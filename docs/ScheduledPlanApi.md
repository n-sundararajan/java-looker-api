# ScheduledPlanApi

All URIs are relative to *https://xxxxxxx.sys.xxxxxx.xxxx:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allScheduledPlans**](ScheduledPlanApi.md#allScheduledPlans) | **GET** /scheduled_plans | Get All Scheduled Plans
[**createScheduledPlan**](ScheduledPlanApi.md#createScheduledPlan) | **POST** /scheduled_plans | Create Scheduled Plan
[**deleteScheduledPlan**](ScheduledPlanApi.md#deleteScheduledPlan) | **DELETE** /scheduled_plans/{scheduled_plan_id} | Delete Scheduled Plan
[**scheduledPlan**](ScheduledPlanApi.md#scheduledPlan) | **GET** /scheduled_plans/{scheduled_plan_id} | Get Scheduled Plan
[**scheduledPlanRunOnce**](ScheduledPlanApi.md#scheduledPlanRunOnce) | **POST** /scheduled_plans/run_once | Run Scheduled Plan Once
[**scheduledPlansForDashboard**](ScheduledPlanApi.md#scheduledPlansForDashboard) | **GET** /scheduled_plans/dashboard/{dashboard_id} | Scheduled Plans for Dashboard
[**scheduledPlansForLook**](ScheduledPlanApi.md#scheduledPlansForLook) | **GET** /scheduled_plans/look/{look_id} | Scheduled Plans for Look
[**scheduledPlansForLookmlDashboard**](ScheduledPlanApi.md#scheduledPlansForLookmlDashboard) | **GET** /scheduled_plans/lookml_dashboard/{lookml_dashboard_id} | Scheduled Plans for LookML Dashboard
[**scheduledPlansForSpace**](ScheduledPlanApi.md#scheduledPlansForSpace) | **GET** /scheduled_plans/space/{space_id} | Scheduled Plans for Space
[**updateScheduledPlan**](ScheduledPlanApi.md#updateScheduledPlan) | **PATCH** /scheduled_plans/{scheduled_plan_id} | Update Scheduled Plan


<a name="allScheduledPlans"></a>
# **allScheduledPlans**
> List&lt;ScheduledPlan&gt; allScheduledPlans(userId, fields)

Get All Scheduled Plans

### List all scheduled plans which belong to the requesting user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long userId = 789L; // Long | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.allScheduledPlans(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#allScheduledPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User Id (default is requesting user if not specified) | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createScheduledPlan"></a>
# **createScheduledPlan**
> ScheduledPlan createScheduledPlan(body)

Create Scheduled Plan

### Schedule a Look or Dashboard by creating a scheduled plan.  Admins can create scheduled plans on behalf of other users by specifying a user id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
try {
    ScheduledPlan result = apiInstance.createScheduledPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#createScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScheduledPlan"></a>
# **deleteScheduledPlan**
> String deleteScheduledPlan(scheduledPlanId)

Delete Scheduled Plan

### Delete the scheduled plan with the specified id.  Admins can delete other users&#39; Scheduled Plans. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long scheduledPlanId = 789L; // Long | Scheduled Plan Id
try {
    String result = apiInstance.deleteScheduledPlan(scheduledPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#deleteScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanId** | **Long**| Scheduled Plan Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlan"></a>
# **scheduledPlan**
> ScheduledPlan scheduledPlan(scheduledPlanId, fields)

Get Scheduled Plan

### Get information about a scheduled plan.  Admins can fetch information about other users&#39; Scheduled Plans. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long scheduledPlanId = 789L; // Long | Scheduled Plan Id
String fields = "fields_example"; // String | Requested fields.
try {
    ScheduledPlan result = apiInstance.scheduledPlan(scheduledPlanId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanId** | **Long**| Scheduled Plan Id |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlanRunOnce"></a>
# **scheduledPlanRunOnce**
> ScheduledPlan scheduledPlanRunOnce(body)

Run Scheduled Plan Once

### Schedule a Look or Dashboard to run once _now_ with a scheduled plan.  This can be useful for testing a Scheduled Plan before committing to a production schedule.  Admins can create scheduled plans on behalf of other users by specifying a user id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
try {
    ScheduledPlan result = apiInstance.scheduledPlanRunOnce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlanRunOnce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlansForDashboard"></a>
# **scheduledPlansForDashboard**
> List&lt;ScheduledPlan&gt; scheduledPlansForDashboard(dashboardId, userId, fields)

Scheduled Plans for Dashboard

### Get scheduled plans by using a dashboard id for the requesting user or a specified user id (with :see_schedules permission) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long dashboardId = 789L; // Long | Dashboard Id
Long userId = 789L; // Long | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForDashboard(dashboardId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **Long**| Dashboard Id |
 **userId** | **Long**| User Id (default is requesting user if not specified) | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlansForLook"></a>
# **scheduledPlansForLook**
> List&lt;ScheduledPlan&gt; scheduledPlansForLook(lookId, userId, fields)

Scheduled Plans for Look

### Get scheduled plans by using a look id for the requesting user or a specified user id (with :see_schedules permission) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long lookId = 789L; // Long | Look Id
Long userId = 789L; // Long | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForLook(lookId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Look Id |
 **userId** | **Long**| User Id (default is requesting user if not specified) | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlansForLookmlDashboard"></a>
# **scheduledPlansForLookmlDashboard**
> List&lt;ScheduledPlan&gt; scheduledPlansForLookmlDashboard(lookmlDashboardId, userId, fields)

Scheduled Plans for LookML Dashboard

### Get scheduled plans by using a LookML dashboard id for the requesting user or a specified user id (with :see_schedules permission) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long lookmlDashboardId = 789L; // Long | LookML Dashboard Id
Long userId = 789L; // Long | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForLookmlDashboard(lookmlDashboardId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForLookmlDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlDashboardId** | **Long**| LookML Dashboard Id |
 **userId** | **Long**| User Id (default is requesting user if not specified) | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlansForSpace"></a>
# **scheduledPlansForSpace**
> List&lt;ScheduledPlan&gt; scheduledPlansForSpace(spaceId, fields)

Scheduled Plans for Space

### Get scheduled plans by using a space id for the requesting user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long spaceId = 789L; // Long | Space Id
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForSpace(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**| Space Id |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateScheduledPlan"></a>
# **updateScheduledPlan**
> ScheduledPlan updateScheduledPlan(scheduledPlanId, body)

Update Scheduled Plan

### Update the scheduled plan with the specified id.  Admins can update other users&#39; Scheduled Plans. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Long scheduledPlanId = 789L; // Long | Scheduled Plan Id
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
try {
    ScheduledPlan result = apiInstance.updateScheduledPlan(scheduledPlanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#updateScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanId** | **Long**| Scheduled Plan Id |
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan |

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

