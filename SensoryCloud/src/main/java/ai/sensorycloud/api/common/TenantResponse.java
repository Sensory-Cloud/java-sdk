// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Tenant response
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.TenantResponse}
 */
public final class TenantResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.TenantResponse)
    TenantResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TenantResponse.newBuilder() to construct.
  private TenantResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TenantResponse() {
    id_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TenantResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TenantResponse(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createdAt_ != null) {
              subBuilder = createdAt_.toBuilder();
            }
            createdAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createdAt_);
              createdAt_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (updatedAt_ != null) {
              subBuilder = updatedAt_.toBuilder();
            }
            updatedAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updatedAt_);
              updatedAt_ = subBuilder.buildPartial();
            }

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
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_TenantResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_TenantResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.common.TenantResponse.class, ai.sensorycloud.api.common.TenantResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * The unique uuid for this tenant
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique uuid for this tenant
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The unique name for this tenant
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name for this tenant
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDAT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <pre>
   * Created timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   * @return Whether the createdAt field is set.
   */
  @java.lang.Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <pre>
   * Created timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <pre>
   * Created timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
    return getCreatedAt();
  }

  public static final int UPDATEDAT_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <pre>
   * Last updated timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
   * @return Whether the updatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <pre>
   * Last updated timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
   * @return The updatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <pre>
   * Last updated timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return getUpdatedAt();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (createdAt_ != null) {
      output.writeMessage(3, getCreatedAt());
    }
    if (updatedAt_ != null) {
      output.writeMessage(4, getUpdatedAt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (createdAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCreatedAt());
    }
    if (updatedAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUpdatedAt());
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
    if (!(obj instanceof ai.sensorycloud.api.common.TenantResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.common.TenantResponse other = (ai.sensorycloud.api.common.TenantResponse) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasCreatedAt() != other.hasCreatedAt()) return false;
    if (hasCreatedAt()) {
      if (!getCreatedAt()
          .equals(other.getCreatedAt())) return false;
    }
    if (hasUpdatedAt() != other.hasUpdatedAt()) return false;
    if (hasUpdatedAt()) {
      if (!getUpdatedAt()
          .equals(other.getUpdatedAt())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasCreatedAt()) {
      hash = (37 * hash) + CREATEDAT_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedAt().hashCode();
    }
    if (hasUpdatedAt()) {
      hash = (37 * hash) + UPDATEDAT_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedAt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.TenantResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.common.TenantResponse prototype) {
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
   * Tenant response
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.TenantResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.TenantResponse)
      ai.sensorycloud.api.common.TenantResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_TenantResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_TenantResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.common.TenantResponse.class, ai.sensorycloud.api.common.TenantResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.common.TenantResponse.newBuilder()
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
      id_ = "";

      name_ = "";

      if (createdAtBuilder_ == null) {
        createdAt_ = null;
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_TenantResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.TenantResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.common.TenantResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.TenantResponse build() {
      ai.sensorycloud.api.common.TenantResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.TenantResponse buildPartial() {
      ai.sensorycloud.api.common.TenantResponse result = new ai.sensorycloud.api.common.TenantResponse(this);
      result.id_ = id_;
      result.name_ = name_;
      if (createdAtBuilder_ == null) {
        result.createdAt_ = createdAt_;
      } else {
        result.createdAt_ = createdAtBuilder_.build();
      }
      if (updatedAtBuilder_ == null) {
        result.updatedAt_ = updatedAt_;
      } else {
        result.updatedAt_ = updatedAtBuilder_.build();
      }
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
      if (other instanceof ai.sensorycloud.api.common.TenantResponse) {
        return mergeFrom((ai.sensorycloud.api.common.TenantResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.common.TenantResponse other) {
      if (other == ai.sensorycloud.api.common.TenantResponse.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasCreatedAt()) {
        mergeCreatedAt(other.getCreatedAt());
      }
      if (other.hasUpdatedAt()) {
        mergeUpdatedAt(other.getUpdatedAt());
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
      ai.sensorycloud.api.common.TenantResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.common.TenantResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The unique uuid for this tenant
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique uuid for this tenant
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique uuid for this tenant
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique uuid for this tenant
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique uuid for this tenant
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The unique name for this tenant
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name for this tenant
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name for this tenant
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name for this tenant
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name for this tenant
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     * @return Whether the createdAt field is set.
     */
    public boolean hasCreatedAt() {
      return createdAtBuilder_ != null || createdAt_ != null;
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     * @return The createdAt.
     */
    public com.google.protobuf.Timestamp getCreatedAt() {
      if (createdAtBuilder_ == null) {
        return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      } else {
        return createdAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAt_ = value;
        onChanged();
      } else {
        createdAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAtBuilder_ == null) {
        createdAt_ = builderForValue.build();
        onChanged();
      } else {
        createdAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (createdAt_ != null) {
          createdAt_ =
            com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
        } else {
          createdAt_ = value;
        }
        onChanged();
      } else {
        createdAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public Builder clearCreatedAt() {
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
        onChanged();
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
      
      onChanged();
      return getCreatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      if (createdAtBuilder_ != null) {
        return createdAtBuilder_.getMessageOrBuilder();
      } else {
        return createdAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      }
    }
    /**
     * <pre>
     * Created timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp createdAt = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAtFieldBuilder() {
      if (createdAtBuilder_ == null) {
        createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAt(),
                getParentForChildren(),
                isClean());
        createdAt_ = null;
      }
      return createdAtBuilder_;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return updatedAtBuilder_ != null || updatedAt_ != null;
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (updatedAt_ != null) {
          updatedAt_ =
            com.google.protobuf.Timestamp.newBuilder(updatedAt_).mergeFrom(value).buildPartial();
        } else {
          updatedAt_ = value;
        }
        onChanged();
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public Builder clearUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
        onChanged();
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <pre>
     * Last updated timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updatedAt = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.common.TenantResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.common.TenantResponse)
  private static final ai.sensorycloud.api.common.TenantResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.common.TenantResponse();
  }

  public static ai.sensorycloud.api.common.TenantResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TenantResponse>
      PARSER = new com.google.protobuf.AbstractParser<TenantResponse>() {
    @java.lang.Override
    public TenantResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TenantResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TenantResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TenantResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.common.TenantResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

