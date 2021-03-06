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
 * JSON template for About (notes) of a user in Directory API.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserAbout extends com.google.api.client.json.GenericJson {

  /**
   * About entry can have a type which indicates the content type. It can either be plain or html.
   * By default, notes contents are assumed to contain plain text. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private java.lang.String contentType;

  /** Actual value of notes. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String value;

  /**
   * About entry can have a type which indicates the content type. It can either be plain or html.
   * By default, notes contents are assumed to contain plain text.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * About entry can have a type which indicates the content type. It can either be plain or html.
   * By default, notes contents are assumed to contain plain text.
   *
   * @param contentType contentType or {@code null} for none
   */
  public UserAbout setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Actual value of notes.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Actual value of notes.
   *
   * @param value value or {@code null} for none
   */
  public UserAbout setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public UserAbout set(String fieldName, Object value) {
    return (UserAbout) super.set(fieldName, value);
  }

  @Override
  public UserAbout clone() {
    return (UserAbout) super.clone();
  }
}
