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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
   * </pre>
   *
   * <code>int64 archive_size_bytes = 381093450;</code>
   *
   * @return Whether the archiveSizeBytes field is set.
   */
  boolean hasArchiveSizeBytes();
  /**
   *
   *
   * <pre>
   * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
   * </pre>
   *
   * <code>int64 archive_size_bytes = 381093450;</code>
   *
   * @return The archiveSizeBytes.
   */
  long getArchiveSizeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * The deprecation status associated with this image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   *
   *
   * <pre>
   * The deprecation status associated with this image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return The deprecated.
   */
  com.google.cloud.compute.v1.DeprecationStatus getDeprecated();
  /**
   *
   *
   * <pre>
   * The deprecation status associated with this image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   */
  com.google.cloud.compute.v1.DeprecationStatusOrBuilder getDeprecatedOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Size of the image when restored onto a persistent disk (in GB).
   * </pre>
   *
   * <code>int64 disk_size_gb = 316263735;</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();
  /**
   *
   *
   * <pre>
   * Size of the image when restored onto a persistent disk (in GB).
   * </pre>
   *
   * <code>int64 disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
   * </pre>
   *
   * <code>string family = 328751972;</code>
   *
   * @return Whether the family field is set.
   */
  boolean hasFamily();
  /**
   *
   *
   * <pre>
   * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
   * </pre>
   *
   * <code>string family = 328751972;</code>
   *
   * @return The family.
   */
  java.lang.String getFamily();
  /**
   *
   *
   * <pre>
   * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
   * </pre>
   *
   * <code>string family = 328751972;</code>
   *
   * @return The bytes for family.
   */
  com.google.protobuf.ByteString getFamilyBytes();

  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<com.google.cloud.compute.v1.GuestOsFeature> getGuestOsFeaturesList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeature getGuestOsFeatures(int index);
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  int getGuestOsFeaturesCount();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.GuestOsFeatureOrBuilder>
      getGuestOsFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeatureOrBuilder getGuestOsFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * Encrypts the image using a customer-supplied encryption key.
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey image_encryption_key = 379512583;</code>
   *
   * @return Whether the imageEncryptionKey field is set.
   */
  boolean hasImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts the image using a customer-supplied encryption key.
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey image_encryption_key = 379512583;</code>
   *
   * @return The imageEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts the image using a customer-supplied encryption key.
   * After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey image_encryption_key = 379512583;</code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getImageEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#image for images.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#image for images.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#image for images.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return Whether the labelFingerprint field is set.
   */
  boolean hasLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an image.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to this image. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this image.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   *
   * @return A list containing the licenseCodes.
   */
  java.util.List<java.lang.Long> getLicenseCodesList();
  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this image.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   *
   * @return The count of licenseCodes.
   */
  int getLicenseCodesCount();
  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this image.
   * </pre>
   *
   * <code>repeated int64 license_codes = 45482664;</code>
   *
   * @param index The index of the element to return.
   * @return The licenseCodes at the given index.
   */
  long getLicenseCodes(int index);

  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();
  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The parameters of the raw disk image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk raw_disk = 503113556;</code>
   *
   * @return Whether the rawDisk field is set.
   */
  boolean hasRawDisk();
  /**
   *
   *
   * <pre>
   * The parameters of the raw disk image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk raw_disk = 503113556;</code>
   *
   * @return The rawDisk.
   */
  com.google.cloud.compute.v1.RawDisk getRawDisk();
  /**
   *
   *
   * <pre>
   * The parameters of the raw disk image.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk raw_disk = 503113556;</code>
   */
  com.google.cloud.compute.v1.RawDiskOrBuilder getRawDiskOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 480964267;</code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 480964267;</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Set the secure boot keys of shielded instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   *
   * @return Whether the shieldedInstanceInitialState field is set.
   */
  boolean hasShieldedInstanceInitialState();
  /**
   *
   *
   * <pre>
   * Set the secure boot keys of shielded instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   *
   * @return The shieldedInstanceInitialState.
   */
  com.google.cloud.compute.v1.InitialStateConfig getShieldedInstanceInitialState();
  /**
   *
   *
   * <pre>
   * Set the secure boot keys of shielded instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   */
  com.google.cloud.compute.v1.InitialStateConfigOrBuilder
      getShieldedInstanceInitialStateOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You must provide either this property or the rawDisk.source property but not both to create an image. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
   * - projects/project/zones/zone/disks/disk
   * - zones/zone/disks/disk
   * </pre>
   *
   * <code>string source_disk = 451753793;</code>
   *
   * @return Whether the sourceDisk field is set.
   */
  boolean hasSourceDisk();
  /**
   *
   *
   * <pre>
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You must provide either this property or the rawDisk.source property but not both to create an image. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
   * - projects/project/zones/zone/disks/disk
   * - zones/zone/disks/disk
   * </pre>
   *
   * <code>string source_disk = 451753793;</code>
   *
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   *
   *
   * <pre>
   * URL of the source disk used to create this image. This can be a full or valid partial URL. You must provide either this property or the rawDisk.source property but not both to create an image. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
   * - projects/project/zones/zone/disks/disk
   * - zones/zone/disks/disk
   * </pre>
   *
   * <code>string source_disk = 451753793;</code>
   *
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString getSourceDiskBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;
   * </code>
   *
   * @return Whether the sourceDiskEncryptionKey field is set.
   */
  boolean hasSourceDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;
   * </code>
   *
   * @return The sourceDiskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_disk_encryption_key = 531501153;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSourceDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>string source_disk_id = 454190809;</code>
   *
   * @return Whether the sourceDiskId field is set.
   */
  boolean hasSourceDiskId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>string source_disk_id = 454190809;</code>
   *
   * @return The sourceDiskId.
   */
  java.lang.String getSourceDiskId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
   * </pre>
   *
   * <code>string source_disk_id = 454190809;</code>
   *
   * @return The bytes for sourceDiskId.
   */
  com.google.protobuf.ByteString getSourceDiskIdBytes();

  /**
   *
   *
   * <pre>
   * URL of the source image used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_image = 50443319;</code>
   *
   * @return Whether the sourceImage field is set.
   */
  boolean hasSourceImage();
  /**
   *
   *
   * <pre>
   * URL of the source image used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_image = 50443319;</code>
   *
   * @return The sourceImage.
   */
  java.lang.String getSourceImage();
  /**
   *
   *
   * <pre>
   * URL of the source image used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_image = 50443319;</code>
   *
   * @return The bytes for sourceImage.
   */
  com.google.protobuf.ByteString getSourceImageBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   *
   * @return Whether the sourceImageEncryptionKey field is set.
   */
  boolean hasSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   *
   * @return The sourceImageEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 381503659;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSourceImageEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
   * </pre>
   *
   * <code>string source_image_id = 55328291;</code>
   *
   * @return Whether the sourceImageId field is set.
   */
  boolean hasSourceImageId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
   * </pre>
   *
   * <code>string source_image_id = 55328291;</code>
   *
   * @return The sourceImageId.
   */
  java.lang.String getSourceImageId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
   * </pre>
   *
   * <code>string source_image_id = 55328291;</code>
   *
   * @return The bytes for sourceImageId.
   */
  com.google.protobuf.ByteString getSourceImageIdBytes();

  /**
   *
   *
   * <pre>
   * URL of the source snapshot used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The sourceImage URL
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_snapshot = 126061928;</code>
   *
   * @return Whether the sourceSnapshot field is set.
   */
  boolean hasSourceSnapshot();
  /**
   *
   *
   * <pre>
   * URL of the source snapshot used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The sourceImage URL
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_snapshot = 126061928;</code>
   *
   * @return The sourceSnapshot.
   */
  java.lang.String getSourceSnapshot();
  /**
   *
   *
   * <pre>
   * URL of the source snapshot used to create this image.
   * In order to create an image, you must provide the full or partial URL of one of the following:
   * - The selfLink URL
   * - This property
   * - The sourceImage URL
   * - The rawDisk.source URL
   * - The sourceDisk URL
   * </pre>
   *
   * <code>string source_snapshot = 126061928;</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  com.google.protobuf.ByteString getSourceSnapshotBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   *
   * @return Whether the sourceSnapshotEncryptionKey field is set.
   */
  boolean hasSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   *
   * @return The sourceSnapshotEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 303679322;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder
      getSourceSnapshotEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
   * </pre>
   *
   * <code>string source_snapshot_id = 98962258;</code>
   *
   * @return Whether the sourceSnapshotId field is set.
   */
  boolean hasSourceSnapshotId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
   * </pre>
   *
   * <code>string source_snapshot_id = 98962258;</code>
   *
   * @return The sourceSnapshotId.
   */
  java.lang.String getSourceSnapshotId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
   * </pre>
   *
   * <code>string source_snapshot_id = 98962258;</code>
   *
   * @return The bytes for sourceSnapshotId.
   */
  com.google.protobuf.ByteString getSourceSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the image used to create this disk. The default and only value is RAW
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.SourceType source_type = 452245726;</code>
   *
   * @return Whether the sourceType field is set.
   */
  boolean hasSourceType();
  /**
   *
   *
   * <pre>
   * The type of the image used to create this disk. The default and only value is RAW
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.SourceType source_type = 452245726;</code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the image used to create this disk. The default and only value is RAW
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.SourceType source_type = 452245726;</code>
   *
   * @return The sourceType.
   */
  com.google.cloud.compute.v1.Image.SourceType getSourceType();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.Status status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Image.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Image.Status getStatus();

  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   *
   * @return A list containing the storageLocations.
   */
  java.util.List<java.lang.String> getStorageLocationsList();
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   *
   * @return The count of storageLocations.
   */
  int getStorageLocationsCount();
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   *
   * @param index The index of the element to return.
   * @return The storageLocations at the given index.
   */
  java.lang.String getStorageLocations(int index);
  /**
   *
   *
   * <pre>
   * Cloud Storage bucket storage location of the image (regional or multi-regional).
   * </pre>
   *
   * <code>repeated string storage_locations = 328005274;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the storageLocations at the given index.
   */
  com.google.protobuf.ByteString getStorageLocationsBytes(int index);
}
