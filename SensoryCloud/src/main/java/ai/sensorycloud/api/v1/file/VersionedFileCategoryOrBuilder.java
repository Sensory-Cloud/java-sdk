// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface VersionedFileCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.VersionedFileCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The category of file
   * </pre>
   *
   * <code>.sensory.api.v1.file.FileCategory category = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * The category of file
   * </pre>
   *
   * <code>.sensory.api.v1.file.FileCategory category = 1 [(.validate.rules) = { ... }</code>
   * @return The category.
   */
  ai.sensorycloud.api.v1.file.FileCategory getCategory();

  /**
   * <pre>
   * The version of the category (e.g. For TSSV v3.16.3 models, the version would be 3.16)
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version of the category (e.g. For TSSV v3.16.3 models, the version would be 3.16)
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
