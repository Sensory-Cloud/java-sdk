// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * A message with an encrypted enrollment token and a token expiration date
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.EnrollmentToken}
 */
public final class EnrollmentToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.EnrollmentToken)
    EnrollmentTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnrollmentToken.newBuilder() to construct.
  private EnrollmentToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnrollmentToken() {
    token_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnrollmentToken();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EnrollmentToken(
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

            token_ = input.readBytes();
            break;
          }
          case 16: {

            expiration_ = input.readInt64();
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
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_EnrollmentToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_EnrollmentToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.common.EnrollmentToken.class, ai.sensorycloud.api.common.EnrollmentToken.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString token_;
  /**
   * <pre>
   * Encrypted token containing enrollment information
   * </pre>
   *
   * <code>bytes token = 1;</code>
   * @return The token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getToken() {
    return token_;
  }

  public static final int EXPIRATION_FIELD_NUMBER = 2;
  private long expiration_;
  /**
   * <pre>
   * The number of seconds until the enrollment token expires
   * An expiration of 0 means that the enrollment token never expires
   * </pre>
   *
   * <code>int64 expiration = 2;</code>
   * @return The expiration.
   */
  @java.lang.Override
  public long getExpiration() {
    return expiration_;
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
    if (!token_.isEmpty()) {
      output.writeBytes(1, token_);
    }
    if (expiration_ != 0L) {
      output.writeInt64(2, expiration_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!token_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, token_);
    }
    if (expiration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, expiration_);
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
    if (!(obj instanceof ai.sensorycloud.api.common.EnrollmentToken)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.common.EnrollmentToken other = (ai.sensorycloud.api.common.EnrollmentToken) obj;

    if (!getToken()
        .equals(other.getToken())) return false;
    if (getExpiration()
        != other.getExpiration()) return false;
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
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + EXPIRATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpiration());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.EnrollmentToken parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.common.EnrollmentToken prototype) {
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
   * A message with an encrypted enrollment token and a token expiration date
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.EnrollmentToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.EnrollmentToken)
      ai.sensorycloud.api.common.EnrollmentTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_EnrollmentToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_EnrollmentToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.common.EnrollmentToken.class, ai.sensorycloud.api.common.EnrollmentToken.Builder.class);
    }

    // Construct using ai.sensorycloud.api.common.EnrollmentToken.newBuilder()
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
      token_ = com.google.protobuf.ByteString.EMPTY;

      expiration_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_EnrollmentToken_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.EnrollmentToken getDefaultInstanceForType() {
      return ai.sensorycloud.api.common.EnrollmentToken.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.EnrollmentToken build() {
      ai.sensorycloud.api.common.EnrollmentToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.EnrollmentToken buildPartial() {
      ai.sensorycloud.api.common.EnrollmentToken result = new ai.sensorycloud.api.common.EnrollmentToken(this);
      result.token_ = token_;
      result.expiration_ = expiration_;
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
      if (other instanceof ai.sensorycloud.api.common.EnrollmentToken) {
        return mergeFrom((ai.sensorycloud.api.common.EnrollmentToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.common.EnrollmentToken other) {
      if (other == ai.sensorycloud.api.common.EnrollmentToken.getDefaultInstance()) return this;
      if (other.getToken() != com.google.protobuf.ByteString.EMPTY) {
        setToken(other.getToken());
      }
      if (other.getExpiration() != 0L) {
        setExpiration(other.getExpiration());
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
      ai.sensorycloud.api.common.EnrollmentToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.common.EnrollmentToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString token_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Encrypted token containing enrollment information
     * </pre>
     *
     * <code>bytes token = 1;</code>
     * @return The token.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getToken() {
      return token_;
    }
    /**
     * <pre>
     * Encrypted token containing enrollment information
     * </pre>
     *
     * <code>bytes token = 1;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encrypted token containing enrollment information
     * </pre>
     *
     * <code>bytes token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }

    private long expiration_ ;
    /**
     * <pre>
     * The number of seconds until the enrollment token expires
     * An expiration of 0 means that the enrollment token never expires
     * </pre>
     *
     * <code>int64 expiration = 2;</code>
     * @return The expiration.
     */
    @java.lang.Override
    public long getExpiration() {
      return expiration_;
    }
    /**
     * <pre>
     * The number of seconds until the enrollment token expires
     * An expiration of 0 means that the enrollment token never expires
     * </pre>
     *
     * <code>int64 expiration = 2;</code>
     * @param value The expiration to set.
     * @return This builder for chaining.
     */
    public Builder setExpiration(long value) {
      
      expiration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of seconds until the enrollment token expires
     * An expiration of 0 means that the enrollment token never expires
     * </pre>
     *
     * <code>int64 expiration = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiration() {
      
      expiration_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.common.EnrollmentToken)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.common.EnrollmentToken)
  private static final ai.sensorycloud.api.common.EnrollmentToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.common.EnrollmentToken();
  }

  public static ai.sensorycloud.api.common.EnrollmentToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnrollmentToken>
      PARSER = new com.google.protobuf.AbstractParser<EnrollmentToken>() {
    @java.lang.Override
    public EnrollmentToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EnrollmentToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnrollmentToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnrollmentToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.common.EnrollmentToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

