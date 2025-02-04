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
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public final class OsLoginProto {
  private OsLoginProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/oslogin/v1/oslogin.proto\022"
          + "\027google.cloud.oslogin.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032(google/cloud/oslogi"
          + "n/common/common.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\"\231\002\n\014LoginProfile\022\022\n\004name\030\001 \001(\tB\004\342A\001"
          + "\002\022A\n\016posix_accounts\030\002 \003(\0132).google.cloud"
          + ".oslogin.common.PosixAccount\022Q\n\017ssh_publ"
          + "ic_keys\030\003 \003(\01328.google.cloud.oslogin.v1."
          + "LoginProfile.SshPublicKeysEntry\032_\n\022SshPu"
          + "blicKeysEntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001("
          + "\0132).google.cloud.oslogin.common.SshPubli"
          + "cKey:\0028\001\"\242\001\n\031CreateSshPublicKeyRequest\022<"
          + "\n\006parent\030\001 \001(\tB,\342A\001\002\372A%\022#oslogin.googlea"
          + "pis.com/SshPublicKey\022G\n\016ssh_public_key\030\002"
          + " \001(\0132).google.cloud.oslogin.common.SshPu"
          + "blicKeyB\004\342A\001\002\"W\n\031DeletePosixAccountReque"
          + "st\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#oslogin.googl"
          + "eapis.com/PosixAccount\"W\n\031DeleteSshPubli"
          + "cKeyRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#oslo"
          + "gin.googleapis.com/SshPublicKey\"{\n\026GetLo"
          + "ginProfileRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%"
          + "\022#oslogin.googleapis.com/PosixAccount\022\022\n"
          + "\nproject_id\030\002 \001(\t\022\021\n\tsystem_id\030\003 \001(\t\"T\n\026"
          + "GetSshPublicKeyRequest\022:\n\004name\030\001 \001(\tB,\342A"
          + "\001\002\372A%\n#oslogin.googleapis.com/SshPublicK"
          + "ey\"\266\001\n\031ImportSshPublicKeyRequest\022<\n\006pare"
          + "nt\030\001 \001(\tB,\342A\001\002\372A%\022#oslogin.googleapis.co"
          + "m/SshPublicKey\022G\n\016ssh_public_key\030\002 \001(\0132)"
          + ".google.cloud.oslogin.common.SshPublicKe"
          + "yB\004\342A\001\001\022\022\n\nproject_id\030\003 \001(\t\"k\n\032ImportSsh"
          + "PublicKeyResponse\022<\n\rlogin_profile\030\001 \001(\013"
          + "2%.google.cloud.oslogin.v1.LoginProfile\022"
          + "\017\n\007details\030\002 \001(\t\"\321\001\n\031UpdateSshPublicKeyR"
          + "equest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#oslogin.g"
          + "oogleapis.com/SshPublicKey\022G\n\016ssh_public"
          + "_key\030\002 \001(\0132).google.cloud.oslogin.common"
          + ".SshPublicKeyB\004\342A\001\002\022/\n\013update_mask\030\003 \001(\013"
          + "2\032.google.protobuf.FieldMask2\206\014\n\016OsLogin"
          + "Service\022\307\001\n\022CreateSshPublicKey\0222.google."
          + "cloud.oslogin.v1.CreateSshPublicKeyReque"
          + "st\032).google.cloud.oslogin.common.SshPubl"
          + "icKey\"R\332A\025parent,ssh_public_key\202\323\344\223\0024\"\"/"
          + "v1/{parent=users/*}/sshPublicKeys:\016ssh_p"
          + "ublic_key\022\216\001\n\022DeletePosixAccount\0222.googl"
          + "e.cloud.oslogin.v1.DeletePosixAccountReq"
          + "uest\032\026.google.protobuf.Empty\",\332A\004name\202\323\344"
          + "\223\002\037*\035/v1/{name=users/*/projects/*}\022\223\001\n\022D"
          + "eleteSshPublicKey\0222.google.cloud.oslogin"
          + ".v1.DeleteSshPublicKeyRequest\032\026.google.p"
          + "rotobuf.Empty\"1\332A\004name\202\323\344\223\002$*\"/v1/{name="
          + "users/*/sshPublicKeys/*}\022\231\001\n\017GetLoginPro"
          + "file\022/.google.cloud.oslogin.v1.GetLoginP"
          + "rofileRequest\032%.google.cloud.oslogin.v1."
          + "LoginProfile\".\332A\004name\202\323\344\223\002!\022\037/v1/{name=u"
          + "sers/*}/loginProfile\022\240\001\n\017GetSshPublicKey"
          + "\022/.google.cloud.oslogin.v1.GetSshPublicK"
          + "eyRequest\032).google.cloud.oslogin.common."
          + "SshPublicKey\"1\332A\004name\202\323\344\223\002$\022\"/v1/{name=u"
          + "sers/*/sshPublicKeys/*}\022\371\001\n\022ImportSshPub"
          + "licKey\0222.google.cloud.oslogin.v1.ImportS"
          + "shPublicKeyRequest\0323.google.cloud.oslogi"
          + "n.v1.ImportSshPublicKeyResponse\"z\332A\025pare"
          + "nt,ssh_public_key\332A parent,ssh_public_ke"
          + "y,project_id\202\323\344\223\0029\"\'/v1/{parent=users/*}"
          + ":importSshPublicKey:\016ssh_public_key\022\347\001\n\022"
          + "UpdateSshPublicKey\0222.google.cloud.oslogi"
          + "n.v1.UpdateSshPublicKeyRequest\032).google."
          + "cloud.oslogin.common.SshPublicKey\"r\332A\023na"
          + "me,ssh_public_key\332A\037name,ssh_public_key,"
          + "update_mask\202\323\344\223\00242\"/v1/{name=users/*/ssh"
          + "PublicKeys/*}:\016ssh_public_key\032\335\001\312A\026oslog"
          + "in.googleapis.com\322A\300\001https://www.googlea"
          + "pis.com/auth/cloud-platform,https://www."
          + "googleapis.com/auth/cloud-platform.read-"
          + "only,https://www.googleapis.com/auth/com"
          + "pute,https://www.googleapis.com/auth/com"
          + "pute.readonlyB\265\001\n\033com.google.cloud.oslog"
          + "in.v1B\014OsLoginProtoP\001Z5cloud.google.com/"
          + "go/oslogin/apiv1/osloginpb;osloginpb\252\002\027G"
          + "oogle.Cloud.OsLogin.V1\312\002\027Google\\Cloud\\Os"
          + "Login\\V1\352\002\032Google::Cloud::OsLogin::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.oslogin.common.OsLoginProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor,
            new java.lang.String[] {
              "Name", "PosixAccounts", "SshPublicKeys",
            });
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor =
        internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshPublicKey",
            });
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor,
            new java.lang.String[] {
              "Name", "ProjectId", "SystemId",
            });
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshPublicKey", "ProjectId",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor,
            new java.lang.String[] {
              "LoginProfile", "Details",
            });
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name", "SshPublicKey", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.oslogin.common.OsLoginProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
