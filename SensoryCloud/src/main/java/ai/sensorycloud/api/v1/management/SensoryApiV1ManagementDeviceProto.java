// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/device.proto

package ai.sensorycloud.api.v1.management;

public final class SensoryApiV1ManagementDeviceProto {
  private SensoryApiV1ManagementDeviceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_EnrollDeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_EnrollDeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_RenewDeviceCredentialRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_RenewDeviceCredentialRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_DeviceGetWhoAmIRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_DeviceGetWhoAmIRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_DeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_DeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_GetDevicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_UpdateDeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_UpdateDeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_DeviceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_DeviceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_GetDeviceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_GetDeviceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_management_DeviceListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_management_DeviceListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032v1/management/device.proto\022\031sensory.ap" +
      "i.v1.management\032\023common/common.proto\032\027va" +
      "lidate/validate.proto\"\270\001\n\023EnrollDeviceRe" +
      "quest\022\027\n\004name\030\001 \001(\tB\t\372B\006r\004\020\001\030\177\022\033\n\010device" +
      "Id\030\002 \001(\tB\t\372B\006r\004\020\001\030\177\022\032\n\010tenantId\030\003 \001(\tB\010\372" +
      "B\005r\003\260\001\001\022;\n\006client\030\004 \001(\0132!.sensory.api.co" +
      "mmon.GenericClientB\010\372B\005\212\001\002\020\001\022\022\n\ncredenti" +
      "al\030\005 \001(\t\"\223\001\n\034RenewDeviceCredentialReques" +
      "t\022\033\n\010deviceId\030\001 \001(\tB\t\372B\006r\004\020\001\030\177\022\032\n\010client" +
      "Id\030\002 \001(\tB\010\372B\005r\003\260\001\001\022\032\n\010tenantId\030\003 \001(\tB\010\372B" +
      "\005r\003\260\001\001\022\036\n\ncredential\030\004 \001(\tB\n\372B\007r\005\020\001\030\377\001\"\030" +
      "\n\026DeviceGetWhoAmIRequest\",\n\rDeviceReques" +
      "t\022\033\n\010deviceId\030\001 \001(\tB\t\372B\006r\004\020\001\030\177\"y\n\021GetDev" +
      "icesRequest\022\020\n\010tenantId\030\001 \001(\t\0229\n\npaginat" +
      "ion\030\002 \001(\0132%.sensory.api.common.Paginatio" +
      "nOptions\022\027\n\006userId\030\003 \001(\tB\007\372B\004r\002\030\177\"K\n\023Upd" +
      "ateDeviceRequest\022\033\n\010deviceId\030\001 \001(\tB\t\372B\006r" +
      "\004\020\001\030\177\022\027\n\004name\030\002 \001(\tB\t\372B\006r\004\020\001\030\177\"0\n\016Device" +
      "Response\022\014\n\004name\030\001 \001(\t\022\020\n\010deviceId\030\002 \001(\t" +
      "\"F\n\021GetDeviceResponse\022\014\n\004name\030\001 \001(\t\022\020\n\010d" +
      "eviceId\030\002 \001(\t\022\021\n\tuserCount\030\003 \001(\003\"\214\001\n\022Dev" +
      "iceListResponse\022:\n\007devices\030\001 \003(\0132).senso" +
      "ry.api.v1.management.DeviceResponse\022:\n\np" +
      "agination\030\002 \001(\0132&.sensory.api.common.Pag" +
      "inationResponse2\220\006\n\rDeviceService\022k\n\014Enr" +
      "ollDevice\022..sensory.api.v1.management.En" +
      "rollDeviceRequest\032).sensory.api.v1.manag" +
      "ement.DeviceResponse\"\000\022}\n\025RenewDeviceCre" +
      "dential\0227.sensory.api.v1.management.Rene" +
      "wDeviceCredentialRequest\032).sensory.api.v" +
      "1.management.DeviceResponse\"\000\022k\n\tGetWhoA" +
      "mI\0221.sensory.api.v1.management.DeviceGet" +
      "WhoAmIRequest\032).sensory.api.v1.managemen" +
      "t.DeviceResponse\"\000\022e\n\tGetDevice\022(.sensor" +
      "y.api.v1.management.DeviceRequest\032,.sens" +
      "ory.api.v1.management.GetDeviceResponse\"" +
      "\000\022k\n\nGetDevices\022,.sensory.api.v1.managem" +
      "ent.GetDevicesRequest\032-.sensory.api.v1.m" +
      "anagement.DeviceListResponse\"\000\022k\n\014Update" +
      "Device\022..sensory.api.v1.management.Updat" +
      "eDeviceRequest\032).sensory.api.v1.manageme" +
      "nt.DeviceResponse\"\000\022e\n\014DeleteDevice\022(.se" +
      "nsory.api.v1.management.DeviceRequest\032)." +
      "sensory.api.v1.management.DeviceResponse" +
      "\"\000B\220\001\n!ai.sensorycloud.api.v1.management" +
      "B!SensoryApiV1ManagementDeviceProtoP\001Z?g" +
      "itlab.com/sensory-cloud/server/titan.git" +
      "/pkg/api/v1/management\242\002\004SENGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_sensory_api_v1_management_EnrollDeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensory_api_v1_management_EnrollDeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_EnrollDeviceRequest_descriptor,
        new java.lang.String[] { "Name", "DeviceId", "TenantId", "Client", "Credential", });
    internal_static_sensory_api_v1_management_RenewDeviceCredentialRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensory_api_v1_management_RenewDeviceCredentialRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_RenewDeviceCredentialRequest_descriptor,
        new java.lang.String[] { "DeviceId", "ClientId", "TenantId", "Credential", });
    internal_static_sensory_api_v1_management_DeviceGetWhoAmIRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensory_api_v1_management_DeviceGetWhoAmIRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_DeviceGetWhoAmIRequest_descriptor,
        new java.lang.String[] { });
    internal_static_sensory_api_v1_management_DeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensory_api_v1_management_DeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_DeviceRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sensory_api_v1_management_GetDevicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor,
        new java.lang.String[] { "TenantId", "Pagination", "UserId", });
    internal_static_sensory_api_v1_management_UpdateDeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sensory_api_v1_management_UpdateDeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_UpdateDeviceRequest_descriptor,
        new java.lang.String[] { "DeviceId", "Name", });
    internal_static_sensory_api_v1_management_DeviceResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sensory_api_v1_management_DeviceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_DeviceResponse_descriptor,
        new java.lang.String[] { "Name", "DeviceId", });
    internal_static_sensory_api_v1_management_GetDeviceResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sensory_api_v1_management_GetDeviceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_GetDeviceResponse_descriptor,
        new java.lang.String[] { "Name", "DeviceId", "UserCount", });
    internal_static_sensory_api_v1_management_DeviceListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sensory_api_v1_management_DeviceListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_management_DeviceListResponse_descriptor,
        new java.lang.String[] { "Devices", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
