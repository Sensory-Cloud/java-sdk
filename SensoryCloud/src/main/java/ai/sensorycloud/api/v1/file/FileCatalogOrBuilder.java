// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface FileCatalogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.FileCatalog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileInfo files = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.file.FileInfo> 
      getFilesList();
  /**
   * <pre>
   * The list of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileInfo files = 1;</code>
   */
  ai.sensorycloud.api.v1.file.FileInfo getFiles(int index);
  /**
   * <pre>
   * The list of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileInfo files = 1;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * The list of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileInfo files = 1;</code>
   */
  java.util.List<? extends ai.sensorycloud.api.v1.file.FileInfoOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * The list of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileInfo files = 1;</code>
   */
  ai.sensorycloud.api.v1.file.FileInfoOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <pre>
   * The category of files in this catalog
   * </pre>
   *
   * <code>.sensory.api.v1.file.VersionedFileCategory category = 2;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * The category of files in this catalog
   * </pre>
   *
   * <code>.sensory.api.v1.file.VersionedFileCategory category = 2;</code>
   * @return The category.
   */
  ai.sensorycloud.api.v1.file.VersionedFileCategory getCategory();
  /**
   * <pre>
   * The category of files in this catalog
   * </pre>
   *
   * <code>.sensory.api.v1.file.VersionedFileCategory category = 2;</code>
   */
  ai.sensorycloud.api.v1.file.VersionedFileCategoryOrBuilder getCategoryOrBuilder();
}
