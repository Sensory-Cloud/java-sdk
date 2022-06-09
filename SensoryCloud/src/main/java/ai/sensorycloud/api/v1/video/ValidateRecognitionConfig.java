// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

/**
 * <pre>
 * Provides information for a video-based event recognition
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.video.ValidateRecognitionConfig}
 */
public final class ValidateRecognitionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.video.ValidateRecognitionConfig)
    ValidateRecognitionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateRecognitionConfig.newBuilder() to construct.
  private ValidateRecognitionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateRecognitionConfig() {
    modelName_ = "";
    userId_ = "";
    threshold_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateRecognitionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidateRecognitionConfig(
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

            modelName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            threshold_ = rawValue;
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
    return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_ValidateRecognitionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.class, ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.Builder.class);
  }

  public static final int MODELNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object modelName_;
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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

  public static final int THRESHOLD_FIELD_NUMBER = 3;
  private int threshold_;
  /**
   * <pre>
   * The model threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for threshold.
   */
  @java.lang.Override public int getThresholdValue() {
    return threshold_;
  }
  /**
   * <pre>
   * The model threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
   * @return The threshold.
   */
  @java.lang.Override public ai.sensorycloud.api.v1.video.RecognitionThreshold getThreshold() {
    @SuppressWarnings("deprecation")
    ai.sensorycloud.api.v1.video.RecognitionThreshold result = ai.sensorycloud.api.v1.video.RecognitionThreshold.valueOf(threshold_);
    return result == null ? ai.sensorycloud.api.v1.video.RecognitionThreshold.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (threshold_ != ai.sensorycloud.api.v1.video.RecognitionThreshold.LOW.getNumber()) {
      output.writeEnum(3, threshold_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (threshold_ != ai.sensorycloud.api.v1.video.RecognitionThreshold.LOW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, threshold_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.video.ValidateRecognitionConfig)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.video.ValidateRecognitionConfig other = (ai.sensorycloud.api.v1.video.ValidateRecognitionConfig) obj;

    if (!getModelName()
        .equals(other.getModelName())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (threshold_ != other.threshold_) return false;
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
    hash = (37 * hash) + MODELNAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + threshold_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig prototype) {
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
   * Provides information for a video-based event recognition
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.video.ValidateRecognitionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.video.ValidateRecognitionConfig)
      ai.sensorycloud.api.v1.video.ValidateRecognitionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_ValidateRecognitionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.class, ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.newBuilder()
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
      modelName_ = "";

      userId_ = "";

      threshold_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_ValidateRecognitionConfig_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig build() {
      ai.sensorycloud.api.v1.video.ValidateRecognitionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig buildPartial() {
      ai.sensorycloud.api.v1.video.ValidateRecognitionConfig result = new ai.sensorycloud.api.v1.video.ValidateRecognitionConfig(this);
      result.modelName_ = modelName_;
      result.userId_ = userId_;
      result.threshold_ = threshold_;
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
      if (other instanceof ai.sensorycloud.api.v1.video.ValidateRecognitionConfig) {
        return mergeFrom((ai.sensorycloud.api.v1.video.ValidateRecognitionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig other) {
      if (other == ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.getDefaultInstance()) return this;
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.threshold_ != 0) {
        setThresholdValue(other.getThresholdValue());
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
      ai.sensorycloud.api.v1.video.ValidateRecognitionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.sensorycloud.api.v1.video.ValidateRecognitionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object modelName_ = "";
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
     * @return The modelName.
     */
    public java.lang.String getModelName() {
      java.lang.Object ref = modelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for modelName.
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      java.lang.Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
     * @param value The modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      
      modelName_ = getDefaultInstance().getModelName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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

    private int threshold_ = 0;
    /**
     * <pre>
     * The model threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for threshold.
     */
    @java.lang.Override public int getThresholdValue() {
      return threshold_;
    }
    /**
     * <pre>
     * The model threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for threshold to set.
     * @return This builder for chaining.
     */
    public Builder setThresholdValue(int value) {
      
      threshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
     * @return The threshold.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.video.RecognitionThreshold getThreshold() {
      @SuppressWarnings("deprecation")
      ai.sensorycloud.api.v1.video.RecognitionThreshold result = ai.sensorycloud.api.v1.video.RecognitionThreshold.valueOf(threshold_);
      return result == null ? ai.sensorycloud.api.v1.video.RecognitionThreshold.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The model threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
     * @param value The threshold to set.
     * @return This builder for chaining.
     */
    public Builder setThreshold(ai.sensorycloud.api.v1.video.RecognitionThreshold value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      threshold_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold threshold = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearThreshold() {
      
      threshold_ = 0;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.video.ValidateRecognitionConfig)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.video.ValidateRecognitionConfig)
  private static final ai.sensorycloud.api.v1.video.ValidateRecognitionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.video.ValidateRecognitionConfig();
  }

  public static ai.sensorycloud.api.v1.video.ValidateRecognitionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateRecognitionConfig>
      PARSER = new com.google.protobuf.AbstractParser<ValidateRecognitionConfig>() {
    @java.lang.Override
    public ValidateRecognitionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidateRecognitionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidateRecognitionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateRecognitionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
