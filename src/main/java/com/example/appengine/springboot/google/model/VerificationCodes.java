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
 * JSON response template for List verification codes operation in Directory API.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VerificationCodes extends com.google.api.client.json.GenericJson {

  static {
    // hack to force ProGuard to consider VerificationCode used, since otherwise it would be
    // stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(VerificationCode.class);
  }

  /** ETag of the resource. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String etag;
  /** A list of verification code resources. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<VerificationCode> items;
  /**
   * The type of the resource. This is always `admin#directory#verificationCodesList`. The value may
   * be {@code null}.
   */
  @com.google.api.client.util.Key private java.lang.String kind;

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
  public VerificationCodes setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A list of verification code resources.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<VerificationCode> getItems() {
    return items;
  }

  /**
   * A list of verification code resources.
   *
   * @param items items or {@code null} for none
   */
  public VerificationCodes setItems(java.util.List<VerificationCode> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of the resource. This is always `admin#directory#verificationCodesList`.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the resource. This is always `admin#directory#verificationCodesList`.
   *
   * @param kind kind or {@code null} for none
   */
  public VerificationCodes setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public VerificationCodes set(String fieldName, Object value) {
    return (VerificationCodes) super.set(fieldName, value);
  }

  @Override
  public VerificationCodes clone() {
    return (VerificationCodes) super.clone();
  }
}
