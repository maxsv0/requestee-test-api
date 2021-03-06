/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.directory.model;

/**
 * Model definition for RoleAssignments.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoleAssignments extends com.google.api.client.json.GenericJson {

  static {
    // hack to force ProGuard to consider RoleAssignment used, since otherwise it would be stripped
    // out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RoleAssignment.class);
  }

  /** ETag of the resource. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String etag;
  /** A list of RoleAssignment resources. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<RoleAssignment> items;
  /**
   * The type of the API resource. This is always `admin#directory#roleAssignments`. The value may
   * be {@code null}.
   */
  @com.google.api.client.util.Key private java.lang.String kind;

  /** The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String nextPageToken;

  /**
   * ETag of the resource.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   *
   * @param etag etag or {@code null} for none
   */
  public RoleAssignments setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A list of RoleAssignment resources.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<RoleAssignment> getItems() {
    return items;
  }

  /**
   * A list of RoleAssignment resources.
   *
   * @param items items or {@code null} for none
   */
  public RoleAssignments setItems(java.util.List<RoleAssignment> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roleAssignments`.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roleAssignments`.
   *
   * @param kind kind or {@code null} for none
   */
  public RoleAssignments setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /** @return value or {@code null} for none */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /** @param nextPageToken nextPageToken or {@code null} for none */
  public RoleAssignments setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public RoleAssignments set(String fieldName, Object value) {
    return (RoleAssignments) super.set(fieldName, value);
  }

  @Override
  public RoleAssignments clone() {
    return (RoleAssignments) super.clone();
  }
}
