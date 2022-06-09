// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Possible usage event type
 * Note: if you change this enum, ensure to update schema.prisma EventType
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.UsageEventType}
 */
public enum UsageEventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Authentication usage event
   * </pre>
   *
   * <code>AUTHENTICATION = 0;</code>
   */
  AUTHENTICATION(0),
  /**
   * <pre>
   * Recognition usage event
   * </pre>
   *
   * <code>RECOGNITION = 1;</code>
   */
  RECOGNITION(1),
  /**
   * <pre>
   * Enrollment usage event
   * </pre>
   *
   * <code>ENROLLMENT = 2;</code>
   */
  ENROLLMENT(2),
  /**
   * <pre>
   * Synthesis usage event
   * </pre>
   *
   * <code>SYNTHESIS = 3;</code>
   */
  SYNTHESIS(3),
  /**
   * <pre>
   * Speech to text usage event
   * </pre>
   *
   * <code>TRANSCRIPTION = 4;</code>
   */
  TRANSCRIPTION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Authentication usage event
   * </pre>
   *
   * <code>AUTHENTICATION = 0;</code>
   */
  public static final int AUTHENTICATION_VALUE = 0;
  /**
   * <pre>
   * Recognition usage event
   * </pre>
   *
   * <code>RECOGNITION = 1;</code>
   */
  public static final int RECOGNITION_VALUE = 1;
  /**
   * <pre>
   * Enrollment usage event
   * </pre>
   *
   * <code>ENROLLMENT = 2;</code>
   */
  public static final int ENROLLMENT_VALUE = 2;
  /**
   * <pre>
   * Synthesis usage event
   * </pre>
   *
   * <code>SYNTHESIS = 3;</code>
   */
  public static final int SYNTHESIS_VALUE = 3;
  /**
   * <pre>
   * Speech to text usage event
   * </pre>
   *
   * <code>TRANSCRIPTION = 4;</code>
   */
  public static final int TRANSCRIPTION_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UsageEventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UsageEventType forNumber(int value) {
    switch (value) {
      case 0: return AUTHENTICATION;
      case 1: return RECOGNITION;
      case 2: return ENROLLMENT;
      case 3: return SYNTHESIS;
      case 4: return TRANSCRIPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UsageEventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UsageEventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UsageEventType>() {
          public UsageEventType findValueByNumber(int number) {
            return UsageEventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final UsageEventType[] VALUES = values();

  public static UsageEventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UsageEventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.UsageEventType)
}

