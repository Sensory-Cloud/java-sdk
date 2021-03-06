// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface FileCompleteCatalogRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.FileCompleteCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional tenantId to retrieve tenant-specific models in addition to the complete catalog
   * </pre>
   *
   * <code>string tenantId = 1;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * Optional tenantId to retrieve tenant-specific models in addition to the complete catalog
   * </pre>
   *
   * <code>string tenantId = 1;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();
}
