// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

public interface SystemSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.common.SystemSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sensory.api.common.CpuSummary cpu = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.sensory.api.common.CpuSummary cpu = 1 [(.validate.rules) = { ... }</code>
   * @return The cpu.
   */
  ai.sensorycloud.api.common.CpuSummary getCpu();
  /**
   * <code>.sensory.api.common.CpuSummary cpu = 1 [(.validate.rules) = { ... }</code>
   */
  ai.sensorycloud.api.common.CpuSummaryOrBuilder getCpuOrBuilder();

  /**
   * <code>.sensory.api.common.MemorySummary memory = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <code>.sensory.api.common.MemorySummary memory = 2 [(.validate.rules) = { ... }</code>
   * @return The memory.
   */
  ai.sensorycloud.api.common.MemorySummary getMemory();
  /**
   * <code>.sensory.api.common.MemorySummary memory = 2 [(.validate.rules) = { ... }</code>
   */
  ai.sensorycloud.api.common.MemorySummaryOrBuilder getMemoryOrBuilder();
}
