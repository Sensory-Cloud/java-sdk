// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * The top-level message sent by the client for the `Authenticate` method.
 * Multiple `AuthenticateRequest` messages are sent in a stream. The first message
 * must contain a `config` message and must not contain `audioContent`.
 * All subsequent messages must contain `audioContent` and
 * must not contain a `config` message.
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.AuthenticateRequest}
 */
public final class AuthenticateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.AuthenticateRequest)
    AuthenticateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthenticateRequest.newBuilder() to construct.
  private AuthenticateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthenticateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthenticateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_AuthenticateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_AuthenticateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.AuthenticateRequest.class, ai.sensorycloud.api.v1.audio.AuthenticateRequest.Builder.class);
  }

  private int streamingRequestCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object streamingRequest_;
  public enum StreamingRequestCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIG(1),
    AUDIOCONTENT(2),
    STREAMINGREQUEST_NOT_SET(0);
    private final int value;
    private StreamingRequestCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StreamingRequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static StreamingRequestCase forNumber(int value) {
      switch (value) {
        case 1: return CONFIG;
        case 2: return AUDIOCONTENT;
        case 0: return STREAMINGREQUEST_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StreamingRequestCase
  getStreamingRequestCase() {
    return StreamingRequestCase.forNumber(
        streamingRequestCase_);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return streamingRequestCase_ == 1;
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
   * @return The config.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AuthenticateConfig getConfig() {
    if (streamingRequestCase_ == 1) {
       return (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_;
    }
    return ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AuthenticateConfigOrBuilder getConfigOrBuilder() {
    if (streamingRequestCase_ == 1) {
       return (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_;
    }
    return ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
  }

  public static final int AUDIOCONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `AuthenticateRequest` messages. The first
   * `AuthenticateRequest` message must not contain `audioContent` data
   * and all subsequent `AuthenticateRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `AuthenticateConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  @java.lang.Override
  public boolean hasAudioContent() {
    return streamingRequestCase_ == 2;
  }
  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `AuthenticateRequest` messages. The first
   * `AuthenticateRequest` message must not contain `audioContent` data
   * and all subsequent `AuthenticateRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `AuthenticateConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioContent() {
    if (streamingRequestCase_ == 2) {
      return (com.google.protobuf.ByteString) streamingRequest_;
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
    if (streamingRequestCase_ == 1) {
      output.writeMessage(1, (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_);
    }
    if (streamingRequestCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) streamingRequest_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamingRequestCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_);
    }
    if (streamingRequestCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) streamingRequest_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.AuthenticateRequest)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.AuthenticateRequest other = (ai.sensorycloud.api.v1.audio.AuthenticateRequest) obj;

    if (!getStreamingRequestCase().equals(other.getStreamingRequestCase())) return false;
    switch (streamingRequestCase_) {
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
    switch (streamingRequestCase_) {
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

  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.AuthenticateRequest prototype) {
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
   * The top-level message sent by the client for the `Authenticate` method.
   * Multiple `AuthenticateRequest` messages are sent in a stream. The first message
   * must contain a `config` message and must not contain `audioContent`.
   * All subsequent messages must contain `audioContent` and
   * must not contain a `config` message.
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.AuthenticateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.AuthenticateRequest)
      ai.sensorycloud.api.v1.audio.AuthenticateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_AuthenticateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_AuthenticateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.AuthenticateRequest.class, ai.sensorycloud.api.v1.audio.AuthenticateRequest.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.AuthenticateRequest.newBuilder()
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
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_AuthenticateRequest_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AuthenticateRequest getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.AuthenticateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AuthenticateRequest build() {
      ai.sensorycloud.api.v1.audio.AuthenticateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AuthenticateRequest buildPartial() {
      ai.sensorycloud.api.v1.audio.AuthenticateRequest result = new ai.sensorycloud.api.v1.audio.AuthenticateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.sensorycloud.api.v1.audio.AuthenticateRequest result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(ai.sensorycloud.api.v1.audio.AuthenticateRequest result) {
      result.streamingRequestCase_ = streamingRequestCase_;
      result.streamingRequest_ = this.streamingRequest_;
      if (streamingRequestCase_ == 1 &&
          configBuilder_ != null) {
        result.streamingRequest_ = configBuilder_.build();
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
      if (other instanceof ai.sensorycloud.api.v1.audio.AuthenticateRequest) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.AuthenticateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.AuthenticateRequest other) {
      if (other == ai.sensorycloud.api.v1.audio.AuthenticateRequest.getDefaultInstance()) return this;
      switch (other.getStreamingRequestCase()) {
        case CONFIG: {
          mergeConfig(other.getConfig());
          break;
        }
        case AUDIOCONTENT: {
          setAudioContent(other.getAudioContent());
          break;
        }
        case STREAMINGREQUEST_NOT_SET: {
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
              streamingRequestCase_ = 1;
              break;
            } // case 10
            case 18: {
              streamingRequest_ = input.readBytes();
              streamingRequestCase_ = 2;
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
    private int streamingRequestCase_ = 0;
    private java.lang.Object streamingRequest_;
    public StreamingRequestCase
        getStreamingRequestCase() {
      return StreamingRequestCase.forNumber(
          streamingRequestCase_);
    }

    public Builder clearStreamingRequest() {
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AuthenticateConfig, ai.sensorycloud.api.v1.audio.AuthenticateConfig.Builder, ai.sensorycloud.api.v1.audio.AuthenticateConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     * @return Whether the config field is set.
     */
    @java.lang.Override
    public boolean hasConfig() {
      return streamingRequestCase_ == 1;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     * @return The config.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AuthenticateConfig getConfig() {
      if (configBuilder_ == null) {
        if (streamingRequestCase_ == 1) {
          return (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_;
        }
        return ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
      } else {
        if (streamingRequestCase_ == 1) {
          return configBuilder_.getMessage();
        }
        return ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    public Builder setConfig(ai.sensorycloud.api.v1.audio.AuthenticateConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamingRequest_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    public Builder setConfig(
        ai.sensorycloud.api.v1.audio.AuthenticateConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        streamingRequest_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    public Builder mergeConfig(ai.sensorycloud.api.v1.audio.AuthenticateConfig value) {
      if (configBuilder_ == null) {
        if (streamingRequestCase_ == 1 &&
            streamingRequest_ != ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance()) {
          streamingRequest_ = ai.sensorycloud.api.v1.audio.AuthenticateConfig.newBuilder((ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_)
              .mergeFrom(value).buildPartial();
        } else {
          streamingRequest_ = value;
        }
        onChanged();
      } else {
        if (streamingRequestCase_ == 1) {
          configBuilder_.mergeFrom(value);
        } else {
          configBuilder_.setMessage(value);
        }
      }
      streamingRequestCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        if (streamingRequestCase_ == 1) {
          streamingRequestCase_ = 0;
          streamingRequest_ = null;
          onChanged();
        }
      } else {
        if (streamingRequestCase_ == 1) {
          streamingRequestCase_ = 0;
          streamingRequest_ = null;
        }
        configBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.AuthenticateConfig.Builder getConfigBuilder() {
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AuthenticateConfigOrBuilder getConfigOrBuilder() {
      if ((streamingRequestCase_ == 1) && (configBuilder_ != null)) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        if (streamingRequestCase_ == 1) {
          return (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_;
        }
        return ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `AuthenticateRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AuthenticateConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.AuthenticateConfig, ai.sensorycloud.api.v1.audio.AuthenticateConfig.Builder, ai.sensorycloud.api.v1.audio.AuthenticateConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        if (!(streamingRequestCase_ == 1)) {
          streamingRequest_ = ai.sensorycloud.api.v1.audio.AuthenticateConfig.getDefaultInstance();
        }
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.AuthenticateConfig, ai.sensorycloud.api.v1.audio.AuthenticateConfig.Builder, ai.sensorycloud.api.v1.audio.AuthenticateConfigOrBuilder>(
                (ai.sensorycloud.api.v1.audio.AuthenticateConfig) streamingRequest_,
                getParentForChildren(),
                isClean());
        streamingRequest_ = null;
      }
      streamingRequestCase_ = 1;
      onChanged();
      return configBuilder_;
    }

    /**
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `AuthenticateRequest` messages. The first
     * `AuthenticateRequest` message must not contain `audioContent` data
     * and all subsequent `AuthenticateRequest` messages must contain
     * `audioContent` data. The audio bytes must be encoded as specified in
     * `AuthenticateConfig`.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return Whether the audioContent field is set.
     */
    public boolean hasAudioContent() {
      return streamingRequestCase_ == 2;
    }
    /**
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `AuthenticateRequest` messages. The first
     * `AuthenticateRequest` message must not contain `audioContent` data
     * and all subsequent `AuthenticateRequest` messages must contain
     * `audioContent` data. The audio bytes must be encoded as specified in
     * `AuthenticateConfig`.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return The audioContent.
     */
    public com.google.protobuf.ByteString getAudioContent() {
      if (streamingRequestCase_ == 2) {
        return (com.google.protobuf.ByteString) streamingRequest_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `AuthenticateRequest` messages. The first
     * `AuthenticateRequest` message must not contain `audioContent` data
     * and all subsequent `AuthenticateRequest` messages must contain
     * `audioContent` data. The audio bytes must be encoded as specified in
     * `AuthenticateConfig`.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @param value The audioContent to set.
     * @return This builder for chaining.
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      streamingRequestCase_ = 2;
      streamingRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The audio data to be recognized. Sequential chunks of audio data are sent
     * in sequential `AuthenticateRequest` messages. The first
     * `AuthenticateRequest` message must not contain `audioContent` data
     * and all subsequent `AuthenticateRequest` messages must contain
     * `audioContent` data. The audio bytes must be encoded as specified in
     * `AuthenticateConfig`.
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioContent() {
      if (streamingRequestCase_ == 2) {
        streamingRequestCase_ = 0;
        streamingRequest_ = null;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.AuthenticateRequest)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.AuthenticateRequest)
  private static final ai.sensorycloud.api.v1.audio.AuthenticateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.AuthenticateRequest();
  }

  public static ai.sensorycloud.api.v1.audio.AuthenticateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticateRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticateRequest>() {
    @java.lang.Override
    public AuthenticateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthenticateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AuthenticateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

