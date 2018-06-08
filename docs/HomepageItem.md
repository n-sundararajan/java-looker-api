
# HomepageItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**homepageSectionId** | **String** | Associated Homepage Section |  [optional]
**order** | **Long** | An arbitrary integer representing the sort order within the section |  [optional]
**title** | **String** | The actual title for display |  [optional]
**customTitle** | **String** | Custom title entered by the user, if present |  [optional]
**useCustomTitle** | **Boolean** | Whether the custom title should be used instead of the content title, if the item is associated with content |  [optional]
**description** | **String** | The actual description for display |  [optional]
**customDescription** | **String** | Custom description entered by the user, if present |  [optional]
**useCustomDescription** | **Boolean** | Whether the custom description should be used instead of the content description, if the item is associated with content |  [optional]
**url** | **String** | The actual url for display |  [optional]
**customUrl** | **String** | Custom url entered by the user, if present |  [optional]
**useCustomUrl** | **Boolean** | Whether the custom url should be used instead of the content url, if the item is associated with content |  [optional]
**imageUrl** | **String** | The actual image_url for display |  [optional]
**customImageUrl** | **String** | Custom image_url entered by the user, if present |  [optional]
**customImageDataBase64** | **String** | (Write-Only) base64 encoded image data |  [optional]
**useCustomImage** | **Boolean** | Whether the custom image should be used instead of the content image, if the item is associated with content |  [optional]
**lookId** | **Long** | Look to base this item on |  [optional]
**dashboardId** | **Long** | Dashboard to base this item on |  [optional]
**lookmlDashboardId** | **String** | LookML Dashboard to base this item on |  [optional]
**viewCount** | **Long** | Number of times content has been viewed, if present |  [optional]
**favoriteCount** | **Long** | Number of times content has been favorited, if present |  [optional]
**contentCreatedBy** | **String** | Name of user who created the content this item is based on |  [optional]
**contentUpdatedAt** | **String** | Last time the content that this item is based on was updated |  [optional]
**contentFavoriteId** | **Long** | Content favorite id associated with the item this content is based on |  [optional]
**contentMetadataId** | **Long** | Content metadata id associated with the item this content is based on |  [optional]
**sectionFetchTime** | **Float** | Number of seconds it took to fetch the section this item is in |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



