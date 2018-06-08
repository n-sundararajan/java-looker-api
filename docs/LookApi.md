# LookApi

All URIs are relative to *https://cilappxd0093.sys.cigna.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allLooks**](LookApi.md#allLooks) | **GET** /looks | Get All Looks
[**createLook**](LookApi.md#createLook) | **POST** /looks | Create Look
[**deleteLook**](LookApi.md#deleteLook) | **DELETE** /looks/{look_id} | Delete Look
[**look**](LookApi.md#look) | **GET** /looks/{look_id} | Get Look
[**runLook**](LookApi.md#runLook) | **GET** /looks/{look_id}/run/{result_format} | Run Look
[**searchLooks**](LookApi.md#searchLooks) | **GET** /looks/search | Search Looks
[**updateLook**](LookApi.md#updateLook) | **PATCH** /looks/{look_id} | Update Look


<a name="allLooks"></a>
# **allLooks**
> List&lt;Look&gt; allLooks(fields)

Get All Looks

### Get all the looks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<Look> result = apiInstance.allLooks(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#allLooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;Look&gt;**](Look.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLook"></a>
# **createLook**
> LookWithQuery createLook(body, fields)

Create Look

### Create a Look with specified information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
LookWithQuery body = new LookWithQuery(); // LookWithQuery | Look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.createLook(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#createLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LookWithQuery**](LookWithQuery.md)| Look | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLook"></a>
# **deleteLook**
> String deleteLook(lookId)

Delete Look

### Delete the look with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Long lookId = 789L; // Long | Id of look
try {
    String result = apiInstance.deleteLook(lookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#deleteLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Id of look |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="look"></a>
# **look**
> LookWithQuery look(lookId, fields)

Get Look

### Get a Look.  Return detailed information about the Look and its associated Query.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Long lookId = 789L; // Long | Id of look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.look(lookId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#look");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Id of look |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runLook"></a>
# **runLook**
> String runLook(lookId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs)

Run Look

### Run a Look.  Runs a given look&#39;s query and returns the results in the requested format.  Suported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Long lookId = 789L; // Long | Id of look
String resultFormat = "resultFormat_example"; // String | Format of result
Long limit = 789L; // Long | Row limit (may override the limit in the saved query).
Boolean applyFormatting = true; // Boolean | Apply model-specified formatting to each result.
Boolean applyVis = true; // Boolean | Apply visualization options to results.
Boolean cache = true; // Boolean | Get results from cache if available.
Long imageWidth = 789L; // Long | Render width for image formats.
Long imageHeight = 789L; // Long | Render height for image formats.
Boolean generateDrillLinks = true; // Boolean | Generate drill links (only applicable to 'json_detail' format.
Boolean forceProduction = true; // Boolean | Force use of production models even if the user is in development mode.
Boolean cacheOnly = true; // Boolean | Retrieve any results from cache even if the results have expired.
String pathPrefix = "pathPrefix_example"; // String | Prefix to use for drill links (url encoded).
Boolean rebuildPdts = true; // Boolean | Rebuild PDTS used in query.
Boolean serverTableCalcs = true; // Boolean | Perform table calculations on query results
try {
    String result = apiInstance.runLook(lookId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#runLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Id of look |
 **resultFormat** | **String**| Format of result |
 **limit** | **Long**| Row limit (may override the limit in the saved query). | [optional]
 **applyFormatting** | **Boolean**| Apply model-specified formatting to each result. | [optional]
 **applyVis** | **Boolean**| Apply visualization options to results. | [optional]
 **cache** | **Boolean**| Get results from cache if available. | [optional]
 **imageWidth** | **Long**| Render width for image formats. | [optional]
 **imageHeight** | **Long**| Render height for image formats. | [optional]
 **generateDrillLinks** | **Boolean**| Generate drill links (only applicable to &#39;json_detail&#39; format. | [optional]
 **forceProduction** | **Boolean**| Force use of production models even if the user is in development mode. | [optional]
 **cacheOnly** | **Boolean**| Retrieve any results from cache even if the results have expired. | [optional]
 **pathPrefix** | **String**| Prefix to use for drill links (url encoded). | [optional]
 **rebuildPdts** | **Boolean**| Rebuild PDTS used in query. | [optional]
 **serverTableCalcs** | **Boolean**| Perform table calculations on query results | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text, application/json, image/png, image/jpg

<a name="searchLooks"></a>
# **searchLooks**
> List&lt;Look&gt; searchLooks(fields, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, userId, viewCount)

Search Looks

Search looks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
String fields = "fields_example"; // String | Requested fields.
Long page = 789L; // Long | Requested page.
Long perPage = 789L; // Long | Results per page.
Long limit = 789L; // Long | Number of results to return. (used with offset and takes priority over page and per_page)
Long offset = 789L; // Long | Number of results to skip before returning any. (used with limit and takes priority over page and per_page)
String sorts = "sorts_example"; // String | Fields to sort by.
String title = "title_example"; // String | Match Look title.
String description = "description_example"; // String | Match Look description.
Long contentFavoriteId = 789L; // Long | Match content favorite id
String spaceId = "spaceId_example"; // String | Filter on a particular space.
String userId = "userId_example"; // String | Filter on dashboards created by a particular user.
String viewCount = "viewCount_example"; // String | Filter on a particular value of view_count
try {
    List<Look> result = apiInstance.searchLooks(fields, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, userId, viewCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#searchLooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]
 **page** | **Long**| Requested page. | [optional]
 **perPage** | **Long**| Results per page. | [optional]
 **limit** | **Long**| Number of results to return. (used with offset and takes priority over page and per_page) | [optional]
 **offset** | **Long**| Number of results to skip before returning any. (used with limit and takes priority over page and per_page) | [optional]
 **sorts** | **String**| Fields to sort by. | [optional]
 **title** | **String**| Match Look title. | [optional]
 **description** | **String**| Match Look description. | [optional]
 **contentFavoriteId** | **Long**| Match content favorite id | [optional]
 **spaceId** | **String**| Filter on a particular space. | [optional]
 **userId** | **String**| Filter on dashboards created by a particular user. | [optional]
 **viewCount** | **String**| Filter on a particular value of view_count | [optional]

### Return type

[**List&lt;Look&gt;**](Look.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLook"></a>
# **updateLook**
> LookWithQuery updateLook(lookId, body, fields)

Update Look

### Update the Look with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Long lookId = 789L; // Long | Id of look
LookWithQuery body = new LookWithQuery(); // LookWithQuery | Look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.updateLook(lookId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#updateLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | **Long**| Id of look |
 **body** | [**LookWithQuery**](LookWithQuery.md)| Look |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

