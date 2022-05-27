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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface PrivatePasswordLeakVerificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.PrivatePasswordLeakVerification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It
   * is used to look up password leaks associated with that hash prefix.
   * </pre>
   *
   * <code>bytes lookup_hash_prefix = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The lookupHashPrefix.
   */
  com.google.protobuf.ByteString getLookupHashPrefix();

  /**
   *
   *
   * <pre>
   * Encrypted Scrypt hash of the canonicalized username+password. It is
   * re-encrypted by the server and returned through
   * `reencrypted_user_credentials_hash`.
   * </pre>
   *
   * <code>bytes encrypted_user_credentials_hash = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptedUserCredentialsHash.
   */
  com.google.protobuf.ByteString getEncryptedUserCredentialsHash();

  /**
   *
   *
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>
   * repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the encryptedLeakMatchPrefixes.
   */
  java.util.List<com.google.protobuf.ByteString> getEncryptedLeakMatchPrefixesList();
  /**
   *
   *
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>
   * repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of encryptedLeakMatchPrefixes.
   */
  int getEncryptedLeakMatchPrefixesCount();
  /**
   *
   *
   * <pre>
   * List of prefixes of the encrypted potential password leaks that matched the
   * given parameters. They should be compared with the client-side decryption
   * prefix of `reencrypted_user_credentials_hash`
   * </pre>
   *
   * <code>
   * repeated bytes encrypted_leak_match_prefixes = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The encryptedLeakMatchPrefixes at the given index.
   */
  com.google.protobuf.ByteString getEncryptedLeakMatchPrefixes(int index);

  /**
   *
   *
   * <pre>
   * Corresponds to the re-encryption of the `encrypted_user_credentials_hash`
   * field. Used to match potential password leaks within
   * `encrypted_leak_match_prefixes`.
   * </pre>
   *
   * <code>bytes reencrypted_user_credentials_hash = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The reencryptedUserCredentialsHash.
   */
  com.google.protobuf.ByteString getReencryptedUserCredentialsHash();
}
