// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface TranscribeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.TranscribeConfig)
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
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * A flag indicating if the transcription session should use punctuation and capitalization support
   * </pre>
   *
   * <code>bool enablePunctuationCapitalization = 4;</code>
   * @return The enablePunctuationCapitalization.
   */
  boolean getEnablePunctuationCapitalization();

  /**
   * <pre>
   * If enabled, the server will automatically close the stream once the user has stopped speaking
   * </pre>
   *
   * <code>bool doSingleUtterance = 5;</code>
   * @return The doSingleUtterance.
   */
  boolean getDoSingleUtterance();

  /**
   * <pre>
   * How sensitive the voice activiy detector should be when single utterance mode is enabled
   * LOW is the recommended sensitivity to use
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity vadSensitivity = 6;</code>
   * @return The enum numeric value on the wire for vadSensitivity.
   */
  int getVadSensitivityValue();
  /**
   * <pre>
   * How sensitive the voice activiy detector should be when single utterance mode is enabled
   * LOW is the recommended sensitivity to use
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity vadSensitivity = 6;</code>
   * @return The vadSensitivity.
   */
  ai.sensorycloud.api.v1.audio.ThresholdSensitivity getVadSensitivity();

  /**
   * <pre>
   * The number of seconds of silence to detect before automatically ending the stream when single utterance mode is enabled
   * If not specified, 1 second is used by default
   * </pre>
   *
   * <code>float vadDuration = 7;</code>
   * @return The vadDuration.
   */
  float getVadDuration();

  /**
   * <pre>
   * Custom vocabulary reward threshold
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity customVocabRewardThreshold = 8;</code>
   * @return The enum numeric value on the wire for customVocabRewardThreshold.
   */
  int getCustomVocabRewardThresholdValue();
  /**
   * <pre>
   * Custom vocabulary reward threshold
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity customVocabRewardThreshold = 8;</code>
   * @return The customVocabRewardThreshold.
   */
  ai.sensorycloud.api.v1.audio.ThresholdSensitivity getCustomVocabRewardThreshold();

  /**
   * <pre>
   * the name of a custom vocabulary list stored on the server to use for this session
   * </pre>
   *
   * <code>string customVocabularyId = 9;</code>
   * @return The customVocabularyId.
   */
  java.lang.String getCustomVocabularyId();
  /**
   * <pre>
   * the name of a custom vocabulary list stored on the server to use for this session
   * </pre>
   *
   * <code>string customVocabularyId = 9;</code>
   * @return The bytes for customVocabularyId.
   */
  com.google.protobuf.ByteString
      getCustomVocabularyIdBytes();

  /**
   * <pre>
   * A list of up to 100 custom vocabulary words in the form &lt;word&gt;, &lt;pronunciation alternative 0&gt;, &lt;alternative 1&gt; etc...
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CustomVocabularyWords customWordList = 10;</code>
   * @return Whether the customWordList field is set.
   */
  boolean hasCustomWordList();
  /**
   * <pre>
   * A list of up to 100 custom vocabulary words in the form &lt;word&gt;, &lt;pronunciation alternative 0&gt;, &lt;alternative 1&gt; etc...
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CustomVocabularyWords customWordList = 10;</code>
   * @return The customWordList.
   */
  ai.sensorycloud.api.v1.audio.CustomVocabularyWords getCustomWordList();
  /**
   * <pre>
   * A list of up to 100 custom vocabulary words in the form &lt;word&gt;, &lt;pronunciation alternative 0&gt;, &lt;alternative 1&gt; etc...
   * </pre>
   *
   * <code>.sensory.api.v1.audio.CustomVocabularyWords customWordList = 10;</code>
   */
  ai.sensorycloud.api.v1.audio.CustomVocabularyWordsOrBuilder getCustomWordListOrBuilder();
}
