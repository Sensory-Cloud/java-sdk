// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * <pre>
 * A message from the assistant
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.assistant.AssistantMessage}
 */
public final class AssistantMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.AssistantMessage)
    AssistantMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssistantMessage.newBuilder() to construct.
  private AssistantMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssistantMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssistantMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssistantMessage(
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
            messageCase_ = 1;
            message_ = s;
            break;
          }
          case 18: {
            message_ = input.readBytes();
            messageCase_ = 2;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.internal_static_sensory_api_v1_assistant_AssistantMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.internal_static_sensory_api_v1_assistant_AssistantMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.assistant.AssistantMessage.class, ai.sensorycloud.api.v1.assistant.AssistantMessage.Builder.class);
  }

  private int messageCase_ = 0;
  private java.lang.Object message_;
  public enum MessageCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEXT(1),
    AUDIOCONTENT(2),
    MESSAGE_NOT_SET(0);
    private final int value;
    private MessageCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessageCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT;
        case 2: return AUDIOCONTENT;
        case 0: return MESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MessageCase
  getMessageCase() {
    return MessageCase.forNumber(
        messageCase_);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the text field is set.
   */
  public boolean hasText() {
    return messageCase_ == 1;
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return The text.
   */
  public java.lang.String getText() {
    java.lang.Object ref = "";
    if (messageCase_ == 1) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (messageCase_ == 1) {
        message_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for text.
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = "";
    if (messageCase_ == 1) {
      ref = message_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (messageCase_ == 1) {
        message_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIOCONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  @java.lang.Override
  public boolean hasAudioContent() {
    return messageCase_ == 2;
  }
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioContent() {
    if (messageCase_ == 2) {
      return (com.google.protobuf.ByteString) message_;
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
    if (messageCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (messageCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (messageCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) message_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.assistant.AssistantMessage)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.assistant.AssistantMessage other = (ai.sensorycloud.api.v1.assistant.AssistantMessage) obj;

    if (!getMessageCase().equals(other.getMessageCase())) return false;
    switch (messageCase_) {
      case 1:
        if (!getText()
            .equals(other.getText())) return false;
        break;
      case 2:
        if (!getAudioContent()
            .equals(other.getAudioContent())) return false;
        break;
      case 0:
      default:
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
    switch (messageCase_) {
      case 1:
        hash = (37 * hash) + TEXT_FIELD_NUMBER;
        hash = (53 * hash) + getText().hashCode();
        break;
      case 2:
        hash = (37 * hash) + AUDIOCONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAudioContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.AssistantMessage prototype) {
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
   * A message from the assistant
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.assistant.AssistantMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.AssistantMessage)
      ai.sensorycloud.api.v1.assistant.AssistantMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.internal_static_sensory_api_v1_assistant_AssistantMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.internal_static_sensory_api_v1_assistant_AssistantMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.assistant.AssistantMessage.class, ai.sensorycloud.api.v1.assistant.AssistantMessage.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.assistant.AssistantMessage.newBuilder()
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
      messageCase_ = 0;
      message_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.internal_static_sensory_api_v1_assistant_AssistantMessage_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.AssistantMessage getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.assistant.AssistantMessage.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.AssistantMessage build() {
      ai.sensorycloud.api.v1.assistant.AssistantMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.AssistantMessage buildPartial() {
      ai.sensorycloud.api.v1.assistant.AssistantMessage result = new ai.sensorycloud.api.v1.assistant.AssistantMessage(this);
      if (messageCase_ == 1) {
        result.message_ = message_;
      }
      if (messageCase_ == 2) {
        result.message_ = message_;
      }
      result.messageCase_ = messageCase_;
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
      if (other instanceof ai.sensorycloud.api.v1.assistant.AssistantMessage) {
        return mergeFrom((ai.sensorycloud.api.v1.assistant.AssistantMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.assistant.AssistantMessage other) {
      if (other == ai.sensorycloud.api.v1.assistant.AssistantMessage.getDefaultInstance()) return this;
      switch (other.getMessageCase()) {
        case TEXT: {
          messageCase_ = 1;
          message_ = other.message_;
          onChanged();
          break;
        }
        case AUDIOCONTENT: {
          setAudioContent(other.getAudioContent());
          break;
        }
        case MESSAGE_NOT_SET: {
          break;
        }
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
      ai.sensorycloud.api.v1.assistant.AssistantMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.assistant.AssistantMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int messageCase_ = 0;
    private java.lang.Object message_;
    public MessageCase
        getMessageCase() {
      return MessageCase.forNumber(
          messageCase_);
    }

    public Builder clearMessage() {
      messageCase_ = 0;
      message_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return messageCase_ == 1;
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      java.lang.Object ref = "";
      if (messageCase_ == 1) {
        ref = message_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (messageCase_ == 1) {
          message_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = "";
      if (messageCase_ == 1) {
        ref = message_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (messageCase_ == 1) {
          message_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  messageCase_ = 1;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      if (messageCase_ == 1) {
        messageCase_ = 0;
        message_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      messageCase_ = 1;
      message_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return Whether the audioContent field is set.
     */
    public boolean hasAudioContent() {
      return messageCase_ == 2;
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return The audioContent.
     */
    public com.google.protobuf.ByteString getAudioContent() {
      if (messageCase_ == 2) {
        return (com.google.protobuf.ByteString) message_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @param value The audioContent to set.
     * @return This builder for chaining.
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  messageCase_ = 2;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioContent() {
      if (messageCase_ == 2) {
        messageCase_ = 0;
        message_ = null;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.AssistantMessage)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.AssistantMessage)
  private static final ai.sensorycloud.api.v1.assistant.AssistantMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.assistant.AssistantMessage();
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssistantMessage>
      PARSER = new com.google.protobuf.AbstractParser<AssistantMessage>() {
    @java.lang.Override
    public AssistantMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssistantMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssistantMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssistantMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.AssistantMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
