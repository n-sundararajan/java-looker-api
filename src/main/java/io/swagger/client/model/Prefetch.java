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
import org.threeten.bp.OffsetDateTime;

/**
 * Prefetch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class Prefetch {
  @SerializedName("ttl")
  private Long ttl = null;

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

  @SerializedName("value")
  private Map<String, String> value = null;

  @SerializedName("url")
  private String url = null;

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

  public Prefetch value(Map<String, String> value) {
    this.value = value;
    return this;
  }

  public Prefetch putValueItem(String key, String valueItem) {
    if (this.value == null) {
      this.value = new HashMap<String, String>();
    }
    this.value.put(key, valueItem);
    return this;
  }

   /**
   * Data associated with the queries stored by prefetching the data
   * @return value
  **/
  @ApiModelProperty(value = "Data associated with the queries stored by prefetching the data")
  public Map<String, String> getValue() {
    return value;
  }

  public void setValue(Map<String, String> value) {
    this.value = value;
  }

   /**
   * Link to get this item
   * @return url
  **/
  @ApiModelProperty(value = "Link to get this item")
  public String getUrl() {
    return url;
  }

  public Prefetch can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public Prefetch putCanItem(String key, Boolean canItem) {
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
    Prefetch prefetch = (Prefetch) o;
    return Objects.equals(this.ttl, prefetch.ttl) &&
        Objects.equals(this.createdAt, prefetch.createdAt) &&
        Objects.equals(this.computationTime, prefetch.computationTime) &&
        Objects.equals(this.resultSizeBytes, prefetch.resultSizeBytes) &&
        Objects.equals(this.hitCount, prefetch.hitCount) &&
        Objects.equals(this.touchedAt, prefetch.touchedAt) &&
        Objects.equals(this.value, prefetch.value) &&
        Objects.equals(this.url, prefetch.url) &&
        Objects.equals(this.can, prefetch.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, createdAt, computationTime, resultSizeBytes, hitCount, touchedAt, value, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prefetch {\n");
    
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    computationTime: ").append(toIndentedString(computationTime)).append("\n");
    sb.append("    resultSizeBytes: ").append(toIndentedString(resultSizeBytes)).append("\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
    sb.append("    touchedAt: ").append(toIndentedString(touchedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

