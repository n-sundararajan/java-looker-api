# DashboardApi

All URIs are relative to *https://xxxxxxx.sys.xxxxxx.xxxx:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allDashboards**](DashboardApi.md#allDashboards) | **GET** /dashboards | Get All Dashboards
[**createDashboard**](DashboardApi.md#createDashboard) | **POST** /dashboards | Create Dashboard
[**createDashboardPrefetch**](DashboardApi.md#createDashboardPrefetch) | **POST** /dashboards/{dashboard_id}/prefetch | Create Dashboard Prefetch
[**dashboard**](DashboardApi.md#dashboard) | **GET** /dashboards/{dashboard_id} | Get Dashboard
[**dashboardPrefetch**](DashboardApi.md#dashboardPrefetch) | **GET** /dashboards/{dashboard_id}/prefetch | Get Dashboard Prefetch
[**deleteDashboard**](DashboardApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_id} | Delete Dashboard
[**searchDashboards**](DashboardApi.md#searchDashboards) | **GET** /dashboards/search | Search Dashboards
[**updateDashboard**](DashboardApi.md#updateDashboard) | **PATCH** /dashboards/{dashboard_id} | Update Dashboard


<a name="allDashboards"></a>
# **allDashboards**
> List&lt;DashboardBase&gt; allDashboards(fields)

Get All Dashboards

Get information about all dashboards.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<DashboardBase> result = apiInstance.allDashboards(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#allDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;DashboardBase&gt;**](DashboardBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDashboard"></a>
# **createDashboard**
> Dashboard createDashboard(body)

Create Dashboard

### Create a dashboard with specified information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
Dashboard body = new Dashboard(); // Dashboard | Dashboard
try {
    Dashboard result = apiInstance.createDashboard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dashboard**](Dashboard.md)| Dashboard | [optional]

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDashboardPrefetch"></a>
# **createDashboardPrefetch**
> PrefetchDashboardRequest createDashboardPrefetch(dashboardId, body)

Create Dashboard Prefetch

### Create a prefetch for a dashboard with the specified information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
PrefetchDashboardRequest body = new PrefetchDashboardRequest(); // PrefetchDashboardRequest | Parameters for prefetch request
try {
    PrefetchDashboardRequest result = apiInstance.createDashboardPrefetch(dashboardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createDashboardPrefetch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of dashboard |
 **body** | [**PrefetchDashboardRequest**](PrefetchDashboardRequest.md)| Parameters for prefetch request | [optional]

### Return type

[**PrefetchDashboardRequest**](PrefetchDashboardRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboard"></a>
# **dashboard**
> Dashboard dashboard(dashboardId, fields)

Get Dashboard

### Get information about the dashboard with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
String fields = "fields_example"; // String | Requested fields.
try {
    Dashboard result = apiInstance.dashboard(dashboardId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#dashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of dashboard |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardPrefetch"></a>
# **dashboardPrefetch**
> Prefetch dashboardPrefetch(dashboardId, dashboardFilters)

Get Dashboard Prefetch

### Get a prefetch for a dashboard with the specified information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
List<PrefetchDashboardFilterValue> dashboardFilters = Arrays.asList(new PrefetchDashboardFilterValue()); // List<PrefetchDashboardFilterValue> | JSON encoded string of Dashboard filters that were applied to prefetch
try {
    Prefetch result = apiInstance.dashboardPrefetch(dashboardId, dashboardFilters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#dashboardPrefetch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of dashboard |
 **dashboardFilters** | [**List&lt;PrefetchDashboardFilterValue&gt;**](PrefetchDashboardFilterValue.md)| JSON encoded string of Dashboard filters that were applied to prefetch | [optional]

### Return type

[**Prefetch**](Prefetch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDashboard"></a>
# **deleteDashboard**
> String deleteDashboard(dashboardId)

Delete Dashboard

### Delete the dashboard with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
try {
    String result = apiInstance.deleteDashboard(dashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#deleteDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of dashboard |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchDashboards"></a>
# **searchDashboards**
> List&lt;Dashboard&gt; searchDashboards(fields, id, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount)

Search Dashboards

Get information about all dashboards.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String fields = "fields_example"; // String | Requested fields.
Long id = 789L; // Long | Match dashboard id.
Long page = 789L; // Long | Requested page.
Long perPage = 789L; // Long | Results per page.
Long limit = 789L; // Long | Number of results to return. (used with offset and takes priority over page and per_page)
Long offset = 789L; // Long | Number of results to skip before returning any. (used with limit and takes priority over page and per_page)
String sorts = "sorts_example"; // String | Fields to sort by.
String title = "title_example"; // String | Match Dashboard title.
String description = "description_example"; // String | Match Dashboard description.
Long contentFavoriteId = 789L; // Long | Filter on a content favorite id.
String spaceId = "spaceId_example"; // String | Filter on a particular space.
String deleted = "deleted_example"; // String | Filter on dashboards deleted status.
String userId = "userId_example"; // String | Filter on dashboards created by a particular user.
String viewCount = "viewCount_example"; // String | Filter on a particular value of view_count
try {
    List<Dashboard> result = apiInstance.searchDashboards(fields, id, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#searchDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]
 **id** | **Long**| Match dashboard id. | [optional]
 **page** | **Long**| Requested page. | [optional]
 **perPage** | **Long**| Results per page. | [optional]
 **limit** | **Long**| Number of results to return. (used with offset and takes priority over page and per_page) | [optional]
 **offset** | **Long**| Number of results to skip before returning any. (used with limit and takes priority over page and per_page) | [optional]
 **sorts** | **String**| Fields to sort by. | [optional]
 **title** | **String**| Match Dashboard title. | [optional]
 **description** | **String**| Match Dashboard description. | [optional]
 **contentFavoriteId** | **Long**| Filter on a content favorite id. | [optional]
 **spaceId** | **String**| Filter on a particular space. | [optional]
 **deleted** | **String**| Filter on dashboards deleted status. | [optional]
 **userId** | **String**| Filter on dashboards created by a particular user. | [optional]
 **viewCount** | **String**| Filter on a particular value of view_count | [optional]

### Return type

[**List&lt;Dashboard&gt;**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDashboard"></a>
# **updateDashboard**
> Dashboard updateDashboard(dashboardId, body)

Update Dashboard

### Update the dashboard with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
Dashboard body = new Dashboard(); // Dashboard | Dashboard
try {
    Dashboard result = apiInstance.updateDashboard(dashboardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of dashboard |
 **body** | [**Dashboard**](Dashboard.md)| Dashboard |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

