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
 * Information regarding a command that was issued to a device.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectoryChromeosdevicesCommand extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the command will expire. If the device doesn't execute the command within
   * this time the command will become expired. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String commandExpireTime;

  /** Unique ID of a device command. The value may be {@code null}. */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long commandId;

  /** The result of the command execution. The value may be {@code null}. */
  @com.google.api.client.util.Key private DirectoryChromeosdevicesCommandResult commandResult;

  /** The timestamp when the command was issued by the admin. The value may be {@code null}. */
  @com.google.api.client.util.Key private String issueTime;

  /** The payload that the command specified, if any. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String payload;

  /** Indicates the command state. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String state;

  /** The type of the command. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.lang.String type;

  /**
   * The time at which the command will expire. If the device doesn't execute the command within
   * this time the command will become expired.
   *
   * @return value or {@code null} for none
   */
  public String getCommandExpireTime() {
    return commandExpireTime;
  }

  /**
   * The time at which the command will expire. If the device doesn't execute the command within
   * this time the command will become expired.
   *
   * @param commandExpireTime commandExpireTime or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setCommandExpireTime(String commandExpireTime) {
    this.commandExpireTime = commandExpireTime;
    return this;
  }

  /**
   * Unique ID of a device command.
   *
   * @return value or {@code null} for none
   */
  public java.lang.Long getCommandId() {
    return commandId;
  }

  /**
   * Unique ID of a device command.
   *
   * @param commandId commandId or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setCommandId(java.lang.Long commandId) {
    this.commandId = commandId;
    return this;
  }

  /**
   * The result of the command execution.
   *
   * @return value or {@code null} for none
   */
  public DirectoryChromeosdevicesCommandResult getCommandResult() {
    return commandResult;
  }

  /**
   * The result of the command execution.
   *
   * @param commandResult commandResult or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setCommandResult(
      DirectoryChromeosdevicesCommandResult commandResult) {
    this.commandResult = commandResult;
    return this;
  }

  /**
   * The timestamp when the command was issued by the admin.
   *
   * @return value or {@code null} for none
   */
  public String getIssueTime() {
    return issueTime;
  }

  /**
   * The timestamp when the command was issued by the admin.
   *
   * @param issueTime issueTime or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setIssueTime(String issueTime) {
    this.issueTime = issueTime;
    return this;
  }

  /**
   * The payload that the command specified, if any.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * The payload that the command specified, if any.
   *
   * @param payload payload or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Indicates the command state.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Indicates the command state.
   *
   * @param state state or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The type of the command.
   *
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the command.
   *
   * @param type type or {@code null} for none
   */
  public DirectoryChromeosdevicesCommand setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DirectoryChromeosdevicesCommand set(String fieldName, Object value) {
    return (DirectoryChromeosdevicesCommand) super.set(fieldName, value);
  }

  @Override
  public DirectoryChromeosdevicesCommand clone() {
    return (DirectoryChromeosdevicesCommand) super.clone();
  }
}