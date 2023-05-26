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

public interface ListFunctionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.ListFunctionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location from which the function should be
   * listed, specified in the format `projects/&#42;&#47;locations/&#42;` If you want to
   * list functions in all locations, use "-" in place of a location. When
   * listing functions in all locations, if one or more location(s) are
   * unreachable, the response will contain functions from all reachable
   * locations along with the names of any unreachable locations.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location from which the function should be
   * listed, specified in the format `projects/&#42;&#47;locations/&#42;` If you want to
   * list functions in all locations, use "-" in place of a location. When
   * listing functions in all locations, if one or more location(s) are
   * unreachable, the response will contain functions from all reachable
   * locations along with the names of any unreachable locations.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of functions to return per call. The largest allowed
   * page_size is 1,000, if the page_size is omitted or specified as greater
   * than 1,000 then it will be replaced as 1,000. The size of the list
   * response can be less than specified when used with filters.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value returned by the last
   * `ListFunctionsResponse`; indicates that
   * this is a continuation of a prior `ListFunctions` call, and that the
   * system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value returned by the last
   * `ListFunctionsResponse`; indicates that
   * this is a continuation of a prior `ListFunctions` call, and that the
   * system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The filter for Functions that match the filter expression,
   * following the syntax outlined in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filter for Functions that match the filter expression,
   * following the syntax outlined in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The sorting order of the resources returned. Value should be a comma
   * separated list of fields. The default sorting oder is ascending.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The sorting order of the resources returned. Value should be a comma
   * separated list of fields. The default sorting oder is ascending.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
