// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface ValidateEnrolledEventConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.ValidateEnrolledEventConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return The audio.
   */
  ai.sensorycloud.api.v1.audio.AudioConfig getAudio();
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getAudioOrBuilder();

  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentId field is set.
   */
  boolean hasEnrollmentId();
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return The enrollmentId.
   */
  java.lang.String getEnrollmentId();
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for enrollmentId.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdBytes();

  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return Whether the enrollmentGroupId field is set.
   */
  boolean hasEnrollmentGroupId();
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return The enrollmentGroupId.
   */
  java.lang.String getEnrollmentGroupId();
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return The bytes for enrollmentGroupId.
   */
  com.google.protobuf.ByteString
      getEnrollmentGroupIdBytes();

  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for sensitivity.
   */
  int getSensitivityValue();
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The sensitivity.
   */
  ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity();

  /**
   * <pre>
   * Encrypted enrollment token that was provided on enrollment creation
   * If the server is configured to store enrollments server side, this may be left blank
   * </pre>
   *
   * <code>bytes enrollmentToken = 5;</code>
   * @return The enrollmentToken.
   */
  com.google.protobuf.ByteString getEnrollmentToken();

  ai.sensorycloud.api.v1.audio.ValidateEnrolledEventConfig.AuthIdCase getAuthIdCase();
}
