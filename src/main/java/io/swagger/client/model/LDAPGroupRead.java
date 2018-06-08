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
import io.swagger.client.model.Role;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LDAPGroupRead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class LDAPGroupRead {
  @SerializedName("name")
  private String name = null;

  @SerializedName("roles")
  private List<Role> roles = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * Name of group in LDAP
   * @return name
  **/
  @ApiModelProperty(value = "Name of group in LDAP")
  public String getName() {
    return name;
  }

  public LDAPGroupRead roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public LDAPGroupRead addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Role>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Looker Roles
   * @return roles
  **/
  @ApiModelProperty(value = "Looker Roles")
  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

   /**
   * Link to ldap config
   * @return url
  **/
  @ApiModelProperty(value = "Link to ldap config")
  public String getUrl() {
    return url;
  }

  public LDAPGroupRead can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public LDAPGroupRead putCanItem(String key, Boolean canItem) {
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
    LDAPGroupRead ldAPGroupRead = (LDAPGroupRead) o;
    return Objects.equals(this.name, ldAPGroupRead.name) &&
        Objects.equals(this.roles, ldAPGroupRead.roles) &&
        Objects.equals(this.url, ldAPGroupRead.url) &&
        Objects.equals(this.can, ldAPGroupRead.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roles, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPGroupRead {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

