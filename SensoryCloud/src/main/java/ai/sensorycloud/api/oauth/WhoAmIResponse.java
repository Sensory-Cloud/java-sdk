// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Response contect generated from the passed authorization token
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.WhoAmIResponse}
 */
public final class WhoAmIResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.WhoAmIResponse)
    WhoAmIResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WhoAmIResponse.newBuilder() to construct.
  private WhoAmIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WhoAmIResponse() {
    clientId_ = "";
    tenantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WhoAmIResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_WhoAmIResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_WhoAmIResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.oauth.WhoAmIResponse.class, ai.sensorycloud.api.oauth.WhoAmIResponse.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANTID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tenantId_ = "";
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tenantId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tenantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tenantId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tenantId_);
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
    if (!(obj instanceof ai.sensorycloud.api.oauth.WhoAmIResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.oauth.WhoAmIResponse other = (ai.sensorycloud.api.oauth.WhoAmIResponse) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getTenantId()
        .equals(other.getTenantId())) return false;
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
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + TENANTID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.oauth.WhoAmIResponse prototype) {
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
   * Response contect generated from the passed authorization token
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.WhoAmIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.WhoAmIResponse)
      ai.sensorycloud.api.oauth.WhoAmIResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_WhoAmIResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_WhoAmIResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.oauth.WhoAmIResponse.class, ai.sensorycloud.api.oauth.WhoAmIResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.oauth.WhoAmIResponse.newBuilder()
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
      clientId_ = "";
      tenantId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.oauth.SensoryApiOauthProto.internal_static_sensory_api_oauth_WhoAmIResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.WhoAmIResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.oauth.WhoAmIResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.WhoAmIResponse build() {
      ai.sensorycloud.api.oauth.WhoAmIResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.oauth.WhoAmIResponse buildPartial() {
      ai.sensorycloud.api.oauth.WhoAmIResponse result = new ai.sensorycloud.api.oauth.WhoAmIResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.sensorycloud.api.oauth.WhoAmIResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tenantId_ = tenantId_;
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
      if (other instanceof ai.sensorycloud.api.oauth.WhoAmIResponse) {
        return mergeFrom((ai.sensorycloud.api.oauth.WhoAmIResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.oauth.WhoAmIResponse other) {
      if (other == ai.sensorycloud.api.oauth.WhoAmIResponse.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              tenantId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tenantId_ = "";
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return The tenantId.
     */
    public java.lang.String getTenantId() {
      java.lang.Object ref = tenantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return The bytes for tenantId.
     */
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      java.lang.Object ref = tenantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tenantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tenantId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      tenantId_ = getDefaultInstance().getTenantId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tenantId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.WhoAmIResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.oauth.WhoAmIResponse)
  private static final ai.sensorycloud.api.oauth.WhoAmIResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.oauth.WhoAmIResponse();
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WhoAmIResponse>
      PARSER = new com.google.protobuf.AbstractParser<WhoAmIResponse>() {
    @java.lang.Override
    public WhoAmIResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<WhoAmIResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WhoAmIResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.oauth.WhoAmIResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

