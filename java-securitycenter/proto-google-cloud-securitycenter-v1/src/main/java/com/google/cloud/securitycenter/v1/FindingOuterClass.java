/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/securitycenter/v1/finding.proto

package com.google.cloud.securitycenter.v1;

public final class FindingOuterClass {
  private FindingOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v1/finding"
          + ".proto\022\036google.cloud.securitycenter.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032+google/cloud/securit"
          + "ycenter/v1/access.proto\032;google/cloud/se"
          + "curitycenter/v1/cloud_dlp_data_profile.p"
          + "roto\0329google/cloud/securitycenter/v1/clo"
          + "ud_dlp_inspection.proto\032/google/cloud/se"
          + "curitycenter/v1/compliance.proto\032/google"
          + "/cloud/securitycenter/v1/connection.prot"
          + "o\0324google/cloud/securitycenter/v1/contac"
          + "t_details.proto\032.google/cloud/securityce"
          + "nter/v1/container.proto\032-google/cloud/se"
          + "curitycenter/v1/database.proto\0321google/c"
          + "loud/securitycenter/v1/exfiltration.prot"
          + "o\0324google/cloud/securitycenter/v1/extern"
          + "al_system.proto\032)google/cloud/securityce"
          + "nter/v1/file.proto\0320google/cloud/securit"
          + "ycenter/v1/iam_binding.proto\032.google/clo"
          + "ud/securitycenter/v1/indicator.proto\0323go"
          + "ogle/cloud/securitycenter/v1/kernel_root"
          + "kit.proto\032/google/cloud/securitycenter/v"
          + "1/kubernetes.proto\0321google/cloud/securit"
          + "ycenter/v1/mitre_attack.proto\032,google/cl"
          + "oud/securitycenter/v1/process.proto\0323goo"
          + "gle/cloud/securitycenter/v1/security_mar"
          + "ks.proto\0322google/cloud/securitycenter/v1"
          + "/vulnerability.proto\032\034google/protobuf/st"
          + "ruct.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\343\026\n\007Finding\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030"
          + "\002 \001(\t\022\025\n\rresource_name\030\003 \001(\t\022<\n\005state\030\004 "
          + "\001(\0162-.google.cloud.securitycenter.v1.Fin"
          + "ding.State\022\020\n\010category\030\005 \001(\t\022\024\n\014external"
          + "_uri\030\006 \001(\t\022X\n\021source_properties\030\007 \003(\0132=."
          + "google.cloud.securitycenter.v1.Finding.S"
          + "ourcePropertiesEntry\022K\n\016security_marks\030\010"
          + " \001(\0132-.google.cloud.securitycenter.v1.Se"
          + "curityMarksB\004\342A\001\003\022.\n\nevent_time\030\t \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013create_time"
          + "\030\n \001(\0132\032.google.protobuf.Timestamp\022B\n\010se"
          + "verity\030\014 \001(\01620.google.cloud.securitycent"
          + "er.v1.Finding.Severity\022\026\n\016canonical_name"
          + "\030\016 \001(\t\022:\n\004mute\030\017 \001(\0162,.google.cloud.secu"
          + "ritycenter.v1.Finding.Mute\022K\n\rfinding_cl"
          + "ass\030\021 \001(\01624.google.cloud.securitycenter."
          + "v1.Finding.FindingClass\022<\n\tindicator\030\022 \001"
          + "(\0132).google.cloud.securitycenter.v1.Indi"
          + "cator\022D\n\rvulnerability\030\024 \001(\0132-.google.cl"
          + "oud.securitycenter.v1.Vulnerability\022:\n\020m"
          + "ute_update_time\030\025 \001(\0132\032.google.protobuf."
          + "TimestampB\004\342A\001\003\022\\\n\020external_systems\030\026 \003("
          + "\0132<.google.cloud.securitycenter.v1.Findi"
          + "ng.ExternalSystemsEntryB\004\342A\001\003\022A\n\014mitre_a"
          + "ttack\030\031 \001(\0132+.google.cloud.securitycente"
          + "r.v1.MitreAttack\0226\n\006access\030\032 \001(\0132&.googl"
          + "e.cloud.securitycenter.v1.Access\022?\n\013conn"
          + "ections\030\037 \003(\0132*.google.cloud.securitycen"
          + "ter.v1.Connection\022\026\n\016mute_initiator\030\034 \001("
          + "\t\022:\n\tprocesses\030\036 \003(\0132\'.google.cloud.secu"
          + "ritycenter.v1.Process\022M\n\010contacts\030! \003(\0132"
          + "5.google.cloud.securitycenter.v1.Finding"
          + ".ContactsEntryB\004\342A\001\003\022?\n\013compliances\030\" \003("
          + "\0132*.google.cloud.securitycenter.v1.Compl"
          + "iance\022!\n\023parent_display_name\030$ \001(\tB\004\342A\001\003"
          + "\022\023\n\013description\030% \001(\t\022B\n\014exfiltration\030& "
          + "\001(\0132,.google.cloud.securitycenter.v1.Exf"
          + "iltration\022@\n\014iam_bindings\030\' \003(\0132*.google"
          + ".cloud.securitycenter.v1.IamBinding\022\022\n\nn"
          + "ext_steps\030( \001(\t\022\023\n\013module_name\030) \001(\t\022=\n\n"
          + "containers\030* \003(\0132).google.cloud.security"
          + "center.v1.Container\022>\n\nkubernetes\030+ \001(\0132"
          + "*.google.cloud.securitycenter.v1.Kuberne"
          + "tes\022:\n\010database\030, \001(\0132(.google.cloud.sec"
          + "uritycenter.v1.Database\0223\n\005files\030. \003(\0132$"
          + ".google.cloud.securitycenter.v1.File\022P\n\024"
          + "cloud_dlp_inspection\0300 \001(\01322.google.clou"
          + "d.securitycenter.v1.CloudDlpInspection\022S"
          + "\n\026cloud_dlp_data_profile\0301 \001(\01323.google."
          + "cloud.securitycenter.v1.CloudDlpDataProf"
          + "ile\022E\n\016kernel_rootkit\0302 \001(\0132-.google.clo"
          + "ud.securitycenter.v1.KernelRootkit\032O\n\025So"
          + "urcePropertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005valu"
          + "e\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\032f\n\024E"
          + "xternalSystemsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005valu"
          + "e\030\002 \001(\0132..google.cloud.securitycenter.v1"
          + ".ExternalSystem:\0028\001\032_\n\rContactsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132..google.cloud."
          + "securitycenter.v1.ContactDetails:\0028\001\"8\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001"
          + "\022\014\n\010INACTIVE\020\002\"Q\n\010Severity\022\030\n\024SEVERITY_U"
          + "NSPECIFIED\020\000\022\014\n\010CRITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006"
          + "MEDIUM\020\003\022\007\n\003LOW\020\004\"C\n\004Mute\022\024\n\020MUTE_UNSPEC"
          + "IFIED\020\000\022\t\n\005MUTED\020\001\022\013\n\007UNMUTED\020\002\022\r\n\tUNDEF"
          + "INED\020\004\"\202\001\n\014FindingClass\022\035\n\031FINDING_CLASS"
          + "_UNSPECIFIED\020\000\022\n\n\006THREAT\020\001\022\021\n\rVULNERABIL"
          + "ITY\020\002\022\024\n\020MISCONFIGURATION\020\003\022\017\n\013OBSERVATI"
          + "ON\020\004\022\r\n\tSCC_ERROR\020\005:\333\001\352A\327\001\n%securitycent"
          + "er.googleapis.com/Finding\022@organizations"
          + "/{organization}/sources/{source}/finding"
          + "s/{finding}\0224folders/{folder}/sources/{s"
          + "ource}/findings/{finding}\0226projects/{pro"
          + "ject}/sources/{source}/findings/{finding"
          + "}B\330\001\n\"com.google.cloud.securitycenter.v1"
          + "P\001ZJcloud.google.com/go/securitycenter/a"
          + "piv1/securitycenterpb;securitycenterpb\252\002"
          + "\036Google.Cloud.SecurityCenter.V1\312\002\036Google"
          + "\\Cloud\\SecurityCenter\\V1\352\002!Google::Cloud"
          + "::SecurityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.AccessProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.CloudDlpInspectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.FileProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.KernelRootkitProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor(),
              com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ResourceName",
              "State",
              "Category",
              "ExternalUri",
              "SourceProperties",
              "SecurityMarks",
              "EventTime",
              "CreateTime",
              "Severity",
              "CanonicalName",
              "Mute",
              "FindingClass",
              "Indicator",
              "Vulnerability",
              "MuteUpdateTime",
              "ExternalSystems",
              "MitreAttack",
              "Access",
              "Connections",
              "MuteInitiator",
              "Processes",
              "Contacts",
              "Compliances",
              "ParentDisplayName",
              "Description",
              "Exfiltration",
              "IamBindings",
              "NextSteps",
              "ModuleName",
              "Containers",
              "Kubernetes",
              "Database",
              "Files",
              "CloudDlpInspection",
              "CloudDlpDataProfile",
              "KernelRootkit",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_SourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_ExternalSystemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Finding_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Finding_ContactsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.AccessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.CloudDlpDataProfileProto.getDescriptor();
    com.google.cloud.securitycenter.v1.CloudDlpInspectionProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ComplianceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ConnectionProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContactDetailsProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ContainerProto.getDescriptor();
    com.google.cloud.securitycenter.v1.DatabaseProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExfiltrationProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ExternalSystemProto.getDescriptor();
    com.google.cloud.securitycenter.v1.FileProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IamBindingProto.getDescriptor();
    com.google.cloud.securitycenter.v1.IndicatorProto.getDescriptor();
    com.google.cloud.securitycenter.v1.KernelRootkitProto.getDescriptor();
    com.google.cloud.securitycenter.v1.KubernetesProto.getDescriptor();
    com.google.cloud.securitycenter.v1.MitreAttackProto.getDescriptor();
    com.google.cloud.securitycenter.v1.ProcessProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.cloud.securitycenter.v1.VulnerabilityProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
