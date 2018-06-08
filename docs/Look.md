
# Look

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**contentMetadataId** | **Long** | Id of content metadata |  [optional]
**viewCount** | **Long** | Number of times viewed in the Looker web UI |  [optional]
**favoriteCount** | **Long** | Number of times favorited |  [optional]
**lastAccessedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Look was last accessed by any user |  [optional]
**contentFavoriteId** | **Long** | Content Favorite Id |  [optional]
**title** | **String** | Look Title |  [optional]
**user** | [**UserIdOnly**](UserIdOnly.md) | User |  [optional]
**queryId** | **Long** | Query Id |  [optional]
**description** | **String** | Description |  [optional]
**shortUrl** | **String** | Short Url |  [optional]
**space** | [**SpaceBase**](SpaceBase.md) | Space of this Look |  [optional]
**_public** | **Boolean** | Is Public |  [optional]
**publicSlug** | **String** | Public Slug |  [optional]
**userId** | **Long** | User Id |  [optional]
**spaceId** | **String** | Space Id |  [optional]
**model** | [**LookModel**](LookModel.md) | Model |  [optional]
**publicUrl** | **String** | Public Url |  [optional]
**embedUrl** | **String** | Embed Url |  [optional]
**imageEmbedUrl** | **String** | Image Embed Url |  [optional]
**googleSpreadsheetFormula** | **String** | Google Spreadsheet Formula |  [optional]
**excelFileUrl** | **String** | Excel File Url |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Look was created. |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Look was deleted. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Look was updated. |  [optional]
**lastUpdaterId** | **Long** | Id of User that last updated the look. |  [optional]
**deleterId** | **Long** | Id of User that deleted the look. |  [optional]
**deleted** | **Boolean** | Whether or not a look is deleted. |  [optional]
**lastViewedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time last viewed in the Looker web UI |  [optional]
**isRunOnLoad** | **Boolean** | auto-run query when Look viewed |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



