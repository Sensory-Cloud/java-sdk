// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

public interface PublicKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.oauth.PublicKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The public key as bytes
   * </pre>
   *
   * <code>bytes publicKey = 1;</code>
   * @return The publicKey.
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 2;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 2;</code>
   * @return The keyType.
   */
  ai.sensorycloud.api.common.KeyType getKeyType();
}