// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public interface AuthenticateConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.AuthenticateConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentId field is set.
   */
  boolean hasEnrollmentId();
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return The enrollmentId.
   */
  java.lang.String getEnrollmentId();
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for enrollmentId.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdBytes();

  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return Whether the enrollmentGroupId field is set.
   */
  boolean hasEnrollmentGroupId();
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return The enrollmentGroupId.
   */
  java.lang.String getEnrollmentGroupId();
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return The bytes for enrollmentGroupId.
   */
  com.google.protobuf.ByteString
      getEnrollmentGroupIdBytes();

  /**
   * <pre>
   * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
   * </pre>
   *
   * <code>bool isLivenessEnabled = 3;</code>
   * @return The isLivenessEnabled.
   */
  boolean getIsLivenessEnabled();

  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for livenessThreshold.
   */
  int getLivenessThresholdValue();
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @return The livenessThreshold.
   */
  ai.sensorycloud.api.v1.video.RecognitionThreshold getLivenessThreshold();

  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   * @return Whether the compression field is set.
   */
  boolean hasCompression();
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   * @return The compression.
   */
  ai.sensorycloud.api.common.CompressionConfiguration getCompression();
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  ai.sensorycloud.api.common.CompressionConfigurationOrBuilder getCompressionOrBuilder();

  /**
   * <pre>
   * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
   * The OAuth token will only be returned if the authentication is successful.
   * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
   * </pre>
   *
   * <code>bool doIncludeToken = 6;</code>
   * @return The doIncludeToken.
   */
  boolean getDoIncludeToken();

  public ai.sensorycloud.api.v1.video.AuthenticateConfig.AuthIdCase getAuthIdCase();
}
