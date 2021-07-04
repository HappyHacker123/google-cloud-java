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

public interface FirewallOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Firewall)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Allowed allowed = 162398632;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Allowed> getAllowedList();
  /**
   *
   *
   * <pre>
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Allowed allowed = 162398632;</code>
   */
  com.google.cloud.compute.v1.Allowed getAllowed(int index);
  /**
   *
   *
   * <pre>
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Allowed allowed = 162398632;</code>
   */
  int getAllowedCount();
  /**
   *
   *
   * <pre>
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Allowed allowed = 162398632;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AllowedOrBuilder> getAllowedOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Allowed allowed = 162398632;</code>
   */
  com.google.cloud.compute.v1.AllowedOrBuilder getAllowedOrBuilder(int index);

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
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Denied denied = 275217307;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Denied> getDeniedList();
  /**
   *
   *
   * <pre>
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Denied denied = 275217307;</code>
   */
  com.google.cloud.compute.v1.Denied getDenied(int index);
  /**
   *
   *
   * <pre>
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Denied denied = 275217307;</code>
   */
  int getDeniedCount();
  /**
   *
   *
   * <pre>
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Denied denied = 275217307;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DeniedOrBuilder> getDeniedOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Denied denied = 275217307;</code>
   */
  com.google.cloud.compute.v1.DeniedOrBuilder getDeniedOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
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
   * An optional description of this resource. Provide this field when you create the resource.
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
   * An optional description of this resource. Provide this field when you create the resource.
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
   * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string destination_ranges = 305699879;</code>
   *
   * @return A list containing the destinationRanges.
   */
  java.util.List<java.lang.String> getDestinationRangesList();
  /**
   *
   *
   * <pre>
   * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string destination_ranges = 305699879;</code>
   *
   * @return The count of destinationRanges.
   */
  int getDestinationRangesCount();
  /**
   *
   *
   * <pre>
   * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string destination_ranges = 305699879;</code>
   *
   * @param index The index of the element to return.
   * @return The destinationRanges at the given index.
   */
  java.lang.String getDestinationRanges(int index);
  /**
   *
   *
   * <pre>
   * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string destination_ranges = 305699879;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the destinationRanges at the given index.
   */
  com.google.protobuf.ByteString getDestinationRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Firewall.Direction direction = 111150975;</code>
   *
   * @return Whether the direction field is set.
   */
  boolean hasDirection();
  /**
   *
   *
   * <pre>
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Firewall.Direction direction = 111150975;</code>
   *
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   *
   *
   * <pre>
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Firewall.Direction direction = 111150975;</code>
   *
   * @return The direction.
   */
  com.google.cloud.compute.v1.Firewall.Direction getDirection();

  /**
   *
   *
   * <pre>
   * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
   * </pre>
   *
   * <code>bool disabled = 270940796;</code>
   *
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   *
   *
   * <pre>
   * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
   * </pre>
   *
   * <code>bool disabled = 270940796;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

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
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
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
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
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
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
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
   * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig log_config = 351299741;</code>
   *
   * @return Whether the logConfig field is set.
   */
  boolean hasLogConfig();
  /**
   *
   *
   * <pre>
   * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig log_config = 351299741;</code>
   *
   * @return The logConfig.
   */
  com.google.cloud.compute.v1.FirewallLogConfig getLogConfig();
  /**
   *
   *
   * <pre>
   * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig log_config = 351299741;</code>
   */
  com.google.cloud.compute.v1.FirewallLogConfigOrBuilder getLogConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
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
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
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
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
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
   * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
   * global/networks/default
   * If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
   * global/networks/default
   * If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
   * global/networks/default
   * If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
   * </pre>
   *
   * <code>int32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
   * </pre>
   *
   * <code>int32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

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
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string source_ranges = 200097658;</code>
   *
   * @return A list containing the sourceRanges.
   */
  java.util.List<java.lang.String> getSourceRangesList();
  /**
   *
   *
   * <pre>
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string source_ranges = 200097658;</code>
   *
   * @return The count of sourceRanges.
   */
  int getSourceRangesCount();
  /**
   *
   *
   * <pre>
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string source_ranges = 200097658;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceRanges at the given index.
   */
  java.lang.String getSourceRanges(int index);
  /**
   *
   *
   * <pre>
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
   * </pre>
   *
   * <code>repeated string source_ranges = 200097658;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceRanges at the given index.
   */
  com.google.protobuf.ByteString getSourceRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
   * </pre>
   *
   * <code>repeated string source_service_accounts = 105100756;</code>
   *
   * @return A list containing the sourceServiceAccounts.
   */
  java.util.List<java.lang.String> getSourceServiceAccountsList();
  /**
   *
   *
   * <pre>
   * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
   * </pre>
   *
   * <code>repeated string source_service_accounts = 105100756;</code>
   *
   * @return The count of sourceServiceAccounts.
   */
  int getSourceServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
   * </pre>
   *
   * <code>repeated string source_service_accounts = 105100756;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceServiceAccounts at the given index.
   */
  java.lang.String getSourceServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
   * </pre>
   *
   * <code>repeated string source_service_accounts = 105100756;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceServiceAccounts at the given index.
   */
  com.google.protobuf.ByteString getSourceServiceAccountsBytes(int index);

  /**
   *
   *
   * <pre>
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
   * </pre>
   *
   * <code>repeated string source_tags = 452222397;</code>
   *
   * @return A list containing the sourceTags.
   */
  java.util.List<java.lang.String> getSourceTagsList();
  /**
   *
   *
   * <pre>
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
   * </pre>
   *
   * <code>repeated string source_tags = 452222397;</code>
   *
   * @return The count of sourceTags.
   */
  int getSourceTagsCount();
  /**
   *
   *
   * <pre>
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
   * </pre>
   *
   * <code>repeated string source_tags = 452222397;</code>
   *
   * @param index The index of the element to return.
   * @return The sourceTags at the given index.
   */
  java.lang.String getSourceTags(int index);
  /**
   *
   *
   * <pre>
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
   * </pre>
   *
   * <code>repeated string source_tags = 452222397;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceTags at the given index.
   */
  com.google.protobuf.ByteString getSourceTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @return A list containing the targetServiceAccounts.
   */
  java.util.List<java.lang.String> getTargetServiceAccountsList();
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @return The count of targetServiceAccounts.
   */
  int getTargetServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @param index The index of the element to return.
   * @return The targetServiceAccounts at the given index.
   */
  java.lang.String getTargetServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetServiceAccounts at the given index.
   */
  com.google.protobuf.ByteString getTargetServiceAccountsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_tags = 62901767;</code>
   *
   * @return A list containing the targetTags.
   */
  java.util.List<java.lang.String> getTargetTagsList();
  /**
   *
   *
   * <pre>
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_tags = 62901767;</code>
   *
   * @return The count of targetTags.
   */
  int getTargetTagsCount();
  /**
   *
   *
   * <pre>
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_tags = 62901767;</code>
   *
   * @param index The index of the element to return.
   * @return The targetTags at the given index.
   */
  java.lang.String getTargetTags(int index);
  /**
   *
   *
   * <pre>
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
   * </pre>
   *
   * <code>repeated string target_tags = 62901767;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetTags at the given index.
   */
  com.google.protobuf.ByteString getTargetTagsBytes(int index);
}
