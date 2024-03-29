// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public interface AuthenticateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.AuthenticateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.AuthenticateConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.AuthenticateConfig config = 1;</code>
   * @return The config.
   */
  ai.sensorycloud.api.v1.video.AuthenticateConfig getConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `AuthenticateRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.AuthenticateConfig config = 1;</code>
   */
  ai.sensorycloud.api.v1.video.AuthenticateConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return Whether the imageContent field is set.
   */
  boolean hasImageContent();
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return The imageContent.
   */
  com.google.protobuf.ByteString getImageContent();

  ai.sensorycloud.api.v1.video.AuthenticateRequest.StreamingRequestCase getStreamingRequestCase();
}
