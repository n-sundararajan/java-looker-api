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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ScheduledPlanDestination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class ScheduledPlanDestination {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("scheduled_plan_id")
  private Long scheduledPlanId = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("apply_formatting")
  private Boolean applyFormatting = null;

  @SerializedName("apply_vis")
  private Boolean applyVis = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("looker_recipient")
  private Boolean lookerRecipient = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("parameters")
  private String parameters = null;

  @SerializedName("secret_parameters")
  private String secretParameters = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * Unique Id
   * @return id
  **/
  @ApiModelProperty(value = "Unique Id")
  public Long getId() {
    return id;
  }

  public ScheduledPlanDestination scheduledPlanId(Long scheduledPlanId) {
    this.scheduledPlanId = scheduledPlanId;
    return this;
  }

   /**
   * Id of a scheduled plan you own
   * @return scheduledPlanId
  **/
  @ApiModelProperty(value = "Id of a scheduled plan you own")
  public Long getScheduledPlanId() {
    return scheduledPlanId;
  }

  public void setScheduledPlanId(Long scheduledPlanId) {
    this.scheduledPlanId = scheduledPlanId;
  }

  public ScheduledPlanDestination format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Format requested by the given destination (i.e. PDF, etc.)
   * @return format
  **/
  @ApiModelProperty(value = "Format requested by the given destination (i.e. PDF, etc.)")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ScheduledPlanDestination applyFormatting(Boolean applyFormatting) {
    this.applyFormatting = applyFormatting;
    return this;
  }

   /**
   * Are values formatted? (containing currency symbols, digit separators, etc.
   * @return applyFormatting
  **/
  @ApiModelProperty(value = "Are values formatted? (containing currency symbols, digit separators, etc.")
  public Boolean isApplyFormatting() {
    return applyFormatting;
  }

  public void setApplyFormatting(Boolean applyFormatting) {
    this.applyFormatting = applyFormatting;
  }

  public ScheduledPlanDestination applyVis(Boolean applyVis) {
    this.applyVis = applyVis;
    return this;
  }

   /**
   * Whether visualization options are applied to the results.
   * @return applyVis
  **/
  @ApiModelProperty(value = "Whether visualization options are applied to the results.")
  public Boolean isApplyVis() {
    return applyVis;
  }

  public void setApplyVis(Boolean applyVis) {
    this.applyVis = applyVis;
  }

  public ScheduledPlanDestination address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address for recipient. For email e.g. &#39;user@example.com&#39;. For webhooks e.g. &#39;https://domain/path&#39;. For Amazon S3 e.g. &#39;s3://bucket-name/path/&#39;. For SFTP e.g. &#39;sftp://host-name/path/&#39;. 
   * @return address
  **/
  @ApiModelProperty(value = "Address for recipient. For email e.g. 'user@example.com'. For webhooks e.g. 'https://domain/path'. For Amazon S3 e.g. 's3://bucket-name/path/'. For SFTP e.g. 'sftp://host-name/path/'. ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

   /**
   * Whether the recipient is a Looker user on the current instance (only applicable for email recipients)
   * @return lookerRecipient
  **/
  @ApiModelProperty(value = "Whether the recipient is a Looker user on the current instance (only applicable for email recipients)")
  public Boolean isLookerRecipient() {
    return lookerRecipient;
  }

  public ScheduledPlanDestination type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the address (&#39;email&#39;, &#39;webhook&#39;, &#39;s3&#39;, or &#39;sftp&#39;)
   * @return type
  **/
  @ApiModelProperty(value = "Type of the address ('email', 'webhook', 's3', or 'sftp')")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ScheduledPlanDestination parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * JSON object containing parameters for external scheduling. For Amazon S3, this requires keys and values for access_key_id and region. For SFTP, this requires a key and value for username.
   * @return parameters
  **/
  @ApiModelProperty(value = "JSON object containing parameters for external scheduling. For Amazon S3, this requires keys and values for access_key_id and region. For SFTP, this requires a key and value for username.")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public ScheduledPlanDestination secretParameters(String secretParameters) {
    this.secretParameters = secretParameters;
    return this;
  }

   /**
   * (Write-Only) JSON object containing secret parameters for external scheduling. For Amazon S3, this requires a key and value for secret_access_key. For SFTP, this requires a key and value for password.
   * @return secretParameters
  **/
  @ApiModelProperty(value = "(Write-Only) JSON object containing secret parameters for external scheduling. For Amazon S3, this requires a key and value for secret_access_key. For SFTP, this requires a key and value for password.")
  public String getSecretParameters() {
    return secretParameters;
  }

  public void setSecretParameters(String secretParameters) {
    this.secretParameters = secretParameters;
  }

  public ScheduledPlanDestination message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Optional message to be included in scheduled emails
   * @return message
  **/
  @ApiModelProperty(value = "Optional message to be included in scheduled emails")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ScheduledPlanDestination can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public ScheduledPlanDestination putCanItem(String key, Boolean canItem) {
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
    ScheduledPlanDestination scheduledPlanDestination = (ScheduledPlanDestination) o;
    return Objects.equals(this.id, scheduledPlanDestination.id) &&
        Objects.equals(this.scheduledPlanId, scheduledPlanDestination.scheduledPlanId) &&
        Objects.equals(this.format, scheduledPlanDestination.format) &&
        Objects.equals(this.applyFormatting, scheduledPlanDestination.applyFormatting) &&
        Objects.equals(this.applyVis, scheduledPlanDestination.applyVis) &&
        Objects.equals(this.address, scheduledPlanDestination.address) &&
        Objects.equals(this.lookerRecipient, scheduledPlanDestination.lookerRecipient) &&
        Objects.equals(this.type, scheduledPlanDestination.type) &&
        Objects.equals(this.parameters, scheduledPlanDestination.parameters) &&
        Objects.equals(this.secretParameters, scheduledPlanDestination.secretParameters) &&
        Objects.equals(this.message, scheduledPlanDestination.message) &&
        Objects.equals(this.can, scheduledPlanDestination.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduledPlanId, format, applyFormatting, applyVis, address, lookerRecipient, type, parameters, secretParameters, message, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPlanDestination {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scheduledPlanId: ").append(toIndentedString(scheduledPlanId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    applyFormatting: ").append(toIndentedString(applyFormatting)).append("\n");
    sb.append("    applyVis: ").append(toIndentedString(applyVis)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lookerRecipient: ").append(toIndentedString(lookerRecipient)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    secretParameters: ").append(toIndentedString(secretParameters)).append("\n");
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

