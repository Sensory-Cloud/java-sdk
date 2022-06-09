// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Response to a public key request. Holds a byte array representing the public key.
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.PublicKeyResponse}
 */
public final class PublicKeyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.PublicKeyResponse)
    PublicKeyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicKeyResponse.newBuilder() to construct.
  private PublicKeyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicKeyResponse() {
    publicKey_ = com.google.protobuf.ByteString.EMPTY;
    keyType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicKeyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublicKeyResponse(
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

            publicKey_ = input.readBytes();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            keyType_ = rawValue;
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
    return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_PublicKeyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_PublicKeyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.oauth.PublicKeyResponse.class, ai.sensorycloud.api.oauth.PublicKeyResponse.Builder.class);
  }

  public static final int PUBLICKEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString publicKey_;
  /**
   * <pre>
   * The public key as bytes
   * </pre>
   *
   * <code>bytes publicKey = 1;</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicKey() {
    return publicKey_;
  }

  public static final int KEYTYPE_FIELD_NUMBER = 2;
  private int keyType_;
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 2;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  @java.lang.Override public int getKeyTypeValue() {
    return keyType_;
  }
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 2;</code>
   * @return The keyType.
   */
  @java.lang.Override public ai.sensorycloud.api.common.KeyType getKeyType() {
    @SuppressWarnings("deprecation")
    ai.sensorycloud.api.common.KeyType result = ai.sensorycloud.api.common.KeyType.valueOf(keyType_);
    return result == null ? ai.sensorycloud.api.common.KeyType.UNRECOGNIZED : result;
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
    if (!publicKey_.isEmpty()) {
      output.writeBytes(1, publicKey_);
    }
    if (keyType_ != ai.sensorycloud.api.common.KeyType.PUBLIC_KEY.getNumber()) {
      output.writeEnum(2, keyType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!publicKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, publicKey_);
    }
    if (keyType_ != ai.sensorycloud.api.common.KeyType.PUBLIC_KEY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, keyType_);
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
    if (!(obj instanceof ai.sensorycloud.api.oauth.PublicKeyResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.oauth.PublicKeyResponse other = (ai.sensorycloud.api.oauth.PublicKeyResponse) obj;

    if (!getPublicKey()
        .equals(other.getPublicKey())) return false;
    if (keyType_ != other.keyType_) return false;
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
    hash = (37 * hash) + PUBLICKEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (37 * hash) + KEYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + keyType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.oauth.PublicKeyResponse prototype) {
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
   * Response to a public key request. Holds a byte array representing the public key.
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.PublicKeyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.PublicKeyResponse)
      ai.sensorycloud.api.oauth.PublicKeyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_PublicKeyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_PublicKeyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.oauth.PublicKeyResponse.class, ai.sensorycloud.api.oauth.PublicKeyResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.oauth.PublicKeyResponse.newBuilder()
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
      publicKey_ = com.google.protobuf.ByteString.EMPTY;

      keyType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_PublicKeyResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.PublicKeyResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.oauth.PublicKeyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.PublicKeyResponse build() {
      ai.sensorycloud.api.oauth.PublicKeyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.PublicKeyResponse buildPartial() {
      ai.sensorycloud.api.oauth.PublicKeyResponse result = new ai.sensorycloud.api.oauth.PublicKeyResponse(this);
      result.publicKey_ = publicKey_;
      result.keyType_ = keyType_;
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
      if (other instanceof ai.sensorycloud.api.oauth.PublicKeyResponse) {
        return mergeFrom((ai.sensorycloud.api.oauth.PublicKeyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.oauth.PublicKeyResponse other) {
      if (other == ai.sensorycloud.api.oauth.PublicKeyResponse.getDefaultInstance()) return this;
      if (other.getPublicKey() != com.google.protobuf.ByteString.EMPTY) {
        setPublicKey(other.getPublicKey());
      }
      if (other.keyType_ != 0) {
        setKeyTypeValue(other.getKeyTypeValue());
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
      ai.sensorycloud.api.oauth.PublicKeyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.oauth.PublicKeyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The public key as bytes
     * </pre>
     *
     * <code>bytes publicKey = 1;</code>
     * @return The publicKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }
    /**
     * <pre>
     * The public key as bytes
     * </pre>
     *
     * <code>bytes publicKey = 1;</code>
     * @param value The publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The public key as bytes
     * </pre>
     *
     * <code>bytes publicKey = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicKey() {
      
      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }

    private int keyType_ = 0;
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 2;</code>
     * @return The enum numeric value on the wire for keyType.
     */
    @java.lang.Override public int getKeyTypeValue() {
      return keyType_;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 2;</code>
     * @param value The enum numeric value on the wire for keyType to set.
     * @return This builder for chaining.
     */
    public Builder setKeyTypeValue(int value) {
      
      keyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 2;</code>
     * @return The keyType.
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.KeyType getKeyType() {
      @SuppressWarnings("deprecation")
      ai.sensorycloud.api.common.KeyType result = ai.sensorycloud.api.common.KeyType.valueOf(keyType_);
      return result == null ? ai.sensorycloud.api.common.KeyType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 2;</code>
     * @param value The keyType to set.
     * @return This builder for chaining.
     */
    public Builder setKeyType(ai.sensorycloud.api.common.KeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      keyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyType() {
      
      keyType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.PublicKeyResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.oauth.PublicKeyResponse)
  private static final ai.sensorycloud.api.oauth.PublicKeyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.oauth.PublicKeyResponse();
  }

  public static ai.sensorycloud.api.oauth.PublicKeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKeyResponse>
      PARSER = new com.google.protobuf.AbstractParser<PublicKeyResponse>() {
    @java.lang.Override
    public PublicKeyResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PublicKeyResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublicKeyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKeyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.oauth.PublicKeyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
