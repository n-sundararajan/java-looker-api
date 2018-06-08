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
 * Session
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class Session {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("browser")
  private String browser = null;

  @SerializedName("operating_system")
  private String operatingSystem = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("credentials_type")
  private String credentialsType = null;

  @SerializedName("extended_at")
  private String extendedAt = null;

  @SerializedName("extended_count")
  private Long extendedCount = null;

  @SerializedName("sudo_user_id")
  private Long sudoUserId = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("expires_at")
  private String expiresAt = null;

  @SerializedName("url")
  private String url = null;

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

   /**
   * IP address of user when this session was initiated
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of user when this session was initiated")
  public String getIpAddress() {
    return ipAddress;
  }

   /**
   * User&#39;s browser type
   * @return browser
  **/
  @ApiModelProperty(value = "User's browser type")
  public String getBrowser() {
    return browser;
  }

   /**
   * User&#39;s Operating System
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "User's Operating System")
  public String getOperatingSystem() {
    return operatingSystem;
  }

   /**
   * City component of user location (derived from IP address)
   * @return city
  **/
  @ApiModelProperty(value = "City component of user location (derived from IP address)")
  public String getCity() {
    return city;
  }

   /**
   * State component of user location (derived from IP address)
   * @return state
  **/
  @ApiModelProperty(value = "State component of user location (derived from IP address)")
  public String getState() {
    return state;
  }

   /**
   * Country component of user location (derived from IP address)
   * @return country
  **/
  @ApiModelProperty(value = "Country component of user location (derived from IP address)")
  public String getCountry() {
    return country;
  }

   /**
   * Type of credentials used for logging in this session
   * @return credentialsType
  **/
  @ApiModelProperty(value = "Type of credentials used for logging in this session")
  public String getCredentialsType() {
    return credentialsType;
  }

   /**
   * Time when this session was last extended by the user
   * @return extendedAt
  **/
  @ApiModelProperty(value = "Time when this session was last extended by the user")
  public String getExtendedAt() {
    return extendedAt;
  }

   /**
   * Number of times this session was extended
   * @return extendedCount
  **/
  @ApiModelProperty(value = "Number of times this session was extended")
  public Long getExtendedCount() {
    return extendedCount;
  }

   /**
   * Actual user in the case when this session represents one user sudo&#39;ing as another
   * @return sudoUserId
  **/
  @ApiModelProperty(value = "Actual user in the case when this session represents one user sudo'ing as another")
  public Long getSudoUserId() {
    return sudoUserId;
  }

   /**
   * Time when this session was initiated
   * @return createdAt
  **/
  @ApiModelProperty(value = "Time when this session was initiated")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * Time when this session will expire
   * @return expiresAt
  **/
  @ApiModelProperty(value = "Time when this session will expire")
  public String getExpiresAt() {
    return expiresAt;
  }

   /**
   * Link to get this item
   * @return url
  **/
  @ApiModelProperty(value = "Link to get this item")
  public String getUrl() {
    return url;
  }

  public Session can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public Session putCanItem(String key, Boolean canItem) {
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
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.ipAddress, session.ipAddress) &&
        Objects.equals(this.browser, session.browser) &&
        Objects.equals(this.operatingSystem, session.operatingSystem) &&
        Objects.equals(this.city, session.city) &&
        Objects.equals(this.state, session.state) &&
        Objects.equals(this.country, session.country) &&
        Objects.equals(this.credentialsType, session.credentialsType) &&
        Objects.equals(this.extendedAt, session.extendedAt) &&
        Objects.equals(this.extendedCount, session.extendedCount) &&
        Objects.equals(this.sudoUserId, session.sudoUserId) &&
        Objects.equals(this.createdAt, session.createdAt) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.url, session.url) &&
        Objects.equals(this.can, session.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ipAddress, browser, operatingSystem, city, state, country, credentialsType, extendedAt, extendedCount, sudoUserId, createdAt, expiresAt, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    credentialsType: ").append(toIndentedString(credentialsType)).append("\n");
    sb.append("    extendedAt: ").append(toIndentedString(extendedAt)).append("\n");
    sb.append("    extendedCount: ").append(toIndentedString(extendedCount)).append("\n");
    sb.append("    sudoUserId: ").append(toIndentedString(sudoUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

