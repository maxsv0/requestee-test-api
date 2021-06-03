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
 * Model definition for Roles.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Roles extends com.google.api.client.json.GenericJson {

  static {
    // hack to force ProGuard to consider Role used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Role.class);
  }

  /** ETag of the resource. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String etag;
  /** A list of Role resources. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<Role> items;
  /**
   * The type of the API resource. This is always `admin#directory#roles`. The value may be {@code
   * null}.
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
  public Roles setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A list of Role resources.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<Role> getItems() {
    return items;
  }

  /**
   * A list of Role resources.
   *
   * @param items items or {@code null} for none
   */
  public Roles setItems(java.util.List<Role> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roles`.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roles`.
   *
   * @param kind kind or {@code null} for none
   */
  public Roles setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /** @return value or {@code null} for none */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /** @param nextPageToken nextPageToken or {@code null} for none */
  public Roles setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public Roles set(String fieldName, Object value) {
    return (Roles) super.set(fieldName, value);
  }

  @Override
  public Roles clone() {
    return (Roles) super.clone();
  }
}
