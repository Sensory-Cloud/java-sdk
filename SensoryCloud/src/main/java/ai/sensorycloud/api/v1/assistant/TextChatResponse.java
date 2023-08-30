// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * Protobuf type {@code sensory.api.v1.assistant.TextChatResponse}
 */
public final class TextChatResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.TextChatResponse)
    TextChatResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextChatResponse.newBuilder() to construct.
  private TextChatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextChatResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextChatResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.assistant.SensoryApiV1ManagementServerProto.internal_static_sensory_api_v1_assistant_TextChatResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.assistant.SensoryApiV1ManagementServerProto.internal_static_sensory_api_v1_assistant_TextChatResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.assistant.TextChatResponse.class, ai.sensorycloud.api.v1.assistant.TextChatResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private ai.sensorycloud.api.v1.assistant.ChatMessage message_;
  /**
   * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.ChatMessage getMessage() {
    return message_ == null ? ai.sensorycloud.api.v1.assistant.ChatMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? ai.sensorycloud.api.v1.assistant.ChatMessage.getDefaultInstance() : message_;
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
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
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
    if (!(obj instanceof ai.sensorycloud.api.v1.assistant.TextChatResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.assistant.TextChatResponse other = (ai.sensorycloud.api.v1.assistant.TextChatResponse) obj;

    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.TextChatResponse prototype) {
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
   * Protobuf type {@code sensory.api.v1.assistant.TextChatResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.TextChatResponse)
      ai.sensorycloud.api.v1.assistant.TextChatResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1ManagementServerProto.internal_static_sensory_api_v1_assistant_TextChatResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1ManagementServerProto.internal_static_sensory_api_v1_assistant_TextChatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.assistant.TextChatResponse.class, ai.sensorycloud.api.v1.assistant.TextChatResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.assistant.TextChatResponse.newBuilder()
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
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1ManagementServerProto.internal_static_sensory_api_v1_assistant_TextChatResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.TextChatResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.assistant.TextChatResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.TextChatResponse build() {
      ai.sensorycloud.api.v1.assistant.TextChatResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.TextChatResponse buildPartial() {
      ai.sensorycloud.api.v1.assistant.TextChatResponse result = new ai.sensorycloud.api.v1.assistant.TextChatResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.sensorycloud.api.v1.assistant.TextChatResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
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
      if (other instanceof ai.sensorycloud.api.v1.assistant.TextChatResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.assistant.TextChatResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.assistant.TextChatResponse other) {
      if (other == ai.sensorycloud.api.v1.assistant.TextChatResponse.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
    private int bitField0_;

    private ai.sensorycloud.api.v1.assistant.ChatMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.assistant.ChatMessage, ai.sensorycloud.api.v1.assistant.ChatMessage.Builder, ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder> messageBuilder_;
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     * @return The message.
     */
    public ai.sensorycloud.api.v1.assistant.ChatMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? ai.sensorycloud.api.v1.assistant.ChatMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public Builder setMessage(ai.sensorycloud.api.v1.assistant.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
      } else {
        messageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public Builder setMessage(
        ai.sensorycloud.api.v1.assistant.ChatMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public Builder mergeMessage(ai.sensorycloud.api.v1.assistant.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          message_ != null &&
          message_ != ai.sensorycloud.api.v1.assistant.ChatMessage.getDefaultInstance()) {
          getMessageBuilder().mergeFrom(value);
        } else {
          message_ = value;
        }
      } else {
        messageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public ai.sensorycloud.api.v1.assistant.ChatMessage.Builder getMessageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    public ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            ai.sensorycloud.api.v1.assistant.ChatMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatMessage message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.v1.assistant.ChatMessage, ai.sensorycloud.api.v1.assistant.ChatMessage.Builder, ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.v1.assistant.ChatMessage, ai.sensorycloud.api.v1.assistant.ChatMessage.Builder, ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.TextChatResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.TextChatResponse)
  private static final ai.sensorycloud.api.v1.assistant.TextChatResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.assistant.TextChatResponse();
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextChatResponse>
      PARSER = new com.google.protobuf.AbstractParser<TextChatResponse>() {
    @java.lang.Override
    public TextChatResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextChatResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextChatResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.TextChatResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

