// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * The response to a speech synthesis request
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.SynthesizeSpeechResponse}
 */
public final class SynthesizeSpeechResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.SynthesizeSpeechResponse)
    SynthesizeSpeechResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SynthesizeSpeechResponse.newBuilder() to construct.
  private SynthesizeSpeechResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SynthesizeSpeechResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SynthesizeSpeechResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.class, ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.Builder.class);
  }

  private int streamingResponseCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object streamingResponse_;
  public enum StreamingResponseCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIG(1),
    AUDIOCONTENT(2),
    STREAMINGRESPONSE_NOT_SET(0);
    private final int value;
    private StreamingResponseCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StreamingResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static StreamingResponseCase forNumber(int value) {
      switch (value) {
        case 1: return CONFIG;
        case 2: return AUDIOCONTENT;
        case 0: return STREAMINGRESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StreamingResponseCase
  getStreamingResponseCase() {
    return StreamingResponseCase.forNumber(
        streamingResponseCase_);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return streamingResponseCase_ == 1;
  }
  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   * @return The config.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioConfig getConfig() {
    if (streamingResponseCase_ == 1) {
       return (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_;
    }
    return ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Provides information that specifies how the audio has been formatted.
   * The first `SpeechSynthesisResponse` message will contain a `config` message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getConfigOrBuilder() {
    if (streamingResponseCase_ == 1) {
       return (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_;
    }
    return ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
  }

  public static final int AUDIOCONTENT_FIELD_NUMBER = 2;
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
  @java.lang.Override
  public boolean hasAudioContent() {
    return streamingResponseCase_ == 2;
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioContent() {
    if (streamingResponseCase_ == 2) {
      return (com.google.protobuf.ByteString) streamingResponse_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (streamingResponseCase_ == 1) {
      output.writeMessage(1, (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_);
    }
    if (streamingResponseCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) streamingResponse_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamingResponseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_);
    }
    if (streamingResponseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) streamingResponse_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse other = (ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse) obj;

    if (!getStreamingResponseCase().equals(other.getStreamingResponseCase())) return false;
    switch (streamingResponseCase_) {
      case 1:
        if (!getConfig()
            .equals(other.getConfig())) return false;
        break;
      case 2:
        if (!getAudioContent()
            .equals(other.getAudioContent())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (streamingResponseCase_) {
      case 1:
        hash = (37 * hash) + CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getConfig().hashCode();
        break;
      case 2:
        hash = (37 * hash) + AUDIOCONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAudioContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse prototype) {
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
   * The response to a speech synthesis request
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.SynthesizeSpeechResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.SynthesizeSpeechResponse)
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.class, ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (configBuilder_ != null) {
        configBuilder_.clear();
      }
      streamingResponseCase_ = 0;
      streamingResponse_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_SynthesizeSpeechResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse build() {
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse buildPartial() {
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse result = new ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse result) {
      result.streamingResponseCase_ = streamingResponseCase_;
      result.streamingResponse_ = this.streamingResponse_;
      if (streamingResponseCase_ == 1 &&
          configBuilder_ != null) {
        result.streamingResponse_ = configBuilder_.build();
      }
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
      if (other instanceof ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse other) {
      if (other == ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.getDefaultInstance()) return this;
      switch (other.getStreamingResponseCase()) {
        case CONFIG: {
          mergeConfig(other.getConfig());
          break;
        }
        case AUDIOCONTENT: {
          setAudioContent(other.getAudioContent());
          break;
        }
        case STREAMINGRESPONSE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              streamingResponseCase_ = 1;
              break;
            } // case 10
            case 18: {
              streamingResponse_ = input.readBytes();
              streamingResponseCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int streamingResponseCase_ = 0;
    private java.lang.Object streamingResponse_;
    public StreamingResponseCase
        getStreamingResponseCase() {
      return StreamingResponseCase.forNumber(
          streamingResponseCase_);
    }

    public Builder clearStreamingResponse() {
      streamingResponseCase_ = 0;
      streamingResponse_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     * @return Whether the config field is set.
     */
    @java.lang.Override
    public boolean hasConfig() {
      return streamingResponseCase_ == 1;
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     * @return The config.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AudioConfig getConfig() {
      if (configBuilder_ == null) {
        if (streamingResponseCase_ == 1) {
          return (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_;
        }
        return ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
      } else {
        if (streamingResponseCase_ == 1) {
          return configBuilder_.getMessage();
        }
        return ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    public Builder setConfig(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamingResponse_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }
      streamingResponseCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    public Builder setConfig(
        ai.sensorycloud.api.v1.audio.AudioConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        streamingResponse_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      streamingResponseCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    public Builder mergeConfig(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      if (configBuilder_ == null) {
        if (streamingResponseCase_ == 1 &&
            streamingResponse_ != ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance()) {
          streamingResponse_ = ai.sensorycloud.api.v1.audio.AudioConfig.newBuilder((ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          streamingResponse_ = value;
        }
        onChanged();
      } else {
        if (streamingResponseCase_ == 1) {
          configBuilder_.mergeFrom(value);
        } else {
          configBuilder_.setMessage(value);
        }
      }
      streamingResponseCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        if (streamingResponseCase_ == 1) {
          streamingResponseCase_ = 0;
          streamingResponse_ = null;
          onChanged();
        }
      } else {
        if (streamingResponseCase_ == 1) {
          streamingResponseCase_ = 0;
          streamingResponse_ = null;
        }
        configBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.AudioConfig.Builder getConfigBuilder() {
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder getConfigOrBuilder() {
      if ((streamingResponseCase_ == 1) && (configBuilder_ != null)) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        if (streamingResponseCase_ == 1) {
          return (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_;
        }
        return ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides information that specifies how the audio has been formatted.
     * The first `SpeechSynthesisResponse` message will contain a `config` message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        if (!(streamingResponseCase_ == 1)) {
          streamingResponse_ = ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance();
        }
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.AudioConfig, ai.sensorycloud.api.v1.audio.AudioConfig.Builder, ai.sensorycloud.api.v1.audio.AudioConfigOrBuilder>(
                (ai.sensorycloud.api.v1.audio.AudioConfig) streamingResponse_,
                getParentForChildren(),
                isClean());
        streamingResponse_ = null;
      }
      streamingResponseCase_ = 1;
      onChanged();
      return configBuilder_;
    }

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
    public boolean hasAudioContent() {
      return streamingResponseCase_ == 2;
    }
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
    public com.google.protobuf.ByteString getAudioContent() {
      if (streamingResponseCase_ == 2) {
        return (com.google.protobuf.ByteString) streamingResponse_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * The synthesized audio data. Sequential chunks of audio data are sent in
     * sequential `SpeechSynthesisResponse` messages. The first `SpeechSynthesisResponse`
     * message will only contain `config` data and all supsequent `SpeechSynthesisResponse`
     * messages will contain `audioContent` data.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @param value The audioContent to set.
     * @return This builder for chaining.
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      streamingResponseCase_ = 2;
      streamingResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The synthesized audio data. Sequential chunks of audio data are sent in
     * sequential `SpeechSynthesisResponse` messages. The first `SpeechSynthesisResponse`
     * message will only contain `config` data and all supsequent `SpeechSynthesisResponse`
     * messages will contain `audioContent` data.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioContent() {
      if (streamingResponseCase_ == 2) {
        streamingResponseCase_ = 0;
        streamingResponse_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.SynthesizeSpeechResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.SynthesizeSpeechResponse)
  private static final ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse();
  }

  public static ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesizeSpeechResponse>
      PARSER = new com.google.protobuf.AbstractParser<SynthesizeSpeechResponse>() {
    @java.lang.Override
    public SynthesizeSpeechResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SynthesizeSpeechResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesizeSpeechResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

