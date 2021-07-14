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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

/**
 *
 *
 * <pre>
 * State of Policy Controller installation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState}
 */
public final class GatekeeperDeploymentState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)
    GatekeeperDeploymentStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GatekeeperDeploymentState.newBuilder() to construct.
  private GatekeeperDeploymentState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GatekeeperDeploymentState() {
    gatekeeperControllerManagerState_ = 0;
    gatekeeperAudit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GatekeeperDeploymentState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GatekeeperDeploymentState(
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
          case 8:
            {
              int rawValue = input.readEnum();

              gatekeeperControllerManagerState_ = rawValue;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              gatekeeperAudit_ = rawValue;
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
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1beta_GatekeeperDeploymentState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1beta_GatekeeperDeploymentState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState.class,
            com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState.Builder
                .class);
  }

  public static final int GATEKEEPER_CONTROLLER_MANAGER_STATE_FIELD_NUMBER = 1;
  private int gatekeeperControllerManagerState_;
  /**
   *
   *
   * <pre>
   * Status of gatekeeper-controller-manager pod.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for gatekeeperControllerManagerState.
   */
  @java.lang.Override
  public int getGatekeeperControllerManagerStateValue() {
    return gatekeeperControllerManagerState_;
  }
  /**
   *
   *
   * <pre>
   * Status of gatekeeper-controller-manager pod.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
   * </code>
   *
   * @return The gatekeeperControllerManagerState.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
      getGatekeeperControllerManagerState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(
            gatekeeperControllerManagerState_);
    return result == null
        ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
        : result;
  }

  public static final int GATEKEEPER_AUDIT_FIELD_NUMBER = 2;
  private int gatekeeperAudit_;
  /**
   *
   *
   * <pre>
   * Status of gatekeeper-audit deployment.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;</code>
   *
   * @return The enum numeric value on the wire for gatekeeperAudit.
   */
  @java.lang.Override
  public int getGatekeeperAuditValue() {
    return gatekeeperAudit_;
  }
  /**
   *
   *
   * <pre>
   * Status of gatekeeper-audit deployment.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;</code>
   *
   * @return The gatekeeperAudit.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getGatekeeperAudit() {
    @SuppressWarnings("deprecation")
    com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(gatekeeperAudit_);
    return result == null
        ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
        : result;
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
    if (gatekeeperControllerManagerState_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, gatekeeperControllerManagerState_);
    }
    if (gatekeeperAudit_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, gatekeeperAudit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gatekeeperControllerManagerState_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(
              1, gatekeeperControllerManagerState_);
    }
    if (gatekeeperAudit_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, gatekeeperAudit_);
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
    if (!(obj
        instanceof com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState other =
        (com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState) obj;

    if (gatekeeperControllerManagerState_ != other.gatekeeperControllerManagerState_) return false;
    if (gatekeeperAudit_ != other.gatekeeperAudit_) return false;
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
    hash = (37 * hash) + GATEKEEPER_CONTROLLER_MANAGER_STATE_FIELD_NUMBER;
    hash = (53 * hash) + gatekeeperControllerManagerState_;
    hash = (37 * hash) + GATEKEEPER_AUDIT_FIELD_NUMBER;
    hash = (53 * hash) + gatekeeperAudit_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parseFrom(
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
      com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState prototype) {
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
   * State of Policy Controller installation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)
      com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_GatekeeperDeploymentState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_GatekeeperDeploymentState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState.class,
              com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState.newBuilder()
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
      gatekeeperControllerManagerState_ = 0;

      gatekeeperAudit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_GatekeeperDeploymentState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState build() {
      com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
        buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState result =
          new com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState(this);
      result.gatekeeperControllerManagerState_ = gatekeeperControllerManagerState_;
      result.gatekeeperAudit_ = gatekeeperAudit_;
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
      if (other
          instanceof com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState) {
        return mergeFrom(
            (com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
              .getDefaultInstance()) return this;
      if (other.gatekeeperControllerManagerState_ != 0) {
        setGatekeeperControllerManagerStateValue(other.getGatekeeperControllerManagerStateValue());
      }
      if (other.gatekeeperAudit_ != 0) {
        setGatekeeperAuditValue(other.getGatekeeperAuditValue());
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
      com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gatekeeperControllerManagerState_ = 0;
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-controller-manager pod.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for gatekeeperControllerManagerState.
     */
    @java.lang.Override
    public int getGatekeeperControllerManagerStateValue() {
      return gatekeeperControllerManagerState_;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-controller-manager pod.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for gatekeeperControllerManagerState to set.
     * @return This builder for chaining.
     */
    public Builder setGatekeeperControllerManagerStateValue(int value) {

      gatekeeperControllerManagerState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-controller-manager pod.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
     * </code>
     *
     * @return The gatekeeperControllerManagerState.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
        getGatekeeperControllerManagerState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
          com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(
              gatekeeperControllerManagerState_);
      return result == null
          ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-controller-manager pod.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
     * </code>
     *
     * @param value The gatekeeperControllerManagerState to set.
     * @return This builder for chaining.
     */
    public Builder setGatekeeperControllerManagerState(
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gatekeeperControllerManagerState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-controller-manager pod.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_controller_manager_state = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGatekeeperControllerManagerState() {

      gatekeeperControllerManagerState_ = 0;
      onChanged();
      return this;
    }

    private int gatekeeperAudit_ = 0;
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-audit deployment.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for gatekeeperAudit.
     */
    @java.lang.Override
    public int getGatekeeperAuditValue() {
      return gatekeeperAudit_;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-audit deployment.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for gatekeeperAudit to set.
     * @return This builder for chaining.
     */
    public Builder setGatekeeperAuditValue(int value) {

      gatekeeperAudit_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-audit deployment.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;
     * </code>
     *
     * @return The gatekeeperAudit.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getGatekeeperAudit() {
      @SuppressWarnings("deprecation")
      com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
          com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(gatekeeperAudit_);
      return result == null
          ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-audit deployment.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;
     * </code>
     *
     * @param value The gatekeeperAudit to set.
     * @return This builder for chaining.
     */
    public Builder setGatekeeperAudit(
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gatekeeperAudit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of gatekeeper-audit deployment.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState gatekeeper_audit = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGatekeeperAudit() {

      gatekeeperAudit_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState)
  private static final com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GatekeeperDeploymentState> PARSER =
      new com.google.protobuf.AbstractParser<GatekeeperDeploymentState>() {
        @java.lang.Override
        public GatekeeperDeploymentState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GatekeeperDeploymentState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GatekeeperDeploymentState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GatekeeperDeploymentState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
