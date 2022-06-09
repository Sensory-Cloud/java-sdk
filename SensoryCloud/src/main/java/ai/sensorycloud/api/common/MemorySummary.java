// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * A summary of memory usage
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.MemorySummary}
 */
public final class MemorySummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.MemorySummary)
    MemorySummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemorySummary.newBuilder() to construct.
  private MemorySummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemorySummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemorySummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemorySummary(
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
          case 8: {

            memTotal_ = input.readUInt64();
            break;
          }
          case 16: {

            memFree_ = input.readUInt64();
            break;
          }
          case 24: {

            memAvailable_ = input.readUInt64();
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
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_MemorySummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_MemorySummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.common.MemorySummary.class, ai.sensorycloud.api.common.MemorySummary.Builder.class);
  }

  public static final int MEMTOTAL_FIELD_NUMBER = 1;
  private long memTotal_;
  /**
   * <pre>
   * total memory in use
   * </pre>
   *
   * <code>uint64 memTotal = 1;</code>
   * @return The memTotal.
   */
  @java.lang.Override
  public long getMemTotal() {
    return memTotal_;
  }

  public static final int MEMFREE_FIELD_NUMBER = 2;
  private long memFree_;
  /**
   * <pre>
   * total memory free
   * </pre>
   *
   * <code>uint64 memFree = 2;</code>
   * @return The memFree.
   */
  @java.lang.Override
  public long getMemFree() {
    return memFree_;
  }

  public static final int MEMAVAILABLE_FIELD_NUMBER = 3;
  private long memAvailable_;
  /**
   * <pre>
   * total memory available by the system
   * </pre>
   *
   * <code>uint64 memAvailable = 3;</code>
   * @return The memAvailable.
   */
  @java.lang.Override
  public long getMemAvailable() {
    return memAvailable_;
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
    if (memTotal_ != 0L) {
      output.writeUInt64(1, memTotal_);
    }
    if (memFree_ != 0L) {
      output.writeUInt64(2, memFree_);
    }
    if (memAvailable_ != 0L) {
      output.writeUInt64(3, memAvailable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, memTotal_);
    }
    if (memFree_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, memFree_);
    }
    if (memAvailable_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, memAvailable_);
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
    if (!(obj instanceof ai.sensorycloud.api.common.MemorySummary)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.common.MemorySummary other = (ai.sensorycloud.api.common.MemorySummary) obj;

    if (getMemTotal()
        != other.getMemTotal()) return false;
    if (getMemFree()
        != other.getMemFree()) return false;
    if (getMemAvailable()
        != other.getMemAvailable()) return false;
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
    hash = (37 * hash) + MEMTOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemTotal());
    hash = (37 * hash) + MEMFREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemFree());
    hash = (37 * hash) + MEMAVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemAvailable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.common.MemorySummary prototype) {
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
   * A summary of memory usage
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.MemorySummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.MemorySummary)
      ai.sensorycloud.api.common.MemorySummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_MemorySummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_MemorySummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.common.MemorySummary.class, ai.sensorycloud.api.common.MemorySummary.Builder.class);
    }

    // Construct using ai.sensorycloud.api.common.MemorySummary.newBuilder()
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
      memTotal_ = 0L;

      memFree_ = 0L;

      memAvailable_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.common.SensoryApiCommonProto.internal_static_sensory_api_common_MemorySummary_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.MemorySummary getDefaultInstanceForType() {
      return ai.sensorycloud.api.common.MemorySummary.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.MemorySummary build() {
      ai.sensorycloud.api.common.MemorySummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.common.MemorySummary buildPartial() {
      ai.sensorycloud.api.common.MemorySummary result = new ai.sensorycloud.api.common.MemorySummary(this);
      result.memTotal_ = memTotal_;
      result.memFree_ = memFree_;
      result.memAvailable_ = memAvailable_;
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
      if (other instanceof ai.sensorycloud.api.common.MemorySummary) {
        return mergeFrom((ai.sensorycloud.api.common.MemorySummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.common.MemorySummary other) {
      if (other == ai.sensorycloud.api.common.MemorySummary.getDefaultInstance()) return this;
      if (other.getMemTotal() != 0L) {
        setMemTotal(other.getMemTotal());
      }
      if (other.getMemFree() != 0L) {
        setMemFree(other.getMemFree());
      }
      if (other.getMemAvailable() != 0L) {
        setMemAvailable(other.getMemAvailable());
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
      ai.sensorycloud.api.common.MemorySummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.common.MemorySummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long memTotal_ ;
    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @return The memTotal.
     */
    @java.lang.Override
    public long getMemTotal() {
      return memTotal_;
    }
    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @param value The memTotal to set.
     * @return This builder for chaining.
     */
    public Builder setMemTotal(long value) {
      
      memTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemTotal() {
      
      memTotal_ = 0L;
      onChanged();
      return this;
    }

    private long memFree_ ;
    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @return The memFree.
     */
    @java.lang.Override
    public long getMemFree() {
      return memFree_;
    }
    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @param value The memFree to set.
     * @return This builder for chaining.
     */
    public Builder setMemFree(long value) {
      
      memFree_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemFree() {
      
      memFree_ = 0L;
      onChanged();
      return this;
    }

    private long memAvailable_ ;
    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @return The memAvailable.
     */
    @java.lang.Override
    public long getMemAvailable() {
      return memAvailable_;
    }
    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @param value The memAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setMemAvailable(long value) {
      
      memAvailable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemAvailable() {
      
      memAvailable_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.common.MemorySummary)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.common.MemorySummary)
  private static final ai.sensorycloud.api.common.MemorySummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.common.MemorySummary();
  }

  public static ai.sensorycloud.api.common.MemorySummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemorySummary>
      PARSER = new com.google.protobuf.AbstractParser<MemorySummary>() {
    @java.lang.Override
    public MemorySummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemorySummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemorySummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemorySummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.common.MemorySummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
