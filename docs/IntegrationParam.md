
# IntegrationParam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the parameter. |  [optional]
**label** | **String** | Label of the parameter. |  [optional]
**description** | **String** | Short description of the parameter. |  [optional]
**required** | **Boolean** | Whether the parameter is required to be set to use the destination. |  [optional]
**hasValue** | **Boolean** | Whether the parameter has a value set. |  [optional]
**value** | **String** | The current value of the parameter. Always null if the value is sensitive. When writing, null values will be ignored. Set the value to an empty string to clear it. |  [optional]
**userAttributeName** | **String** | When present, the param&#39;s value comes from this user attribute instead of the &#39;value&#39; parameter. Set to null to use the &#39;value&#39;. |  [optional]
**sensitive** | **Boolean** | Whether the parameter contains sensitive data like API credentials. |  [optional]



