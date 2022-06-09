// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Provides information for an audio-based event recognition
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.ValidateEventConfig}
 */
public final class ValidateEventConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.ValidateEventConfig)
    ValidateEventConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateEventConfig.newBuilder() to construct.
  private ValidateEventConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateEventConfig() {
    modelName_ = "";
    userId_ = "";
    sensitivity_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateEventConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidateEventConfig(
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
          case 10: {
            ai.sensorycloud.api.v1.audio.AudioConfig.Builder subBuilder = null;
            if (audio_ != null) {
              subBuilder = audio_.toBuilder();
            }
            audio_ = input.readMessage(ai.sensorycloud.api.v1.audio.AudioConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audio_);
              audio_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            modelName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            sensitivity_ = rawValue;
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
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.ValidateEventConfig.class, ai.sensorycloud.api.v1.audio.ValidateEventConfig.Builder.class);
  }

  public static final int AUDIO_FIELD_NUMBER = 1;
  private ai.sensorycloud.api.v1.audio.AudioConfig audio_;
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the audio field is set.
   */
  @java.lang.Override
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return The audio.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioConfig getAudio() {
    return audio_ == null ? ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance() : audio_;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getAudioOrBuilder() {
    return getAudio();
  }

  public static final int MODELNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object modelName_;
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENSITIVITY_FIELD_NUMBER = 4;
  private int sensitivity_;
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for sensitivity.
   */
  @java.lang.Override public int getSensitivityValue() {
    return sensitivity_;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The sensitivity.
   */
  @java.lang.Override public ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity() {
    @SuppressWarnings("deprecation")
    ai.sensorycloud.api.v1.audio.ThresholdSensitivity result = ai.sensorycloud.api.v1.audio.ThresholdSensitivity.valueOf(sensitivity_);
    return result == null ? ai.sensorycloud.api.v1.audio.ThresholdSensitivity.UNRECOGNIZED : result;
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
    if (audio_ != null) {
      output.writeMessage(1, getAudio());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, modelName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userId_);
    }
    if (sensitivity_ != ai.sensorycloud.api.v1.audio.ThresholdSensitivity.LOWEST.getNumber()) {
      output.writeEnum(4, sensitivity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audio_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAudio());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, modelName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userId_);
    }
    if (sensitivity_ != ai.sensorycloud.api.v1.audio.ThresholdSensitivity.LOWEST.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, sensitivity_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.ValidateEventConfig)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.ValidateEventConfig other = (ai.sensorycloud.api.v1.audio.ValidateEventConfig) obj;

    if (hasAudio() != other.hasAudio()) return false;
    if (hasAudio()) {
      if (!getAudio()
          .equals(other.getAudio())) return false;
    }
    if (!getModelName()
        .equals(other.getModelName())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (sensitivity_ != other.sensitivity_) return false;
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
    if (hasAudio()) {
      hash = (37 * hash) + AUDIO_FIELD_NUMBER;
      hash = (53 * hash) + getAudio().hashCode();
    }
    hash = (37 * hash) + MODELNAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + SENSITIVITY_FIELD_NUMBER;
    hash = (53 * hash) + sensitivity_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.ValidateEventConfig prototype) {
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
   * Provides information for an audio-based event recognition
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.ValidateEventConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.ValidateEventConfig)
      ai.sensorycloud.api.v1.audio.ValidateEventConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.ValidateEventConfig.class, ai.sensorycloud.api.v1.audio.ValidateEventConfig.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.ValidateEventConfig.newBuilder()
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
      if (audioBuilder_ == null) {
        audio_ = null;
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }
      modelName_ = "";

      userId_ = "";

      sensitivity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_ValidateEventConfig_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventConfig getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.ValidateEventConfig.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventConfig build() {
      ai.sensorycloud.api.v1.audio.ValidateEventConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ValidateEventConfig buildPartial() {
      ai.sensorycloud.api.v1.audio.ValidateEventConfig result = new ai.sensorycloud.api.v1.audio.ValidateEventConfig(this);
      if (audioBuilder_ == null) {
        result.audio_ = audio_;
      } else {
        result.audio_ = audioBuilder_.build();
      }
      result.modelName_ = modelName_;
      result.userId_ = userId_;
      result.sensitivity_ = sensitivity_;
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
      if (other instanceof ai.sensorycloud.api.v1.audio.ValidateEventConfig) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.ValidateEventConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.ValidateEventConfig other) {
      if (other == ai.sensorycloud.api.v1.audio.ValidateEventConfig.getDefaultInstance()) return this;
      if (other.hasAudio()) {
        mergeAudio(other.getAudio());
      }
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.sensitivity_ != 0) {
        setSensitivityValue(other.getSensitivityValue());
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
      ai.sensorycloud.api.v1.audio.ValidateEventConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.audio.ValidateEventConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ai.sensorycloud.api.v1.audio.AudioConfig audio_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder> audioBuilder_;
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the audio field is set.
     */
    public boolean hasAudio() {
      return audioBuilder_ != null || audio_ != null;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     * @return The audio.
     */
    public ai.sensorycloud.api.v1.audio.AudioConfig getAudio() {
      if (audioBuilder_ == null) {
        return audio_ == null ? ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance() : audio_;
      } else {
        return audioBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audio_ = value;
        onChanged();
      } else {
        audioBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(
        ai.sensorycloud.api.v1.audio.AudioConfig.Builder builderForValue) {
      if (audioBuilder_ == null) {
        audio_ = builderForValue.build();
        onChanged();
      } else {
        audioBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      if (audioBuilder_ == null) {
        if (audio_ != null) {
          audio_ =
            ai.sensorycloud.api.v1.audio.AudioConfig.newBuilder(audio_).mergeFrom(value).buildPartial();
        } else {
          audio_ = value;
        }
        onChanged();
      } else {
        audioBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearAudio() {
      if (audioBuilder_ == null) {
        audio_ = null;
        onChanged();
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public ai.sensorycloud.api.v1.audio.AudioConfig.Builder getAudioBuilder() {
      
      onChanged();
      return getAudioFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getAudioOrBuilder() {
      if (audioBuilder_ != null) {
        return audioBuilder_.getMessageOrBuilder();
      } else {
        return audio_ == null ?
            ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance() : audio_;
      }
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder> 
        getAudioFieldBuilder() {
      if (audioBuilder_ == null) {
        audioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder>(
                getAudio(),
                getParentForChildren(),
                isClean());
        audio_ = null;
      }
      return audioBuilder_;
    }

    private java.lang.Object modelName_ = "";
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return The modelName.
     */
    public java.lang.String getModelName() {
      java.lang.Object ref = modelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for modelName.
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      java.lang.Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @param value The modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      
      modelName_ = getDefaultInstance().getModelName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private int sensitivity_ = 0;
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for sensitivity.
     */
    @java.lang.Override public int getSensitivityValue() {
      return sensitivity_;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivityValue(int value) {
      
      sensitivity_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return The sensitivity.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity() {
      @SuppressWarnings("deprecation")
      ai.sensorycloud.api.v1.audio.ThresholdSensitivity result = ai.sensorycloud.api.v1.audio.ThresholdSensitivity.valueOf(sensitivity_);
      return result == null ? ai.sensorycloud.api.v1.audio.ThresholdSensitivity.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @param value The sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivity(ai.sensorycloud.api.v1.audio.ThresholdSensitivity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sensitivity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSensitivity() {
      
      sensitivity_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.ValidateEventConfig)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.ValidateEventConfig)
  private static final ai.sensorycloud.api.v1.audio.ValidateEventConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.ValidateEventConfig();
  }

  public static ai.sensorycloud.api.v1.audio.ValidateEventConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateEventConfig>
      PARSER = new com.google.protobuf.AbstractParser<ValidateEventConfig>() {
    @java.lang.Override
    public ValidateEventConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidateEventConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidateEventConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateEventConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.ValidateEventConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

