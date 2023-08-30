// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface SynthesizeSpeechResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.SynthesizeSpeechResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   * @return The config.
   */
  ai.sensorycloud.api.v1.audio.AudioConfig getConfig();
  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   */
  ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The synthesized audio data. Sequential chunks of audio data are sent in
   * sequential `SpeechSynthesisResponse` messages. The first `SpeechSynthesisResponse`
   * message will only contain `config` data and all supsequent `SpeechSynthesisResponse`
   * messages will contain `audioContent` data.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  boolean hasAudioContent();
  /**
   * <pre>
   * The synthesized audio data. Sequential chunks of audio data are sent in
   * sequential `SpeechSynthesisResponse` messages. The first `SpeechSynthesisResponse`
   * message will only contain `config` data and all supsequent `SpeechSynthesisResponse`
   * messages will contain `audioContent` data.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();

  ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.StreamingResponseCase getStreamingResponseCase();
}
