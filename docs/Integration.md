
# Integration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the integration. |  [optional]
**integrationHubId** | **Long** | ID of the integration hub. |  [optional]
**label** | **String** | Label for the integration. |  [optional]
**description** | **String** | Description of the integration. |  [optional]
**enabled** | **Boolean** | Whether the integration is available to users. |  [optional]
**params** | [**List&lt;IntegrationParam&gt;**](IntegrationParam.md) | Array of params for the integration. |  [optional]
**supportedFormats** | **List&lt;String&gt;** | A list of data formats the integration supports. Valid values are: \&quot;txt\&quot;, \&quot;csv\&quot;, \&quot;inline_json\&quot;, \&quot;json\&quot;, \&quot;json_detail\&quot;, \&quot;xlsx\&quot;, \&quot;html\&quot;, \&quot;wysiwyg_pdf\&quot;, \&quot;assembled_pdf\&quot;, \&quot;wysiwyg_png\&quot;, \&quot;csv_zip\&quot;. |  [optional]
**supportedActionTypes** | **List&lt;String&gt;** | A list of action types the integration supports. Valid values are: \&quot;cell\&quot;, \&quot;query\&quot;, \&quot;dashboard\&quot;. |  [optional]
**supportedFormattings** | **List&lt;String&gt;** | A list of formatting options the integration supports. Valid values are: \&quot;formatted\&quot;, \&quot;unformatted\&quot;. |  [optional]
**supportedVisualizationFormattings** | **List&lt;String&gt;** | A list of visualization formatting options the integration supports. Valid values are: \&quot;apply\&quot;, \&quot;noapply\&quot;. |  [optional]
**supportedDownloadSettings** | **List&lt;String&gt;** | A list of streaming options the integration supports. Valid values are: \&quot;push\&quot;, \&quot;url\&quot;. |  [optional]
**iconUrl** | **String** | URL to an icon for the integration. |  [optional]
**requiredFields** | [**List&lt;IntegrationRequiredField&gt;**](IntegrationRequiredField.md) | A list of descriptions of required fields that this integration is compatible with. If there are multiple entries in this list, the integration requires more than one field. |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



