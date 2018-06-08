# ContentApi

All URIs are relative to *https://cilappxd0093.sys.cigna.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allContentMetadataAccesss**](ContentApi.md#allContentMetadataAccesss) | **GET** /content_metadata_access | Get All Content Metadata Accesss
[**allContentMetadatas**](ContentApi.md#allContentMetadatas) | **GET** /content_metadata | Get All Content Metadatas
[**contentFavorite**](ContentApi.md#contentFavorite) | **GET** /content_favorite/{content_favorite_id} | Get Favorite Content
[**contentMetadata**](ContentApi.md#contentMetadata) | **GET** /content_metadata/{content_metadata_id} | Get Content Metadata
[**createContentFavorite**](ContentApi.md#createContentFavorite) | **POST** /content_favorite | Create Favorite Content
[**createContentMetadataAccess**](ContentApi.md#createContentMetadataAccess) | **POST** /content_metadata_access | Create Content Metadata Access
[**deleteContentFavorite**](ContentApi.md#deleteContentFavorite) | **DELETE** /content_favorite/{content_favorite_id} | Delete Favorite Content
[**deleteContentMetadataAccess**](ContentApi.md#deleteContentMetadataAccess) | **DELETE** /content_metadata_access/{content_metadata_access_id} | Delete Content Metadata Access
[**searchContentFavorites**](ContentApi.md#searchContentFavorites) | **GET** /content_favorite/search | Search Favorite Contents
[**searchContentViews**](ContentApi.md#searchContentViews) | **GET** /content_view/search | Search Content Views
[**updateContentMetadata**](ContentApi.md#updateContentMetadata) | **PATCH** /content_metadata/{content_metadata_id} | Update Content Metadata
[**updateContentMetadataAccess**](ContentApi.md#updateContentMetadataAccess) | **PUT** /content_metadata_access/{content_metadata_access_id} | Update Content Metadata Access


<a name="allContentMetadataAccesss"></a>
# **allContentMetadataAccesss**
> List&lt;ContentMetaGroupUser&gt; allContentMetadataAccesss(contentMetadataId, fields)

Get All Content Metadata Accesss

### All content metadata access records for a content metadata item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentMetadataId = 789L; // Long | Id of content metadata
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentMetaGroupUser> result = apiInstance.allContentMetadataAccesss(contentMetadataId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#allContentMetadataAccesss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataId** | **Long**| Id of content metadata | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ContentMetaGroupUser&gt;**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allContentMetadatas"></a>
# **allContentMetadatas**
> List&lt;ContentMeta&gt; allContentMetadatas(parentId, fields)

Get All Content Metadatas

### Get information about all content metadata in a space. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long parentId = 789L; // Long | Parent space of content.
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentMeta> result = apiInstance.allContentMetadatas(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#allContentMetadatas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| Parent space of content. |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ContentMeta&gt;**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentFavorite"></a>
# **contentFavorite**
> ContentFavorite contentFavorite(contentFavoriteId, fields)

Get Favorite Content

### Get favorite content by its id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentFavoriteId = 789L; // Long | Id of favorite content
String fields = "fields_example"; // String | Requested fields.
try {
    ContentFavorite result = apiInstance.contentFavorite(contentFavoriteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentFavoriteId** | **Long**| Id of favorite content |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**ContentFavorite**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentMetadata"></a>
# **contentMetadata**
> ContentMeta contentMetadata(contentMetadataId, fields)

Get Content Metadata

### Get information about an individual content metadata record. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentMetadataId = 789L; // Long | Id of content metadata
String fields = "fields_example"; // String | Requested fields.
try {
    ContentMeta result = apiInstance.contentMetadata(contentMetadataId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataId** | **Long**| Id of content metadata |
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**ContentMeta**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContentFavorite"></a>
# **createContentFavorite**
> ContentFavorite createContentFavorite(body)

Create Favorite Content

### Create favorite content

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentFavorite body = new ContentFavorite(); // ContentFavorite | Favorite Content
try {
    ContentFavorite result = apiInstance.createContentFavorite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createContentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentFavorite**](ContentFavorite.md)| Favorite Content | [optional]

### Return type

[**ContentFavorite**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContentMetadataAccess"></a>
# **createContentMetadataAccess**
> ContentMetaGroupUser createContentMetadataAccess(body)

Create Content Metadata Access

### Create content metadata access. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentMetaGroupUser body = new ContentMetaGroupUser(); // ContentMetaGroupUser | Content Metadata Access
try {
    ContentMetaGroupUser result = apiInstance.createContentMetadataAccess(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentMetaGroupUser**](ContentMetaGroupUser.md)| Content Metadata Access | [optional]

### Return type

[**ContentMetaGroupUser**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContentFavorite"></a>
# **deleteContentFavorite**
> String deleteContentFavorite(contentFavoriteId)

Delete Favorite Content

### Delete favorite content

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentFavoriteId = 789L; // Long | Id of favorite content
try {
    String result = apiInstance.deleteContentFavorite(contentFavoriteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#deleteContentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentFavoriteId** | **Long**| Id of favorite content |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContentMetadataAccess"></a>
# **deleteContentMetadataAccess**
> String deleteContentMetadataAccess(contentMetadataAccessId)

Delete Content Metadata Access

### Remove content metadata access. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentMetadataAccessId = 789L; // Long | Id of content metadata access
try {
    String result = apiInstance.deleteContentMetadataAccess(contentMetadataAccessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#deleteContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataAccessId** | **Long**| Id of content metadata access |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchContentFavorites"></a>
# **searchContentFavorites**
> List&lt;ContentFavorite&gt; searchContentFavorites(userId, limit, offset, sorts, fields)

Search Favorite Contents

### Search Favorite Content 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long userId = 789L; // Long | Match User Id
Long limit = 789L; // Long | Number of results to return. (used with offset)
Long offset = 789L; // Long | Number of results to skip before returning any. (used with limit)
String sorts = "sorts_example"; // String | Fields to sort by.
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentFavorite> result = apiInstance.searchContentFavorites(userId, limit, offset, sorts, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#searchContentFavorites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| Match User Id | [optional]
 **limit** | **Long**| Number of results to return. (used with offset) | [optional]
 **offset** | **Long**| Number of results to skip before returning any. (used with limit) | [optional]
 **sorts** | **String**| Fields to sort by. | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ContentFavorite&gt;**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchContentViews"></a>
# **searchContentViews**
> List&lt;ContentView&gt; searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields)

Search Content Views

### Search Content View 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long viewCount = 789L; // Long | Match view count
Long groupId = 789L; // Long | Match Group Id
String lookId = "lookId_example"; // String | Match look_id
String dashboardId = "dashboardId_example"; // String | Match dashboard_id
Long contentMetadataId = 789L; // Long | Match content metadata id
String startOfWeekDate = "startOfWeekDate_example"; // String | Match start of week date
Boolean allTime = true; // Boolean | True if only all time view records should be returned
Long userId = 789L; // Long | Match user id
Long limit = 789L; // Long | Number of results to return. Use with `offset` to manage pagination of results
Long offset = 789L; // Long | Number of results to skip before returning data
String sorts = "sorts_example"; // String | Fields to sort by
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentView> result = apiInstance.searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#searchContentViews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewCount** | **Long**| Match view count | [optional]
 **groupId** | **Long**| Match Group Id | [optional]
 **lookId** | **String**| Match look_id | [optional]
 **dashboardId** | **String**| Match dashboard_id | [optional]
 **contentMetadataId** | **Long**| Match content metadata id | [optional]
 **startOfWeekDate** | **String**| Match start of week date | [optional]
 **allTime** | **Boolean**| True if only all time view records should be returned | [optional]
 **userId** | **Long**| Match user id | [optional]
 **limit** | **Long**| Number of results to return. Use with &#x60;offset&#x60; to manage pagination of results | [optional]
 **offset** | **Long**| Number of results to skip before returning data | [optional]
 **sorts** | **String**| Fields to sort by | [optional]
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**List&lt;ContentView&gt;**](ContentView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContentMetadata"></a>
# **updateContentMetadata**
> ContentMeta updateContentMetadata(contentMetadataId, body)

Update Content Metadata

### Move a piece of content. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentMetadataId = 789L; // Long | Id of content metadata
ContentMeta body = new ContentMeta(); // ContentMeta | Content Metadata
try {
    ContentMeta result = apiInstance.updateContentMetadata(contentMetadataId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#updateContentMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataId** | **Long**| Id of content metadata |
 **body** | [**ContentMeta**](ContentMeta.md)| Content Metadata |

### Return type

[**ContentMeta**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContentMetadataAccess"></a>
# **updateContentMetadataAccess**
> ContentMetaGroupUser updateContentMetadataAccess(contentMetadataAccessId, body)

Update Content Metadata Access

### Update type of access for content metadata. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Long contentMetadataAccessId = 789L; // Long | Id of content metadata access
ContentMetaGroupUser body = new ContentMetaGroupUser(); // ContentMetaGroupUser | Content Metadata Access
try {
    ContentMetaGroupUser result = apiInstance.updateContentMetadataAccess(contentMetadataAccessId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#updateContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataAccessId** | **Long**| Id of content metadata access |
 **body** | [**ContentMetaGroupUser**](ContentMetaGroupUser.md)| Content Metadata Access |

### Return type

[**ContentMetaGroupUser**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

