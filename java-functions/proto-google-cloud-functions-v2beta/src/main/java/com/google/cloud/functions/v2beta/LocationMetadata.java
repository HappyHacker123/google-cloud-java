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
// source: google/cloud/functions/v2beta/functions.proto

package com.google.cloud.functions.v2beta;

/**
 *
 *
 * <pre>
 * Extra GCF specific location information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2beta.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2beta.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {
    environments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.functions.v2beta.FunctionsProto
        .internal_static_google_cloud_functions_v2beta_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2beta.FunctionsProto
        .internal_static_google_cloud_functions_v2beta_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2beta.LocationMetadata.class,
            com.google.cloud.functions.v2beta.LocationMetadata.Builder.class);
  }

  public static final int ENVIRONMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> environments_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.cloud.functions.v2beta.Environment>
      environments_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.functions.v2beta.Environment>() {
            public com.google.cloud.functions.v2beta.Environment convert(java.lang.Integer from) {
              com.google.cloud.functions.v2beta.Environment result =
                  com.google.cloud.functions.v2beta.Environment.forNumber(from);
              return result == null
                  ? com.google.cloud.functions.v2beta.Environment.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return A list containing the environments.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.functions.v2beta.Environment> getEnvironmentsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.functions.v2beta.Environment>(
        environments_, environments_converter_);
  }
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return The count of environments.
   */
  @java.lang.Override
  public int getEnvironmentsCount() {
    return environments_.size();
  }
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The environments at the given index.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.Environment getEnvironments(int index) {
    return environments_converter_.convert(environments_.get(index));
  }
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for environments.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getEnvironmentsValueList() {
    return environments_;
  }
  /**
   *
   *
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of environments at the given index.
   */
  @java.lang.Override
  public int getEnvironmentsValue(int index) {
    return environments_.get(index);
  }

  private int environmentsMemoizedSerializedSize;

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
    getSerializedSize();
    if (getEnvironmentsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(environmentsMemoizedSerializedSize);
    }
    for (int i = 0; i < environments_.size(); i++) {
      output.writeEnumNoTag(environments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < environments_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(environments_.get(i));
      }
      size += dataSize;
      if (!getEnvironmentsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      environmentsMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.functions.v2beta.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2beta.LocationMetadata other =
        (com.google.cloud.functions.v2beta.LocationMetadata) obj;

    if (!environments_.equals(other.environments_)) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEnvironmentsCount() > 0) {
      hash = (37 * hash) + ENVIRONMENTS_FIELD_NUMBER;
      hash = (53 * hash) + environments_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.functions.v2beta.LocationMetadata prototype) {
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
   * Extra GCF specific location information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2beta.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2beta.LocationMetadata)
      com.google.cloud.functions.v2beta.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2beta.LocationMetadata.class,
              com.google.cloud.functions.v2beta.LocationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2beta.LocationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v2beta.FunctionsProto
          .internal_static_google_cloud_functions_v2beta_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.LocationMetadata getDefaultInstanceForType() {
      return com.google.cloud.functions.v2beta.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.LocationMetadata build() {
      com.google.cloud.functions.v2beta.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.LocationMetadata buildPartial() {
      com.google.cloud.functions.v2beta.LocationMetadata result =
          new com.google.cloud.functions.v2beta.LocationMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.functions.v2beta.LocationMetadata result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        environments_ = java.util.Collections.unmodifiableList(environments_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.environments_ = environments_;
    }

    private void buildPartial0(com.google.cloud.functions.v2beta.LocationMetadata result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.functions.v2beta.LocationMetadata) {
        return mergeFrom((com.google.cloud.functions.v2beta.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2beta.LocationMetadata other) {
      if (other == com.google.cloud.functions.v2beta.LocationMetadata.getDefaultInstance())
        return this;
      if (!other.environments_.isEmpty()) {
        if (environments_.isEmpty()) {
          environments_ = other.environments_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEnvironmentsIsMutable();
          environments_.addAll(other.environments_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                int tmpRaw = input.readEnum();
                ensureEnvironmentsIsMutable();
                environments_.add(tmpRaw);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureEnvironmentsIsMutable();
                  environments_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<java.lang.Integer> environments_ = java.util.Collections.emptyList();

    private void ensureEnvironmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        environments_ = new java.util.ArrayList<java.lang.Integer>(environments_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @return A list containing the environments.
     */
    public java.util.List<com.google.cloud.functions.v2beta.Environment> getEnvironmentsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.functions.v2beta.Environment>(
          environments_, environments_converter_);
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @return The count of environments.
     */
    public int getEnvironmentsCount() {
      return environments_.size();
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The environments at the given index.
     */
    public com.google.cloud.functions.v2beta.Environment getEnvironments(int index) {
      return environments_converter_.convert(environments_.get(index));
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The environments to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironments(int index, com.google.cloud.functions.v2beta.Environment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnvironmentsIsMutable();
      environments_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param value The environments to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironments(com.google.cloud.functions.v2beta.Environment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnvironmentsIsMutable();
      environments_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param values The environments to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnvironments(
        java.lang.Iterable<? extends com.google.cloud.functions.v2beta.Environment> values) {
      ensureEnvironmentsIsMutable();
      for (com.google.cloud.functions.v2beta.Environment value : values) {
        environments_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnvironments() {
      environments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @return A list containing the enum numeric values on the wire for environments.
     */
    public java.util.List<java.lang.Integer> getEnvironmentsValueList() {
      return java.util.Collections.unmodifiableList(environments_);
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of environments at the given index.
     */
    public int getEnvironmentsValue(int index) {
      return environments_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for environments to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentsValue(int index, int value) {
      ensureEnvironmentsIsMutable();
      environments_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param value The enum numeric value on the wire for environments to add.
     * @return This builder for chaining.
     */
    public Builder addEnvironmentsValue(int value) {
      ensureEnvironmentsIsMutable();
      environments_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Function environments this location supports.
     * </pre>
     *
     * <code>repeated .google.cloud.functions.v2beta.Environment environments = 1;</code>
     *
     * @param values The enum numeric values on the wire for environments to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnvironmentsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureEnvironmentsIsMutable();
      for (int value : values) {
        environments_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2beta.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2beta.LocationMetadata)
  private static final com.google.cloud.functions.v2beta.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2beta.LocationMetadata();
  }

  public static com.google.cloud.functions.v2beta.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2beta.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
