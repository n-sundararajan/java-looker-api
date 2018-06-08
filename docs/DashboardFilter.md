
# DashboardFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**dashboardId** | **String** | Id of Dashboard |  [optional]
**name** | **String** | Name of filter |  [optional]
**title** | **String** | Title of filter |  [optional]
**type** | **String** | Type of filter: one of date, number, string, or field |  [optional]
**defaultValue** | **String** | Default value of filter |  [optional]
**model** | **String** | Model of filter (required if type &#x3D; field) |  [optional]
**explore** | **String** | Explore of filter (required if type &#x3D; field) |  [optional]
**dimension** | **String** | Dimension of filter (required if type &#x3D; field) |  [optional]
**field** | **Map&lt;String, String&gt;** | Field information |  [optional]
**row** | **Long** | Position of filter when displaying |  [optional]
**listensToFilters** | **List&lt;String&gt;** | Array of listeners for faceted filters |  [optional]
**allowMultipleValues** | **Boolean** | Whether the filter allows multiple filter values |  [optional]
**required** | **Boolean** | Whether the filter requires a value to run the dashboard |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



