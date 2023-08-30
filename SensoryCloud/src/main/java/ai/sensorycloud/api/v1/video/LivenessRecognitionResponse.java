// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

/**
 * <pre>
 * Response to a liveness recognition request
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.video.LivenessRecognitionResponse}
 */
public final class LivenessRecognitionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.video.LivenessRecognitionResponse)
    LivenessRecognitionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LivenessRecognitionResponse.newBuilder() to construct.
  private LivenessRecognitionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LivenessRecognitionResponse() {
    boundingBox_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LivenessRecognitionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_LivenessRecognitionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.class, ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.Builder.class);
  }

  public static final int ISALIVE_FIELD_NUMBER = 1;
  private boolean isAlive_ = false;
  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool isAlive = 1;</code>
   * @return The isAlive.
   */
  @java.lang.Override
  public boolean getIsAlive() {
    return isAlive_;
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private float score_ = 0F;
  /**
   * <pre>
   * Score of the liveness (lower is better)
   * </pre>
   *
   * <code>float score = 2;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
  }

  public static final int DIDFINDFACE_FIELD_NUMBER = 3;
  private boolean didFindFace_ = false;
  /**
   * <pre>
   * Indicates if a face was found in the uploaded image
   * </pre>
   *
   * <code>bool didFindFace = 3;</code>
   * @return The didFindFace.
   */
  @java.lang.Override
  public boolean getDidFindFace() {
    return didFindFace_;
  }

  public static final int BOUNDINGBOX_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList boundingBox_;
  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 4;</code>
   * @return A list containing the boundingBox.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getBoundingBoxList() {
    return boundingBox_;
  }
  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 4;</code>
   * @return The count of boundingBox.
   */
  public int getBoundingBoxCount() {
    return boundingBox_.size();
  }
  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 4;</code>
   * @param index The index of the element to return.
   * @return The boundingBox at the given index.
   */
  public long getBoundingBox(int index) {
    return boundingBox_.getLong(index);
  }
  private int boundingBoxMemoizedSerializedSize = -1;

  public static final int PROBABILITYFACE_FIELD_NUMBER = 5;
  private float probabilityFace_ = 0F;
  /**
   * <pre>
   * The model's confidence in its face detection
   * </pre>
   *
   * <code>float probabilityFace = 5;</code>
   * @return The probabilityFace.
   */
  @java.lang.Override
  public float getProbabilityFace() {
    return probabilityFace_;
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
    getSerializedSize();
    if (isAlive_ != false) {
      output.writeBool(1, isAlive_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      output.writeFloat(2, score_);
    }
    if (didFindFace_ != false) {
      output.writeBool(3, didFindFace_);
    }
    if (getBoundingBoxList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(boundingBoxMemoizedSerializedSize);
    }
    for (int i = 0; i < boundingBox_.size(); i++) {
      output.writeInt64NoTag(boundingBox_.getLong(i));
    }
    if (java.lang.Float.floatToRawIntBits(probabilityFace_) != 0) {
      output.writeFloat(5, probabilityFace_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isAlive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isAlive_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, score_);
    }
    if (didFindFace_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, didFindFace_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < boundingBox_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(boundingBox_.getLong(i));
      }
      size += dataSize;
      if (!getBoundingBoxList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      boundingBoxMemoizedSerializedSize = dataSize;
    }
    if (java.lang.Float.floatToRawIntBits(probabilityFace_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, probabilityFace_);
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
    if (!(obj instanceof ai.sensorycloud.api.v1.video.LivenessRecognitionResponse)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.video.LivenessRecognitionResponse other = (ai.sensorycloud.api.v1.video.LivenessRecognitionResponse) obj;

    if (getIsAlive()
        != other.getIsAlive()) return false;
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (getDidFindFace()
        != other.getDidFindFace()) return false;
    if (!getBoundingBoxList()
        .equals(other.getBoundingBoxList())) return false;
    if (java.lang.Float.floatToIntBits(getProbabilityFace())
        != java.lang.Float.floatToIntBits(
            other.getProbabilityFace())) return false;
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
    hash = (37 * hash) + ISALIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAlive());
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    hash = (37 * hash) + DIDFINDFACE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDidFindFace());
    if (getBoundingBoxCount() > 0) {
      hash = (37 * hash) + BOUNDINGBOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBoxList().hashCode();
    }
    hash = (37 * hash) + PROBABILITYFACE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getProbabilityFace());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.video.LivenessRecognitionResponse prototype) {
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
   * Response to a liveness recognition request
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.video.LivenessRecognitionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.video.LivenessRecognitionResponse)
      ai.sensorycloud.api.v1.video.LivenessRecognitionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_LivenessRecognitionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.class, ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.newBuilder()
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
      isAlive_ = false;
      score_ = 0F;
      didFindFace_ = false;
      boundingBox_ = emptyLongList();
      probabilityFace_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.internal_static_sensory_api_v1_video_LivenessRecognitionResponse_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.LivenessRecognitionResponse getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.LivenessRecognitionResponse build() {
      ai.sensorycloud.api.v1.video.LivenessRecognitionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.video.LivenessRecognitionResponse buildPartial() {
      ai.sensorycloud.api.v1.video.LivenessRecognitionResponse result = new ai.sensorycloud.api.v1.video.LivenessRecognitionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.sensorycloud.api.v1.video.LivenessRecognitionResponse result) {
      if (((bitField0_ & 0x00000008) != 0)) {
        boundingBox_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.boundingBox_ = boundingBox_;
    }

    private void buildPartial0(ai.sensorycloud.api.v1.video.LivenessRecognitionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isAlive_ = isAlive_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.score_ = score_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.didFindFace_ = didFindFace_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.probabilityFace_ = probabilityFace_;
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
      if (other instanceof ai.sensorycloud.api.v1.video.LivenessRecognitionResponse) {
        return mergeFrom((ai.sensorycloud.api.v1.video.LivenessRecognitionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.video.LivenessRecognitionResponse other) {
      if (other == ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.getDefaultInstance()) return this;
      if (other.getIsAlive() != false) {
        setIsAlive(other.getIsAlive());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getDidFindFace() != false) {
        setDidFindFace(other.getDidFindFace());
      }
      if (!other.boundingBox_.isEmpty()) {
        if (boundingBox_.isEmpty()) {
          boundingBox_ = other.boundingBox_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureBoundingBoxIsMutable();
          boundingBox_.addAll(other.boundingBox_);
        }
        onChanged();
      }
      if (other.getProbabilityFace() != 0F) {
        setProbabilityFace(other.getProbabilityFace());
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
            case 8: {
              isAlive_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 21: {
              score_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 24: {
              didFindFace_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              long v = input.readInt64();
              ensureBoundingBoxIsMutable();
              boundingBox_.addLong(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureBoundingBoxIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                boundingBox_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 34
            case 45: {
              probabilityFace_ = input.readFloat();
              bitField0_ |= 0x00000010;
              break;
            } // case 45
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

    private boolean isAlive_ ;
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool isAlive = 1;</code>
     * @return The isAlive.
     */
    @java.lang.Override
    public boolean getIsAlive() {
      return isAlive_;
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool isAlive = 1;</code>
     * @param value The isAlive to set.
     * @return This builder for chaining.
     */
    public Builder setIsAlive(boolean value) {

      isAlive_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool isAlive = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAlive() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isAlive_ = false;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * Score of the liveness (lower is better)
     * </pre>
     *
     * <code>float score = 2;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Score of the liveness (lower is better)
     * </pre>
     *
     * <code>float score = 2;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Score of the liveness (lower is better)
     * </pre>
     *
     * <code>float score = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000002);
      score_ = 0F;
      onChanged();
      return this;
    }

    private boolean didFindFace_ ;
    /**
     * <pre>
     * Indicates if a face was found in the uploaded image
     * </pre>
     *
     * <code>bool didFindFace = 3;</code>
     * @return The didFindFace.
     */
    @java.lang.Override
    public boolean getDidFindFace() {
      return didFindFace_;
    }
    /**
     * <pre>
     * Indicates if a face was found in the uploaded image
     * </pre>
     *
     * <code>bool didFindFace = 3;</code>
     * @param value The didFindFace to set.
     * @return This builder for chaining.
     */
    public Builder setDidFindFace(boolean value) {

      didFindFace_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if a face was found in the uploaded image
     * </pre>
     *
     * <code>bool didFindFace = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDidFindFace() {
      bitField0_ = (bitField0_ & ~0x00000004);
      didFindFace_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList boundingBox_ = emptyLongList();
    private void ensureBoundingBoxIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        boundingBox_ = mutableCopy(boundingBox_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @return A list containing the boundingBox.
     */
    public java.util.List<java.lang.Long>
        getBoundingBoxList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(boundingBox_) : boundingBox_;
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @return The count of boundingBox.
     */
    public int getBoundingBoxCount() {
      return boundingBox_.size();
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @param index The index of the element to return.
     * @return The boundingBox at the given index.
     */
    public long getBoundingBox(int index) {
      return boundingBox_.getLong(index);
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @param index The index to set the value at.
     * @param value The boundingBox to set.
     * @return This builder for chaining.
     */
    public Builder setBoundingBox(
        int index, long value) {

      ensureBoundingBoxIsMutable();
      boundingBox_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @param value The boundingBox to add.
     * @return This builder for chaining.
     */
    public Builder addBoundingBox(long value) {

      ensureBoundingBoxIsMutable();
      boundingBox_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @param values The boundingBox to add.
     * @return This builder for chaining.
     */
    public Builder addAllBoundingBox(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureBoundingBoxIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, boundingBox_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The bounding box of the face
     * </pre>
     *
     * <code>repeated int64 boundingBox = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoundingBox() {
      boundingBox_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private float probabilityFace_ ;
    /**
     * <pre>
     * The model's confidence in its face detection
     * </pre>
     *
     * <code>float probabilityFace = 5;</code>
     * @return The probabilityFace.
     */
    @java.lang.Override
    public float getProbabilityFace() {
      return probabilityFace_;
    }
    /**
     * <pre>
     * The model's confidence in its face detection
     * </pre>
     *
     * <code>float probabilityFace = 5;</code>
     * @param value The probabilityFace to set.
     * @return This builder for chaining.
     */
    public Builder setProbabilityFace(float value) {

      probabilityFace_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The model's confidence in its face detection
     * </pre>
     *
     * <code>float probabilityFace = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearProbabilityFace() {
      bitField0_ = (bitField0_ & ~0x00000010);
      probabilityFace_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.video.LivenessRecognitionResponse)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.video.LivenessRecognitionResponse)
  private static final ai.sensorycloud.api.v1.video.LivenessRecognitionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.video.LivenessRecognitionResponse();
  }

  public static ai.sensorycloud.api.v1.video.LivenessRecognitionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LivenessRecognitionResponse>
      PARSER = new com.google.protobuf.AbstractParser<LivenessRecognitionResponse>() {
    @java.lang.Override
    public LivenessRecognitionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<LivenessRecognitionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LivenessRecognitionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.video.LivenessRecognitionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

