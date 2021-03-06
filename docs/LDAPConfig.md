
# LDAPConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Enable/Disable LDAP authentication for the server |  [optional]
**connectionHost** | **String** | LDAP server hostname |  [optional]
**connectionPort** | **String** | LDAP host port |  [optional]
**connectionTls** | **Boolean** | Use Transport Layer Security |  [optional]
**authUsername** | **String** | Distinguished name of LDAP account used to access the LDAP server |  [optional]
**authPassword** | **String** | (Write-Only)  Password for the LDAP account used to access the LDAP server |  [optional]
**hasAuthPassword** | **Boolean** | (Read-only) Has the password been set for the LDAP account used to access the LDAP server |  [optional]
**userBindBaseDn** | **String** | Distinguished name of LDAP node used as the base for user searches |  [optional]
**userIdAttributeNames** | **String** | Name(s) of user record attributes used for matching user login id (comma separated list) |  [optional]
**userObjectclass** | **String** | (Optional) Name of user record objectclass used for finding user during login id |  [optional]
**userCustomFilter** | **String** | (Optional) Custom RFC-2254 filter clause for use in finding user during login. Combined via &#39;and&#39; with the other generated filter clauses. |  [optional]
**userAttributeMapEmail** | **String** | Name of user record attributes used to indicate email address field |  [optional]
**userAttributeMapFirstName** | **String** | Name of user record attributes used to indicate first name |  [optional]
**userAttributeMapLastName** | **String** | Name of user record attributes used to indicate last name |  [optional]
**userAttributeMapLdapId** | **String** | Name of user record attributes used to indicate unique record id |  [optional]
**mergeNewUsersByEmail** | **Boolean** | Merge first-time ldap login to existing user account by email addresses. When a user logs in for the first time via ldap this option will connect this user into their existing account by finding the account with a matching email address. Otherwise a new user account will be created for the user. |  [optional]
**alternateEmailLoginAllowed** | **Boolean** | Allow alternate email-based login via &#39;/login/email&#39; for admins and for specified users with the &#39;login_special_email&#39; permission. This option is useful as a fallback during ldap setup, if ldap config problems occur later, or if you need to support some users who are not in your ldap directory. Looker email/password logins are always disabled for regular users when ldap is enabled. |  [optional]
**modifiedAt** | **String** | When this config was last modified |  [optional]
**modifiedBy** | **String** | User id of user who last modified this config |  [optional]
**defaultNewUserGroups** | [**List&lt;Group&gt;**](Group.md) | (Read-only) Groups that will be applied to new users the first time they login via LDAP |  [optional]
**defaultNewUserRoles** | [**List&lt;Role&gt;**](Role.md) | (Read-only) Roles that will be applied to new users the first time they login via LDAP |  [optional]
**defaultNewUserRoleIds** | **List&lt;Long&gt;** | (Write-Only)  Array of ids of roles that will be applied to new users the first time they login via LDAP |  [optional]
**defaultNewUserGroupIds** | **List&lt;Long&gt;** | (Write-Only)  Array of ids of groups that will be applied to new users the first time they login via LDAP |  [optional]
**setRolesFromGroups** | **Boolean** | Set user roles in Looker based on groups from LDAP |  [optional]
**groups** | [**List&lt;LDAPGroupRead&gt;**](LDAPGroupRead.md) | (Read-only) Array of mappings between LDAP Groups and Looker Roles |  [optional]
**groupsWithRoleIds** | [**List&lt;LDAPGroupWrite&gt;**](LDAPGroupWrite.md) | (Read/Write) Array of mappings between LDAP Groups and arrays of Looker Role ids |  [optional]
**authRequiresRole** | **Boolean** | Users will not be allowed to login at all unless a role for them is found in LDAP if set to true |  [optional]
**groupsFinderType** | **String** | Identifier for a strategy for how Looker will search for groups in the LDAP server |  [optional]
**groupsBaseDn** | **String** | Base dn for finding groups in LDAP searches |  [optional]
**groupsMemberAttribute** | **String** | LDAP Group attribute that signifies the members of the groups. Most commonly &#39;member&#39; |  [optional]
**groupsUserAttribute** | **String** | LDAP Group attribute that signifies the user in a group. Most commonly &#39;dn&#39; |  [optional]
**groupsObjectclasses** | **String** | Optional comma-separated list of supported LDAP objectclass for groups when doing groups searches |  [optional]
**forceNoPage** | **Boolean** | Don&#39;t attempt to do LDAP search result paging (RFC 2696) even if the LDAP server claims to support it. |  [optional]
**testLdapUser** | **String** | (Write-Only)  Test LDAP user login id. For ldap tests only. |  [optional]
**testLdapPassword** | **String** | (Write-Only)  Test LDAP user password. For ldap tests only. |  [optional]
**userAttributes** | [**List&lt;LDAPUserAttributeRead&gt;**](LDAPUserAttributeRead.md) | (Read-only) Array of mappings between LDAP User Attributes and Looker User Attributes |  [optional]
**userAttributesWithIds** | [**List&lt;LDAPUserAttributeWrite&gt;**](LDAPUserAttributeWrite.md) | (Read/Write) Array of mappings between LDAP User Attributes and arrays of Looker User Attribute ids |  [optional]
**url** | **String** | Link to get this item |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



