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

public interface InterconnectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Interconnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
   * </pre>
   *
   * <code>optional bool admin_enabled = 445675089;</code>
   *
   * @return Whether the adminEnabled field is set.
   */
  boolean hasAdminEnabled();
  /**
   *
   *
   * <pre>
   * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
   * </pre>
   *
   * <code>optional bool admin_enabled = 445675089;</code>
   *
   * @return The adminEnabled.
   */
  boolean getAdminEnabled();

  /**
   *
   *
   * <pre>
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectCircuitInfo circuit_infos = 164839855;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectCircuitInfo> getCircuitInfosList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectCircuitInfo circuit_infos = 164839855;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectCircuitInfo getCircuitInfos(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectCircuitInfo circuit_infos = 164839855;
   * </code>
   */
  int getCircuitInfosCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectCircuitInfo circuit_infos = 164839855;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectCircuitInfoOrBuilder>
      getCircuitInfosOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectCircuitInfo circuit_infos = 164839855;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectCircuitInfoOrBuilder getCircuitInfosOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
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
   * <code>optional string creation_timestamp = 30525366;</code>
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
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
   * </pre>
   *
   * <code>optional string customer_name = 3665484;</code>
   *
   * @return Whether the customerName field is set.
   */
  boolean hasCustomerName();
  /**
   *
   *
   * <pre>
   * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
   * </pre>
   *
   * <code>optional string customer_name = 3665484;</code>
   *
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   *
   *
   * <pre>
   * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
   * </pre>
   *
   * <code>optional string customer_name = 3665484;</code>
   *
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString getCustomerNameBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
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
   * <code>optional string description = 422937596;</code>
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
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A list of outages expected for this Interconnect.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectOutageNotification expected_outages = 264484123;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectOutageNotification>
      getExpectedOutagesList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of outages expected for this Interconnect.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectOutageNotification expected_outages = 264484123;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectOutageNotification getExpectedOutages(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of outages expected for this Interconnect.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectOutageNotification expected_outages = 264484123;
   * </code>
   */
  int getExpectedOutagesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of outages expected for this Interconnect.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectOutageNotification expected_outages = 264484123;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectOutageNotificationOrBuilder>
      getExpectedOutagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of outages expected for this Interconnect.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InterconnectOutageNotification expected_outages = 264484123;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectOutageNotificationOrBuilder getExpectedOutagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string google_ip_address = 443105954;</code>
   *
   * @return Whether the googleIpAddress field is set.
   */
  boolean hasGoogleIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string google_ip_address = 443105954;</code>
   *
   * @return The googleIpAddress.
   */
  java.lang.String getGoogleIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string google_ip_address = 443105954;</code>
   *
   * @return The bytes for googleIpAddress.
   */
  com.google.protobuf.ByteString getGoogleIpAddressBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
   * </pre>
   *
   * <code>optional string google_reference_id = 534944469;</code>
   *
   * @return Whether the googleReferenceId field is set.
   */
  boolean hasGoogleReferenceId();
  /**
   *
   *
   * <pre>
   * [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
   * </pre>
   *
   * <code>optional string google_reference_id = 534944469;</code>
   *
   * @return The googleReferenceId.
   */
  java.lang.String getGoogleReferenceId();
  /**
   *
   *
   * <pre>
   * [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
   * </pre>
   *
   * <code>optional string google_reference_id = 534944469;</code>
   *
   * @return The bytes for googleReferenceId.
   */
  com.google.protobuf.ByteString getGoogleReferenceIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
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
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
   * </pre>
   *
   * <code>repeated string interconnect_attachments = 425388415;</code>
   *
   * @return A list containing the interconnectAttachments.
   */
  java.util.List<java.lang.String> getInterconnectAttachmentsList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
   * </pre>
   *
   * <code>repeated string interconnect_attachments = 425388415;</code>
   *
   * @return The count of interconnectAttachments.
   */
  int getInterconnectAttachmentsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
   * </pre>
   *
   * <code>repeated string interconnect_attachments = 425388415;</code>
   *
   * @param index The index of the element to return.
   * @return The interconnectAttachments at the given index.
   */
  java.lang.String getInterconnectAttachments(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
   * </pre>
   *
   * <code>repeated string interconnect_attachments = 425388415;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the interconnectAttachments at the given index.
   */
  com.google.protobuf.ByteString getInterconnectAttachmentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
   * Check the InterconnectType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interconnect_type = 515165259;</code>
   *
   * @return Whether the interconnectType field is set.
   */
  boolean hasInterconnectType();
  /**
   *
   *
   * <pre>
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
   * Check the InterconnectType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interconnect_type = 515165259;</code>
   *
   * @return The interconnectType.
   */
  java.lang.String getInterconnectType();
  /**
   *
   *
   * <pre>
   * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
   * Check the InterconnectType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interconnect_type = 515165259;</code>
   *
   * @return The bytes for interconnectType.
   */
  com.google.protobuf.ByteString getInterconnectTypeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#interconnect for interconnects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
   * Check the LinkType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string link_type = 523207775;</code>
   *
   * @return Whether the linkType field is set.
   */
  boolean hasLinkType();
  /**
   *
   *
   * <pre>
   * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
   * Check the LinkType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string link_type = 523207775;</code>
   *
   * @return The linkType.
   */
  java.lang.String getLinkType();
  /**
   *
   *
   * <pre>
   * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
   * Check the LinkType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string link_type = 523207775;</code>
   *
   * @return The bytes for linkType.
   */
  com.google.protobuf.ByteString getLinkTypeBytes();

  /**
   *
   *
   * <pre>
   * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
   * </pre>
   *
   * <code>optional string location = 290430901;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
   * </pre>
   *
   * <code>optional string location = 290430901;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
   * </pre>
   *
   * <code>optional string location = 290430901;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
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
   * <code>optional string name = 3373707;</code>
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
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Cloud Monitoring logs alerting and Cloud Notifications. This field is required for users who sign up for Cloud Interconnect using workforce identity federation.
   * </pre>
   *
   * <code>optional string noc_contact_email = 14072832;</code>
   *
   * @return Whether the nocContactEmail field is set.
   */
  boolean hasNocContactEmail();
  /**
   *
   *
   * <pre>
   * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Cloud Monitoring logs alerting and Cloud Notifications. This field is required for users who sign up for Cloud Interconnect using workforce identity federation.
   * </pre>
   *
   * <code>optional string noc_contact_email = 14072832;</code>
   *
   * @return The nocContactEmail.
   */
  java.lang.String getNocContactEmail();
  /**
   *
   *
   * <pre>
   * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Cloud Monitoring logs alerting and Cloud Notifications. This field is required for users who sign up for Cloud Interconnect using workforce identity federation.
   * </pre>
   *
   * <code>optional string noc_contact_email = 14072832;</code>
   *
   * @return The bytes for nocContactEmail.
   */
  com.google.protobuf.ByteString getNocContactEmailBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the OperationalStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operational_status = 201070847;</code>
   *
   * @return Whether the operationalStatus field is set.
   */
  boolean hasOperationalStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the OperationalStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operational_status = 201070847;</code>
   *
   * @return The operationalStatus.
   */
  java.lang.String getOperationalStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the OperationalStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string operational_status = 201070847;</code>
   *
   * @return The bytes for operationalStatus.
   */
  com.google.protobuf.ByteString getOperationalStatusBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return Whether the peerIpAddress field is set.
   */
  boolean hasPeerIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return The peerIpAddress.
   */
  java.lang.String getPeerIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
   * </pre>
   *
   * <code>optional string peer_ip_address = 207735769;</code>
   *
   * @return The bytes for peerIpAddress.
   */
  com.google.protobuf.ByteString getPeerIpAddressBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Number of links actually provisioned in this interconnect.
   * </pre>
   *
   * <code>optional int32 provisioned_link_count = 410888565;</code>
   *
   * @return Whether the provisionedLinkCount field is set.
   */
  boolean hasProvisionedLinkCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Number of links actually provisioned in this interconnect.
   * </pre>
   *
   * <code>optional int32 provisioned_link_count = 410888565;</code>
   *
   * @return The provisionedLinkCount.
   */
  int getProvisionedLinkCount();

  /**
   *
   *
   * <pre>
   * Target number of physical links in the link bundle, as requested by the customer.
   * </pre>
   *
   * <code>optional int32 requested_link_count = 45051387;</code>
   *
   * @return Whether the requestedLinkCount field is set.
   */
  boolean hasRequestedLinkCount();
  /**
   *
   *
   * <pre>
   * Target number of physical links in the link bundle, as requested by the customer.
   * </pre>
   *
   * <code>optional int32 requested_link_count = 45051387;</code>
   *
   * @return The requestedLinkCount.
   */
  int getRequestedLinkCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * [Output Only] Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
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
   * <code>optional string self_link = 456214797;</code>
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
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();
}
