// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface EnrollmentGroupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.EnrollmentGroupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique group identifier (UUID)
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique group identifier (UUID)
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Created at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Created at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Created at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Updated at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * Updated at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 3;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * Updated at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description of the enrollment group
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the enrollment group
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Name of the model for this enrollment group
   * </pre>
   *
   * <code>string modelName = 6;</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of the model for this enrollment group
   * </pre>
   *
   * <code>string modelName = 6;</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Type of the model for this enrollment gooup
   * </pre>
   *
   * <code>.sensory.api.common.ModelType modelType = 7;</code>
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <pre>
   * Type of the model for this enrollment gooup
   * </pre>
   *
   * <code>.sensory.api.common.ModelType modelType = 7;</code>
   * @return The modelType.
   */
  ai.sensorycloud.api.common.ModelType getModelType();

  /**
   * <pre>
   * Version of the model
   * </pre>
   *
   * <code>string modelVersion = 8;</code>
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   * <pre>
   * Version of the model
   * </pre>
   *
   * <code>string modelVersion = 8;</code>
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString
      getModelVersionBytes();

  /**
   * <pre>
   * UserID of the user who created the enrollment group
   * </pre>
   *
   * <code>string userId = 9;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * UserID of the user who created the enrollment group
   * </pre>
   *
   * <code>string userId = 9;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * List of enrollments contained in this enrollment group
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 10;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.management.EnrollmentResponse> 
      getEnrollmentsList();
  /**
   * <pre>
   * List of enrollments contained in this enrollment group
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 10;</code>
   */
  ai.sensorycloud.api.v1.management.EnrollmentResponse getEnrollments(int index);
  /**
   * <pre>
   * List of enrollments contained in this enrollment group
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 10;</code>
   */
  int getEnrollmentsCount();
  /**
   * <pre>
   * List of enrollments contained in this enrollment group
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 10;</code>
   */
  java.util.List<? extends ai.sensorycloud.api.v1.management.EnrollmentResponseOrBuilder> 
      getEnrollmentsOrBuilderList();
  /**
   * <pre>
   * List of enrollments contained in this enrollment group
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 10;</code>
   */
  ai.sensorycloud.api.v1.management.EnrollmentResponseOrBuilder getEnrollmentsOrBuilder(
      int index);
}
