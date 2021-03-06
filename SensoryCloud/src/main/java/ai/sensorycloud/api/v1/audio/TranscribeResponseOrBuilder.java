// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface TranscribeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.TranscribeResponse)
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
   * Text of the current transcript
   * </pre>
   *
   * <code>string transcript = 2;</code>
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * Text of the current transcript
   * </pre>
   *
   * <code>string transcript = 2;</code>
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * Indicates if the returned transcript is an intermediate result
   * </pre>
   *
   * <code>bool isPartialResult = 3;</code>
   * @return The isPartialResult.
   */
  boolean getIsPartialResult();

  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return Whether the postProcessingAction field is set.
   */
  boolean hasPostProcessingAction();
  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return The postProcessingAction.
   */
  ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction getPostProcessingAction();
  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   */
  ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder getPostProcessingActionOrBuilder();
}
