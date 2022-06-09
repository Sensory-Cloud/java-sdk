// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface UpdateEnrollmentGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.UpdateEnrollmentGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enrollment Group ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Enrollment Group ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * New name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * New name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
