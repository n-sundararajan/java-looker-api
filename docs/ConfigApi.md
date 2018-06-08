# ConfigApi

All URIs are relative to *https://xxxxxxx.sys.xxxxxx.xxxx:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allLegacyFeatures**](ConfigApi.md#allLegacyFeatures) | **GET** /legacy_features | Get All Legacy Features
[**allTimezones**](ConfigApi.md#allTimezones) | **GET** /timezones | Get All Timezones
[**backupConfiguration**](ConfigApi.md#backupConfiguration) | **GET** /backup_configuration | Get Backup Configuration
[**legacyFeature**](ConfigApi.md#legacyFeature) | **GET** /legacy_features/{legacy_feature_id} | Get Legacy Feature
[**updateBackupConfiguration**](ConfigApi.md#updateBackupConfiguration) | **PATCH** /backup_configuration | Update Backup Configuration
[**updateLegacyFeature**](ConfigApi.md#updateLegacyFeature) | **PATCH** /legacy_features/{legacy_feature_id} | Update Legacy Feature
[**updateWhitelabelConfiguration**](ConfigApi.md#updateWhitelabelConfiguration) | **PUT** /whitelabel_configuration | Update Whitelabel configuration
[**versions**](ConfigApi.md#versions) | **GET** /versions | Get ApiVersion
[**whitelabelConfiguration**](ConfigApi.md#whitelabelConfiguration) | **GET** /whitelabel_configuration | Get Whitelabel configuration


<a name="allLegacyFeatures"></a>
# **allLegacyFeatures**
> List&lt;LegacyFeature&gt; allLegacyFeatures()

Get All Legacy Features

### Get all legacy features. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
try {
    List<LegacyFeature> result = apiInstance.allLegacyFeatures();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#allLegacyFeatures");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LegacyFeature&gt;**](LegacyFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allTimezones"></a>
# **allTimezones**
> List&lt;Timezone&gt; allTimezones()

Get All Timezones

### Get a list of timezones that Looker supports (e.g. useful for scheduling tasks). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
try {
    List<Timezone> result = apiInstance.allTimezones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#allTimezones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Timezone&gt;**](Timezone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupConfiguration"></a>
# **backupConfiguration**
> BackupConfiguration backupConfiguration()

Get Backup Configuration

### Get the current Looker internal database backup configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
try {
    BackupConfiguration result = apiInstance.backupConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#backupConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BackupConfiguration**](BackupConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="legacyFeature"></a>
# **legacyFeature**
> LegacyFeature legacyFeature(legacyFeatureId)

Get Legacy Feature

### Get information about the legacy feature with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
Long legacyFeatureId = 789L; // Long | id of legacy feature
try {
    LegacyFeature result = apiInstance.legacyFeature(legacyFeatureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#legacyFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyFeatureId** | **Long**| id of legacy feature |

### Return type

[**LegacyFeature**](LegacyFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBackupConfiguration"></a>
# **updateBackupConfiguration**
> BackupConfiguration updateBackupConfiguration(body)

Update Backup Configuration

### Update the Looker internal database backup configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
BackupConfiguration body = new BackupConfiguration(); // BackupConfiguration | Options for Backup Configuration
try {
    BackupConfiguration result = apiInstance.updateBackupConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#updateBackupConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BackupConfiguration**](BackupConfiguration.md)| Options for Backup Configuration |

### Return type

[**BackupConfiguration**](BackupConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLegacyFeature"></a>
# **updateLegacyFeature**
> LegacyFeature updateLegacyFeature(legacyFeatureId, body)

Update Legacy Feature

### Update information about the legacy feature with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
Long legacyFeatureId = 789L; // Long | id of legacy feature
LegacyFeature body = new LegacyFeature(); // LegacyFeature | Legacy Feature
try {
    LegacyFeature result = apiInstance.updateLegacyFeature(legacyFeatureId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#updateLegacyFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacyFeatureId** | **Long**| id of legacy feature |
 **body** | [**LegacyFeature**](LegacyFeature.md)| Legacy Feature |

### Return type

[**LegacyFeature**](LegacyFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWhitelabelConfiguration"></a>
# **updateWhitelabelConfiguration**
> Whitelabel updateWhitelabelConfiguration(body)

Update Whitelabel configuration

### Update the whitelabel configuration 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
Whitelabel body = new Whitelabel(); // Whitelabel | Whitelabel configuration
try {
    Whitelabel result = apiInstance.updateWhitelabelConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#updateWhitelabelConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Whitelabel**](Whitelabel.md)| Whitelabel configuration |

### Return type

[**Whitelabel**](Whitelabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="versions"></a>
# **versions**
> ApiVersion versions(fields)

Get ApiVersion

### Get information about all API versions supported by this Looker instance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
String fields = "fields_example"; // String | Requested fields.
try {
    ApiVersion result = apiInstance.versions(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#versions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**ApiVersion**](ApiVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="whitelabelConfiguration"></a>
# **whitelabelConfiguration**
> Whitelabel whitelabelConfiguration(fields)

Get Whitelabel configuration

### This feature is enabled only by special license. ### Gets the whitelabel configuration, which includes hiding documentation links, custom favicon uploading, etc. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigApi;


ConfigApi apiInstance = new ConfigApi();
String fields = "fields_example"; // String | Requested fields.
try {
    Whitelabel result = apiInstance.whitelabelConfiguration(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigApi#whitelabelConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields. | [optional]

### Return type

[**Whitelabel**](Whitelabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

