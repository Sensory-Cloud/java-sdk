// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Every type of compression that is supported
 * Note: if you change this enum, ensure to update schema.prisma CompressionType
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.CompressionType}
 */
public enum CompressionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Image data is in grayscale instead of full color
   * </pre>
   *
   * <code>IMAGE_GRAYSCALE = 0;</code>
   */
  IMAGE_GRAYSCALE(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Image data is in grayscale instead of full color
   * </pre>
   *
   * <code>IMAGE_GRAYSCALE = 0;</code>
   */
  public static final int IMAGE_GRAYSCALE_VALUE = 0;


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
  public static CompressionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CompressionType forNumber(int value) {
    switch (value) {
      case 0: return IMAGE_GRAYSCALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompressionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CompressionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CompressionType>() {
          public CompressionType findValueByNumber(int number) {
            return CompressionType.forNumber(number);
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
    return ai.sensorycloud.api.common.SensoryApiCommonProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final CompressionType[] VALUES = values();

  public static CompressionType valueOf(
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

  private CompressionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.CompressionType)
}

