/*
 * Looker API 3.0 Reference
 * ### Authorization  The Looker API uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page. Pass API3 credentials to the **_/login** endpoint to obtain a temporary access_token. Include that access_token in the Authorization header of Looker API requests. For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization)  ### Client SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. Client SDKs for a variety of programming languages can be generated from the Looker API's Swagger JSON metadata to streamline use of the Looker API in your applications. A client SDK for Ruby is available as an example. For more information, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks)  ### Try It Out!  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  ### Versioning  Future releases of Looker will expand this API release-by-release to securely expose more and more of the core power of Looker to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning. Stable (non-beta) API endpoints should not receive breaking changes in future releases. For more information, see [Looker API Versioning](https://looker.com/docs/r/api/versioning) 
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ValidationError;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataActionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class DataActionResponse {
  @SerializedName("webhook_id")
  private String webhookId = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("refresh_query")
  private Boolean refreshQuery = null;

  @SerializedName("validation_errors")
  private ValidationError validationErrors = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * ID of the webhook event that sent this data action. In some error conditions, this may be null.
   * @return webhookId
  **/
  @ApiModelProperty(value = "ID of the webhook event that sent this data action. In some error conditions, this may be null.")
  public String getWebhookId() {
    return webhookId;
  }

   /**
   * Whether the data action was successful.
   * @return success
  **/
  @ApiModelProperty(value = "Whether the data action was successful.")
  public Boolean isSuccess() {
    return success;
  }

   /**
   * When true, indicates that the client should refresh (rerun) the source query because the data may have been changed by the action.
   * @return refreshQuery
  **/
  @ApiModelProperty(value = "When true, indicates that the client should refresh (rerun) the source query because the data may have been changed by the action.")
  public Boolean isRefreshQuery() {
    return refreshQuery;
  }

  public DataActionResponse validationErrors(ValidationError validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

   /**
   * Validation errors returned by the data action server.
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Validation errors returned by the data action server.")
  public ValidationError getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(ValidationError validationErrors) {
    this.validationErrors = validationErrors;
  }

   /**
   * Optional message returned by the data action server describing the state of the action that took place. This can be used to implement custom failure messages. If a failure is related to a particular form field, the server should send back a validation error instead. The Looker web UI does not currently display any message if the action indicates &#39;success&#39;, but may do so in the future.
   * @return message
  **/
  @ApiModelProperty(value = "Optional message returned by the data action server describing the state of the action that took place. This can be used to implement custom failure messages. If a failure is related to a particular form field, the server should send back a validation error instead. The Looker web UI does not currently display any message if the action indicates 'success', but may do so in the future.")
  public String getMessage() {
    return message;
  }

  public DataActionResponse can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public DataActionResponse putCanItem(String key, Boolean canItem) {
    if (this.can == null) {
      this.can = new HashMap<String, Boolean>();
    }
    this.can.put(key, canItem);
    return this;
  }

   /**
   * Operations the current user is able to perform on this object
   * @return can
  **/
  @ApiModelProperty(value = "Operations the current user is able to perform on this object")
  public Map<String, Boolean> getCan() {
    return can;
  }

  public void setCan(Map<String, Boolean> can) {
    this.can = can;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataActionResponse dataActionResponse = (DataActionResponse) o;
    return Objects.equals(this.webhookId, dataActionResponse.webhookId) &&
        Objects.equals(this.success, dataActionResponse.success) &&
        Objects.equals(this.refreshQuery, dataActionResponse.refreshQuery) &&
        Objects.equals(this.validationErrors, dataActionResponse.validationErrors) &&
        Objects.equals(this.message, dataActionResponse.message) &&
        Objects.equals(this.can, dataActionResponse.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, success, refreshQuery, validationErrors, message, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataActionResponse {\n");
    
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    refreshQuery: ").append(toIndentedString(refreshQuery)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    can: ").append(toIndentedString(can)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
