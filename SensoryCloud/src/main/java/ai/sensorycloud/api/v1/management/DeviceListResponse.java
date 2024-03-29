// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/device.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * A response containing multiple devices
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.DeviceListResponse}
 */
public final class DeviceListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.DeviceListResponse)
    DeviceListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceListResponse.newBuilder() to construct.
  private DeviceListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceListResponse() {
    devices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_DeviceListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_DeviceListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.management.DeviceListResponse.class, ai.sensorycloud.api.v1.management.DeviceListResponse.Builder.class);
  }

  public static final int DEVICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.sensorycloud.api.v1.management.DeviceResponse> devices_;
  /**
   * <pre>
   * A list of devices
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.management.DeviceResponse> getDevicesList() {
    return devices_;
  }
  /**
   * <pre>
   * A list of devices
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder> 
      getDevicesOrBuilderList() {
    return devices_;
  }
  /**
   * <pre>
   * A list of devices
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
   */
  @java.lang.Override
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   * <pre>
   * A list of devices
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.management.DeviceResponse getDevices(int index) {
    return devices_.get(index);
  }
  /**
   * <pre>
   * A list of devices
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder getDevicesOrBuilder(
      int index) {
    return devices_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private ai.sensorycloud.api.common.PaginationResponse pagination_;
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.PaginationResponse getPagination() {
    return pagination_ == null ? ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.PaginationResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < devices_.size(); i++) {
      output.writeMessage(1, devices_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devices_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof ai.sensorycloud.api.v1.management.DeviceListResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.management.DeviceListResponse other = (ai.sensorycloud.api.v1.management.DeviceListResponse) obj;

    if (!getDevicesList()
        .equals(other.getDevicesList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.DeviceListResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.DeviceListResponse prototype) {
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
   * A response containing multiple devices
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.DeviceListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.DeviceListResponse)
      ai.sensorycloud.api.v1.management.DeviceListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_DeviceListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_DeviceListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.management.DeviceListResponse.class, ai.sensorycloud.api.v1.management.DeviceListResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.management.DeviceListResponse.newBuilder()
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
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
      } else {
        devices_ = null;
        devicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementDeviceProto.internal_static_sensory_api_v1_management_DeviceListResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.DeviceListResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.management.DeviceListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.DeviceListResponse build() {
      ai.sensorycloud.api.v1.management.DeviceListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.DeviceListResponse buildPartial() {
      ai.sensorycloud.api.v1.management.DeviceListResponse result = new ai.sensorycloud.api.v1.management.DeviceListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.sensorycloud.api.v1.management.DeviceListResponse result) {
      if (devicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          devices_ = java.util.Collections.unmodifiableList(devices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devices_ = devices_;
      } else {
        result.devices_ = devicesBuilder_.build();
      }
    }

    private void buildPartial0(ai.sensorycloud.api.v1.management.DeviceListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
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
      if (other instanceof ai.sensorycloud.api.v1.management.DeviceListResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.management.DeviceListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.management.DeviceListResponse other) {
      if (other == ai.sensorycloud.api.v1.management.DeviceListResponse.getDefaultInstance()) return this;
      if (devicesBuilder_ == null) {
        if (!other.devices_.isEmpty()) {
          if (devices_.isEmpty()) {
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevicesIsMutable();
            devices_.addAll(other.devices_);
          }
          onChanged();
        }
      } else {
        if (!other.devices_.isEmpty()) {
          if (devicesBuilder_.isEmpty()) {
            devicesBuilder_.dispose();
            devicesBuilder_ = null;
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevicesFieldBuilder() : null;
          } else {
            devicesBuilder_.addAllMessages(other.devices_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              ai.sensorycloud.api.v1.management.DeviceResponse m =
                  input.readMessage(
                      ai.sensorycloud.api.v1.management.DeviceResponse.parser(),
                      extensionRegistry);
              if (devicesBuilder_ == null) {
                ensureDevicesIsMutable();
                devices_.add(m);
              } else {
                devicesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<ai.sensorycloud.api.v1.management.DeviceResponse> devices_ =
      java.util.Collections.emptyList();
    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        devices_ = new java.util.ArrayList<ai.sensorycloud.api.v1.management.DeviceResponse>(devices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.management.DeviceResponse, ai.sensorycloud.api.v1.management.DeviceResponse.Builder, ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder> devicesBuilder_;

    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.management.DeviceResponse> getDevicesList() {
      if (devicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devices_);
      } else {
        return devicesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public int getDevicesCount() {
      if (devicesBuilder_ == null) {
        return devices_.size();
      } else {
        return devicesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse getDevices(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder setDevices(
        int index, ai.sensorycloud.api.v1.management.DeviceResponse value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.set(index, value);
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder setDevices(
        int index, ai.sensorycloud.api.v1.management.DeviceResponse.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.set(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder addDevices(ai.sensorycloud.api.v1.management.DeviceResponse value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder addDevices(
        int index, ai.sensorycloud.api.v1.management.DeviceResponse value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(index, value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder addDevices(
        ai.sensorycloud.api.v1.management.DeviceResponse.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder addDevices(
        int index, ai.sensorycloud.api.v1.management.DeviceResponse.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder addAllDevices(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.management.DeviceResponse> values) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devices_);
        onChanged();
      } else {
        devicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder clearDevices() {
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public Builder removeDevices(int index) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.remove(index);
        onChanged();
      } else {
        devicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse.Builder getDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder getDevicesOrBuilder(
        int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);  } else {
        return devicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public java.util.List<? extends ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder> 
         getDevicesOrBuilderList() {
      if (devicesBuilder_ != null) {
        return devicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devices_);
      }
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse.Builder addDevicesBuilder() {
      return getDevicesFieldBuilder().addBuilder(
          ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse.Builder addDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().addBuilder(
          index, ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of devices
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.DeviceResponse devices = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.management.DeviceResponse.Builder> 
         getDevicesBuilderList() {
      return getDevicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.management.DeviceResponse, ai.sensorycloud.api.v1.management.DeviceResponse.Builder, ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder> 
        getDevicesFieldBuilder() {
      if (devicesBuilder_ == null) {
        devicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.sensorycloud.api.v1.management.DeviceResponse, ai.sensorycloud.api.v1.management.DeviceResponse.Builder, ai.sensorycloud.api.v1.management.DeviceResponseOrBuilder>(
                devices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        devices_ = null;
      }
      return devicesBuilder_;
    }

    private ai.sensorycloud.api.common.PaginationResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.common.PaginationResponse, ai.sensorycloud.api.common.PaginationResponse.Builder, ai.sensorycloud.api.common.PaginationResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     * @return The pagination.
     */
    public ai.sensorycloud.api.common.PaginationResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder setPagination(ai.sensorycloud.api.common.PaginationResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder setPagination(
        ai.sensorycloud.api.common.PaginationResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder mergePagination(ai.sensorycloud.api.common.PaginationResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public ai.sensorycloud.api.common.PaginationResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public ai.sensorycloud.api.common.PaginationResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.sensorycloud.api.common.PaginationResponse, ai.sensorycloud.api.common.PaginationResponse.Builder, ai.sensorycloud.api.common.PaginationResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.sensorycloud.api.common.PaginationResponse, ai.sensorycloud.api.common.PaginationResponse.Builder, ai.sensorycloud.api.common.PaginationResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.DeviceListResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.DeviceListResponse)
  private static final ai.sensorycloud.api.v1.management.DeviceListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.management.DeviceListResponse();
  }

  public static ai.sensorycloud.api.v1.management.DeviceListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceListResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeviceListResponse>() {
    @java.lang.Override
    public DeviceListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.management.DeviceListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

