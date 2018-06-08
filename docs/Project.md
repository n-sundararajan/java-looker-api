
# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Project Id |  [optional]
**name** | **String** | Project display name |  [optional]
**usesGit** | **Boolean** | If true the project is configured with a git repository |  [optional]
**gitRemoteUrl** | **String** | Git remote repository url |  [optional]
**gitServiceName** | **String** | Name of the git service provider |  [optional]
**pullRequestMode** | **String** | The git pull request policy for this project. Valid values are: \&quot;off\&quot;, \&quot;links\&quot;, \&quot;recommended\&quot;, \&quot;required\&quot;. |  [optional]
**validationRequired** | **Boolean** | Validation policy: If true, the project must pass all validation checks before project changes can be committed to the git repository |  [optional]
**isExample** | **Boolean** | If true the project is an example project and cannot be modified |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



