// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/device.proto

package ai.sensorycloud.api.v1.management;

/**
 * Protobuf type {@code sensory.api.v1.management.GetDevicesRequest}
 */
public final class GetDevicesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.GetDevicesRequest)
    GetDevicesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDevicesRequest.newBuilder() to construct.
  private GetDevicesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDevicesRequest() {
    tenantId_ = "";
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDevicesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetDevicesRequest(
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

            tenantId_ = s;
            break;
          }
          case 18: {
            ai.sensorycloud.api.common.PaginationOptions.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(ai.sensorycloud.api.common.PaginationOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
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
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_GetDevicesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.management.GetDevicesRequest.class, ai.sensorycloud.api.v1.management.GetDevicesRequest.Builder.class);
  }

  public static final int TENANTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object tenantId_;
  /**
   * <pre>
   * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
   * </pre>
   *
   * <code>string tenantId = 1;</code>
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
   * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
   * </pre>
   *
   * <code>string tenantId = 1;</code>
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

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private ai.sensorycloud.api.common.PaginationOptions pagination_;
  /**
   * <pre>
   * Metadata about how to paginate the response
   * </pre>
   *
   * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * Metadata about how to paginate the response
   * </pre>
   *
   * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.PaginationOptions getPagination() {
    return pagination_ == null ? ai.sensorycloud.api.common.PaginationOptions.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * Metadata about how to paginate the response
   * </pre>
   *
   * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.PaginationOptionsOrBuilder getPaginationOrBuilder() {
    return getPagination();
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * Optional user id to filter devices by
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
   * Optional user id to filter devices by
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenantId_);
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tenantId_);
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userId_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.management.GetDevicesRequest)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.management.GetDevicesRequest other = (ai.sensorycloud.api.v1.management.GetDevicesRequest) obj;

    if (!getTenantId()
        .equals(other.getTenantId())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (!getUserId()
        .equals(other.getUserId())) return false;
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
    hash = (37 * hash) + TENANTID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.GetDevicesRequest parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.GetDevicesRequest prototype) {
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
   * Protobuf type {@code sensory.api.v1.management.GetDevicesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.GetDevicesRequest)
      ai.sensorycloud.api.v1.management.GetDevicesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_GetDevicesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.management.GetDevicesRequest.class, ai.sensorycloud.api.v1.management.GetDevicesRequest.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.management.GetDevicesRequest.newBuilder()
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
      tenantId_ = "";

      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      userId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_GetDevicesRequest_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetDevicesRequest getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.management.GetDevicesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetDevicesRequest build() {
      ai.sensorycloud.api.v1.management.GetDevicesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetDevicesRequest buildPartial() {
      ai.sensorycloud.api.v1.management.GetDevicesRequest result = new ai.sensorycloud.api.v1.management.GetDevicesRequest(this);
      result.tenantId_ = tenantId_;
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
      }
      result.userId_ = userId_;
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
      if (other instanceof ai.sensorycloud.api.v1.management.GetDevicesRequest) {
        return mergeFrom((ai.sensorycloud.api.v1.management.GetDevicesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.management.GetDevicesRequest other) {
      if (other == ai.sensorycloud.api.v1.management.GetDevicesRequest.getDefaultInstance()) return this;
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
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
      ai.sensorycloud.api.v1.management.GetDevicesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.management.GetDevicesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tenantId_ = "";
    /**
     * <pre>
     * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
     * </pre>
     *
     * <code>string tenantId = 1;</code>
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
     * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
     * </pre>
     *
     * <code>string tenantId = 1;</code>
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
     * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
     * </pre>
     *
     * <code>string tenantId = 1;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
     * </pre>
     *
     * <code>string tenantId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      
      tenantId_ = getDefaultInstance().getTenantId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TenantID to filter on. TenantId validation is handled within the tenant_filter_middleware.
     * </pre>
     *
     * <code>string tenantId = 1;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenantId_ = value;
      onChanged();
      return this;
    }

    private ai.sensorycloud.api.common.PaginationOptions pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.common.PaginationOptions, ai.sensorycloud.api.common.PaginationOptions.Builder, ai.sensorycloud.api.common.PaginationOptionsOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     * @return The pagination.
     */
    public ai.sensorycloud.api.common.PaginationOptions getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? ai.sensorycloud.api.common.PaginationOptions.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public Builder setPagination(ai.sensorycloud.api.common.PaginationOptions value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
        onChanged();
      } else {
        paginationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public Builder setPagination(
        ai.sensorycloud.api.common.PaginationOptions.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public Builder mergePagination(ai.sensorycloud.api.common.PaginationOptions value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            ai.sensorycloud.api.common.PaginationOptions.newBuilder(pagination_).mergeFrom(value).buildPartial();
        } else {
          pagination_ = value;
        }
        onChanged();
      } else {
        paginationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public Builder clearPagination() {
      if (paginationBuilder_ == null) {
        pagination_ = null;
        onChanged();
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public ai.sensorycloud.api.common.PaginationOptions.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    public ai.sensorycloud.api.common.PaginationOptionsOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            ai.sensorycloud.api.common.PaginationOptions.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * Metadata about how to paginate the response
     * </pre>
     *
     * <code>.sensory.api.common.PaginationOptions pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.common.PaginationOptions, ai.sensorycloud.api.common.PaginationOptions.Builder, ai.sensorycloud.api.common.PaginationOptionsOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.common.PaginationOptions, ai.sensorycloud.api.common.PaginationOptions.Builder, ai.sensorycloud.api.common.PaginationOptionsOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * Optional user id to filter devices by
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
     * Optional user id to filter devices by
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
     * Optional user id to filter devices by
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
     * Optional user id to filter devices by
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
     * Optional user id to filter devices by
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.GetDevicesRequest)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.GetDevicesRequest)
  private static final ai.sensorycloud.api.v1.management.GetDevicesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.management.GetDevicesRequest();
  }

  public static ai.sensorycloud.api.v1.management.GetDevicesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDevicesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDevicesRequest>() {
    @java.lang.Override
    public GetDevicesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetDevicesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetDevicesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDevicesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.management.GetDevicesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

