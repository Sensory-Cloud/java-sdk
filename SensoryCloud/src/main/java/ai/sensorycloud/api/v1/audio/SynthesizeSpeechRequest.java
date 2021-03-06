// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * The top-level message sent by the client for the `SynthesizeSpeech` method.
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.SynthesizeSpeechRequest}
 */
public final class SynthesizeSpeechRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.SynthesizeSpeechRequest)
    SynthesizeSpeechRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SynthesizeSpeechRequest.newBuilder() to construct.
  private SynthesizeSpeechRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SynthesizeSpeechRequest() {
    phrase_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SynthesizeSpeechRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SynthesizeSpeechRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            phrase_ = s;
            break;
          }
          case 18: {
            ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
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
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.class, ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.Builder.class);
  }

  public static final int PHRASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object phrase_;
  /**
   * <pre>
   * The raw text to create voice synthesis for
   * </pre>
   *
   * <code>string phrase = 1;</code>
   * @return The phrase.
   */
  @java.lang.Override
  public java.lang.String getPhrase() {
    java.lang.Object ref = phrase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phrase_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The raw text to create voice synthesis for
   * </pre>
   *
   * <code>string phrase = 1;</code>
   * @return The bytes for phrase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhraseBytes() {
    java.lang.Object ref = phrase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phrase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig config_;
  /**
   * <pre>
   * Configurations for the synthesized voice
   * </pre>
   *
   * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * Configurations for the synthesized voice
   * </pre>
   *
   * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig getConfig() {
    return config_ == null ? ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * Configurations for the synthesized voice
   * </pre>
   *
   * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phrase_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phrase_);
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phrase_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phrase_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
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
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest other = (ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest) obj;

    if (!getPhrase()
        .equals(other.getPhrase())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
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
    hash = (37 * hash) + PHRASE_FIELD_NUMBER;
    hash = (53 * hash) + getPhrase().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest prototype) {
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
   * The top-level message sent by the client for the `SynthesizeSpeech` method.
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.SynthesizeSpeechRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.SynthesizeSpeechRequest)
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.class, ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.newBuilder()
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
      phrase_ = "";

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechRequest_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest build() {
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest buildPartial() {
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest result = new ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest(this);
      result.phrase_ = phrase_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
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
      if (other instanceof ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest other) {
      if (other == ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.getDefaultInstance()) return this;
      if (!other.getPhrase().isEmpty()) {
        phrase_ = other.phrase_;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phrase_ = "";
    /**
     * <pre>
     * The raw text to create voice synthesis for
     * </pre>
     *
     * <code>string phrase = 1;</code>
     * @return The phrase.
     */
    public java.lang.String getPhrase() {
      java.lang.Object ref = phrase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phrase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The raw text to create voice synthesis for
     * </pre>
     *
     * <code>string phrase = 1;</code>
     * @return The bytes for phrase.
     */
    public com.google.protobuf.ByteString
        getPhraseBytes() {
      java.lang.Object ref = phrase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phrase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The raw text to create voice synthesis for
     * </pre>
     *
     * <code>string phrase = 1;</code>
     * @param value The phrase to set.
     * @return This builder for chaining.
     */
    public Builder setPhrase(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phrase_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The raw text to create voice synthesis for
     * </pre>
     *
     * <code>string phrase = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhrase() {
      
      phrase_ = getDefaultInstance().getPhrase();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The raw text to create voice synthesis for
     * </pre>
     *
     * <code>string phrase = 1;</code>
     * @param value The bytes for phrase to set.
     * @return This builder for chaining.
     */
    public Builder setPhraseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phrase_ = value;
      onChanged();
      return this;
    }

    private ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     * @return The config.
     */
    public ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public Builder setConfig(ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public Builder setConfig(
        ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public Builder mergeConfig(ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    public ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * Configurations for the synthesized voice
     * </pre>
     *
     * <code>.sensory.api.v1.audio.VoiceSynthesisConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.Builder, ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.SynthesizeSpeechRequest)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.SynthesizeSpeechRequest)
  private static final ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest();
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesizeSpeechRequest>
      PARSER = new com.google.protobuf.AbstractParser<SynthesizeSpeechRequest>() {
    @java.lang.Override
    public SynthesizeSpeechRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SynthesizeSpeechRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SynthesizeSpeechRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesizeSpeechRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

