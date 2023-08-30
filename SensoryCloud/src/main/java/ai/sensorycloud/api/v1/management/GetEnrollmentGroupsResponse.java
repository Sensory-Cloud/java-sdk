// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * A response containing a list of enrollment groups
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.GetEnrollmentGroupsResponse}
 */
public final class GetEnrollmentGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.GetEnrollmentGroupsResponse)
    GetEnrollmentGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEnrollmentGroupsResponse.newBuilder() to construct.
  private GetEnrollmentGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEnrollmentGroupsResponse() {
    enrollmentGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEnrollmentGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_GetEnrollmentGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_GetEnrollmentGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.class, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.Builder.class);
  }

  public static final int ENROLLMENTGROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> enrollmentGroups_;
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getEnrollmentGroupsList() {
    return enrollmentGroups_;
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> 
      getEnrollmentGroupsOrBuilderList() {
    return enrollmentGroups_;
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public int getEnrollmentGroupsCount() {
    return enrollmentGroups_.size();
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse getEnrollmentGroups(int index) {
    return enrollmentGroups_.get(index);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder getEnrollmentGroupsOrBuilder(
      int index) {
    return enrollmentGroups_.get(index);
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
    for (int i = 0; i < enrollmentGroups_.size(); i++) {
      output.writeMessage(1, enrollmentGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < enrollmentGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, enrollmentGroups_.get(i));
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
    if (!(obj instanceof ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse other = (ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse) obj;

    if (!getEnrollmentGroupsList()
        .equals(other.getEnrollmentGroupsList())) return false;
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
    if (getEnrollmentGroupsCount() > 0) {
      hash = (37 * hash) + ENROLLMENTGROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getEnrollmentGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse prototype) {
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
   * A response containing a list of enrollment groups
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.GetEnrollmentGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.GetEnrollmentGroupsResponse)
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_GetEnrollmentGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_GetEnrollmentGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.class, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.newBuilder()
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
      if (enrollmentGroupsBuilder_ == null) {
        enrollmentGroups_ = java.util.Collections.emptyList();
      } else {
        enrollmentGroups_ = null;
        enrollmentGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_GetEnrollmentGroupsResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse build() {
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse buildPartial() {
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse result = new ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse result) {
      if (enrollmentGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          enrollmentGroups_ = java.util.Collections.unmodifiableList(enrollmentGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.enrollmentGroups_ = enrollmentGroups_;
      } else {
        result.enrollmentGroups_ = enrollmentGroupsBuilder_.build();
      }
    }

    private void buildPartial0(ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse other) {
      if (other == ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.getDefaultInstance()) return this;
      if (enrollmentGroupsBuilder_ == null) {
        if (!other.enrollmentGroups_.isEmpty()) {
          if (enrollmentGroups_.isEmpty()) {
            enrollmentGroups_ = other.enrollmentGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEnrollmentGroupsIsMutable();
            enrollmentGroups_.addAll(other.enrollmentGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.enrollmentGroups_.isEmpty()) {
          if (enrollmentGroupsBuilder_.isEmpty()) {
            enrollmentGroupsBuilder_.dispose();
            enrollmentGroupsBuilder_ = null;
            enrollmentGroups_ = other.enrollmentGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            enrollmentGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEnrollmentGroupsFieldBuilder() : null;
          } else {
            enrollmentGroupsBuilder_.addAllMessages(other.enrollmentGroups_);
          }
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
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse m =
                  input.readMessage(
                      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.parser(),
                      extensionRegistry);
              if (enrollmentGroupsBuilder_ == null) {
                ensureEnrollmentGroupsIsMutable();
                enrollmentGroups_.add(m);
              } else {
                enrollmentGroupsBuilder_.addMessage(m);
              }
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

    private java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> enrollmentGroups_ =
      java.util.Collections.emptyList();
    private void ensureEnrollmentGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enrollmentGroups_ = new java.util.ArrayList<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(enrollmentGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.management.EnrollmentGroupResponse, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder, ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> enrollmentGroupsBuilder_;

    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getEnrollmentGroupsList() {
      if (enrollmentGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(enrollmentGroups_);
      } else {
        return enrollmentGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public int getEnrollmentGroupsCount() {
      if (enrollmentGroupsBuilder_ == null) {
        return enrollmentGroups_.size();
      } else {
        return enrollmentGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse getEnrollmentGroups(int index) {
      if (enrollmentGroupsBuilder_ == null) {
        return enrollmentGroups_.get(index);
      } else {
        return enrollmentGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder setEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      if (enrollmentGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.set(index, value);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder setEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      if (enrollmentGroupsBuilder_ == null) {
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        enrollmentGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      if (enrollmentGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.add(value);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      if (enrollmentGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.add(index, value);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      if (enrollmentGroupsBuilder_ == null) {
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.add(builderForValue.build());
        onChanged();
      } else {
        enrollmentGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      if (enrollmentGroupsBuilder_ == null) {
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        enrollmentGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addAllEnrollmentGroups(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> values) {
      if (enrollmentGroupsBuilder_ == null) {
        ensureEnrollmentGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, enrollmentGroups_);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder clearEnrollmentGroups() {
      if (enrollmentGroupsBuilder_ == null) {
        enrollmentGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder removeEnrollmentGroups(int index) {
      if (enrollmentGroupsBuilder_ == null) {
        ensureEnrollmentGroupsIsMutable();
        enrollmentGroups_.remove(index);
        onChanged();
      } else {
        enrollmentGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder getEnrollmentGroupsBuilder(
        int index) {
      return getEnrollmentGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder getEnrollmentGroupsOrBuilder(
        int index) {
      if (enrollmentGroupsBuilder_ == null) {
        return enrollmentGroups_.get(index);  } else {
        return enrollmentGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public java.util.List<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> 
         getEnrollmentGroupsOrBuilderList() {
      if (enrollmentGroupsBuilder_ != null) {
        return enrollmentGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(enrollmentGroups_);
      }
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder addEnrollmentGroupsBuilder() {
      return getEnrollmentGroupsFieldBuilder().addBuilder(
          ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder addEnrollmentGroupsBuilder(
        int index) {
      return getEnrollmentGroupsFieldBuilder().addBuilder(
          index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder> 
         getEnrollmentGroupsBuilderList() {
      return getEnrollmentGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.management.EnrollmentGroupResponse, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder, ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> 
        getEnrollmentGroupsFieldBuilder() {
      if (enrollmentGroupsBuilder_ == null) {
        enrollmentGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.sensorycloud.api.v1.management.EnrollmentGroupResponse, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder, ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder>(
                enrollmentGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        enrollmentGroups_ = null;
      }
      return enrollmentGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.GetEnrollmentGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.GetEnrollmentGroupsResponse)
  private static final ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse();
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEnrollmentGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEnrollmentGroupsResponse>() {
    @java.lang.Override
    public GetEnrollmentGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEnrollmentGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEnrollmentGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

