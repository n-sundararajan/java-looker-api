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
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationRequiredField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class IntegrationRequiredField {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("any_tag")
  private List<String> anyTag = null;

  @SerializedName("all_tags")
  private List<String> allTags = null;

   /**
   * Matches a field that has this tag.
   * @return tag
  **/
  @ApiModelProperty(value = "Matches a field that has this tag.")
  public String getTag() {
    return tag;
  }

  public IntegrationRequiredField anyTag(List<String> anyTag) {
    this.anyTag = anyTag;
    return this;
  }

  public IntegrationRequiredField addAnyTagItem(String anyTagItem) {
    if (this.anyTag == null) {
      this.anyTag = new ArrayList<String>();
    }
    this.anyTag.add(anyTagItem);
    return this;
  }

   /**
   * If present, supercedes &#39;tag&#39; and matches a field that has any of the provided tags.
   * @return anyTag
  **/
  @ApiModelProperty(value = "If present, supercedes 'tag' and matches a field that has any of the provided tags.")
  public List<String> getAnyTag() {
    return anyTag;
  }

  public void setAnyTag(List<String> anyTag) {
    this.anyTag = anyTag;
  }

  public IntegrationRequiredField allTags(List<String> allTags) {
    this.allTags = allTags;
    return this;
  }

  public IntegrationRequiredField addAllTagsItem(String allTagsItem) {
    if (this.allTags == null) {
      this.allTags = new ArrayList<String>();
    }
    this.allTags.add(allTagsItem);
    return this;
  }

   /**
   * If present, supercedes &#39;tag&#39; and matches a field that has all of the provided tags.
   * @return allTags
  **/
  @ApiModelProperty(value = "If present, supercedes 'tag' and matches a field that has all of the provided tags.")
  public List<String> getAllTags() {
    return allTags;
  }

  public void setAllTags(List<String> allTags) {
    this.allTags = allTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationRequiredField integrationRequiredField = (IntegrationRequiredField) o;
    return Objects.equals(this.tag, integrationRequiredField.tag) &&
        Objects.equals(this.anyTag, integrationRequiredField.anyTag) &&
        Objects.equals(this.allTags, integrationRequiredField.allTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, anyTag, allTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRequiredField {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    anyTag: ").append(toIndentedString(anyTag)).append("\n");
    sb.append("    allTags: ").append(toIndentedString(allTags)).append("\n");
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

