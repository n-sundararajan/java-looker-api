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
import io.swagger.client.model.LDAPUser;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LDAPConfigTestResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class LDAPConfigTestResult {
  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("user")
  private LDAPUser user = null;

  @SerializedName("trace")
  private String trace = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * Test status code: always &#39;success&#39; or &#39;error&#39;
   * @return status
  **/
  @ApiModelProperty(value = "Test status code: always 'success' or 'error'")
  public String getStatus() {
    return status;
  }

   /**
   * Short human readable test about the result
   * @return message
  **/
  @ApiModelProperty(value = "Short human readable test about the result")
  public String getMessage() {
    return message;
  }

   /**
   * Additional details for error cases
   * @return details
  **/
  @ApiModelProperty(value = "Additional details for error cases")
  public String getDetails() {
    return details;
  }

  public LDAPConfigTestResult user(LDAPUser user) {
    this.user = user;
    return this;
  }

   /**
   * User details from LDAP server for auth tests
   * @return user
  **/
  @ApiModelProperty(value = "User details from LDAP server for auth tests")
  public LDAPUser getUser() {
    return user;
  }

  public void setUser(LDAPUser user) {
    this.user = user;
  }

   /**
   * A more detailed trace incremental results during auth tests
   * @return trace
  **/
  @ApiModelProperty(value = "A more detailed trace incremental results during auth tests")
  public String getTrace() {
    return trace;
  }

   /**
   * Link to ldap config
   * @return url
  **/
  @ApiModelProperty(value = "Link to ldap config")
  public String getUrl() {
    return url;
  }

  public LDAPConfigTestResult can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public LDAPConfigTestResult putCanItem(String key, Boolean canItem) {
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
    LDAPConfigTestResult ldAPConfigTestResult = (LDAPConfigTestResult) o;
    return Objects.equals(this.status, ldAPConfigTestResult.status) &&
        Objects.equals(this.message, ldAPConfigTestResult.message) &&
        Objects.equals(this.details, ldAPConfigTestResult.details) &&
        Objects.equals(this.user, ldAPConfigTestResult.user) &&
        Objects.equals(this.trace, ldAPConfigTestResult.trace) &&
        Objects.equals(this.url, ldAPConfigTestResult.url) &&
        Objects.equals(this.can, ldAPConfigTestResult.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, details, user, trace, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPConfigTestResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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

