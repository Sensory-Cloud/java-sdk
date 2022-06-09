// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * Request to remove enrollments from an enrollment group
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.RemoveEnrollmentsRequest}
 */
public final class RemoveEnrollmentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.RemoveEnrollmentsRequest)
    RemoveEnrollmentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveEnrollmentsRequest.newBuilder() to construct.
  private RemoveEnrollmentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveEnrollmentsRequest() {
    groupId_ = "";
    enrollmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveEnrollmentsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveEnrollmentsRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            groupId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              enrollmentIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            enrollmentIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        enrollmentIds_ = enrollmentIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_RemoveEnrollmentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_RemoveEnrollmentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.class, ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.Builder.class);
  }

  public static final int GROUPID_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupId_;
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENROLLMENTIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList enrollmentIds_;
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
   * @return A list containing the enrollmentIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEnrollmentIdsList() {
    return enrollmentIds_;
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
   * @return The count of enrollmentIds.
   */
  public int getEnrollmentIdsCount() {
    return enrollmentIds_.size();
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The enrollmentIds at the given index.
   */
  public java.lang.String getEnrollmentIds(int index) {
    return enrollmentIds_.get(index);
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the enrollmentIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEnrollmentIdsBytes(int index) {
    return enrollmentIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
    }
    for (int i = 0; i < enrollmentIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, enrollmentIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < enrollmentIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(enrollmentIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnrollmentIdsList().size();
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
    if (!(obj instanceof ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest other = (ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest) obj;

    if (!getGroupId()
        .equals(other.getGroupId())) return false;
    if (!getEnrollmentIdsList()
        .equals(other.getEnrollmentIdsList())) return false;
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
    hash = (37 * hash) + GROUPID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    if (getEnrollmentIdsCount() > 0) {
      hash = (37 * hash) + ENROLLMENTIDS_FIELD_NUMBER;
      hash = (53 * hash) + getEnrollmentIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest prototype) {
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
   * Request to remove enrollments from an enrollment group
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.RemoveEnrollmentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.RemoveEnrollmentsRequest)
      ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_RemoveEnrollmentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_RemoveEnrollmentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.class, ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.newBuilder()
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
      groupId_ = "";

      enrollmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.internal_static_sensory_api_v1_management_RemoveEnrollmentsRequest_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest build() {
      ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest buildPartial() {
      ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest result = new ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest(this);
      int from_bitField0_ = bitField0_;
      result.groupId_ = groupId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        enrollmentIds_ = enrollmentIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.enrollmentIds_ = enrollmentIds_;
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
      if (other instanceof ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest) {
        return mergeFrom((ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest other) {
      if (other == ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.getDefaultInstance()) return this;
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
        onChanged();
      }
      if (!other.enrollmentIds_.isEmpty()) {
        if (enrollmentIds_.isEmpty()) {
          enrollmentIds_ = other.enrollmentIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEnrollmentIdsIsMutable();
          enrollmentIds_.addAll(other.enrollmentIds_);
        }
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
      ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object groupId_ = "";
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return The groupId.
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for groupId.
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = getDefaultInstance().getGroupId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList enrollmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEnrollmentIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enrollmentIds_ = new com.google.protobuf.LazyStringArrayList(enrollmentIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @return A list containing the enrollmentIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEnrollmentIdsList() {
      return enrollmentIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @return The count of enrollmentIds.
     */
    public int getEnrollmentIdsCount() {
      return enrollmentIds_.size();
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param index The index of the element to return.
     * @return The enrollmentIds at the given index.
     */
    public java.lang.String getEnrollmentIds(int index) {
      return enrollmentIds_.get(index);
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the enrollmentIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEnrollmentIdsBytes(int index) {
      return enrollmentIds_.getByteString(index);
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The enrollmentIds to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnrollmentIdsIsMutable();
      enrollmentIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param value The enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnrollmentIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnrollmentIdsIsMutable();
      enrollmentIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param values The enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnrollmentIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnrollmentIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, enrollmentIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentIds() {
      enrollmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes of the enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnrollmentIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEnrollmentIdsIsMutable();
      enrollmentIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.RemoveEnrollmentsRequest)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.RemoveEnrollmentsRequest)
  private static final ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest();
  }

  public static ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveEnrollmentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveEnrollmentsRequest>() {
    @java.lang.Override
    public RemoveEnrollmentsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveEnrollmentsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveEnrollmentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveEnrollmentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

