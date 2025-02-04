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
// source: google/cloud/retail/v2/control_service.proto

package com.google.cloud.retail.v2;

public final class ControlServiceProto {
  private ControlServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CreateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CreateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UpdateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UpdateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_DeleteControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_DeleteControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_GetControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_GetControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListControlsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListControlsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListControlsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/retail/v2/control_service"
          + ".proto\022\026google.cloud.retail.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032$google/cloud/"
          + "retail/v2/control.proto\032\033google/protobuf"
          + "/empty.proto\032 google/protobuf/field_mask"
          + ".proto\"\240\001\n\024CreateControlRequest\0226\n\006paren"
          + "t\030\001 \001(\tB&\342A\001\002\372A\037\n\035retail.googleapis.com/"
          + "Catalog\0226\n\007control\030\002 \001(\0132\037.google.cloud."
          + "retail.v2.ControlB\004\342A\001\002\022\030\n\ncontrol_id\030\003 "
          + "\001(\tB\004\342A\001\002\"\177\n\024UpdateControlRequest\0226\n\007con"
          + "trol\030\001 \001(\0132\037.google.cloud.retail.v2.Cont"
          + "rolB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMask\"L\n\024DeleteControlReque"
          + "st\0224\n\004name\030\001 \001(\tB&\342A\001\002\372A\037\n\035retail.google"
          + "apis.com/Control\"I\n\021GetControlRequest\0224\n"
          + "\004name\030\001 \001(\tB&\342A\001\002\372A\037\n\035retail.googleapis."
          + "com/Control\"\226\001\n\023ListControlsRequest\0226\n\006p"
          + "arent\030\001 \001(\tB&\342A\001\002\372A\037\n\035retail.googleapis."
          + "com/Catalog\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\n"
          + "page_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001(\tB\004"
          + "\342A\001\001\"b\n\024ListControlsResponse\0221\n\010controls"
          + "\030\001 \003(\0132\037.google.cloud.retail.v2.Control\022"
          + "\027\n\017next_page_token\030\002 \001(\t2\344\007\n\016ControlServ"
          + "ice\022\304\001\n\rCreateControl\022,.google.cloud.ret"
          + "ail.v2.CreateControlRequest\032\037.google.clo"
          + "ud.retail.v2.Control\"d\332A\031parent,control,"
          + "control_id\202\323\344\223\002B\"7/v2/{parent=projects/*"
          + "/locations/*/catalogs/*}/controls:\007contr"
          + "ol\022\235\001\n\rDeleteControl\022,.google.cloud.reta"
          + "il.v2.DeleteControlRequest\032\026.google.prot"
          + "obuf.Empty\"F\332A\004name\202\323\344\223\0029*7/v2/{name=pro"
          + "jects/*/locations/*/catalogs/*/controls/"
          + "*}\022\306\001\n\rUpdateControl\022,.google.cloud.reta"
          + "il.v2.UpdateControlRequest\032\037.google.clou"
          + "d.retail.v2.Control\"f\332A\023control,update_m"
          + "ask\202\323\344\223\002J2?/v2/{control.name=projects/*/"
          + "locations/*/catalogs/*/controls/*}:\007cont"
          + "rol\022\240\001\n\nGetControl\022).google.cloud.retail"
          + ".v2.GetControlRequest\032\037.google.cloud.ret"
          + "ail.v2.Control\"F\332A\004name\202\323\344\223\0029\0227/v2/{name"
          + "=projects/*/locations/*/catalogs/*/contr"
          + "ols/*}\022\263\001\n\014ListControls\022+.google.cloud.r"
          + "etail.v2.ListControlsRequest\032,.google.cl"
          + "oud.retail.v2.ListControlsResponse\"H\332A\006p"
          + "arent\202\323\344\223\0029\0227/v2/{parent=projects/*/loca"
          + "tions/*/catalogs/*}/controls\032I\312A\025retail."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\276\001\n\032com.google.c"
          + "loud.retail.v2B\023ControlServiceProtoP\001Z2c"
          + "loud.google.com/go/retail/apiv2/retailpb"
          + ";retailpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail"
          + ".V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::C"
          + "loud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.ControlProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_CreateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_CreateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CreateControlRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Control", "ControlId",
            });
    internal_static_google_cloud_retail_v2_UpdateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_UpdateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UpdateControlRequest_descriptor,
            new java.lang.String[] {
              "Control", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2_DeleteControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_DeleteControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_DeleteControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_GetControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_GetControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_GetControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2_ListControlsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_ListControlsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListControlsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2_ListControlsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListControlsResponse_descriptor,
            new java.lang.String[] {
              "Controls", "NextPageToken",
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
    com.google.cloud.retail.v2.ControlProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
