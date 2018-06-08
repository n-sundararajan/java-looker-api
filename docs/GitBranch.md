
# GitBranch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The short name on the local |  [optional]
**remote** | **String** | The name of the remote |  [optional]
**remoteName** | **String** | The short name on the remote |  [optional]
**error** | **String** | Name of error |  [optional]
**message** | **String** | Message describing an error if present |  [optional]
**ownerName** | **String** | Name of the owner of a personal branch |  [optional]
**readonly** | **Boolean** | Whether or not this branch is readonly |  [optional]
**personal** | **Boolean** | Whether or not this branch is a personal branch - readonly for all developers except the owner |  [optional]
**isLocal** | **Boolean** | Whether or not a local ref exists for the branch |  [optional]
**isRemote** | **Boolean** | Whether or not a remote ref exists for the branch |  [optional]
**isProduction** | **Boolean** | Whether or not this is the production branch |  [optional]
**aheadCount** | **Long** | Number of commits the local branch is ahead of the remote |  [optional]
**behindCount** | **Long** | Number of commits the local branch is behind the remote |  [optional]
**commitAt** | **Long** | UNIX timestamp at which this branch was last committed. |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



