
# Dashboard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**contentMetadataId** | **Long** | Id of content metadata |  [optional]
**contentFavoriteId** | **Long** | Content Favorite Id |  [optional]
**viewCount** | **Long** | Number of times viewed in the Looker web UI |  [optional]
**lastAccessedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time the dashboard was last accessed |  [optional]
**favoriteCount** | **Long** | Number of times favorited |  [optional]
**userId** | **Long** | Id of User |  [optional]
**title** | **String** | Look Title |  [optional]
**description** | **String** | Description |  [optional]
**readonly** | **Boolean** | Is Read-only |  [optional]
**hidden** | **Boolean** | Is Hidden |  [optional]
**refreshInterval** | **String** | Refresh Interval |  [optional]
**refreshIntervalToI** | **Long** | Refresh Interval as Integer |  [optional]
**space** | [**SpaceBase**](SpaceBase.md) | Space |  [optional]
**loadConfiguration** | **String** | configuration option that governs how dashboard loading will happen. |  [optional]
**model** | [**LookModel**](LookModel.md) | Model |  [optional]
**spaceId** | **String** | Id of Space |  [optional]
**dashboardElements** | [**List&lt;DashboardElement&gt;**](DashboardElement.md) | Elements |  [optional]
**dashboardLayouts** | [**List&lt;DashboardLayout&gt;**](DashboardLayout.md) | Layouts |  [optional]
**dashboardFilters** | [**List&lt;DashboardFilter&gt;**](DashboardFilter.md) | Filters |  [optional]
**lastViewedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time last viewed in the Looker web UI |  [optional]
**backgroundColor** | **String** | Background color |  [optional]
**showTitle** | **Boolean** | Show title |  [optional]
**titleColor** | **String** | Title color |  [optional]
**showFiltersBar** | **Boolean** | Show filters bar |  [optional]
**tileBackgroundColor** | **String** | Tile background color |  [optional]
**tileTextColor** | **String** | Tile text color |  [optional]
**textTileTextColor** | **String** | Color of text on text tiles |  [optional]
**lastUpdaterId** | **Long** | Id of User that last updated the dashboard. |  [optional]
**deleterId** | **Long** | Id of User that deleted the dashboard. |  [optional]
**deleted** | **Boolean** | Whether or not a dashboard is deleted. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Dashboard was created. |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time that the Dashboard was deleted. |  [optional]
**queryTimezone** | **String** | Timezone in which the Dashboard will run by default. |  [optional]
**editUri** | **String** | Relative path of URI of LookML file to edit the dashboard (LookML dashboard only). |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



