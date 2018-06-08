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
 * CredentialsGoogle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class CredentialsGoogle {
  @SerializedName("email")
  private String email = null;

  @SerializedName("google_user_id")
  private String googleUserId = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("logged_in_at")
  private String loggedInAt = null;

  @SerializedName("is_disabled")
  private Boolean isDisabled = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * EMail address
   * @return email
  **/
  @ApiModelProperty(value = "EMail address")
  public String getEmail() {
    return email;
  }

   /**
   * Google&#39;s Unique ID for this user
   * @return googleUserId
  **/
  @ApiModelProperty(value = "Google's Unique ID for this user")
  public String getGoogleUserId() {
    return googleUserId;
  }

   /**
   * Google domain
   * @return domain
  **/
  @ApiModelProperty(value = "Google domain")
  public String getDomain() {
    return domain;
  }

   /**
   * Timestamp for the creation of this credential
   * @return createdAt
  **/
  @ApiModelProperty(value = "Timestamp for the creation of this credential")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Timestamp for most recent login using credential
   * @return loggedInAt
  **/
  @ApiModelProperty(value = "Timestamp for most recent login using credential")
  public String getLoggedInAt() {
    return loggedInAt;
  }

   /**
   * Has this credential been disabled?
   * @return isDisabled
  **/
  @ApiModelProperty(value = "Has this credential been disabled?")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

   /**
   * Short name for the type of this kind of credential
   * @return type
  **/
  @ApiModelProperty(value = "Short name for the type of this kind of credential")
  public String getType() {
    return type;
  }

   /**
   * Link to get this item
   * @return url
  **/
  @ApiModelProperty(value = "Link to get this item")
  public String getUrl() {
    return url;
  }

  public CredentialsGoogle can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public CredentialsGoogle putCanItem(String key, Boolean canItem) {
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
    CredentialsGoogle credentialsGoogle = (CredentialsGoogle) o;
    return Objects.equals(this.email, credentialsGoogle.email) &&
        Objects.equals(this.googleUserId, credentialsGoogle.googleUserId) &&
        Objects.equals(this.domain, credentialsGoogle.domain) &&
        Objects.equals(this.createdAt, credentialsGoogle.createdAt) &&
        Objects.equals(this.loggedInAt, credentialsGoogle.loggedInAt) &&
        Objects.equals(this.isDisabled, credentialsGoogle.isDisabled) &&
        Objects.equals(this.type, credentialsGoogle.type) &&
        Objects.equals(this.url, credentialsGoogle.url) &&
        Objects.equals(this.can, credentialsGoogle.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, googleUserId, domain, createdAt, loggedInAt, isDisabled, type, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsGoogle {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    googleUserId: ").append(toIndentedString(googleUserId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    loggedInAt: ").append(toIndentedString(loggedInAt)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

