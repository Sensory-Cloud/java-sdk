package ai.sensorycloud.service;

import ai.sensorycloud.api.common.ServerHealthResponse;
import ai.sensorycloud.api.health.HealthRequest;
import ai.sensorycloud.api.health.HealthServiceGrpc;
import ai.sensorycloud.config.Config;
import io.grpc.*;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Rule;

import static org.awaitility.Awaitility.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.*;

public class HealthServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    final public Config mockConfig = new Config(
            new Config.CloudConfig("host"),
            new Config.TenantConfig("tenantID"),
            new Config.DeviceConfig("deviceID", "lanCode")
    );

    final ServerHealthResponse expectedResponse = ServerHealthResponse.newBuilder()
            .setId("serverID")
            .setIsHealthy(true)
            .setServerVersion("1.0")
            .build();

    private final ServerInterceptor mockServerInterceptor = mock(ServerInterceptor.class, delegatesTo(
            new ServerInterceptor() {
                @Override
                public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                    assertNull("No OAuth token should be sent", headers.get(authKey));
                    return next.startCall(call, headers);
                }
            }
    ));

    private final HealthServiceGrpc.HealthServiceImplBase serviceImpl =
            mock(HealthServiceGrpc.HealthServiceImplBase.class, delegatesTo(
                    new HealthServiceGrpc.HealthServiceImplBase() {
                        @Override
                        public void getHealth(HealthRequest request, StreamObserver<ServerHealthResponse> responseObserver) {
                            assertEquals("Request should match", HealthRequest.getDefaultInstance(), request);
                            responseObserver.onNext(expectedResponse);
                            responseObserver.onCompleted();
                        }
                    }
            ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public HealthService service;
    public boolean responseRecieved = false;

    @Before
    public void setUp() throws Exception {
        responseRecieved = false;

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(serviceImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        service = new HealthService(mockConfig, channel);
    }

    public void testGetHealth() {
        service.getHealth(new HealthService.GetHealthListener() {
            @Override
            public void onSuccess(ServerHealthResponse response) {
                assertEquals("Response should match", expectedResponse, response);
                responseRecieved = true;
            }

            @Override
            public void onFailure(Throwable t) {
                fail("Call should not fail: " + t.getMessage());
            }
        });

        await().until(() -> responseRecieved);
    }
}