// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Word Level Transcription Data
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.TranscribeWordResponse}
 */
public final class TranscribeWordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.TranscribeWordResponse)
    TranscribeWordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TranscribeWordResponse.newBuilder() to construct.
  private TranscribeWordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TranscribeWordResponse() {
    words_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TranscribeWordResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TranscribeWordResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              words_ = new java.util.ArrayList<ai.sensorycloud.api.v1.audio.TranscribeWord>();
              mutable_bitField0_ |= 0x00000001;
            }
            words_.add(
                input.readMessage(ai.sensorycloud.api.v1.audio.TranscribeWord.parser(), extensionRegistry));
            break;
          }
          case 16: {

            firstWordIndex_ = input.readUInt64();
            break;
          }
          case 24: {

            lastWordIndex_ = input.readUInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        words_ = java.util.Collections.unmodifiableList(words_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_TranscribeWordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_TranscribeWordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.audio.TranscribeWordResponse.class, ai.sensorycloud.api.v1.audio.TranscribeWordResponse.Builder.class);
  }

  public static final int WORDS_FIELD_NUMBER = 1;
  private java.util.List<ai.sensorycloud.api.v1.audio.TranscribeWord> words_;
  /**
   * <pre>
   * An array of TranscribeWords
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.audio.TranscribeWord> getWordsList() {
    return words_;
  }
  /**
   * <pre>
   * An array of TranscribeWords
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder> 
      getWordsOrBuilderList() {
    return words_;
  }
  /**
   * <pre>
   * An array of TranscribeWords
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
   */
  @java.lang.Override
  public int getWordsCount() {
    return words_.size();
  }
  /**
   * <pre>
   * An array of TranscribeWords
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.TranscribeWord getWords(int index) {
    return words_.get(index);
  }
  /**
   * <pre>
   * An array of TranscribeWords
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder getWordsOrBuilder(
      int index) {
    return words_.get(index);
  }

  public static final int FIRSTWORDINDEX_FIELD_NUMBER = 2;
  private long firstWordIndex_;
  /**
   * <pre>
   * Lowest index of the words in wordList
   * </pre>
   *
   * <code>uint64 firstWordIndex = 2;</code>
   * @return The firstWordIndex.
   */
  @java.lang.Override
  public long getFirstWordIndex() {
    return firstWordIndex_;
  }

  public static final int LASTWORDINDEX_FIELD_NUMBER = 3;
  private long lastWordIndex_;
  /**
   * <pre>
   * Highest index of the words in wordList
   * </pre>
   *
   * <code>uint64 lastWordIndex = 3;</code>
   * @return The lastWordIndex.
   */
  @java.lang.Override
  public long getLastWordIndex() {
    return lastWordIndex_;
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
    for (int i = 0; i < words_.size(); i++) {
      output.writeMessage(1, words_.get(i));
    }
    if (firstWordIndex_ != 0L) {
      output.writeUInt64(2, firstWordIndex_);
    }
    if (lastWordIndex_ != 0L) {
      output.writeUInt64(3, lastWordIndex_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < words_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, words_.get(i));
    }
    if (firstWordIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, firstWordIndex_);
    }
    if (lastWordIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, lastWordIndex_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.audio.TranscribeWordResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.audio.TranscribeWordResponse other = (ai.sensorycloud.api.v1.audio.TranscribeWordResponse) obj;

    if (!getWordsList()
        .equals(other.getWordsList())) return false;
    if (getFirstWordIndex()
        != other.getFirstWordIndex()) return false;
    if (getLastWordIndex()
        != other.getLastWordIndex()) return false;
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
    if (getWordsCount() > 0) {
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWordsList().hashCode();
    }
    hash = (37 * hash) + FIRSTWORDINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFirstWordIndex());
    hash = (37 * hash) + LASTWORDINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastWordIndex());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.TranscribeWordResponse prototype) {
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
   * Word Level Transcription Data
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.TranscribeWordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.TranscribeWordResponse)
      ai.sensorycloud.api.v1.audio.TranscribeWordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_TranscribeWordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_TranscribeWordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.audio.TranscribeWordResponse.class, ai.sensorycloud.api.v1.audio.TranscribeWordResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.audio.TranscribeWordResponse.newBuilder()
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
        getWordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        wordsBuilder_.clear();
      }
      firstWordIndex_ = 0L;

      lastWordIndex_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.audio.SensoryApiV1AudioProto.internal_static_sensory_api_v1_audio_TranscribeWordResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.TranscribeWordResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.audio.TranscribeWordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.TranscribeWordResponse build() {
      ai.sensorycloud.api.v1.audio.TranscribeWordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.TranscribeWordResponse buildPartial() {
      ai.sensorycloud.api.v1.audio.TranscribeWordResponse result = new ai.sensorycloud.api.v1.audio.TranscribeWordResponse(this);
      int from_bitField0_ = bitField0_;
      if (wordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          words_ = java.util.Collections.unmodifiableList(words_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.words_ = words_;
      } else {
        result.words_ = wordsBuilder_.build();
      }
      result.firstWordIndex_ = firstWordIndex_;
      result.lastWordIndex_ = lastWordIndex_;
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
      if (other instanceof ai.sensorycloud.api.v1.audio.TranscribeWordResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.audio.TranscribeWordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.audio.TranscribeWordResponse other) {
      if (other == ai.sensorycloud.api.v1.audio.TranscribeWordResponse.getDefaultInstance()) return this;
      if (wordsBuilder_ == null) {
        if (!other.words_.isEmpty()) {
          if (words_.isEmpty()) {
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWordsIsMutable();
            words_.addAll(other.words_);
          }
          onChanged();
        }
      } else {
        if (!other.words_.isEmpty()) {
          if (wordsBuilder_.isEmpty()) {
            wordsBuilder_.dispose();
            wordsBuilder_ = null;
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000001);
            wordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWordsFieldBuilder() : null;
          } else {
            wordsBuilder_.addAllMessages(other.words_);
          }
        }
      }
      if (other.getFirstWordIndex() != 0L) {
        setFirstWordIndex(other.getFirstWordIndex());
      }
      if (other.getLastWordIndex() != 0L) {
        setLastWordIndex(other.getLastWordIndex());
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
      ai.sensorycloud.api.v1.audio.TranscribeWordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.audio.TranscribeWordResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ai.sensorycloud.api.v1.audio.TranscribeWord> words_ =
      java.util.Collections.emptyList();
    private void ensureWordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        words_ = new java.util.ArrayList<ai.sensorycloud.api.v1.audio.TranscribeWord>(words_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.TranscribeWord, ai.sensorycloud.api.v1.audio.TranscribeWord.Builder, ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder> wordsBuilder_;

    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.audio.TranscribeWord> getWordsList() {
      if (wordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(words_);
      } else {
        return wordsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public int getWordsCount() {
      if (wordsBuilder_ == null) {
        return words_.size();
      } else {
        return wordsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.TranscribeWord getWords(int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);
      } else {
        return wordsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder setWords(
        int index, ai.sensorycloud.api.v1.audio.TranscribeWord value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.set(index, value);
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder setWords(
        int index, ai.sensorycloud.api.v1.audio.TranscribeWord.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.set(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder addWords(ai.sensorycloud.api.v1.audio.TranscribeWord value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder addWords(
        int index, ai.sensorycloud.api.v1.audio.TranscribeWord value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(index, value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder addWords(
        ai.sensorycloud.api.v1.audio.TranscribeWord.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder addWords(
        int index, ai.sensorycloud.api.v1.audio.TranscribeWord.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder addAllWords(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.audio.TranscribeWord> values) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, words_);
        onChanged();
      } else {
        wordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder clearWords() {
      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        wordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public Builder removeWords(int index) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.remove(index);
        onChanged();
      } else {
        wordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.TranscribeWord.Builder getWordsBuilder(
        int index) {
      return getWordsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder getWordsOrBuilder(
        int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);  } else {
        return wordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public java.util.List<? extends ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder> 
         getWordsOrBuilderList() {
      if (wordsBuilder_ != null) {
        return wordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(words_);
      }
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.TranscribeWord.Builder addWordsBuilder() {
      return getWordsFieldBuilder().addBuilder(
          ai.sensorycloud.api.v1.audio.TranscribeWord.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public ai.sensorycloud.api.v1.audio.TranscribeWord.Builder addWordsBuilder(
        int index) {
      return getWordsFieldBuilder().addBuilder(
          index, ai.sensorycloud.api.v1.audio.TranscribeWord.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of TranscribeWords
     * </pre>
     *
     * <code>repeated .sensory.api.v1.audio.TranscribeWord words = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.audio.TranscribeWord.Builder> 
         getWordsBuilderList() {
      return getWordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.audio.TranscribeWord, ai.sensorycloud.api.v1.audio.TranscribeWord.Builder, ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder> 
        getWordsFieldBuilder() {
      if (wordsBuilder_ == null) {
        wordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.sensorycloud.api.v1.audio.TranscribeWord, ai.sensorycloud.api.v1.audio.TranscribeWord.Builder, ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder>(
                words_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        words_ = null;
      }
      return wordsBuilder_;
    }

    private long firstWordIndex_ ;
    /**
     * <pre>
     * Lowest index of the words in wordList
     * </pre>
     *
     * <code>uint64 firstWordIndex = 2;</code>
     * @return The firstWordIndex.
     */
    @java.lang.Override
    public long getFirstWordIndex() {
      return firstWordIndex_;
    }
    /**
     * <pre>
     * Lowest index of the words in wordList
     * </pre>
     *
     * <code>uint64 firstWordIndex = 2;</code>
     * @param value The firstWordIndex to set.
     * @return This builder for chaining.
     */
    public Builder setFirstWordIndex(long value) {
      
      firstWordIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lowest index of the words in wordList
     * </pre>
     *
     * <code>uint64 firstWordIndex = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstWordIndex() {
      
      firstWordIndex_ = 0L;
      onChanged();
      return this;
    }

    private long lastWordIndex_ ;
    /**
     * <pre>
     * Highest index of the words in wordList
     * </pre>
     *
     * <code>uint64 lastWordIndex = 3;</code>
     * @return The lastWordIndex.
     */
    @java.lang.Override
    public long getLastWordIndex() {
      return lastWordIndex_;
    }
    /**
     * <pre>
     * Highest index of the words in wordList
     * </pre>
     *
     * <code>uint64 lastWordIndex = 3;</code>
     * @param value The lastWordIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLastWordIndex(long value) {
      
      lastWordIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Highest index of the words in wordList
     * </pre>
     *
     * <code>uint64 lastWordIndex = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastWordIndex() {
      
      lastWordIndex_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.TranscribeWordResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.TranscribeWordResponse)
  private static final ai.sensorycloud.api.v1.audio.TranscribeWordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.audio.TranscribeWordResponse();
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeWordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranscribeWordResponse>
      PARSER = new com.google.protobuf.AbstractParser<TranscribeWordResponse>() {
    @java.lang.Override
    public TranscribeWordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TranscribeWordResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TranscribeWordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranscribeWordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.TranscribeWordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

