// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 * <pre>
 * Multiple async file annotation requests are batched into a single service
 * call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest}
 */
public  final class AsyncBatchAnnotateFilesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)
    AsyncBatchAnnotateFilesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsyncBatchAnnotateFilesRequest.newBuilder() to construct.
  private AsyncBatchAnnotateFilesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsyncBatchAnnotateFilesRequest() {
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AsyncBatchAnnotateFilesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              requests_ = new java.util.ArrayList<com.google.cloud.vision.v1.AsyncAnnotateFileRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            requests_.add(
                input.readMessage(com.google.cloud.vision.v1.AsyncAnnotateFileRequest.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        requests_ = java.util.Collections.unmodifiableList(requests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_AsyncBatchAnnotateFilesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_AsyncBatchAnnotateFilesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.class, com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.Builder.class);
  }

  public static final int REQUESTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest> requests_;
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  public java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest> getRequestsList() {
    return requests_;
  }
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder> 
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  public com.google.cloud.vision.v1.AsyncAnnotateFileRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  public com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(1, requests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, requests_.get(i));
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
    if (!(obj instanceof com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest other = (com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest) obj;

    boolean result = true;
    result = result && getRequestsList()
        .equals(other.getRequestsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Multiple async file annotation requests are batched into a single service
   * call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)
      com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_AsyncBatchAnnotateFilesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_AsyncBatchAnnotateFilesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.class, com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRequestsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_AsyncBatchAnnotateFilesRequest_descriptor;
    }

    public com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.getDefaultInstance();
    }

    public com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest build() {
      com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest buildPartial() {
      com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest result = new com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest(this);
      int from_bitField0_ = bitField0_;
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest) {
        return mergeFrom((com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest other) {
      if (other == com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest.getDefaultInstance()) return this;
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequestsFieldBuilder() : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest> requests_ =
      java.util.Collections.emptyList();
    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        requests_ = new java.util.ArrayList<com.google.cloud.vision.v1.AsyncAnnotateFileRequest>(requests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1.AsyncAnnotateFileRequest, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder, com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder> requestsBuilder_;

    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest> getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public com.google.cloud.vision.v1.AsyncAnnotateFileRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder setRequests(
        int index, com.google.cloud.vision.v1.AsyncAnnotateFileRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder setRequests(
        int index, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder addRequests(com.google.cloud.vision.v1.AsyncAnnotateFileRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder addRequests(
        int index, com.google.cloud.vision.v1.AsyncAnnotateFileRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder addRequests(
        com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder addRequests(
        int index, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.cloud.vision.v1.AsyncAnnotateFileRequest> values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);  } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder> 
         getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder().addBuilder(
          com.google.cloud.vision.v1.AsyncAnnotateFileRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().addBuilder(
          index, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * Individual async file annotation requests for this batch.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder> 
         getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1.AsyncAnnotateFileRequest, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder, com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1.AsyncAnnotateFileRequest, com.google.cloud.vision.v1.AsyncAnnotateFileRequest.Builder, com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder>(
                requests_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)
  private static final com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest();
  }

  public static com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsyncBatchAnnotateFilesRequest>
      PARSER = new com.google.protobuf.AbstractParser<AsyncBatchAnnotateFilesRequest>() {
    public AsyncBatchAnnotateFilesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AsyncBatchAnnotateFilesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AsyncBatchAnnotateFilesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsyncBatchAnnotateFilesRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

