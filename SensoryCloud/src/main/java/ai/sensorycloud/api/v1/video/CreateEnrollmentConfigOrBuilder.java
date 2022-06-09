// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public interface CreateEnrollmentConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.CreateEnrollmentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 3 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Description of the enrollment as entered by the user.
   * Max length is 1023 characters
   * </pre>
   *
   * <code>string description = 4 [(.validate.rules) = { ... }</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the enrollment as entered by the user.
   * Max length is 1023 characters
   * </pre>
   *
   * <code>string description = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Enable a liveness check on the image, which will further improve the security of enrollment at the expense of a slightly slower response.
   * </pre>
   *
   * <code>bool isLivenessEnabled = 5;</code>
   * @return The isLivenessEnabled.
   */
  boolean getIsLivenessEnabled();

  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 6 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for livenessThreshold.
   */
  int getLivenessThresholdValue();
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 6 [(.validate.rules) = { ... }</code>
   * @return The livenessThreshold.
   */
  ai.sensorycloud.api.v1.video.RecognitionThreshold getLivenessThreshold();

  /**
   * <pre>
   * Information about how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 7;</code>
   * @return Whether the compression field is set.
   */
  boolean hasCompression();
  /**
   * <pre>
   * Information about how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 7;</code>
   * @return The compression.
   */
  ai.sensorycloud.api.common.CompressionConfiguration getCompression();
  /**
   * <pre>
   * Information about how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 7;</code>
   */
  ai.sensorycloud.api.common.CompressionConfigurationOrBuilder getCompressionOrBuilder();

  /**
   * <pre>
   * Reference Id allows clients to assign their own identifier to enrollments for various purposes
   * such as tying an audio and video enrollment together.
   * </pre>
   *
   * <code>string referenceId = 8 [(.validate.rules) = { ... }</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * Reference Id allows clients to assign their own identifier to enrollments for various purposes
   * such as tying an audio and video enrollment together.
   * </pre>
   *
   * <code>string referenceId = 8 [(.validate.rules) = { ... }</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();

  /**
   * <pre>
   * If isLivenessEnabled is true, this determines how many frames need to pass the liveness check before the enrollment can be successful
   * A value of 0 means that all enrollment frames must pass the liveness check.
   * </pre>
   *
   * <code>int32 numLivenessFramesRequired = 9;</code>
   * @return The numLivenessFramesRequired.
   */
  int getNumLivenessFramesRequired();
}
