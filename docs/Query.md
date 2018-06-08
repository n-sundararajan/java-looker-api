
# Query

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**model** | **String** | Model | 
**view** | **String** | View | 
**fields** | **List&lt;String&gt;** | Fields |  [optional]
**pivots** | **List&lt;String&gt;** | Pivots |  [optional]
**fillFields** | **List&lt;String&gt;** | Fill Fields |  [optional]
**filters** | **Map&lt;String, String&gt;** | Filters |  [optional]
**filterExpression** | **String** | Filter Expression |  [optional]
**sorts** | **List&lt;String&gt;** | Sorts |  [optional]
**limit** | **String** | Limit |  [optional]
**columnLimit** | **String** | Column Limit |  [optional]
**total** | **Boolean** | Total |  [optional]
**rowTotal** | **String** | Raw Total |  [optional]
**runtime** | **Double** | Runtime |  [optional]
**visConfig** | **Map&lt;String, String&gt;** | Visualization configuration properties. These properties are typically opaque and differ based on the type of visualization used. There is no specified set of allowed keys. The values can be any type supported by JSON. A \&quot;type\&quot; key with a string value is often present, and is used by Looker to determine which visualization to present. Visualizations ignore unknown vis_config properties. |  [optional]
**filterConfig** | **Map&lt;String, String&gt;** | The filter_config represents the state of the filter UI on the explore page for a given query. When running a query via the Looker UI, this parameter takes precedence over \&quot;filters\&quot;. When creating a query or modifying an existing query, \&quot;filter_config\&quot; should be set to null. Setting it to any other value could cause unexpected filtering behavior. The format should be considered opaque. |  [optional]
**visibleUiSections** | **String** | Visible UI Sections |  [optional]
**slug** | **String** | Slug |  [optional]
**dynamicFields** | **List&lt;String&gt;** | Dynamic Fields |  [optional]
**clientId** | **String** | Client Id: used to generate shortened explore URLs. If set by client, must be a unique 22 character alphanumeric string. Otherwise one will be generated. |  [optional]
**shareUrl** | **String** | Share Url |  [optional]
**expandedShareUrl** | **String** | Expanded Share Url |  [optional]
**url** | **String** | Expanded Url |  [optional]
**queryTimezone** | **String** | Query Timezone |  [optional]
**hasTableCalculations** | **Boolean** | Has Table Calculations |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



