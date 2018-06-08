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
 * CreateDashboardRenderTask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class CreateDashboardRenderTask {
  @SerializedName("dashboard_style")
  private String dashboardStyle = null;

  @SerializedName("dashboard_filters")
  private String dashboardFilters = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

  public CreateDashboardRenderTask dashboardStyle(String dashboardStyle) {
    this.dashboardStyle = dashboardStyle;
    return this;
  }

   /**
   * Dashboard layout style: single_column or tiled
   * @return dashboardStyle
  **/
  @ApiModelProperty(value = "Dashboard layout style: single_column or tiled")
  public String getDashboardStyle() {
    return dashboardStyle;
  }

  public void setDashboardStyle(String dashboardStyle) {
    this.dashboardStyle = dashboardStyle;
  }

  public CreateDashboardRenderTask dashboardFilters(String dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
    return this;
  }

   /**
   * Filter values to apply to the dashboard queries, in URL query format
   * @return dashboardFilters
  **/
  @ApiModelProperty(value = "Filter values to apply to the dashboard queries, in URL query format")
  public String getDashboardFilters() {
    return dashboardFilters;
  }

  public void setDashboardFilters(String dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
  }

  public CreateDashboardRenderTask can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public CreateDashboardRenderTask putCanItem(String key, Boolean canItem) {
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
    CreateDashboardRenderTask createDashboardRenderTask = (CreateDashboardRenderTask) o;
    return Objects.equals(this.dashboardStyle, createDashboardRenderTask.dashboardStyle) &&
        Objects.equals(this.dashboardFilters, createDashboardRenderTask.dashboardFilters) &&
        Objects.equals(this.can, createDashboardRenderTask.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardStyle, dashboardFilters, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDashboardRenderTask {\n");
    
    sb.append("    dashboardStyle: ").append(toIndentedString(dashboardStyle)).append("\n");
    sb.append("    dashboardFilters: ").append(toIndentedString(dashboardFilters)).append("\n");
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

