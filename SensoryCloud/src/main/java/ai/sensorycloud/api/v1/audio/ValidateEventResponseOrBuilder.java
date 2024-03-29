// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface ValidateEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.ValidateEventResponse)
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
   * Indicates the id of the particular sound that was recognized.
   * Useful for combined models where multiple sound events can be recognized by the same model.
   * </pre>
   *
   * <code>string resultId = 3;</code>
   * @return The resultId.
   */
  java.lang.String getResultId();
  /**
   * <pre>
   * Indicates the id of the particular sound that was recognized.
   * Useful for combined models where multiple sound events can be recognized by the same model.
   * </pre>
   *
   * <code>string resultId = 3;</code>
   * @return The bytes for resultId.
   */
  com.google.protobuf.ByteString
      getResultIdBytes();

  /**
   * <pre>
   * The score of the event between -100 to +100. Smaller values typically indicate an invalid sound while larger values would generally indicate a detected sound.
   * </pre>
   *
   * <code>float score = 4;</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * Array of the top N most likely results
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.SoundIdTopNResponse topNResponse = 5;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.audio.SoundIdTopNResponse> 
      getTopNResponseList();
  /**
   * <pre>
   * Array of the top N most likely results
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.SoundIdTopNResponse topNResponse = 5;</code>
   */
  ai.sensorycloud.api.v1.audio.SoundIdTopNResponse getTopNResponse(int index);
  /**
   * <pre>
   * Array of the top N most likely results
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.SoundIdTopNResponse topNResponse = 5;</code>
   */
  int getTopNResponseCount();
  /**
   * <pre>
   * Array of the top N most likely results
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.SoundIdTopNResponse topNResponse = 5;</code>
   */
  java.util.List<? extends ai.sensorycloud.api.v1.audio.SoundIdTopNResponseOrBuilder> 
      getTopNResponseOrBuilderList();
  /**
   * <pre>
   * Array of the top N most likely results
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.SoundIdTopNResponse topNResponse = 5;</code>
   */
  ai.sensorycloud.api.v1.audio.SoundIdTopNResponseOrBuilder getTopNResponseOrBuilder(
      int index);

  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>float ResultStartTime = 6;</code>
   * @return The resultStartTime.
   */
  float getResultStartTime();

  /**
   * <code>float ResultEndTime = 7;</code>
   * @return The resultEndTime.
   */
  float getResultEndTime();

  /**
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return Whether the postProcessingAction field is set.
   */
  boolean hasPostProcessingAction();
  /**
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return The postProcessingAction.
   */
  ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction getPostProcessingAction();
  /**
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   */
  ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder getPostProcessingActionOrBuilder();
}
