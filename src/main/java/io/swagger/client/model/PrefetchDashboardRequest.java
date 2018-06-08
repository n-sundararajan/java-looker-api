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
import io.swagger.client.model.PrefetchAccessFilterValue;
import io.swagger.client.model.PrefetchDashboardFilterValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * PrefetchDashboardRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class PrefetchDashboardRequest {
  @SerializedName("ttl")
  private Long ttl = null;

  @SerializedName("access_filters")
  private List<PrefetchAccessFilterValue> accessFilters = null;

  @SerializedName("dashboard_filters")
  private List<PrefetchDashboardFilterValue> dashboardFilters = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("computation_time")
  private Float computationTime = null;

  @SerializedName("result_size_bytes")
  private Long resultSizeBytes = null;

  @SerializedName("hit_count")
  private Long hitCount = null;

  @SerializedName("touched_at")
  private OffsetDateTime touchedAt = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * Number of seconds prefetch will live for.
   * @return ttl
  **/
  @ApiModelProperty(value = "Number of seconds prefetch will live for.")
  public Long getTtl() {
    return ttl;
  }

  public PrefetchDashboardRequest accessFilters(List<PrefetchAccessFilterValue> accessFilters) {
    this.accessFilters = accessFilters;
    return this;
  }

  public PrefetchDashboardRequest addAccessFiltersItem(PrefetchAccessFilterValue accessFiltersItem) {
    if (this.accessFilters == null) {
      this.accessFilters = new ArrayList<PrefetchAccessFilterValue>();
    }
    this.accessFilters.add(accessFiltersItem);
    return this;
  }

   /**
   * Access filters to apply when running queries for prefetch.
   * @return accessFilters
  **/
  @ApiModelProperty(value = "Access filters to apply when running queries for prefetch.")
  public List<PrefetchAccessFilterValue> getAccessFilters() {
    return accessFilters;
  }

  public void setAccessFilters(List<PrefetchAccessFilterValue> accessFilters) {
    this.accessFilters = accessFilters;
  }

  public PrefetchDashboardRequest dashboardFilters(List<PrefetchDashboardFilterValue> dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
    return this;
  }

  public PrefetchDashboardRequest addDashboardFiltersItem(PrefetchDashboardFilterValue dashboardFiltersItem) {
    if (this.dashboardFilters == null) {
      this.dashboardFilters = new ArrayList<PrefetchDashboardFilterValue>();
    }
    this.dashboardFilters.add(dashboardFiltersItem);
    return this;
  }

   /**
   * Dashboard filters to apply when running queries for prefetch.
   * @return dashboardFilters
  **/
  @ApiModelProperty(value = "Dashboard filters to apply when running queries for prefetch.")
  public List<PrefetchDashboardFilterValue> getDashboardFilters() {
    return dashboardFilters;
  }

  public void setDashboardFilters(List<PrefetchDashboardFilterValue> dashboardFilters) {
    this.dashboardFilters = dashboardFilters;
  }

   /**
   * Time when prefetch was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Time when prefetch was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Number of seconds it took to compute results for prefetch.
   * @return computationTime
  **/
  @ApiModelProperty(value = "Number of seconds it took to compute results for prefetch.")
  public Float getComputationTime() {
    return computationTime;
  }

   /**
   * Size of result.
   * @return resultSizeBytes
  **/
  @ApiModelProperty(value = "Size of result.")
  public Long getResultSizeBytes() {
    return resultSizeBytes;
  }

   /**
   * Number of times prefetch has been accessed.
   * @return hitCount
  **/
  @ApiModelProperty(value = "Number of times prefetch has been accessed.")
  public Long getHitCount() {
    return hitCount;
  }

   /**
   * Time when prefetch was last accessed.
   * @return touchedAt
  **/
  @ApiModelProperty(value = "Time when prefetch was last accessed.")
  public OffsetDateTime getTouchedAt() {
    return touchedAt;
  }

  public PrefetchDashboardRequest can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public PrefetchDashboardRequest putCanItem(String key, Boolean canItem) {
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
    PrefetchDashboardRequest prefetchDashboardRequest = (PrefetchDashboardRequest) o;
    return Objects.equals(this.ttl, prefetchDashboardRequest.ttl) &&
        Objects.equals(this.accessFilters, prefetchDashboardRequest.accessFilters) &&
        Objects.equals(this.dashboardFilters, prefetchDashboardRequest.dashboardFilters) &&
        Objects.equals(this.createdAt, prefetchDashboardRequest.createdAt) &&
        Objects.equals(this.computationTime, prefetchDashboardRequest.computationTime) &&
        Objects.equals(this.resultSizeBytes, prefetchDashboardRequest.resultSizeBytes) &&
        Objects.equals(this.hitCount, prefetchDashboardRequest.hitCount) &&
        Objects.equals(this.touchedAt, prefetchDashboardRequest.touchedAt) &&
        Objects.equals(this.can, prefetchDashboardRequest.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, accessFilters, dashboardFilters, createdAt, computationTime, resultSizeBytes, hitCount, touchedAt, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefetchDashboardRequest {\n");
    
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    accessFilters: ").append(toIndentedString(accessFilters)).append("\n");
    sb.append("    dashboardFilters: ").append(toIndentedString(dashboardFilters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    computationTime: ").append(toIndentedString(computationTime)).append("\n");
    sb.append("    resultSizeBytes: ").append(toIndentedString(resultSizeBytes)).append("\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
    sb.append("    touchedAt: ").append(toIndentedString(touchedAt)).append("\n");
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

