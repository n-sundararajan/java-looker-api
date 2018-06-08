# RenderTaskApi

All URIs are relative to *https://xxxxxxx.sys.xxxxxx.xxxx:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDashboardRenderTask**](RenderTaskApi.md#createDashboardRenderTask) | **POST** /render_tasks/dashboards/{dashboard_id}/{result_format} | Create Dashboard Render Task
[**createLookRenderTask**](RenderTaskApi.md#createLookRenderTask) | **POST** /render_tasks/looks/{look_id}/{result_format} | Create Look Render Task
[**createLookmlDashboardRenderTask**](RenderTaskApi.md#createLookmlDashboardRenderTask) | **POST** /render_tasks/lookml_dashboards/{dashboard_id}/{result_format} | Create Lookml Dashboard Render Task
[**createQueryRenderTask**](RenderTaskApi.md#createQueryRenderTask) | **POST** /render_tasks/queries/{query_id}/{result_format} | Create Query Render Task
[**renderTask**](RenderTaskApi.md#renderTask) | **GET** /render_tasks/{render_task_id} | Get Render Task
[**renderTaskResults**](RenderTaskApi.md#renderTaskResults) | **GET** /render_tasks/{render_task_id}/results | Render Task Results


<a name="createDashboardRenderTask"></a>
# **createDashboardRenderTask**
> RenderTask createDashboardRenderTask(dashboardId, resultFormat, body, width, height, fields)

Create Dashboard Render Task

### Create a new task to render a dashboard to a document or image.  Returns a render task object. To check the status of a render task, pass the render_task.id to [Get Render Task](#!/RenderTask/get_render_task). Once the render task is complete, you can download the resulting document or image using [Get Render Task Results](#!/RenderTask/get_render_task_results).  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
Long dashboardId = 789L; // Long | Id of dashboard to render
String resultFormat = "resultFormat_example"; // String | Output type: pdf, png, or jpg
CreateDashboardRenderTask body = new CreateDashboardRenderTask(); // CreateDashboardRenderTask | Dashboard render task parameters
Long width = 789L; // Long | Output width in pixels
Long height = 789L; // Long | Output height in pixels
String fields = "fields_example"; // String | Requested fields.
try {
    RenderTask result = apiInstance.createDashboardRenderTask(dashboardId, resultFormat, body, width, height, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#createDashboardRenderTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **Long**| Id of dashboard to render |
 **resultFormat** | **String**| Output type: pdf, png, or jpg |
 **body** | [**CreateDashboardRenderTask**](CreateDashboardRenderTask.md)| Dashboard render task parameters |
 **width** | **Long**| Output width in pixels |
 **height** | **Long**| Output height in pixels |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**RenderTask**](RenderTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLookRenderTask"></a>
# **createLookRenderTask**
> RenderTask createLookRenderTask(lookId, resultFormat, width, height, fields)

Create Look Render Task

### Create a new task to render a look to an image.  Returns a render task object. To check the status of a render task, pass the render_task.id to [Get Render Task](#!/RenderTask/get_render_task). Once the render task is complete, you can download the resulting document or image using [Get Render Task Results](#!/RenderTask/get_render_task_results).  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
Long lookId = 789L; // Long | Id of look to render
String resultFormat = "resultFormat_example"; // String | Output type: png, or jpg
Long width = 789L; // Long | Output width in pixels
Long height = 789L; // Long | Output height in pixels
String fields = "fields_example"; // String | Requested fields.
try {
    RenderTask result = apiInstance.createLookRenderTask(lookId, resultFormat, width, height, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#createLookRenderTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Id of look to render |
 **resultFormat** | **String**| Output type: png, or jpg |
 **width** | **Long**| Output width in pixels |
 **height** | **Long**| Output height in pixels |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**RenderTask**](RenderTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLookmlDashboardRenderTask"></a>
# **createLookmlDashboardRenderTask**
> RenderTask createLookmlDashboardRenderTask(dashboardId, resultFormat, body, width, height, fields)

Create Lookml Dashboard Render Task

### Create a new task to render a lookml dashboard to a document or image.  Returns a render task object. To check the status of a render task, pass the render_task.id to [Get Render Task](#!/RenderTask/get_render_task). Once the render task is complete, you can download the resulting document or image using [Get Render Task Results](#!/RenderTask/get_render_task_results).  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
String dashboardId = "dashboardId_example"; // String | Id of lookml dashboard to render
String resultFormat = "resultFormat_example"; // String | Output type: pdf, png, or jpg
CreateDashboardRenderTask body = new CreateDashboardRenderTask(); // CreateDashboardRenderTask | Dashboard render task parameters
Long width = 789L; // Long | Output width in pixels
Long height = 789L; // Long | Output height in pixels
String fields = "fields_example"; // String | Requested fields.
try {
    RenderTask result = apiInstance.createLookmlDashboardRenderTask(dashboardId, resultFormat, body, width, height, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#createLookmlDashboardRenderTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| Id of lookml dashboard to render |
 **resultFormat** | **String**| Output type: pdf, png, or jpg |
 **body** | [**CreateDashboardRenderTask**](CreateDashboardRenderTask.md)| Dashboard render task parameters |
 **width** | **Long**| Output width in pixels |
 **height** | **Long**| Output height in pixels |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**RenderTask**](RenderTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createQueryRenderTask"></a>
# **createQueryRenderTask**
> RenderTask createQueryRenderTask(queryId, resultFormat, width, height, fields)

Create Query Render Task

### Create a new task to render an existing query to an image.  Returns a render task object. To check the status of a render task, pass the render_task.id to [Get Render Task](#!/RenderTask/get_render_task). Once the render task is complete, you can download the resulting document or image using [Get Render Task Results](#!/RenderTask/get_render_task_results).  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
Long queryId = 789L; // Long | Id of the query to render
String resultFormat = "resultFormat_example"; // String | Output type: png or jpg
Long width = 789L; // Long | Output width in pixels
Long height = 789L; // Long | Output height in pixels
String fields = "fields_example"; // String | Requested fields.
try {
    RenderTask result = apiInstance.createQueryRenderTask(queryId, resultFormat, width, height, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#createQueryRenderTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryId** | **Long**| Id of the query to render |
 **resultFormat** | **String**| Output type: png or jpg |
 **width** | **Long**| Output width in pixels |
 **height** | **Long**| Output height in pixels |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**RenderTask**](RenderTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="renderTask"></a>
# **renderTask**
> RenderTask renderTask(renderTaskId, fields)

Get Render Task

### Get information about a render task.  Returns a render task object. To check the status of a render task, pass the render_task.id to [Get Render Task](#!/RenderTask/get_render_task). Once the render task is complete, you can download the resulting document or image using [Get Render Task Results](#!/RenderTask/get_render_task_results).  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
String renderTaskId = "renderTaskId_example"; // String | Id of render task
String fields = "fields_example"; // String | Requested fields.
try {
    RenderTask result = apiInstance.renderTask(renderTaskId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#renderTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **renderTaskId** | **String**| Id of render task |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**RenderTask**](RenderTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="renderTaskResults"></a>
# **renderTaskResults**
> String renderTaskResults(renderTaskId)

Render Task Results

### Get the document or image produced by a completed render task.  Returns &#x60;102 Processing&#x60; if the render task has not completed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RenderTaskApi;


RenderTaskApi apiInstance = new RenderTaskApi();
String renderTaskId = "renderTaskId_example"; // String | Id of render task
try {
    String result = apiInstance.renderTaskResults(renderTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenderTaskApi#renderTaskResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **renderTaskId** | **String**| Id of render task |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/jpeg, image/png, application/pdf

