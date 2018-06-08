
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**firstName** | **String** | First name |  [optional]
**lastName** | **String** | Last name |  [optional]
**displayName** | **String** | Full name for display (available only if both first_name and last_name are set) |  [optional]
**email** | **String** | EMail address |  [optional]
**isDisabled** | **Boolean** | Account has been disabled |  [optional]
**avatarUrl** | **String** | URL for the avatar image (may be generic) |  [optional]
**homeSpaceId** | **String** | ID string for user&#39;s home space |  [optional]
**personalSpaceId** | **Long** | ID of user&#39;s personal space |  [optional]
**embedGroupSpaceId** | **Long** | (Embed only) ID of user&#39;s group space based on the external_group_id optionally specified during embed user login |  [optional]
**accessFilters** | [**List&lt;AccessFilter&gt;**](AccessFilter.md) | Model access filters. |  [optional]
**credentialsEmail** | [**CredentialsEmail**](CredentialsEmail.md) | Email/Password login credentials |  [optional]
**credentialsTotp** | [**CredentialsTotp**](CredentialsTotp.md) | Two-factor credentials |  [optional]
**credentialsLdap** | [**CredentialsLDAP**](CredentialsLDAP.md) | LDAP credentials |  [optional]
**credentialsGoogle** | [**CredentialsGoogle**](CredentialsGoogle.md) | Google auth credentials |  [optional]
**credentialsSaml** | [**CredentialsSaml**](CredentialsSaml.md) | Saml auth credentials |  [optional]
**credentialsOidc** | [**CredentialsOIDC**](CredentialsOIDC.md) | OpenID Connect auth credentials |  [optional]
**credentialsApi** | [**CredentialsApi**](CredentialsApi.md) | API user credentials |  [optional]
**credentialsApi3** | [**List&lt;CredentialsApi3&gt;**](CredentialsApi3.md) | API 3 credentials |  [optional]
**credentialsEmbed** | [**List&lt;CredentialsEmbed&gt;**](CredentialsEmbed.md) | Embed credentials |  [optional]
**credentialsLookerOpenid** | [**CredentialsLookerOpenid**](CredentialsLookerOpenid.md) | LookerOpenID credentials. Used for login by Looker Analysts |  [optional]
**sessions** | [**List&lt;Session&gt;**](Session.md) | Active sessions |  [optional]
**roleIds** | **List&lt;Long&gt;** | Array of ids of the roles for this user |  [optional]
**groupIds** | **List&lt;Long&gt;** | Array of ids of the groups for this user |  [optional]
**presumedLookerEmployee** | **Boolean** | User is identified as an employee of Looker |  [optional]
**verifiedLookerEmployee** | **Boolean** | User is identified as an employee of Looker who has been verified via Looker corporate authentication |  [optional]
**lookerVersions** | **List&lt;String&gt;** | Array of strings representing the Looker versions that this user has used (this only goes back as far as &#39;3.54.0&#39;) |  [optional]
**uiState** | **Map&lt;String, String&gt;** | Per user dictionary of undocumented state information owned by the Looker UI. |  [optional]
**url** | **String** | Link to get this item |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



