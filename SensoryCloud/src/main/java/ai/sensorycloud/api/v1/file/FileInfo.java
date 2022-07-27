// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

/**
 * <pre>
 * Information about the file
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.file.FileInfo}
 */
public final class FileInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.file.FileInfo)
    FileInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileInfo.newBuilder() to construct.
  private FileInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileInfo() {
    file_ = "";
    absolutePath_ = "";
    contentType_ = "";
    hash_ = "";
    tenantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileInfo(
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

            file_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            absolutePath_ = s;
            break;
          }
          case 24: {

            size_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            contentType_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            hash_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            tenantId_ = s;
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
    return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.file.FileInfo.class, ai.sensorycloud.api.v1.file.FileInfo.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object file_;
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      file_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileBytes() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      file_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ABSOLUTEPATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object absolutePath_;
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The absolutePath.
   */
  @java.lang.Override
  public java.lang.String getAbsolutePath() {
    java.lang.Object ref = absolutePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      absolutePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The bytes for absolutePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAbsolutePathBytes() {
    java.lang.Object ref = absolutePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      absolutePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private long size_;
  /**
   * <pre>
   * The full size of the file
   * </pre>
   *
   * <code>int64 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int CONTENTTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object contentType_;
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASH_FIELD_NUMBER = 5;
  private volatile java.lang.Object hash_;
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANTID_FIELD_NUMBER = 6;
  private volatile java.lang.Object tenantId_;
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
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
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(absolutePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, absolutePath_);
    }
    if (size_ != 0L) {
      output.writeInt64(3, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, hash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, tenantId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(absolutePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, absolutePath_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, hash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, tenantId_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.file.FileInfo)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.file.FileInfo other = (ai.sensorycloud.api.v1.file.FileInfo) obj;

    if (!getFile()
        .equals(other.getFile())) return false;
    if (!getAbsolutePath()
        .equals(other.getAbsolutePath())) return false;
    if (getSize()
        != other.getSize()) return false;
    if (!getContentType()
        .equals(other.getContentType())) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
    if (!getTenantId()
        .equals(other.getTenantId())) return false;
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
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (37 * hash) + ABSOLUTEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getAbsolutePath().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (37 * hash) + TENANTID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.file.FileInfo prototype) {
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
   * Information about the file
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.file.FileInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.file.FileInfo)
      ai.sensorycloud.api.v1.file.FileInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.file.FileInfo.class, ai.sensorycloud.api.v1.file.FileInfo.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.file.FileInfo.newBuilder()
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
      file_ = "";

      absolutePath_ = "";

      size_ = 0L;

      contentType_ = "";

      hash_ = "";

      tenantId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.file.SensoryApiV1FileProto.internal_static_sensory_api_v1_file_FileInfo_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileInfo getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.file.FileInfo.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileInfo build() {
      ai.sensorycloud.api.v1.file.FileInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.file.FileInfo buildPartial() {
      ai.sensorycloud.api.v1.file.FileInfo result = new ai.sensorycloud.api.v1.file.FileInfo(this);
      result.file_ = file_;
      result.absolutePath_ = absolutePath_;
      result.size_ = size_;
      result.contentType_ = contentType_;
      result.hash_ = hash_;
      result.tenantId_ = tenantId_;
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
      if (other instanceof ai.sensorycloud.api.v1.file.FileInfo) {
        return mergeFrom((ai.sensorycloud.api.v1.file.FileInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.file.FileInfo other) {
      if (other == ai.sensorycloud.api.v1.file.FileInfo.getDefaultInstance()) return this;
      if (!other.getFile().isEmpty()) {
        file_ = other.file_;
        onChanged();
      }
      if (!other.getAbsolutePath().isEmpty()) {
        absolutePath_ = other.absolutePath_;
        onChanged();
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        onChanged();
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        onChanged();
      }
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
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
      ai.sensorycloud.api.v1.file.FileInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.file.FileInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object file_ = "";
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The file.
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        file_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The bytes for file.
     */
    public com.google.protobuf.ByteString
        getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      file_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      
      file_ = getDefaultInstance().getFile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      file_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object absolutePath_ = "";
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return The absolutePath.
     */
    public java.lang.String getAbsolutePath() {
      java.lang.Object ref = absolutePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        absolutePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return The bytes for absolutePath.
     */
    public com.google.protobuf.ByteString
        getAbsolutePathBytes() {
      java.lang.Object ref = absolutePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        absolutePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @param value The absolutePath to set.
     * @return This builder for chaining.
     */
    public Builder setAbsolutePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      absolutePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbsolutePath() {
      
      absolutePath_ = getDefaultInstance().getAbsolutePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @param value The bytes for absolutePath to set.
     * @return This builder for chaining.
     */
    public Builder setAbsolutePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      absolutePath_ = value;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object contentType_ = "";
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      
      contentType_ = getDefaultInstance().getContentType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hash_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tenantId_ = "";
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
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
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
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
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
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
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      
      tenantId_ = getDefaultInstance().getTenantId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.file.FileInfo)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.file.FileInfo)
  private static final ai.sensorycloud.api.v1.file.FileInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.file.FileInfo();
  }

  public static ai.sensorycloud.api.v1.file.FileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileInfo>
      PARSER = new com.google.protobuf.AbstractParser<FileInfo>() {
    @java.lang.Override
    public FileInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.file.FileInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

