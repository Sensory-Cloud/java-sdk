// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Response from a ValidateEventRequest
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.ValidateEventResponse}
 */
public final class ValidateEventResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.ValidateEventResponse)
    ValidateEventResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateEventResponse.newBuilder() to construct.
  private ValidateEventResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateEventResponse() {
    resultId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateEventResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidateEventResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            audioEnergy_ = input.readFloat();
            break;
          }
          case 16: {

            success_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            resultId_ = s;
            break;
          }
          case 37: {

            score_ = input.readFloat();
            break;
          }
          case 82: {
            ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder subBuilder = null;
            if (postProcessingAction_ != null) {
              subBuilder = postProcessingAction_.toBuilder();
            }
            postProcessingAction_ = input.readMessage(ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(postProcessingAction_);
              postProcessingAction_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.ValidateEventResponse.class, ai.sensorycloud.api.v1.audio.ValidateEventResponse.Builder.class);
  }

  public static final int AUDIOENERGY_FIELD_NUMBER = 1;
  private float audioEnergy_;
  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 1;</code>
   * @return The audioEnergy.
   */
  @java.lang.Override
  public float getAudioEnergy() {
    return audioEnergy_;
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private boolean success_;
  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int RESULTID_FIELD_NUMBER = 3;
  private volatile java.lang.Object resultId_;
  /**
   * <pre>
   * Indicates the id of the particular sound that was recognized.
   * Useful for combined models where multiple sound events can be recognized by the same model.
   * </pre>
   *
   * <code>string resultId = 3;</code>
   * @return The resultId.
   */
  @java.lang.Override
  public java.lang.String getResultId() {
    java.lang.Object ref = resultId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Indicates the id of the particular sound that was recognized.
   * Useful for combined models where multiple sound events can be recognized by the same model.
   * </pre>
   *
   * <code>string resultId = 3;</code>
   * @return The bytes for resultId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultIdBytes() {
    java.lang.Object ref = resultId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 4;
  private float score_;
  /**
   * <pre>
   * The score of the event between -100 to +100. Smaller values typically indicate an invalid sound while larger values would generally indicate a detected sound.
   * </pre>
   *
   * <code>float score = 4;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
  }

  public static final int POSTPROCESSINGACTION_FIELD_NUMBER = 10;
  private ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction_;
  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return Whether the postProcessingAction field is set.
   */
  @java.lang.Override
  public boolean hasPostProcessingAction() {
    return postProcessingAction_ != null;
  }
  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   * @return The postProcessingAction.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction getPostProcessingAction() {
    return postProcessingAction_ == null ? ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.getDefaultInstance() : postProcessingAction_;
  }
  /**
   * <pre>
   * If a post processing audio action was requested, this will be populated with the specific
   * action that was completed along with the actionId optionally set by the client.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder getPostProcessingActionOrBuilder() {
    return getPostProcessingAction();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (java.lang.Float.floatToRawIntBits(audioEnergy_) != 0) {
      output.writeFloat(1, audioEnergy_);
    }
    if (success_ != false) {
      output.writeBool(2, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resultId_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      output.writeFloat(4, score_);
    }
    if (postProcessingAction_ != null) {
      output.writeMessage(10, getPostProcessingAction());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(audioEnergy_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, audioEnergy_);
    }
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resultId_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, score_);
    }
    if (postProcessingAction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getPostProcessingAction());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.ValidateEventResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.ValidateEventResponse other = (ai.sensorycloud.api.v1.audio.ValidateEventResponse) obj;

    if (java.lang.Float.floatToIntBits(getAudioEnergy())
        != java.lang.Float.floatToIntBits(
            other.getAudioEnergy())) return false;
    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getResultId()
        .equals(other.getResultId())) return false;
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (hasPostProcessingAction() != other.hasPostProcessingAction()) return false;
    if (hasPostProcessingAction()) {
      if (!getPostProcessingAction()
          .equals(other.getPostProcessingAction())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUDIOENERGY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAudioEnergy());
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + RESULTID_FIELD_NUMBER;
    hash = (53 * hash) + getResultId().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    if (hasPostProcessingAction()) {
      hash = (37 * hash) + POSTPROCESSINGACTION_FIELD_NUMBER;
      hash = (53 * hash) + getPostProcessingAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.ValidateEventResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response from a ValidateEventRequest
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.ValidateEventResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.ValidateEventResponse)
      ai.sensorycloud.api.v1.audio.ValidateEventResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.ValidateEventResponse.class, ai.sensorycloud.api.v1.audio.ValidateEventResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.ValidateEventResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      audioEnergy_ = 0F;

      success_ = false;

      resultId_ = "";

      score_ = 0F;

      if (postProcessingActionBuilder_ == null) {
        postProcessingAction_ = null;
      } else {
        postProcessingAction_ = null;
        postProcessingActionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.ValidateEventResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventResponse build() {
      ai.sensorycloud.api.v1.audio.ValidateEventResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventResponse buildPartial() {
      ai.sensorycloud.api.v1.audio.ValidateEventResponse result = new ai.sensorycloud.api.v1.audio.ValidateEventResponse(this);
      result.audioEnergy_ = audioEnergy_;
      result.success_ = success_;
      result.resultId_ = resultId_;
      result.score_ = score_;
      if (postProcessingActionBuilder_ == null) {
        result.postProcessingAction_ = postProcessingAction_;
      } else {
        result.postProcessingAction_ = postProcessingActionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.sensorycloud.api.v1.audio.ValidateEventResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.ValidateEventResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.ValidateEventResponse other) {
      if (other == ai.sensorycloud.api.v1.audio.ValidateEventResponse.getDefaultInstance()) return this;
      if (other.getAudioEnergy() != 0F) {
        setAudioEnergy(other.getAudioEnergy());
      }
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getResultId().isEmpty()) {
        resultId_ = other.resultId_;
        onChanged();
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.hasPostProcessingAction()) {
        mergePostProcessingAction(other.getPostProcessingAction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.sensorycloud.api.v1.audio.ValidateEventResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.audio.ValidateEventResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float audioEnergy_ ;
    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 1;</code>
     * @return The audioEnergy.
     */
    @java.lang.Override
    public float getAudioEnergy() {
      return audioEnergy_;
    }
    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 1;</code>
     * @param value The audioEnergy to set.
     * @return This builder for chaining.
     */
    public Builder setAudioEnergy(float value) {
      
      audioEnergy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioEnergy() {
      
      audioEnergy_ = 0F;
      onChanged();
      return this;
    }

    private boolean success_ ;
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object resultId_ = "";
    /**
     * <pre>
     * Indicates the id of the particular sound that was recognized.
     * Useful for combined models where multiple sound events can be recognized by the same model.
     * </pre>
     *
     * <code>string resultId = 3;</code>
     * @return The resultId.
     */
    public java.lang.String getResultId() {
      java.lang.Object ref = resultId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Indicates the id of the particular sound that was recognized.
     * Useful for combined models where multiple sound events can be recognized by the same model.
     * </pre>
     *
     * <code>string resultId = 3;</code>
     * @return The bytes for resultId.
     */
    public com.google.protobuf.ByteString
        getResultIdBytes() {
      java.lang.Object ref = resultId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Indicates the id of the particular sound that was recognized.
     * Useful for combined models where multiple sound events can be recognized by the same model.
     * </pre>
     *
     * <code>string resultId = 3;</code>
     * @param value The resultId to set.
     * @return This builder for chaining.
     */
    public Builder setResultId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the id of the particular sound that was recognized.
     * Useful for combined models where multiple sound events can be recognized by the same model.
     * </pre>
     *
     * <code>string resultId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultId() {
      
      resultId_ = getDefaultInstance().getResultId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the id of the particular sound that was recognized.
     * Useful for combined models where multiple sound events can be recognized by the same model.
     * </pre>
     *
     * <code>string resultId = 3;</code>
     * @param value The bytes for resultId to set.
     * @return This builder for chaining.
     */
    public Builder setResultIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultId_ = value;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * The score of the event between -100 to +100. Smaller values typically indicate an invalid sound while larger values would generally indicate a detected sound.
     * </pre>
     *
     * <code>float score = 4;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * The score of the event between -100 to +100. Smaller values typically indicate an invalid sound while larger values would generally indicate a detected sound.
     * </pre>
     *
     * <code>float score = 4;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The score of the event between -100 to +100. Smaller values typically indicate an invalid sound while larger values would generally indicate a detected sound.
     * </pre>
     *
     * <code>float score = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder> postProcessingActionBuilder_;
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     * @return Whether the postProcessingAction field is set.
     */
    public boolean hasPostProcessingAction() {
      return postProcessingActionBuilder_ != null || postProcessingAction_ != null;
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     * @return The postProcessingAction.
     */
    public ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction getPostProcessingAction() {
      if (postProcessingActionBuilder_ == null) {
        return postProcessingAction_ == null ? ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.getDefaultInstance() : postProcessingAction_;
      } else {
        return postProcessingActionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public Builder setPostProcessingAction(ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction value) {
      if (postProcessingActionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        postProcessingAction_ = value;
        onChanged();
      } else {
        postProcessingActionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public Builder setPostProcessingAction(
        ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder builderForValue) {
      if (postProcessingActionBuilder_ == null) {
        postProcessingAction_ = builderForValue.build();
        onChanged();
      } else {
        postProcessingActionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public Builder mergePostProcessingAction(ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction value) {
      if (postProcessingActionBuilder_ == null) {
        if (postProcessingAction_ != null) {
          postProcessingAction_ =
            ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.newBuilder(postProcessingAction_).mergeFrom(value).buildPartial();
        } else {
          postProcessingAction_ = value;
        }
        onChanged();
      } else {
        postProcessingActionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public Builder clearPostProcessingAction() {
      if (postProcessingActionBuilder_ == null) {
        postProcessingAction_ = null;
        onChanged();
      } else {
        postProcessingAction_ = null;
        postProcessingActionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder getPostProcessingActionBuilder() {
      
      onChanged();
      return getPostProcessingActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    public ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder getPostProcessingActionOrBuilder() {
      if (postProcessingActionBuilder_ != null) {
        return postProcessingActionBuilder_.getMessageOrBuilder();
      } else {
        return postProcessingAction_ == null ?
            ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.getDefaultInstance() : postProcessingAction_;
      }
    }
    /**
     * <pre>
     * If a post processing audio action was requested, this will be populated with the specific
     * action that was completed along with the actionId optionally set by the client.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioResponsePostProcessingAction postProcessingAction = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder> 
        getPostProcessingActionFieldBuilder() {
      if (postProcessingActionBuilder_ == null) {
        postProcessingActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingAction.Builder, ai.sensorycloud.api.v1.audio.AudioResponsePostProcessingActionOrBuilder>(
                getPostProcessingAction(),
                getParentForChildren(),
                isClean());
        postProcessingAction_ = null;
      }
      return postProcessingActionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.ValidateEventResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.ValidateEventResponse)
  private static final ai.sensorycloud.api.v1.audio.ValidateEventResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.ValidateEventResponse();
  }

  public static ai.sensorycloud.api.v1.audio.ValidateEventResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateEventResponse>
      PARSER = new com.google.protobuf.AbstractParser<ValidateEventResponse>() {
    @java.lang.Override
    public ValidateEventResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidateEventResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidateEventResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateEventResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.ValidateEventResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

