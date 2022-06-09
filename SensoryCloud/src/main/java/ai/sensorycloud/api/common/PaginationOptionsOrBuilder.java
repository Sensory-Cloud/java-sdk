// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

public interface PaginationOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.common.PaginationOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parameter to order the data by. If empty, the server will choose a default ordering
   * </pre>
   *
   * <code>string ordering = 1;</code>
   * @return The ordering.
   */
  java.lang.String getOrdering();
  /**
   * <pre>
   * The parameter to order the data by. If empty, the server will choose a default ordering
   * </pre>
   *
   * <code>string ordering = 1;</code>
   * @return The bytes for ordering.
   */
  com.google.protobuf.ByteString
      getOrderingBytes();

  /**
   * <pre>
   * If "True" the data will be sorted in decending order
   * </pre>
   *
   * <code>bool decending = 2;</code>
   * @return The decending.
   */
  boolean getDecending();

  /**
   * <pre>
   * The page index to return
   * </pre>
   *
   * <code>int32 pageIndex = 3;</code>
   * @return The pageIndex.
   */
  int getPageIndex();

  /**
   * <pre>
   * The preferred number of elements per page. If zero the server will choose a default size
   * The server enforces a maximum page size of 100
   * </pre>
   *
   * <code>int32 pageSize = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
