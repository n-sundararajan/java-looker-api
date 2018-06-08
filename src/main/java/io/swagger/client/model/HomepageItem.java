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
 * HomepageItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class HomepageItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("homepage_section_id")
  private String homepageSectionId = null;

  @SerializedName("order")
  private Long order = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("custom_title")
  private String customTitle = null;

  @SerializedName("use_custom_title")
  private Boolean useCustomTitle = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("custom_description")
  private String customDescription = null;

  @SerializedName("use_custom_description")
  private Boolean useCustomDescription = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("custom_url")
  private String customUrl = null;

  @SerializedName("use_custom_url")
  private Boolean useCustomUrl = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("custom_image_url")
  private String customImageUrl = null;

  @SerializedName("custom_image_data_base64")
  private String customImageDataBase64 = null;

  @SerializedName("use_custom_image")
  private Boolean useCustomImage = null;

  @SerializedName("look_id")
  private Long lookId = null;

  @SerializedName("dashboard_id")
  private Long dashboardId = null;

  @SerializedName("lookml_dashboard_id")
  private String lookmlDashboardId = null;

  @SerializedName("view_count")
  private Long viewCount = null;

  @SerializedName("favorite_count")
  private Long favoriteCount = null;

  @SerializedName("content_created_by")
  private String contentCreatedBy = null;

  @SerializedName("content_updated_at")
  private String contentUpdatedAt = null;

  @SerializedName("content_favorite_id")
  private Long contentFavoriteId = null;

  @SerializedName("content_metadata_id")
  private Long contentMetadataId = null;

  @SerializedName("section_fetch_time")
  private Float sectionFetchTime = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

   /**
   * Unique Id
   * @return id
  **/
  @ApiModelProperty(value = "Unique Id")
  public String getId() {
    return id;
  }

  public HomepageItem homepageSectionId(String homepageSectionId) {
    this.homepageSectionId = homepageSectionId;
    return this;
  }

   /**
   * Associated Homepage Section
   * @return homepageSectionId
  **/
  @ApiModelProperty(value = "Associated Homepage Section")
  public String getHomepageSectionId() {
    return homepageSectionId;
  }

  public void setHomepageSectionId(String homepageSectionId) {
    this.homepageSectionId = homepageSectionId;
  }

  public HomepageItem order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * An arbitrary integer representing the sort order within the section
   * @return order
  **/
  @ApiModelProperty(value = "An arbitrary integer representing the sort order within the section")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

   /**
   * The actual title for display
   * @return title
  **/
  @ApiModelProperty(value = "The actual title for display")
  public String getTitle() {
    return title;
  }

  public HomepageItem customTitle(String customTitle) {
    this.customTitle = customTitle;
    return this;
  }

   /**
   * Custom title entered by the user, if present
   * @return customTitle
  **/
  @ApiModelProperty(value = "Custom title entered by the user, if present")
  public String getCustomTitle() {
    return customTitle;
  }

  public void setCustomTitle(String customTitle) {
    this.customTitle = customTitle;
  }

  public HomepageItem useCustomTitle(Boolean useCustomTitle) {
    this.useCustomTitle = useCustomTitle;
    return this;
  }

   /**
   * Whether the custom title should be used instead of the content title, if the item is associated with content
   * @return useCustomTitle
  **/
  @ApiModelProperty(value = "Whether the custom title should be used instead of the content title, if the item is associated with content")
  public Boolean isUseCustomTitle() {
    return useCustomTitle;
  }

  public void setUseCustomTitle(Boolean useCustomTitle) {
    this.useCustomTitle = useCustomTitle;
  }

   /**
   * The actual description for display
   * @return description
  **/
  @ApiModelProperty(value = "The actual description for display")
  public String getDescription() {
    return description;
  }

  public HomepageItem customDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

   /**
   * Custom description entered by the user, if present
   * @return customDescription
  **/
  @ApiModelProperty(value = "Custom description entered by the user, if present")
  public String getCustomDescription() {
    return customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }

  public HomepageItem useCustomDescription(Boolean useCustomDescription) {
    this.useCustomDescription = useCustomDescription;
    return this;
  }

   /**
   * Whether the custom description should be used instead of the content description, if the item is associated with content
   * @return useCustomDescription
  **/
  @ApiModelProperty(value = "Whether the custom description should be used instead of the content description, if the item is associated with content")
  public Boolean isUseCustomDescription() {
    return useCustomDescription;
  }

  public void setUseCustomDescription(Boolean useCustomDescription) {
    this.useCustomDescription = useCustomDescription;
  }

   /**
   * The actual url for display
   * @return url
  **/
  @ApiModelProperty(value = "The actual url for display")
  public String getUrl() {
    return url;
  }

  public HomepageItem customUrl(String customUrl) {
    this.customUrl = customUrl;
    return this;
  }

   /**
   * Custom url entered by the user, if present
   * @return customUrl
  **/
  @ApiModelProperty(value = "Custom url entered by the user, if present")
  public String getCustomUrl() {
    return customUrl;
  }

  public void setCustomUrl(String customUrl) {
    this.customUrl = customUrl;
  }

  public HomepageItem useCustomUrl(Boolean useCustomUrl) {
    this.useCustomUrl = useCustomUrl;
    return this;
  }

   /**
   * Whether the custom url should be used instead of the content url, if the item is associated with content
   * @return useCustomUrl
  **/
  @ApiModelProperty(value = "Whether the custom url should be used instead of the content url, if the item is associated with content")
  public Boolean isUseCustomUrl() {
    return useCustomUrl;
  }

  public void setUseCustomUrl(Boolean useCustomUrl) {
    this.useCustomUrl = useCustomUrl;
  }

   /**
   * The actual image_url for display
   * @return imageUrl
  **/
  @ApiModelProperty(value = "The actual image_url for display")
  public String getImageUrl() {
    return imageUrl;
  }

   /**
   * Custom image_url entered by the user, if present
   * @return customImageUrl
  **/
  @ApiModelProperty(value = "Custom image_url entered by the user, if present")
  public String getCustomImageUrl() {
    return customImageUrl;
  }

  public HomepageItem customImageDataBase64(String customImageDataBase64) {
    this.customImageDataBase64 = customImageDataBase64;
    return this;
  }

   /**
   * (Write-Only) base64 encoded image data
   * @return customImageDataBase64
  **/
  @ApiModelProperty(value = "(Write-Only) base64 encoded image data")
  public String getCustomImageDataBase64() {
    return customImageDataBase64;
  }

  public void setCustomImageDataBase64(String customImageDataBase64) {
    this.customImageDataBase64 = customImageDataBase64;
  }

  public HomepageItem useCustomImage(Boolean useCustomImage) {
    this.useCustomImage = useCustomImage;
    return this;
  }

   /**
   * Whether the custom image should be used instead of the content image, if the item is associated with content
   * @return useCustomImage
  **/
  @ApiModelProperty(value = "Whether the custom image should be used instead of the content image, if the item is associated with content")
  public Boolean isUseCustomImage() {
    return useCustomImage;
  }

  public void setUseCustomImage(Boolean useCustomImage) {
    this.useCustomImage = useCustomImage;
  }

  public HomepageItem lookId(Long lookId) {
    this.lookId = lookId;
    return this;
  }

   /**
   * Look to base this item on
   * @return lookId
  **/
  @ApiModelProperty(value = "Look to base this item on")
  public Long getLookId() {
    return lookId;
  }

  public void setLookId(Long lookId) {
    this.lookId = lookId;
  }

  public HomepageItem dashboardId(Long dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * Dashboard to base this item on
   * @return dashboardId
  **/
  @ApiModelProperty(value = "Dashboard to base this item on")
  public Long getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(Long dashboardId) {
    this.dashboardId = dashboardId;
  }

  public HomepageItem lookmlDashboardId(String lookmlDashboardId) {
    this.lookmlDashboardId = lookmlDashboardId;
    return this;
  }

   /**
   * LookML Dashboard to base this item on
   * @return lookmlDashboardId
  **/
  @ApiModelProperty(value = "LookML Dashboard to base this item on")
  public String getLookmlDashboardId() {
    return lookmlDashboardId;
  }

  public void setLookmlDashboardId(String lookmlDashboardId) {
    this.lookmlDashboardId = lookmlDashboardId;
  }

   /**
   * Number of times content has been viewed, if present
   * @return viewCount
  **/
  @ApiModelProperty(value = "Number of times content has been viewed, if present")
  public Long getViewCount() {
    return viewCount;
  }

   /**
   * Number of times content has been favorited, if present
   * @return favoriteCount
  **/
  @ApiModelProperty(value = "Number of times content has been favorited, if present")
  public Long getFavoriteCount() {
    return favoriteCount;
  }

   /**
   * Name of user who created the content this item is based on
   * @return contentCreatedBy
  **/
  @ApiModelProperty(value = "Name of user who created the content this item is based on")
  public String getContentCreatedBy() {
    return contentCreatedBy;
  }

   /**
   * Last time the content that this item is based on was updated
   * @return contentUpdatedAt
  **/
  @ApiModelProperty(value = "Last time the content that this item is based on was updated")
  public String getContentUpdatedAt() {
    return contentUpdatedAt;
  }

   /**
   * Content favorite id associated with the item this content is based on
   * @return contentFavoriteId
  **/
  @ApiModelProperty(value = "Content favorite id associated with the item this content is based on")
  public Long getContentFavoriteId() {
    return contentFavoriteId;
  }

   /**
   * Content metadata id associated with the item this content is based on
   * @return contentMetadataId
  **/
  @ApiModelProperty(value = "Content metadata id associated with the item this content is based on")
  public Long getContentMetadataId() {
    return contentMetadataId;
  }

   /**
   * Number of seconds it took to fetch the section this item is in
   * @return sectionFetchTime
  **/
  @ApiModelProperty(value = "Number of seconds it took to fetch the section this item is in")
  public Float getSectionFetchTime() {
    return sectionFetchTime;
  }

  public HomepageItem can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public HomepageItem putCanItem(String key, Boolean canItem) {
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
    HomepageItem homepageItem = (HomepageItem) o;
    return Objects.equals(this.id, homepageItem.id) &&
        Objects.equals(this.homepageSectionId, homepageItem.homepageSectionId) &&
        Objects.equals(this.order, homepageItem.order) &&
        Objects.equals(this.title, homepageItem.title) &&
        Objects.equals(this.customTitle, homepageItem.customTitle) &&
        Objects.equals(this.useCustomTitle, homepageItem.useCustomTitle) &&
        Objects.equals(this.description, homepageItem.description) &&
        Objects.equals(this.customDescription, homepageItem.customDescription) &&
        Objects.equals(this.useCustomDescription, homepageItem.useCustomDescription) &&
        Objects.equals(this.url, homepageItem.url) &&
        Objects.equals(this.customUrl, homepageItem.customUrl) &&
        Objects.equals(this.useCustomUrl, homepageItem.useCustomUrl) &&
        Objects.equals(this.imageUrl, homepageItem.imageUrl) &&
        Objects.equals(this.customImageUrl, homepageItem.customImageUrl) &&
        Objects.equals(this.customImageDataBase64, homepageItem.customImageDataBase64) &&
        Objects.equals(this.useCustomImage, homepageItem.useCustomImage) &&
        Objects.equals(this.lookId, homepageItem.lookId) &&
        Objects.equals(this.dashboardId, homepageItem.dashboardId) &&
        Objects.equals(this.lookmlDashboardId, homepageItem.lookmlDashboardId) &&
        Objects.equals(this.viewCount, homepageItem.viewCount) &&
        Objects.equals(this.favoriteCount, homepageItem.favoriteCount) &&
        Objects.equals(this.contentCreatedBy, homepageItem.contentCreatedBy) &&
        Objects.equals(this.contentUpdatedAt, homepageItem.contentUpdatedAt) &&
        Objects.equals(this.contentFavoriteId, homepageItem.contentFavoriteId) &&
        Objects.equals(this.contentMetadataId, homepageItem.contentMetadataId) &&
        Objects.equals(this.sectionFetchTime, homepageItem.sectionFetchTime) &&
        Objects.equals(this.can, homepageItem.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, homepageSectionId, order, title, customTitle, useCustomTitle, description, customDescription, useCustomDescription, url, customUrl, useCustomUrl, imageUrl, customImageUrl, customImageDataBase64, useCustomImage, lookId, dashboardId, lookmlDashboardId, viewCount, favoriteCount, contentCreatedBy, contentUpdatedAt, contentFavoriteId, contentMetadataId, sectionFetchTime, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomepageItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    homepageSectionId: ").append(toIndentedString(homepageSectionId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    customTitle: ").append(toIndentedString(customTitle)).append("\n");
    sb.append("    useCustomTitle: ").append(toIndentedString(useCustomTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customDescription: ").append(toIndentedString(customDescription)).append("\n");
    sb.append("    useCustomDescription: ").append(toIndentedString(useCustomDescription)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
    sb.append("    useCustomUrl: ").append(toIndentedString(useCustomUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    customImageUrl: ").append(toIndentedString(customImageUrl)).append("\n");
    sb.append("    customImageDataBase64: ").append(toIndentedString(customImageDataBase64)).append("\n");
    sb.append("    useCustomImage: ").append(toIndentedString(useCustomImage)).append("\n");
    sb.append("    lookId: ").append(toIndentedString(lookId)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    lookmlDashboardId: ").append(toIndentedString(lookmlDashboardId)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    contentCreatedBy: ").append(toIndentedString(contentCreatedBy)).append("\n");
    sb.append("    contentUpdatedAt: ").append(toIndentedString(contentUpdatedAt)).append("\n");
    sb.append("    contentFavoriteId: ").append(toIndentedString(contentFavoriteId)).append("\n");
    sb.append("    contentMetadataId: ").append(toIndentedString(contentMetadataId)).append("\n");
    sb.append("    sectionFetchTime: ").append(toIndentedString(sectionFetchTime)).append("\n");
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

