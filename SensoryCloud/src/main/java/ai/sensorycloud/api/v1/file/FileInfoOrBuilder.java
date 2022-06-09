// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface FileInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.FileInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The file.
   */
  java.lang.String getFile();
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The absolutePath.
   */
  java.lang.String getAbsolutePath();
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The bytes for absolutePath.
   */
  com.google.protobuf.ByteString
      getAbsolutePathBytes();

  /**
   * <pre>
   * The full size of the file
   * </pre>
   *
   * <code>int64 size = 3;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();
}