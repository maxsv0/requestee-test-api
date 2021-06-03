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
 * The result of executing a command.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectoryChromeosdevicesCommandResult
    extends com.google.api.client.json.GenericJson {

  /**
   * The error message with a short explanation as to why the command failed. Only present if the
   * command failed. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private java.lang.String errorMessage;

  /**
   * The time at which the command was executed or failed to execute. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String executeTime;

  /** The result of the command. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String result;

  /**
   * The error message with a short explanation as to why the command failed. Only present if the
   * command failed.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * The error message with a short explanation as to why the command failed. Only present if the
   * command failed.
   *
   * @param errorMessage errorMessage or {@code null} for none
   */
  public DirectoryChromeosdevicesCommandResult setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The time at which the command was executed or failed to execute.
   *
   * @return value or {@code null} for none
   */
  public String getExecuteTime() {
    return executeTime;
  }

  /**
   * The time at which the command was executed or failed to execute.
   *
   * @param executeTime executeTime or {@code null} for none
   */
  public DirectoryChromeosdevicesCommandResult setExecuteTime(String executeTime) {
    this.executeTime = executeTime;
    return this;
  }

  /**
   * The result of the command.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * The result of the command.
   *
   * @param result result or {@code null} for none
   */
  public DirectoryChromeosdevicesCommandResult setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  @Override
  public DirectoryChromeosdevicesCommandResult set(String fieldName, Object value) {
    return (DirectoryChromeosdevicesCommandResult) super.set(fieldName, value);
  }

  @Override
  public DirectoryChromeosdevicesCommandResult clone() {
    return (DirectoryChromeosdevicesCommandResult) super.clone();
  }
}
