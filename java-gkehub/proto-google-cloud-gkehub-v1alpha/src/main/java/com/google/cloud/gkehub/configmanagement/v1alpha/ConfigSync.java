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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 *
 *
 * <pre>
 * Configuration for Config Sync
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.ConfigSync}
 */
public final class ConfigSync extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.ConfigSync)
    ConfigSyncOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConfigSync.newBuilder() to construct.
  private ConfigSync(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConfigSync() {
    sourceFormat_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConfigSync();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConfigSync(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 58:
            {
              com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder subBuilder = null;
              if (git_ != null) {
                subBuilder = git_.toBuilder();
              }
              git_ =
                  input.readMessage(
                      com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(git_);
                git_ = subBuilder.buildPartial();
              }

              break;
            }
          case 66:
            {
              java.lang.String s = input.readStringRequireUtf8();

              sourceFormat_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_ConfigSync_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_ConfigSync_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.class,
            com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.Builder.class);
  }

  public static final int GIT_FIELD_NUMBER = 7;
  private com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git_;
  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
   *
   * @return Whether the git field is set.
   */
  @java.lang.Override
  public boolean hasGit() {
    return git_ != null;
  }
  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
   *
   * @return The git.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig getGit() {
    return git_ == null
        ? com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.getDefaultInstance()
        : git_;
  }
  /**
   *
   *
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GitConfigOrBuilder getGitOrBuilder() {
    return getGit();
  }

  public static final int SOURCE_FORMAT_FIELD_NUMBER = 8;
  private volatile java.lang.Object sourceFormat_;
  /**
   *
   *
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   *
   * @return The sourceFormat.
   */
  @java.lang.Override
  public java.lang.String getSourceFormat() {
    java.lang.Object ref = sourceFormat_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceFormat_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   *
   * @return The bytes for sourceFormat.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceFormatBytes() {
    java.lang.Object ref = sourceFormat_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceFormat_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (git_ != null) {
      output.writeMessage(7, getGit());
    }
    if (!getSourceFormatBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, sourceFormat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (git_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, getGit());
    }
    if (!getSourceFormatBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, sourceFormat_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync other =
        (com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync) obj;

    if (hasGit() != other.hasGit()) return false;
    if (hasGit()) {
      if (!getGit().equals(other.getGit())) return false;
    }
    if (!getSourceFormat().equals(other.getSourceFormat())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGit()) {
      hash = (37 * hash) + GIT_FIELD_NUMBER;
      hash = (53 * hash) + getGit().hashCode();
    }
    hash = (37 * hash) + SOURCE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getSourceFormat().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Configuration for Config Sync
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.ConfigSync}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.ConfigSync)
      com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSyncOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_ConfigSync_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_ConfigSync_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.class,
              com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gitBuilder_ == null) {
        git_ = null;
      } else {
        git_ = null;
        gitBuilder_ = null;
      }
      sourceFormat_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_ConfigSync_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync result =
          new com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync(this);
      if (gitBuilder_ == null) {
        result.git_ = git_;
      } else {
        result.git_ = gitBuilder_.build();
      }
      result.sourceFormat_ = sourceFormat_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync.getDefaultInstance())
        return this;
      if (other.hasGit()) {
        mergeGit(other.getGit());
      }
      if (!other.getSourceFormat().isEmpty()) {
        sourceFormat_ = other.sourceFormat_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig,
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfigOrBuilder>
        gitBuilder_;
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     *
     * @return Whether the git field is set.
     */
    public boolean hasGit() {
      return gitBuilder_ != null || git_ != null;
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     *
     * @return The git.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig getGit() {
      if (gitBuilder_ == null) {
        return git_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.getDefaultInstance()
            : git_;
      } else {
        return gitBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public Builder setGit(com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig value) {
      if (gitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        git_ = value;
        onChanged();
      } else {
        gitBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public Builder setGit(
        com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder builderForValue) {
      if (gitBuilder_ == null) {
        git_ = builderForValue.build();
        onChanged();
      } else {
        gitBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public Builder mergeGit(com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig value) {
      if (gitBuilder_ == null) {
        if (git_ != null) {
          git_ =
              com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.newBuilder(git_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          git_ = value;
        }
        onChanged();
      } else {
        gitBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public Builder clearGit() {
      if (gitBuilder_ == null) {
        git_ = null;
        onChanged();
      } else {
        git_ = null;
        gitBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder getGitBuilder() {

      onChanged();
      return getGitFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GitConfigOrBuilder getGitOrBuilder() {
      if (gitBuilder_ != null) {
        return gitBuilder_.getMessageOrBuilder();
      } else {
        return git_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.getDefaultInstance()
            : git_;
      }
    }
    /**
     *
     *
     * <pre>
     * Git repo configuration for the cluster.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GitConfig git = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig,
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.GitConfigOrBuilder>
        getGitFieldBuilder() {
      if (gitBuilder_ == null) {
        gitBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig,
                com.google.cloud.gkehub.configmanagement.v1alpha.GitConfig.Builder,
                com.google.cloud.gkehub.configmanagement.v1alpha.GitConfigOrBuilder>(
                getGit(), getParentForChildren(), isClean());
        git_ = null;
      }
      return gitBuilder_;
    }

    private java.lang.Object sourceFormat_ = "";
    /**
     *
     *
     * <pre>
     * Specifies whether the Config Sync Repo is
     * in “hierarchical” or “unstructured” mode.
     * </pre>
     *
     * <code>string source_format = 8;</code>
     *
     * @return The sourceFormat.
     */
    public java.lang.String getSourceFormat() {
      java.lang.Object ref = sourceFormat_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceFormat_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the Config Sync Repo is
     * in “hierarchical” or “unstructured” mode.
     * </pre>
     *
     * <code>string source_format = 8;</code>
     *
     * @return The bytes for sourceFormat.
     */
    public com.google.protobuf.ByteString getSourceFormatBytes() {
      java.lang.Object ref = sourceFormat_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceFormat_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the Config Sync Repo is
     * in “hierarchical” or “unstructured” mode.
     * </pre>
     *
     * <code>string source_format = 8;</code>
     *
     * @param value The sourceFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFormat(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sourceFormat_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the Config Sync Repo is
     * in “hierarchical” or “unstructured” mode.
     * </pre>
     *
     * <code>string source_format = 8;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceFormat() {

      sourceFormat_ = getDefaultInstance().getSourceFormat();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the Config Sync Repo is
     * in “hierarchical” or “unstructured” mode.
     * </pre>
     *
     * <code>string source_format = 8;</code>
     *
     * @param value The bytes for sourceFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFormatBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      sourceFormat_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.ConfigSync)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.ConfigSync)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigSync> PARSER =
      new com.google.protobuf.AbstractParser<ConfigSync>() {
        @java.lang.Override
        public ConfigSync parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConfigSync(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConfigSync> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigSync> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.ConfigSync getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
