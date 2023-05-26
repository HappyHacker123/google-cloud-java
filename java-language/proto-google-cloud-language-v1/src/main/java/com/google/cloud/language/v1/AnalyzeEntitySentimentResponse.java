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
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 *
 *
 * <pre>
 * The entity-level sentiment analysis response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.AnalyzeEntitySentimentResponse}
 */
public final class AnalyzeEntitySentimentResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
    AnalyzeEntitySentimentResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnalyzeEntitySentimentResponse.newBuilder() to construct.
  private AnalyzeEntitySentimentResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnalyzeEntitySentimentResponse() {
    entities_ = java.util.Collections.emptyList();
    language_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnalyzeEntitySentimentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.language.v1.LanguageServiceProto
        .internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto
        .internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.class,
            com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.Builder.class);
  }

  public static final int ENTITIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.language.v1.Entity> entities_;
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList() {
    return entities_;
  }
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder>
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1.Entity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The recognized entities in the input document with associated sentiments.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(int index) {
    return entities_.get(index);
  }

  public static final int LANGUAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object language_ = "";
  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field
   * for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   *
   * @return The language.
   */
  @java.lang.Override
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field
   * for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   *
   * @return The bytes for language.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      language_ = b;
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
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(1, entities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(language_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, language_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(language_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, language_);
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
    if (!(obj instanceof com.google.cloud.language.v1.AnalyzeEntitySentimentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.AnalyzeEntitySentimentResponse other =
        (com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) obj;

    if (!getEntitiesList().equals(other.getEntitiesList())) return false;
    if (!getLanguage().equals(other.getLanguage())) return false;
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
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse parseFrom(
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
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse prototype) {
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
   * The entity-level sentiment analysis response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.AnalyzeEntitySentimentResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.class,
              com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
      } else {
        entities_ = null;
        entitiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      language_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto
          .internal_static_google_cloud_language_v1_AnalyzeEntitySentimentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstanceForType() {
      return com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse build() {
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse buildPartial() {
      com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result =
          new com.google.cloud.language.v1.AnalyzeEntitySentimentResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result) {
      if (entitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entities_ = java.util.Collections.unmodifiableList(entities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entities_ = entities_;
      } else {
        result.entities_ = entitiesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.language.v1.AnalyzeEntitySentimentResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.language_ = language_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) {
        return mergeFrom((com.google.cloud.language.v1.AnalyzeEntitySentimentResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.AnalyzeEntitySentimentResponse other) {
      if (other == com.google.cloud.language.v1.AnalyzeEntitySentimentResponse.getDefaultInstance())
        return this;
      if (entitiesBuilder_ == null) {
        if (!other.entities_.isEmpty()) {
          if (entities_.isEmpty()) {
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitiesIsMutable();
            entities_.addAll(other.entities_);
          }
          onChanged();
        }
      } else {
        if (!other.entities_.isEmpty()) {
          if (entitiesBuilder_.isEmpty()) {
            entitiesBuilder_.dispose();
            entitiesBuilder_ = null;
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntitiesFieldBuilder()
                    : null;
          } else {
            entitiesBuilder_.addAllMessages(other.entities_);
          }
        }
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        bitField0_ |= 0x00000002;
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
            case 10:
              {
                com.google.cloud.language.v1.Entity m =
                    input.readMessage(
                        com.google.cloud.language.v1.Entity.parser(), extensionRegistry);
                if (entitiesBuilder_ == null) {
                  ensureEntitiesIsMutable();
                  entities_.add(m);
                } else {
                  entitiesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                language_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.util.List<com.google.cloud.language.v1.Entity> entities_ =
        java.util.Collections.emptyList();

    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entities_ = new java.util.ArrayList<com.google.cloud.language.v1.Entity>(entities_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.language.v1.Entity,
            com.google.cloud.language.v1.Entity.Builder,
            com.google.cloud.language.v1.EntityOrBuilder>
        entitiesBuilder_;

    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.language.v1.Entity> getEntitiesList() {
      if (entitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entities_);
      } else {
        return entitiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public int getEntitiesCount() {
      if (entitiesBuilder_ == null) {
        return entities_.size();
      } else {
        return entitiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity getEntities(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(int index, com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.set(index, value);
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(int index, com.google.cloud.language.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(index, value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.google.cloud.language.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends com.google.cloud.language.v1.Entity> values) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entities_);
        onChanged();
      } else {
        entitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder clearEntities() {
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public Builder removeEntities(int index) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.remove(index);
        onChanged();
      } else {
        entitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder getEntitiesBuilder(int index) {
      return getEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.EntityOrBuilder getEntitiesOrBuilder(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.language.v1.EntityOrBuilder>
        getEntitiesOrBuilderList() {
      if (entitiesBuilder_ != null) {
        return entitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entities_);
      }
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder addEntitiesBuilder() {
      return getEntitiesFieldBuilder()
          .addBuilder(com.google.cloud.language.v1.Entity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.language.v1.Entity.Builder addEntitiesBuilder(int index) {
      return getEntitiesFieldBuilder()
          .addBuilder(index, com.google.cloud.language.v1.Entity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The recognized entities in the input document with associated sentiments.
     * </pre>
     *
     * <code>repeated .google.cloud.language.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.language.v1.Entity.Builder> getEntitiesBuilderList() {
      return getEntitiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.language.v1.Entity,
            com.google.cloud.language.v1.Entity.Builder,
            com.google.cloud.language.v1.EntityOrBuilder>
        getEntitiesFieldBuilder() {
      if (entitiesBuilder_ == null) {
        entitiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.language.v1.Entity,
                com.google.cloud.language.v1.Entity.Builder,
                com.google.cloud.language.v1.EntityOrBuilder>(
                entities_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entities_ = null;
      }
      return entitiesBuilder_;
    }

    private java.lang.Object language_ = "";
    /**
     *
     *
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field
     * for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     *
     * @return The language.
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field
     * for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     *
     * @return The bytes for language.
     */
    public com.google.protobuf.ByteString getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field
     * for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     *
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      language_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field
     * for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      language_ = getDefaultInstance().getLanguage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language of the text, which will be the same as the language specified
     * in the request or, if not specified, the automatically-detected language.
     * See [Document.language][google.cloud.language.v1.Document.language] field
     * for more details.
     * </pre>
     *
     * <code>string language = 2;</code>
     *
     * @param value The bytes for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      language_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.AnalyzeEntitySentimentResponse)
  private static final com.google.cloud.language.v1.AnalyzeEntitySentimentResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.AnalyzeEntitySentimentResponse();
  }

  public static com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeEntitySentimentResponse> PARSER =
      new com.google.protobuf.AbstractParser<AnalyzeEntitySentimentResponse>() {
        @java.lang.Override
        public AnalyzeEntitySentimentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnalyzeEntitySentimentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeEntitySentimentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.language.v1.AnalyzeEntitySentimentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
