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
 * List of recent device users, in descending order, by last login time.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RecentUsers extends com.google.api.client.json.GenericJson {

  /**
   * The user's email address. This is only present if the user type is `USER_TYPE_MANAGED`. The
   * value may be {@code null}.
   */
  @com.google.api.client.util.Key private java.lang.String email;

  /** The type of the user. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String type;

  /**
   * The user's email address. This is only present if the user type is `USER_TYPE_MANAGED`.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The user's email address. This is only present if the user type is `USER_TYPE_MANAGED`.
   *
   * @param email email or {@code null} for none
   */
  public RecentUsers setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The type of the user.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the user.
   *
   * @param type type or {@code null} for none
   */
  public RecentUsers setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public RecentUsers set(String fieldName, Object value) {
    return (RecentUsers) super.set(fieldName, value);
  }

  @Override
  public RecentUsers clone() {
    return (RecentUsers) super.clone();
  }
}