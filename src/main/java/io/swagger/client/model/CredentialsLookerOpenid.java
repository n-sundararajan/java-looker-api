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
 * CredentialsLookerOpenid
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class CredentialsLookerOpenid {
  @SerializedName("email")
  private String email = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("logged_in_at")
  private String loggedInAt = null;

  @SerializedName("logged_in_ip")
  private String loggedInIp = null;

  @SerializedName("is_disabled")
  private Boolean isDisabled = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("user_url")
  private String userUrl = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * EMail address used for user login
   * @return email
  **/
  @ApiModelProperty(value = "EMail address used for user login")
  public String getEmail() {
    return email;
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
   * IP address of client for most recent login using credential
   * @return loggedInIp
  **/
  @ApiModelProperty(value = "IP address of client for most recent login using credential")
  public String getLoggedInIp() {
    return loggedInIp;
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

   /**
   * Link to get this user
   * @return userUrl
  **/
  @ApiModelProperty(value = "Link to get this user")
  public String getUserUrl() {
    return userUrl;
  }

  public CredentialsLookerOpenid can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public CredentialsLookerOpenid putCanItem(String key, Boolean canItem) {
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
    CredentialsLookerOpenid credentialsLookerOpenid = (CredentialsLookerOpenid) o;
    return Objects.equals(this.email, credentialsLookerOpenid.email) &&
        Objects.equals(this.createdAt, credentialsLookerOpenid.createdAt) &&
        Objects.equals(this.loggedInAt, credentialsLookerOpenid.loggedInAt) &&
        Objects.equals(this.loggedInIp, credentialsLookerOpenid.loggedInIp) &&
        Objects.equals(this.isDisabled, credentialsLookerOpenid.isDisabled) &&
        Objects.equals(this.type, credentialsLookerOpenid.type) &&
        Objects.equals(this.url, credentialsLookerOpenid.url) &&
        Objects.equals(this.userUrl, credentialsLookerOpenid.userUrl) &&
        Objects.equals(this.can, credentialsLookerOpenid.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, createdAt, loggedInAt, loggedInIp, isDisabled, type, url, userUrl, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsLookerOpenid {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    loggedInAt: ").append(toIndentedString(loggedInAt)).append("\n");
    sb.append("    loggedInIp: ").append(toIndentedString(loggedInIp)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
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
