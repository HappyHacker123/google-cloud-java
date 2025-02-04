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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/aiplatform/v1beta1/deploy"
          + "ment_resource_pool_service.proto\022\037google"
          + ".cloud.aiplatform.v1beta1\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0328google/cloud/aipla"
          + "tform/v1beta1/deployed_model_ref.proto\032>"
          + "google/cloud/aiplatform/v1beta1/deployme"
          + "nt_resource_pool.proto\032.google/cloud/aip"
          + "latform/v1beta1/endpoint.proto\032/google/c"
          + "loud/aiplatform/v1beta1/operation.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\"\355\001\n#CreateDepl"
          + "oymentResourcePoolRequest\022:\n\006parent\030\001 \001("
          + "\tB*\342A\001\002\372A#\n!locations.googleapis.com/Loc"
          + "ation\022_\n\030deployment_resource_pool\030\002 \001(\0132"
          + "7.google.cloud.aiplatform.v1beta1.Deploy"
          + "mentResourcePoolB\004\342A\001\002\022)\n\033deployment_res"
          + "ource_pool_id\030\003 \001(\tB\004\342A\001\002\"\204\001\n-CreateDepl"
          + "oymentResourcePoolOperationMetadata\022S\n\020g"
          + "eneric_metadata\030\001 \001(\01329.google.cloud.aip"
          + "latform.v1beta1.GenericOperationMetadata"
          + "\"k\n GetDeploymentResourcePoolRequest\022G\n\004"
          + "name\030\001 \001(\tB9\342A\001\002\372A2\n0aiplatform.googleap"
          + "is.com/DeploymentResourcePool\"\207\001\n\"ListDe"
          + "ploymentResourcePoolsRequest\022:\n\006parent\030\001"
          + " \001(\tB*\342A\001\002\372A#\022!locations.googleapis.com/"
          + "Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"\232\001\n#ListDeploymentResourcePoolsR"
          + "esponse\022Z\n\031deployment_resource_pools\030\001 \003"
          + "(\01327.google.cloud.aiplatform.v1beta1.Dep"
          + "loymentResourcePool\022\027\n\017next_page_token\030\002"
          + " \001(\t\"\204\001\n-UpdateDeploymentResourcePoolOpe"
          + "rationMetadata\022S\n\020generic_metadata\030\001 \001(\013"
          + "29.google.cloud.aiplatform.v1beta1.Gener"
          + "icOperationMetadata\"n\n#DeleteDeploymentR"
          + "esourcePoolRequest\022G\n\004name\030\001 \001(\tB9\342A\001\002\372A"
          + "2\n0aiplatform.googleapis.com/DeploymentR"
          + "esourcePool\"k\n\032QueryDeployedModelsReques"
          + "t\022&\n\030deployment_resource_pool\030\001 \001(\tB\004\342A\001"
          + "\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\"\225\002\n\033QueryDeployedModelsResponse\022K\n\017depl"
          + "oyed_models\030\001 \003(\0132..google.cloud.aiplatf"
          + "orm.v1beta1.DeployedModelB\002\030\001\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\022N\n\023deployed_model_refs\030\003 "
          + "\003(\01321.google.cloud.aiplatform.v1beta1.De"
          + "ployedModelRef\022\"\n\032total_deployed_model_c"
          + "ount\030\004 \001(\005\022\034\n\024total_endpoint_count\030\005 \001(\005"
          + "2\337\013\n\035DeploymentResourcePoolService\022\331\002\n\034C"
          + "reateDeploymentResourcePool\022D.google.clo"
          + "ud.aiplatform.v1beta1.CreateDeploymentRe"
          + "sourcePoolRequest\032\035.google.longrunning.O"
          + "peration\"\323\001\312AG\n\026DeploymentResourcePool\022-"
          + "CreateDeploymentResourcePoolOperationMet"
          + "adata\332A;parent,deployment_resource_pool,"
          + "deployment_resource_pool_id\202\323\344\223\002E\"@/v1be"
          + "ta1/{parent=projects/*/locations/*}/depl"
          + "oymentResourcePools:\001*\022\350\001\n\031GetDeployment"
          + "ResourcePool\022A.google.cloud.aiplatform.v"
          + "1beta1.GetDeploymentResourcePoolRequest\032"
          + "7.google.cloud.aiplatform.v1beta1.Deploy"
          + "mentResourcePool\"O\332A\004name\202\323\344\223\002B\022@/v1beta"
          + "1/{name=projects/*/locations/*/deploymen"
          + "tResourcePools/*}\022\373\001\n\033ListDeploymentReso"
          + "urcePools\022C.google.cloud.aiplatform.v1be"
          + "ta1.ListDeploymentResourcePoolsRequest\032D"
          + ".google.cloud.aiplatform.v1beta1.ListDep"
          + "loymentResourcePoolsResponse\"Q\332A\006parent\202"
          + "\323\344\223\002B\022@/v1beta1/{parent=projects/*/locat"
          + "ions/*}/deploymentResourcePools\022\210\002\n\034Dele"
          + "teDeploymentResourcePool\022D.google.cloud."
          + "aiplatform.v1beta1.DeleteDeploymentResou"
          + "rcePoolRequest\032\035.google.longrunning.Oper"
          + "ation\"\202\001\312A0\n\025google.protobuf.Empty\022\027Dele"
          + "teOperationMetadata\332A\004name\202\323\344\223\002B*@/v1bet"
          + "a1/{name=projects/*/locations/*/deployme"
          + "ntResourcePools/*}\022\236\002\n\023QueryDeployedMode"
          + "ls\022;.google.cloud.aiplatform.v1beta1.Que"
          + "ryDeployedModelsRequest\032<.google.cloud.a"
          + "iplatform.v1beta1.QueryDeployedModelsRes"
          + "ponse\"\213\001\332A\030deployment_resource_pool\202\323\344\223\002"
          + "j\022h/v1beta1/{deployment_resource_pool=pr"
          + "ojects/*/locations/*/deploymentResourceP"
          + "ools/*}:queryDeployedModels\032M\312A\031aiplatfo"
          + "rm.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\371\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\"DeploymentRe"
          + "sourcePoolServiceProtoP\001ZCcloud.google.c"
          + "om/go/aiplatform/apiv1beta1/aiplatformpb"
          + ";aiplatformpb\252\002\037Google.Cloud.AIPlatform."
          + "V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta"
          + "1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePools", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor,
            new java.lang.String[] {
              "DeploymentResourcePool", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor,
            new java.lang.String[] {
              "DeployedModels",
              "NextPageToken",
              "DeployedModelRefs",
              "TotalDeployedModelCount",
              "TotalEndpointCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
