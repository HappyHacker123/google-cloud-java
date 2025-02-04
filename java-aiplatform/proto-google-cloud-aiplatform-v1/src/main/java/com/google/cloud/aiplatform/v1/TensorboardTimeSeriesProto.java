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
// source: google/cloud/aiplatform/v1/tensorboard_time_series.proto

package com.google.cloud.aiplatform.v1;

public final class TensorboardTimeSeriesProto {
  private TensorboardTimeSeriesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1/tensorboard"
          + "_time_series.proto\022\032google.cloud.aiplatf"
          + "orm.v1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\037google/proto"
          + "buf/timestamp.proto\"\307\006\n\025TensorboardTimeS"
          + "eries\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_nam"
          + "e\030\002 \001(\tB\004\342A\001\002\022\023\n\013description\030\003 \001(\t\022V\n\nva"
          + "lue_type\030\004 \001(\0162;.google.cloud.aiplatform"
          + ".v1.TensorboardTimeSeries.ValueTypeB\005\342A\002"
          + "\002\005\0225\n\013create_time\030\005 \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\0225\n\013update_time\030\006 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\022\014\n\004etag"
          + "\030\007 \001(\t\022\031\n\013plugin_name\030\010 \001(\tB\004\342A\001\005\022\023\n\013plu"
          + "gin_data\030\t \001(\014\022R\n\010metadata\030\n \001(\0132:.googl"
          + "e.cloud.aiplatform.v1.TensorboardTimeSer"
          + "ies.MetadataB\004\342A\001\003\032\203\001\n\010Metadata\022\026\n\010max_s"
          + "tep\030\001 \001(\003B\004\342A\001\003\0227\n\rmax_wall_time\030\002 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\022&\n\030max_"
          + "blob_sequence_length\030\003 \001(\003B\004\342A\001\003\"R\n\tValu"
          + "eType\022\032\n\026VALUE_TYPE_UNSPECIFIED\020\000\022\n\n\006SCA"
          + "LAR\020\001\022\n\n\006TENSOR\020\002\022\021\n\rBLOB_SEQUENCE\020\003:\266\001\352"
          + "A\262\001\n/aiplatform.googleapis.com/Tensorboa"
          + "rdTimeSeries\022\177projects/{project}/locatio"
          + "ns/{location}/tensorboards/{tensorboard}"
          + "/experiments/{experiment}/runs/{run}/tim"
          + "eSeries/{time_series}B\330\001\n\036com.google.clo"
          + "ud.aiplatform.v1B\032TensorboardTimeSeriesP"
          + "rotoP\001Z>cloud.google.com/go/aiplatform/a"
          + "piv1/aiplatformpb;aiplatformpb\252\002\032Google."
          + "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla"
          + "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "ValueType",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "PluginName",
              "PluginData",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor =
        internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor,
            new java.lang.String[] {
              "MaxStep", "MaxWallTime", "MaxBlobSequenceLength",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
