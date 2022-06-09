// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Generic NULL value
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.Void}
 */
public enum Void
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VOID_VALUE = 0;</code>
   */
  VOID_VALUE(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VOID_VALUE = 0;</code>
   */
  public static final int VOID_VALUE_VALUE = 0;


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
  public static Void valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Void forNumber(int value) {
    switch (value) {
      case 0: return VOID_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Void>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Void> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Void>() {
          public Void findValueByNumber(int number) {
            return Void.forNumber(number);
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
    return ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Void[] VALUES = values();

  public static Void valueOf(
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

  private Void(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.Void)
}
