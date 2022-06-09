// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface GetEnrollmentGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.GetEnrollmentGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> 
      getEnrollmentGroupsList();
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse getEnrollmentGroups(int index);
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  int getEnrollmentGroupsCount();
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  java.util.List<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> 
      getEnrollmentGroupsOrBuilderList();
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder getEnrollmentGroupsOrBuilder(
      int index);
}
