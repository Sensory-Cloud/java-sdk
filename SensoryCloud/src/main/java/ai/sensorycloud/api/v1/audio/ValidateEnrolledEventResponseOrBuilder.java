// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface ValidateEnrolledEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.ValidateEnrolledEventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 1;</code>
   * @return The audioEnergy.
   */
  float getAudioEnergy();

  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * The enrollmentID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The enrollmentId.
   */
  java.lang.String getEnrollmentId();
  /**
   * <pre>
   * The enrollmentID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The bytes for enrollmentId.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdBytes();

  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
   * </pre>
   *
   * <code>string modelPrompt = 5;</code>
   * @return The modelPrompt.
   */
  java.lang.String getModelPrompt();
  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
   * </pre>
   *
   * <code>string modelPrompt = 5;</code>
   * @return The bytes for modelPrompt.
   */
  com.google.protobuf.ByteString
      getModelPromptBytes();
}
