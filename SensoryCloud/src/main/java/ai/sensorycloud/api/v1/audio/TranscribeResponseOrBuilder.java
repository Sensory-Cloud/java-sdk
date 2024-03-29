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
   * A response including word metadata
   * </pre>
   *
   * <code>.sensory.api.v1.audio.TranscribeWordResponse wordList = 4;</code>
   * @return Whether the wordList field is set.
   */
  boolean hasWordList();
  /**
   * <pre>
   * A response including word metadata
   * </pre>
   *
   * <code>.sensory.api.v1.audio.TranscribeWordResponse wordList = 4;</code>
   * @return The wordList.
   */
  ai.sensorycloud.api.v1.audio.TranscribeWordResponse getWordList();
  /**
   * <pre>
   * A response including word metadata
   * </pre>
   *
   * <code>.sensory.api.v1.audio.TranscribeWordResponse wordList = 4;</code>
   */
  ai.sensorycloud.api.v1.audio.TranscribeWordResponseOrBuilder getWordListOrBuilder();

  /**
   * <pre>
   * Tells if any voice activity was detected for the most recently proccessed audio segment
   * </pre>
   *
   * <code>bool hasVoiceActivity = 5;</code>
   * @return The hasVoiceActivity.
   */
  boolean getHasVoiceActivity();

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
