// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

/**
 * <pre>
 * A reponse with the file catalog
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.file.FileCatalogResponse}
 */
public final class FileCatalogResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.file.FileCatalogResponse)
    FileCatalogResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileCatalogResponse.newBuilder() to construct.
  private FileCatalogResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileCatalogResponse() {
    catalog_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileCatalogResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileCatalogResponse(
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
              catalog_ = new java.util.ArrayList<ai.sensorycloud.api.v1.file.FileCatalog>();
              mutable_bitField0_ |= 0x00000001;
            }
            catalog_.add(
                input.readMessage(ai.sensorycloud.api.v1.file.FileCatalog.parser(), extensionRegistry));
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
        catalog_ = java.util.Collections.unmodifiableList(catalog_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileCatalogResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileCatalogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.file.FileCatalogResponse.class, ai.sensorycloud.api.v1.file.FileCatalogResponse.Builder.class);
  }

  public static final int CATALOG_FIELD_NUMBER = 1;
  private java.util.List<ai.sensorycloud.api.v1.file.FileCatalog> catalog_;
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.file.FileCatalog> getCatalogList() {
    return catalog_;
  }
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.sensorycloud.api.v1.file.FileCatalogOrBuilder> 
      getCatalogOrBuilderList() {
    return catalog_;
  }
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  @java.lang.Override
  public int getCatalogCount() {
    return catalog_.size();
  }
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.file.FileCatalog getCatalog(int index) {
    return catalog_.get(index);
  }
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.file.FileCatalogOrBuilder getCatalogOrBuilder(
      int index) {
    return catalog_.get(index);
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
    for (int i = 0; i < catalog_.size(); i++) {
      output.writeMessage(1, catalog_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < catalog_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, catalog_.get(i));
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
    if (!(obj instanceof ai.sensorycloud.api.v1.file.FileCatalogResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.file.FileCatalogResponse other = (ai.sensorycloud.api.v1.file.FileCatalogResponse) obj;

    if (!getCatalogList()
        .equals(other.getCatalogList())) return false;
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
    if (getCatalogCount() > 0) {
      hash = (37 * hash) + CATALOG_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileCatalogResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.file.FileCatalogResponse prototype) {
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
   * A reponse with the file catalog
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.file.FileCatalogResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.file.FileCatalogResponse)
      ai.sensorycloud.api.v1.file.FileCatalogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileCatalogResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileCatalogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.file.FileCatalogResponse.class, ai.sensorycloud.api.v1.file.FileCatalogResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.file.FileCatalogResponse.newBuilder()
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
        getCatalogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (catalogBuilder_ == null) {
        catalog_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        catalogBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileCatalogResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileCatalogResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.file.FileCatalogResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileCatalogResponse build() {
      ai.sensorycloud.api.v1.file.FileCatalogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileCatalogResponse buildPartial() {
      ai.sensorycloud.api.v1.file.FileCatalogResponse result = new ai.sensorycloud.api.v1.file.FileCatalogResponse(this);
      int from_bitField0_ = bitField0_;
      if (catalogBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          catalog_ = java.util.Collections.unmodifiableList(catalog_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.catalog_ = catalog_;
      } else {
        result.catalog_ = catalogBuilder_.build();
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
      if (other instanceof ai.sensorycloud.api.v1.file.FileCatalogResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.file.FileCatalogResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.file.FileCatalogResponse other) {
      if (other == ai.sensorycloud.api.v1.file.FileCatalogResponse.getDefaultInstance()) return this;
      if (catalogBuilder_ == null) {
        if (!other.catalog_.isEmpty()) {
          if (catalog_.isEmpty()) {
            catalog_ = other.catalog_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCatalogIsMutable();
            catalog_.addAll(other.catalog_);
          }
          onChanged();
        }
      } else {
        if (!other.catalog_.isEmpty()) {
          if (catalogBuilder_.isEmpty()) {
            catalogBuilder_.dispose();
            catalogBuilder_ = null;
            catalog_ = other.catalog_;
            bitField0_ = (bitField0_ & ~0x00000001);
            catalogBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCatalogFieldBuilder() : null;
          } else {
            catalogBuilder_.addAllMessages(other.catalog_);
          }
        }
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
      ai.sensorycloud.api.v1.file.FileCatalogResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.file.FileCatalogResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ai.sensorycloud.api.v1.file.FileCatalog> catalog_ =
      java.util.Collections.emptyList();
    private void ensureCatalogIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catalog_ = new java.util.ArrayList<ai.sensorycloud.api.v1.file.FileCatalog>(catalog_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.file.FileCatalog, ai.sensorycloud.api.v1.file.FileCatalog.Builder, ai.sensorycloud.api.v1.file.FileCatalogOrBuilder> catalogBuilder_;

    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.file.FileCatalog> getCatalogList() {
      if (catalogBuilder_ == null) {
        return java.util.Collections.unmodifiableList(catalog_);
      } else {
        return catalogBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public int getCatalogCount() {
      if (catalogBuilder_ == null) {
        return catalog_.size();
      } else {
        return catalogBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public ai.sensorycloud.api.v1.file.FileCatalog getCatalog(int index) {
      if (catalogBuilder_ == null) {
        return catalog_.get(index);
      } else {
        return catalogBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder setCatalog(
        int index, ai.sensorycloud.api.v1.file.FileCatalog value) {
      if (catalogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogIsMutable();
        catalog_.set(index, value);
        onChanged();
      } else {
        catalogBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder setCatalog(
        int index, ai.sensorycloud.api.v1.file.FileCatalog.Builder builderForValue) {
      if (catalogBuilder_ == null) {
        ensureCatalogIsMutable();
        catalog_.set(index, builderForValue.build());
        onChanged();
      } else {
        catalogBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder addCatalog(ai.sensorycloud.api.v1.file.FileCatalog value) {
      if (catalogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogIsMutable();
        catalog_.add(value);
        onChanged();
      } else {
        catalogBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder addCatalog(
        int index, ai.sensorycloud.api.v1.file.FileCatalog value) {
      if (catalogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogIsMutable();
        catalog_.add(index, value);
        onChanged();
      } else {
        catalogBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder addCatalog(
        ai.sensorycloud.api.v1.file.FileCatalog.Builder builderForValue) {
      if (catalogBuilder_ == null) {
        ensureCatalogIsMutable();
        catalog_.add(builderForValue.build());
        onChanged();
      } else {
        catalogBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder addCatalog(
        int index, ai.sensorycloud.api.v1.file.FileCatalog.Builder builderForValue) {
      if (catalogBuilder_ == null) {
        ensureCatalogIsMutable();
        catalog_.add(index, builderForValue.build());
        onChanged();
      } else {
        catalogBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder addAllCatalog(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.file.FileCatalog> values) {
      if (catalogBuilder_ == null) {
        ensureCatalogIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, catalog_);
        onChanged();
      } else {
        catalogBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder clearCatalog() {
      if (catalogBuilder_ == null) {
        catalog_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        catalogBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public Builder removeCatalog(int index) {
      if (catalogBuilder_ == null) {
        ensureCatalogIsMutable();
        catalog_.remove(index);
        onChanged();
      } else {
        catalogBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public ai.sensorycloud.api.v1.file.FileCatalog.Builder getCatalogBuilder(
        int index) {
      return getCatalogFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public ai.sensorycloud.api.v1.file.FileCatalogOrBuilder getCatalogOrBuilder(
        int index) {
      if (catalogBuilder_ == null) {
        return catalog_.get(index);  } else {
        return catalogBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public java.util.List<? extends ai.sensorycloud.api.v1.file.FileCatalogOrBuilder> 
         getCatalogOrBuilderList() {
      if (catalogBuilder_ != null) {
        return catalogBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(catalog_);
      }
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public ai.sensorycloud.api.v1.file.FileCatalog.Builder addCatalogBuilder() {
      return getCatalogFieldBuilder().addBuilder(
          ai.sensorycloud.api.v1.file.FileCatalog.getDefaultInstance());
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public ai.sensorycloud.api.v1.file.FileCatalog.Builder addCatalogBuilder(
        int index) {
      return getCatalogFieldBuilder().addBuilder(
          index, ai.sensorycloud.api.v1.file.FileCatalog.getDefaultInstance());
    }
    /**
     * <pre>
     * The catalog of files
     * </pre>
     *
     * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.file.FileCatalog.Builder> 
         getCatalogBuilderList() {
      return getCatalogFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.file.FileCatalog, ai.sensorycloud.api.v1.file.FileCatalog.Builder, ai.sensorycloud.api.v1.file.FileCatalogOrBuilder> 
        getCatalogFieldBuilder() {
      if (catalogBuilder_ == null) {
        catalogBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.sensorycloud.api.v1.file.FileCatalog, ai.sensorycloud.api.v1.file.FileCatalog.Builder, ai.sensorycloud.api.v1.file.FileCatalogOrBuilder>(
                catalog_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        catalog_ = null;
      }
      return catalogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.file.FileCatalogResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.file.FileCatalogResponse)
  private static final ai.sensorycloud.api.v1.file.FileCatalogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.file.FileCatalogResponse();
  }

  public static ai.sensorycloud.api.v1.file.FileCatalogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileCatalogResponse>
      PARSER = new com.google.protobuf.AbstractParser<FileCatalogResponse>() {
    @java.lang.Override
    public FileCatalogResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileCatalogResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileCatalogResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileCatalogResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.file.FileCatalogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
