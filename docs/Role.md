
# Role

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**name** | **String** | Name of Role |  [optional]
**permissionSet** | [**PermissionSet**](PermissionSet.md) | (Read only) Permission set |  [optional]
**permissionSetId** | **Long** | (Write-Only) Id of permission set |  [optional]
**modelSet** | [**ModelSet**](ModelSet.md) | (Read only) Model set |  [optional]
**modelSetId** | **Long** | (Write-Only) Id of model set |  [optional]
**url** | **String** | Link to get this item |  [optional]
**usersUrl** | **String** | Link to get list of users with this role |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



