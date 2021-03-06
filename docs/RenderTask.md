
# RenderTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of this render task |  [optional]
**createdAt** | **String** | Date/Time render task was created |  [optional]
**finalizedAt** | **String** | Date/Time render task was completed |  [optional]
**status** | **String** | Render task status: enqueued_for_query, querying, enqueued_for_render, rendering, success, failure |  [optional]
**statusDetail** | **String** | Additional information about the current status |  [optional]
**userId** | **Long** | The user account permissions in which the render task will execute |  [optional]
**runtime** | **Double** | Total seconds elapsed for render task |  [optional]
**queryRuntime** | **Double** | Number of seconds elapsed running queries |  [optional]
**renderRuntime** | **Double** | Number of seconds elapsed rendering data |  [optional]
**resultFormat** | **String** | Output format: pdf, png, or jpg |  [optional]
**lookId** | **Long** | Id of look to render |  [optional]
**dashboardId** | **Long** | Id of dashboard to render |  [optional]
**lookmlDashboardId** | **String** | Id of lookml dashboard to render |  [optional]
**queryId** | **Long** | Id of query to render |  [optional]
**width** | **Long** | Output width in pixels |  [optional]
**height** | **Long** | Output height in pixels. Flowed layouts may ignore this value. |  [optional]
**dashboardStyle** | **String** | Dashboard layout style: single_column or tiled |  [optional]
**dashboardFilters** | **String** | Filter values to apply to the dashboard queries, in URL query format |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



