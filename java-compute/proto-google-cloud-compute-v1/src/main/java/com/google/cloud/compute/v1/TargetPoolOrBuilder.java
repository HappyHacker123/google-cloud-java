/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface TargetPoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool.
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
   * </pre>
   *
   * <code>string backup_pool = 45884537;</code>
   *
   * @return Whether the backupPool field is set.
   */
  boolean hasBackupPool();
  /**
   *
   *
   * <pre>
   * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool.
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
   * </pre>
   *
   * <code>string backup_pool = 45884537;</code>
   *
   * @return The backupPool.
   */
  java.lang.String getBackupPool();
  /**
   *
   *
   * <pre>
   * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool.
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
   * </pre>
   *
   * <code>string backup_pool = 45884537;</code>
   *
   * @return The bytes for backupPool.
   */
  com.google.protobuf.ByteString getBackupPoolBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1].
   * If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool.
   * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
   * </pre>
   *
   * <code>float failover_ratio = 212667006;</code>
   *
   * @return Whether the failoverRatio field is set.
   */
  boolean hasFailoverRatio();
  /**
   *
   *
   * <pre>
   * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1].
   * If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool.
   * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
   * </pre>
   *
   * <code>float failover_ratio = 212667006;</code>
   *
   * @return The failoverRatio.
   */
  float getFailoverRatio();

  /**
   *
   *
   * <pre>
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
   * </pre>
   *
   * <code>repeated string health_checks = 448370606;</code>
   *
   * @return A list containing the healthChecks.
   */
  java.util.List<java.lang.String> getHealthChecksList();
  /**
   *
   *
   * <pre>
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
   * </pre>
   *
   * <code>repeated string health_checks = 448370606;</code>
   *
   * @return The count of healthChecks.
   */
  int getHealthChecksCount();
  /**
   *
   *
   * <pre>
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
   * </pre>
   *
   * <code>repeated string health_checks = 448370606;</code>
   *
   * @param index The index of the element to return.
   * @return The healthChecks at the given index.
   */
  java.lang.String getHealthChecks(int index);
  /**
   *
   *
   * <pre>
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
   * </pre>
   *
   * <code>repeated string health_checks = 448370606;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the healthChecks at the given index.
   */
  com.google.protobuf.ByteString getHealthChecksBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String> getInstancesList();
  /**
   *
   *
   * <pre>
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   *
   *
   * <pre>
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString getInstancesBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the target pool resides.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the target pool resides.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the target pool resides.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Session affinity option, must be one of the following values:
   * NONE: Connections from the same client IP may go to any instance in the pool.
   * CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy.
   * CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetPool.SessionAffinity session_affinity = 463888561;</code>
   *
   * @return Whether the sessionAffinity field is set.
   */
  boolean hasSessionAffinity();
  /**
   *
   *
   * <pre>
   * Session affinity option, must be one of the following values:
   * NONE: Connections from the same client IP may go to any instance in the pool.
   * CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy.
   * CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetPool.SessionAffinity session_affinity = 463888561;</code>
   *
   * @return The enum numeric value on the wire for sessionAffinity.
   */
  int getSessionAffinityValue();
  /**
   *
   *
   * <pre>
   * Session affinity option, must be one of the following values:
   * NONE: Connections from the same client IP may go to any instance in the pool.
   * CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy.
   * CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.TargetPool.SessionAffinity session_affinity = 463888561;</code>
   *
   * @return The sessionAffinity.
   */
  com.google.cloud.compute.v1.TargetPool.SessionAffinity getSessionAffinity();
}
