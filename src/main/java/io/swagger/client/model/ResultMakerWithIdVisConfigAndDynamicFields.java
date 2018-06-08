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
 * ResultMakerWithIdVisConfigAndDynamicFields
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class ResultMakerWithIdVisConfigAndDynamicFields {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("dynamic_fields")
  private String dynamicFields = null;

  @SerializedName("sorts")
  private String sorts = null;

  @SerializedName("total")
  private Boolean total = null;

  @SerializedName("vis_config")
  private String visConfig = null;

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
   * JSON string of dynamic field information
   * @return dynamicFields
  **/
  @ApiModelProperty(value = "JSON string of dynamic field information")
  public String getDynamicFields() {
    return dynamicFields;
  }

   /**
   * Sorts of the constituent Look, Query, or Merge Query
   * @return sorts
  **/
  @ApiModelProperty(value = "Sorts of the constituent Look, Query, or Merge Query")
  public String getSorts() {
    return sorts;
  }

   /**
   * Total of the constituent Look, Query, or Merge Query
   * @return total
  **/
  @ApiModelProperty(value = "Total of the constituent Look, Query, or Merge Query")
  public Boolean isTotal() {
    return total;
  }

   /**
   * Vis config of the constituent Look, Query, or Merge Query
   * @return visConfig
  **/
  @ApiModelProperty(value = "Vis config of the constituent Look, Query, or Merge Query")
  public String getVisConfig() {
    return visConfig;
  }

  public ResultMakerWithIdVisConfigAndDynamicFields can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public ResultMakerWithIdVisConfigAndDynamicFields putCanItem(String key, Boolean canItem) {
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
    ResultMakerWithIdVisConfigAndDynamicFields resultMakerWithIdVisConfigAndDynamicFields = (ResultMakerWithIdVisConfigAndDynamicFields) o;
    return Objects.equals(this.id, resultMakerWithIdVisConfigAndDynamicFields.id) &&
        Objects.equals(this.dynamicFields, resultMakerWithIdVisConfigAndDynamicFields.dynamicFields) &&
        Objects.equals(this.sorts, resultMakerWithIdVisConfigAndDynamicFields.sorts) &&
        Objects.equals(this.total, resultMakerWithIdVisConfigAndDynamicFields.total) &&
        Objects.equals(this.visConfig, resultMakerWithIdVisConfigAndDynamicFields.visConfig) &&
        Objects.equals(this.can, resultMakerWithIdVisConfigAndDynamicFields.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dynamicFields, sorts, total, visConfig, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultMakerWithIdVisConfigAndDynamicFields {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dynamicFields: ").append(toIndentedString(dynamicFields)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    visConfig: ").append(toIndentedString(visConfig)).append("\n");
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

