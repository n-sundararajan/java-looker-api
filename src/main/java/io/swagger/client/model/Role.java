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
import io.swagger.client.model.ModelSet;
import io.swagger.client.model.PermissionSet;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Role
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class Role {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("permission_set")
  private PermissionSet permissionSet = null;

  @SerializedName("permission_set_id")
  private Long permissionSetId = null;

  @SerializedName("model_set")
  private ModelSet modelSet = null;

  @SerializedName("model_set_id")
  private Long modelSetId = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("users_url")
  private String usersUrl = null;

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

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Role
   * @return name
  **/
  @ApiModelProperty(value = "Name of Role")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role permissionSet(PermissionSet permissionSet) {
    this.permissionSet = permissionSet;
    return this;
  }

   /**
   * (Read only) Permission set
   * @return permissionSet
  **/
  @ApiModelProperty(value = "(Read only) Permission set")
  public PermissionSet getPermissionSet() {
    return permissionSet;
  }

  public void setPermissionSet(PermissionSet permissionSet) {
    this.permissionSet = permissionSet;
  }

  public Role permissionSetId(Long permissionSetId) {
    this.permissionSetId = permissionSetId;
    return this;
  }

   /**
   * (Write-Only) Id of permission set
   * @return permissionSetId
  **/
  @ApiModelProperty(value = "(Write-Only) Id of permission set")
  public Long getPermissionSetId() {
    return permissionSetId;
  }

  public void setPermissionSetId(Long permissionSetId) {
    this.permissionSetId = permissionSetId;
  }

  public Role modelSet(ModelSet modelSet) {
    this.modelSet = modelSet;
    return this;
  }

   /**
   * (Read only) Model set
   * @return modelSet
  **/
  @ApiModelProperty(value = "(Read only) Model set")
  public ModelSet getModelSet() {
    return modelSet;
  }

  public void setModelSet(ModelSet modelSet) {
    this.modelSet = modelSet;
  }

  public Role modelSetId(Long modelSetId) {
    this.modelSetId = modelSetId;
    return this;
  }

   /**
   * (Write-Only) Id of model set
   * @return modelSetId
  **/
  @ApiModelProperty(value = "(Write-Only) Id of model set")
  public Long getModelSetId() {
    return modelSetId;
  }

  public void setModelSetId(Long modelSetId) {
    this.modelSetId = modelSetId;
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
   * Link to get list of users with this role
   * @return usersUrl
  **/
  @ApiModelProperty(value = "Link to get list of users with this role")
  public String getUsersUrl() {
    return usersUrl;
  }

  public Role can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public Role putCanItem(String key, Boolean canItem) {
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
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.permissionSet, role.permissionSet) &&
        Objects.equals(this.permissionSetId, role.permissionSetId) &&
        Objects.equals(this.modelSet, role.modelSet) &&
        Objects.equals(this.modelSetId, role.modelSetId) &&
        Objects.equals(this.url, role.url) &&
        Objects.equals(this.usersUrl, role.usersUrl) &&
        Objects.equals(this.can, role.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissionSet, permissionSetId, modelSet, modelSetId, url, usersUrl, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissionSet: ").append(toIndentedString(permissionSet)).append("\n");
    sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
    sb.append("    modelSet: ").append(toIndentedString(modelSet)).append("\n");
    sb.append("    modelSetId: ").append(toIndentedString(modelSetId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
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
