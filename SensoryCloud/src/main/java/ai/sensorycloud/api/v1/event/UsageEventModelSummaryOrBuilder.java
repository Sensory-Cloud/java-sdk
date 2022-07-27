// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

public interface UsageEventModelSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.event.UsageEventModelSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @return The enum numeric value on the wire for billableFunction.
   */
  int getBillableFunctionValue();
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @return The billableFunction.
   */
  ai.sensorycloud.api.common.ModelType getBillableFunction();

  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @return The units.
   */
  java.lang.String getUnits();
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @return The bytes for units.
   */
  com.google.protobuf.ByteString
      getUnitsBytes();

  /**
   * <pre>
   * The value of the summary
   * </pre>
   *
   * <code>int64 value = 3;</code>
   * @return The value.
   */
  long getValue();

  /**
   * <pre>
   * The number of events included in the summary
   * </pre>
   *
   * <code>int64 count = 4;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * Credits used by this event
   * </pre>
   *
   * <code>double credits = 5;</code>
   * @return The credits.
   */
  double getCredits();
}
