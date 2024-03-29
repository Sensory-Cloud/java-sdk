// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public final class SensoryApiV1VideoProto {
  private SensoryApiV1VideoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_VideoModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_VideoModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_GetModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_GetModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_GetModelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_GetModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_CreateEnrollmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_CreateEnrollmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_AuthenticateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_AuthenticateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_ValidateRecognitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_ValidateRecognitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_CreateEnrollmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_CreateEnrollmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_AuthenticateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_AuthenticateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_LivenessRecognitionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_CreateEnrollmentConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_CreateEnrollmentConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_AuthenticateConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_AuthenticateConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensory_api_v1_video_ValidateRecognitionConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024v1/video/video.proto\022\024sensory.api.v1.v" +
      "ideo\032\027validate/validate.proto\032\023common/co" +
      "mmon.proto\"\336\001\n\nVideoModel\022\014\n\004name\030\001 \001(\t\022" +
      "\024\n\014isEnrollable\030\002 \001(\010\0220\n\tmodelType\030\003 \001(\016" +
      "2\035.sensory.api.common.ModelType\022\023\n\013fixed" +
      "Object\030\004 \001(\t\022\020\n\010versions\030\005 \003(\t\0226\n\ntechno" +
      "logy\030\006 \001(\0162\".sensory.api.common.Technolo" +
      "gyType\022\033\n\023isLivenessSupported\030\007 \001(\010\"\022\n\020G" +
      "etModelsRequest\"E\n\021GetModelsResponse\0220\n\006" +
      "models\030\001 \003(\0132 .sensory.api.v1.video.Vide" +
      "oModel\"\212\001\n\027CreateEnrollmentRequest\022>\n\006co" +
      "nfig\030\001 \001(\0132,.sensory.api.v1.video.Create" +
      "EnrollmentConfigH\000\022\026\n\014imageContent\030\002 \001(\014" +
      "H\000B\027\n\020streamingRequest\022\003\370B\001\"\202\001\n\023Authenti" +
      "cateRequest\022:\n\006config\030\001 \001(\0132(.sensory.ap" +
      "i.v1.video.AuthenticateConfigH\000\022\026\n\014image" +
      "Content\030\002 \001(\014H\000B\027\n\020streamingRequest\022\003\370B\001" +
      "\"\220\001\n\032ValidateRecognitionRequest\022A\n\006confi" +
      "g\030\001 \001(\0132/.sensory.api.v1.video.ValidateR" +
      "ecognitionConfigH\000\022\026\n\014imageContent\030\002 \001(\014" +
      "H\000B\027\n\020streamingRequest\022\003\370B\001\"\223\002\n\030CreateEn" +
      "rollmentResponse\022\027\n\017percentComplete\030\001 \001(" +
      "\003\022\017\n\007isAlive\030\002 \001(\010\022\024\n\014enrollmentId\030\003 \001(\t" +
      "\022\021\n\tmodelName\030\004 \001(\t\022\024\n\014modelVersion\030\005 \001(" +
      "\t\022\r\n\005score\030\006 \001(\002\022<\n\017enrollmentToken\030\007 \001(" +
      "\0132#.sensory.api.common.EnrollmentToken\022\023" +
      "\n\013didFindFace\030\010 \001(\010\022\023\n\013boundingBox\030\t \003(\003" +
      "\022\027\n\017probabilityFace\030\n \001(\002\"\342\001\n\024Authentica" +
      "teResponse\022\017\n\007success\030\001 \001(\010\022\r\n\005score\030\002 \001" +
      "(\002\022\017\n\007isAlive\030\003 \001(\010\0220\n\005token\030\004 \001(\0132!.sen" +
      "sory.api.common.TokenResponse\022\016\n\006userId\030" +
      "\005 \001(\t\022\024\n\014enrollmentId\030\006 \001(\t\022\023\n\013didFindFa" +
      "ce\030\007 \001(\010\022\023\n\013boundingBox\030\010 \003(\003\022\027\n\017probabi" +
      "lityFace\030\t \001(\002\"\200\001\n\033LivenessRecognitionRe" +
      "sponse\022\017\n\007isAlive\030\001 \001(\010\022\r\n\005score\030\002 \001(\002\022\023" +
      "\n\013didFindFace\030\003 \001(\010\022\023\n\013boundingBox\030\004 \003(\003" +
      "\022\027\n\017probabilityFace\030\005 \001(\002\"\256\003\n\026CreateEnro" +
      "llmentConfig\022\031\n\006userId\030\001 \001(\tB\t\372B\006r\004\020\001\030\177\022" +
      "\033\n\010deviceId\030\002 \001(\tB\t\372B\006r\004\020\001\030\177\022\035\n\tmodelNam" +
      "e\030\003 \001(\tB\n\372B\007r\005\020\001\030\377\001\022\035\n\013description\030\004 \001(\t" +
      "B\010\372B\005r\003\030\377\007\022\031\n\021isLivenessEnabled\030\005 \001(\010\022O\n" +
      "\021livenessThreshold\030\006 \001(\0162*.sensory.api.v" +
      "1.video.RecognitionThresholdB\010\372B\005\202\001\002\020\001\022A" +
      "\n\013compression\030\007 \001(\0132,.sensory.api.common" +
      ".CompressionConfiguration\022\034\n\013referenceId" +
      "\030\010 \001(\tB\007\372B\004r\002\030\177\022!\n\031numLivenessFramesRequ" +
      "ired\030\t \001(\005\022.\n&disableServerEnrollmentTem" +
      "plateStorage\030\n \001(\010\"\302\002\n\022AuthenticateConfi" +
      "g\022 \n\014enrollmentId\030\001 \001(\tB\010\372B\005r\003\260\001\001H\000\022\033\n\021e" +
      "nrollmentGroupId\030\002 \001(\tH\000\022\031\n\021isLivenessEn" +
      "abled\030\003 \001(\010\022O\n\021livenessThreshold\030\004 \001(\0162*" +
      ".sensory.api.v1.video.RecognitionThresho" +
      "ldB\010\372B\005\202\001\002\020\001\022A\n\013compression\030\005 \001(\0132,.sens" +
      "ory.api.common.CompressionConfiguration\022" +
      "\026\n\016doIncludeToken\030\006 \001(\010\022\027\n\017enrollmentTok" +
      "en\030\007 \001(\014B\r\n\006authId\022\003\370B\001\"\236\001\n\031ValidateReco" +
      "gnitionConfig\022\035\n\tmodelName\030\001 \001(\tB\n\372B\007r\005\020" +
      "\001\030\377\001\022\031\n\006userId\030\002 \001(\tB\t\372B\006r\004\020\001\030\177\022G\n\tthres" +
      "hold\030\003 \001(\0162*.sensory.api.v1.video.Recogn" +
      "itionThresholdB\010\372B\005\202\001\002\020\001*B\n\024RecognitionT" +
      "hreshold\022\007\n\003LOW\020\000\022\n\n\006MEDIUM\020\001\022\010\n\004HIGH\020\002\022" +
      "\013\n\007HIGHEST\020\0032m\n\013VideoModels\022^\n\tGetModels" +
      "\022&.sensory.api.v1.video.GetModelsRequest" +
      "\032\'.sensory.api.v1.video.GetModelsRespons" +
      "e\"\0002\367\001\n\017VideoBiometrics\022w\n\020CreateEnrollm" +
      "ent\022-.sensory.api.v1.video.CreateEnrollm" +
      "entRequest\032..sensory.api.v1.video.Create" +
      "EnrollmentResponse\"\000(\0010\001\022k\n\014Authenticate" +
      "\022).sensory.api.v1.video.AuthenticateRequ" +
      "est\032*.sensory.api.v1.video.AuthenticateR" +
      "esponse\"\000(\0010\0012\221\001\n\020VideoRecognition\022}\n\020Va" +
      "lidateLiveness\0220.sensory.api.v1.video.Va" +
      "lidateRecognitionRequest\0321.sensory.api.v" +
      "1.video.LivenessRecognitionResponse\"\000(\0010" +
      "\001B|\n\034ai.sensorycloud.api.v1.videoB\026Senso" +
      "ryApiV1VideoProtoP\001Z:gitlab.com/sensory-" +
      "cloud/server/titan.git/pkg/api/v1/video\242" +
      "\002\005SENGVb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
          ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor(),
        });
    internal_static_sensory_api_v1_video_VideoModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensory_api_v1_video_VideoModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_VideoModel_descriptor,
        new java.lang.String[] { "Name", "IsEnrollable", "ModelType", "FixedObject", "Versions", "Technology", "IsLivenessSupported", });
    internal_static_sensory_api_v1_video_GetModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensory_api_v1_video_GetModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_GetModelsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_sensory_api_v1_video_GetModelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensory_api_v1_video_GetModelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_GetModelsResponse_descriptor,
        new java.lang.String[] { "Models", });
    internal_static_sensory_api_v1_video_CreateEnrollmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensory_api_v1_video_CreateEnrollmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_CreateEnrollmentRequest_descriptor,
        new java.lang.String[] { "Config", "ImageContent", "StreamingRequest", });
    internal_static_sensory_api_v1_video_AuthenticateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sensory_api_v1_video_AuthenticateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_AuthenticateRequest_descriptor,
        new java.lang.String[] { "Config", "ImageContent", "StreamingRequest", });
    internal_static_sensory_api_v1_video_ValidateRecognitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sensory_api_v1_video_ValidateRecognitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_ValidateRecognitionRequest_descriptor,
        new java.lang.String[] { "Config", "ImageContent", "StreamingRequest", });
    internal_static_sensory_api_v1_video_CreateEnrollmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sensory_api_v1_video_CreateEnrollmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_CreateEnrollmentResponse_descriptor,
        new java.lang.String[] { "PercentComplete", "IsAlive", "EnrollmentId", "ModelName", "ModelVersion", "Score", "EnrollmentToken", "DidFindFace", "BoundingBox", "ProbabilityFace", });
    internal_static_sensory_api_v1_video_AuthenticateResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sensory_api_v1_video_AuthenticateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_AuthenticateResponse_descriptor,
        new java.lang.String[] { "Success", "Score", "IsAlive", "Token", "UserId", "EnrollmentId", "DidFindFace", "BoundingBox", "ProbabilityFace", });
    internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sensory_api_v1_video_LivenessRecognitionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor,
        new java.lang.String[] { "IsAlive", "Score", "DidFindFace", "BoundingBox", "ProbabilityFace", });
    internal_static_sensory_api_v1_video_CreateEnrollmentConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sensory_api_v1_video_CreateEnrollmentConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_CreateEnrollmentConfig_descriptor,
        new java.lang.String[] { "UserId", "DeviceId", "ModelName", "Description", "IsLivenessEnabled", "LivenessThreshold", "Compression", "ReferenceId", "NumLivenessFramesRequired", "DisableServerEnrollmentTemplateStorage", });
    internal_static_sensory_api_v1_video_AuthenticateConfig_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_sensory_api_v1_video_AuthenticateConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_AuthenticateConfig_descriptor,
        new java.lang.String[] { "EnrollmentId", "EnrollmentGroupId", "IsLivenessEnabled", "LivenessThreshold", "Compression", "DoIncludeToken", "EnrollmentToken", "AuthId", });
    internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_sensory_api_v1_video_ValidateRecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor,
        new java.lang.String[] { "ModelName", "UserId", "Threshold", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
    ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
