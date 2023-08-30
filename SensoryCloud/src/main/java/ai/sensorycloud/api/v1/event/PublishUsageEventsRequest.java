// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

/**
 * <pre>
 * Request to create a new usage event
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.event.PublishUsageEventsRequest}
 */
public final class PublishUsageEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.event.PublishUsageEventsRequest)
    PublishUsageEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishUsageEventsRequest.newBuilder() to construct.
  private PublishUsageEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishUsageEventsRequest() {
    events_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublishUsageEventsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.sensorycloud.api.v1.event.SensoryApiV1EventProto.internal_static_sensory_api_v1_event_PublishUsageEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.sensorycloud.api.v1.event.SensoryApiV1EventProto.internal_static_sensory_api_v1_event_PublishUsageEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.class, ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.Builder.class);
  }

  public static final int EVENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> events_;
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.sensorycloud.api.v1.event.UsageEventOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.event.UsageEvent getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.event.UsageEventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(1, events_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, events_.get(i));
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
    if (!(obj instanceof ai.sensorycloud.api.v1.event.PublishUsageEventsRequest)) {
      return super.equals(obj);
    }
    ai.sensorycloud.api.v1.event.PublishUsageEventsRequest other = (ai.sensorycloud.api.v1.event.PublishUsageEventsRequest) obj;

    if (!getEventsList()
        .equals(other.getEventsList())) return false;
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
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
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
  public static Builder newBuilder(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest prototype) {
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
   * Request to create a new usage event
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.event.PublishUsageEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.event.PublishUsageEventsRequest)
      ai.sensorycloud.api.v1.event.PublishUsageEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.sensorycloud.api.v1.event.SensoryApiV1EventProto.internal_static_sensory_api_v1_event_PublishUsageEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.sensorycloud.api.v1.event.SensoryApiV1EventProto.internal_static_sensory_api_v1_event_PublishUsageEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.class, ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.Builder.class);
    }

    // Construct using ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.newBuilder()
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
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.sensorycloud.api.v1.event.SensoryApiV1EventProto.internal_static_sensory_api_v1_event_PublishUsageEventsRequest_descriptor;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.event.PublishUsageEventsRequest getDefaultInstanceForType() {
      return ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.event.PublishUsageEventsRequest build() {
      ai.sensorycloud.api.v1.event.PublishUsageEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.sensorycloud.api.v1.event.PublishUsageEventsRequest buildPartial() {
      ai.sensorycloud.api.v1.event.PublishUsageEventsRequest result = new ai.sensorycloud.api.v1.event.PublishUsageEventsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest result) {
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
      if (other instanceof ai.sensorycloud.api.v1.event.PublishUsageEventsRequest) {
        return mergeFrom((ai.sensorycloud.api.v1.event.PublishUsageEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest other) {
      if (other == ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.getDefaultInstance()) return this;
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
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
              ai.sensorycloud.api.v1.event.UsageEvent m =
                  input.readMessage(
                      ai.sensorycloud.api.v1.event.UsageEvent.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
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

    private java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<ai.sensorycloud.api.v1.event.UsageEvent>(events_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.event.UsageEvent, ai.sensorycloud.api.v1.event.UsageEvent.Builder, ai.sensorycloud.api.v1.event.UsageEventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public ai.sensorycloud.api.v1.event.UsageEvent getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(ai.sensorycloud.api.v1.event.UsageEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.event.UsageEvent> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public ai.sensorycloud.api.v1.event.UsageEvent.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public ai.sensorycloud.api.v1.event.UsageEventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public java.util.List<? extends ai.sensorycloud.api.v1.event.UsageEventOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public ai.sensorycloud.api.v1.event.UsageEvent.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          ai.sensorycloud.api.v1.event.UsageEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public ai.sensorycloud.api.v1.event.UsageEvent.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, ai.sensorycloud.api.v1.event.UsageEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public java.util.List<ai.sensorycloud.api.v1.event.UsageEvent.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.sensorycloud.api.v1.event.UsageEvent, ai.sensorycloud.api.v1.event.UsageEvent.Builder, ai.sensorycloud.api.v1.event.UsageEventOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.sensorycloud.api.v1.event.UsageEvent, ai.sensorycloud.api.v1.event.UsageEvent.Builder, ai.sensorycloud.api.v1.event.UsageEventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensory.api.v1.event.PublishUsageEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:sensory.api.v1.event.PublishUsageEventsRequest)
  private static final ai.sensorycloud.api.v1.event.PublishUsageEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.sensorycloud.api.v1.event.PublishUsageEventsRequest();
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishUsageEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishUsageEventsRequest>() {
    @java.lang.Override
    public PublishUsageEventsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublishUsageEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishUsageEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.sensorycloud.api.v1.event.PublishUsageEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

