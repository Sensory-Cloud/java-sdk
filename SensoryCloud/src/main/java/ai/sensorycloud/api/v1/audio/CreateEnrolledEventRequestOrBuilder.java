// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface CreateEnrolledEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.CreateEnrolledEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrolledEventRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CreateEnrollmentEventConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrolledEventRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CreateEnrollmentEventConfig config = 1;</code>
   * @return The config.
   */
  ai.sensorycloud.api.v1.audio.CreateEnrollmentEventConfig getConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrolledEventRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CreateEnrollmentEventConfig config = 1;</code>
   */
  ai.sensorycloud.api.v1.audio.CreateEnrollmentEventConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `CreateEnrolledEventRequest` messages. The first
   * `CreateEnrolledEventRequest` message must not contain `audioContent` data
   * and all subsequent `CreateEnrolledEventRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `AudioConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  boolean hasAudioContent();
  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `CreateEnrolledEventRequest` messages. The first
   * `CreateEnrolledEventRequest` message must not contain `audioContent` data
   * and all subsequent `CreateEnrolledEventRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `AudioConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();

  ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest.StreamingRequestCase getStreamingRequestCase();
}
