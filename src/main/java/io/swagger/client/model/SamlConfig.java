/*
 * Looker API 3.0 Reference
 * ### Authorization  The Looker API uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page. Pass API3 credentials to the **_/login** endpoint to obtain a temporary access_token. Include that access_token in the Authorization header of Looker API requests. For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization)  ### Client SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. Client SDKs for a variety of programming languages can be generated from the Looker API's Swagger JSON metadata to streamline use of the Looker API in your applications. A client SDK for Ruby is available as an example. For more information, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks)  ### Try It Out!  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  ### Versioning  Future releases of Looker will expand this API release-by-release to securely expose more and more of the core power of Looker to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning. Stable (non-beta) API endpoints should not receive breaking changes in future releases. For more information, see [Looker API Versioning](https://looker.com/docs/r/api/versioning) 
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Group;
import io.swagger.client.model.Role;
import io.swagger.client.model.SamlGroupRead;
import io.swagger.client.model.SamlGroupWrite;
import io.swagger.client.model.SamlUserAttributeRead;
import io.swagger.client.model.SamlUserAttributeWrite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SamlConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class SamlConfig {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("idp_cert")
  private String idpCert = null;

  @SerializedName("idp_url")
  private String idpUrl = null;

  @SerializedName("idp_issuer")
  private String idpIssuer = null;

  @SerializedName("idp_audience")
  private String idpAudience = null;

  @SerializedName("allowed_clock_drift")
  private Long allowedClockDrift = null;

  @SerializedName("user_attribute_map_email")
  private String userAttributeMapEmail = null;

  @SerializedName("user_attribute_map_first_name")
  private String userAttributeMapFirstName = null;

  @SerializedName("user_attribute_map_last_name")
  private String userAttributeMapLastName = null;

  @SerializedName("new_user_migration_types")
  private String newUserMigrationTypes = null;

  @SerializedName("alternate_email_login_allowed")
  private Boolean alternateEmailLoginAllowed = null;

  @SerializedName("test_slug")
  private String testSlug = null;

  @SerializedName("modified_at")
  private String modifiedAt = null;

  @SerializedName("modified_by")
  private String modifiedBy = null;

  @SerializedName("default_new_user_roles")
  private List<Role> defaultNewUserRoles = null;

  @SerializedName("default_new_user_groups")
  private List<Group> defaultNewUserGroups = null;

  @SerializedName("default_new_user_role_ids")
  private List<Long> defaultNewUserRoleIds = null;

  @SerializedName("default_new_user_group_ids")
  private List<Long> defaultNewUserGroupIds = null;

  @SerializedName("set_roles_from_groups")
  private Boolean setRolesFromGroups = null;

  @SerializedName("groups_attribute")
  private String groupsAttribute = null;

  @SerializedName("groups")
  private List<SamlGroupRead> groups = null;

  @SerializedName("groups_with_role_ids")
  private List<SamlGroupWrite> groupsWithRoleIds = null;

  @SerializedName("auth_requires_role")
  private Boolean authRequiresRole = null;

  @SerializedName("user_attributes")
  private List<SamlUserAttributeRead> userAttributes = null;

  @SerializedName("user_attributes_with_ids")
  private List<SamlUserAttributeWrite> userAttributesWithIds = null;

  @SerializedName("groups_finder_type")
  private String groupsFinderType = null;

  @SerializedName("groups_member_value")
  private String groupsMemberValue = null;

  @SerializedName("bypass_login_page")
  private Boolean bypassLoginPage = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;

  public SamlConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable/Disable Saml authentication for the server
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable/Disable Saml authentication for the server")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SamlConfig idpCert(String idpCert) {
    this.idpCert = idpCert;
    return this;
  }

   /**
   * Identity Provider Certificate (provided by IdP)
   * @return idpCert
  **/
  @ApiModelProperty(value = "Identity Provider Certificate (provided by IdP)")
  public String getIdpCert() {
    return idpCert;
  }

  public void setIdpCert(String idpCert) {
    this.idpCert = idpCert;
  }

  public SamlConfig idpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

   /**
   * Identity Provider Url (provided by IdP)
   * @return idpUrl
  **/
  @ApiModelProperty(value = "Identity Provider Url (provided by IdP)")
  public String getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
  }

  public SamlConfig idpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
    return this;
  }

   /**
   * Identity Provider Issuer (provided by IdP)
   * @return idpIssuer
  **/
  @ApiModelProperty(value = "Identity Provider Issuer (provided by IdP)")
  public String getIdpIssuer() {
    return idpIssuer;
  }

  public void setIdpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
  }

  public SamlConfig idpAudience(String idpAudience) {
    this.idpAudience = idpAudience;
    return this;
  }

   /**
   * Identity Provider Audience (set in IdP config). Optional in Looker. Set this only if you want Looker to validate the audience value returned by the IdP.
   * @return idpAudience
  **/
  @ApiModelProperty(value = "Identity Provider Audience (set in IdP config). Optional in Looker. Set this only if you want Looker to validate the audience value returned by the IdP.")
  public String getIdpAudience() {
    return idpAudience;
  }

  public void setIdpAudience(String idpAudience) {
    this.idpAudience = idpAudience;
  }

  public SamlConfig allowedClockDrift(Long allowedClockDrift) {
    this.allowedClockDrift = allowedClockDrift;
    return this;
  }

   /**
   * Count of seconds of clock drift to allow when validating timestamps of assertions.
   * @return allowedClockDrift
  **/
  @ApiModelProperty(value = "Count of seconds of clock drift to allow when validating timestamps of assertions.")
  public Long getAllowedClockDrift() {
    return allowedClockDrift;
  }

  public void setAllowedClockDrift(Long allowedClockDrift) {
    this.allowedClockDrift = allowedClockDrift;
  }

  public SamlConfig userAttributeMapEmail(String userAttributeMapEmail) {
    this.userAttributeMapEmail = userAttributeMapEmail;
    return this;
  }

   /**
   * Name of user record attributes used to indicate email address field
   * @return userAttributeMapEmail
  **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate email address field")
  public String getUserAttributeMapEmail() {
    return userAttributeMapEmail;
  }

  public void setUserAttributeMapEmail(String userAttributeMapEmail) {
    this.userAttributeMapEmail = userAttributeMapEmail;
  }

  public SamlConfig userAttributeMapFirstName(String userAttributeMapFirstName) {
    this.userAttributeMapFirstName = userAttributeMapFirstName;
    return this;
  }

   /**
   * Name of user record attributes used to indicate first name
   * @return userAttributeMapFirstName
  **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate first name")
  public String getUserAttributeMapFirstName() {
    return userAttributeMapFirstName;
  }

  public void setUserAttributeMapFirstName(String userAttributeMapFirstName) {
    this.userAttributeMapFirstName = userAttributeMapFirstName;
  }

  public SamlConfig userAttributeMapLastName(String userAttributeMapLastName) {
    this.userAttributeMapLastName = userAttributeMapLastName;
    return this;
  }

   /**
   * Name of user record attributes used to indicate last name
   * @return userAttributeMapLastName
  **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate last name")
  public String getUserAttributeMapLastName() {
    return userAttributeMapLastName;
  }

  public void setUserAttributeMapLastName(String userAttributeMapLastName) {
    this.userAttributeMapLastName = userAttributeMapLastName;
  }

  public SamlConfig newUserMigrationTypes(String newUserMigrationTypes) {
    this.newUserMigrationTypes = newUserMigrationTypes;
    return this;
  }

   /**
   * Merge first-time saml login to existing user account by email addresses. When a user logs in for the first time via saml this option will connect this user into their existing account by finding the account with a matching email address by testing the given types of credentials for existing users. Otherwise a new user account will be created for the user. This list (if provided) must be a comma separated list of string like &#39;email,ldap,google&#39;
   * @return newUserMigrationTypes
  **/
  @ApiModelProperty(value = "Merge first-time saml login to existing user account by email addresses. When a user logs in for the first time via saml this option will connect this user into their existing account by finding the account with a matching email address by testing the given types of credentials for existing users. Otherwise a new user account will be created for the user. This list (if provided) must be a comma separated list of string like 'email,ldap,google'")
  public String getNewUserMigrationTypes() {
    return newUserMigrationTypes;
  }

  public void setNewUserMigrationTypes(String newUserMigrationTypes) {
    this.newUserMigrationTypes = newUserMigrationTypes;
  }

  public SamlConfig alternateEmailLoginAllowed(Boolean alternateEmailLoginAllowed) {
    this.alternateEmailLoginAllowed = alternateEmailLoginAllowed;
    return this;
  }

   /**
   * Allow alternate email-based login via &#39;/login/email&#39; for admins and for specified users with the &#39;login_special_email&#39; permission. This option is useful as a fallback during ldap setup, if ldap config problems occur later, or if you need to support some users who are not in your ldap directory. Looker email/password logins are always disabled for regular users when ldap is enabled.
   * @return alternateEmailLoginAllowed
  **/
  @ApiModelProperty(value = "Allow alternate email-based login via '/login/email' for admins and for specified users with the 'login_special_email' permission. This option is useful as a fallback during ldap setup, if ldap config problems occur later, or if you need to support some users who are not in your ldap directory. Looker email/password logins are always disabled for regular users when ldap is enabled.")
  public Boolean isAlternateEmailLoginAllowed() {
    return alternateEmailLoginAllowed;
  }

  public void setAlternateEmailLoginAllowed(Boolean alternateEmailLoginAllowed) {
    this.alternateEmailLoginAllowed = alternateEmailLoginAllowed;
  }

   /**
   * Slug to identify configurations that are created in order to run a Saml config test
   * @return testSlug
  **/
  @ApiModelProperty(value = "Slug to identify configurations that are created in order to run a Saml config test")
  public String getTestSlug() {
    return testSlug;
  }

   /**
   * When this config was last modified
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "When this config was last modified")
  public String getModifiedAt() {
    return modifiedAt;
  }

   /**
   * User id of user who last modified this config
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "User id of user who last modified this config")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public SamlConfig defaultNewUserRoles(List<Role> defaultNewUserRoles) {
    this.defaultNewUserRoles = defaultNewUserRoles;
    return this;
  }

  public SamlConfig addDefaultNewUserRolesItem(Role defaultNewUserRolesItem) {
    if (this.defaultNewUserRoles == null) {
      this.defaultNewUserRoles = new ArrayList<Role>();
    }
    this.defaultNewUserRoles.add(defaultNewUserRolesItem);
    return this;
  }

   /**
   * (Read-only) Roles that will be applied to new users the first time they login via Saml
   * @return defaultNewUserRoles
  **/
  @ApiModelProperty(value = "(Read-only) Roles that will be applied to new users the first time they login via Saml")
  public List<Role> getDefaultNewUserRoles() {
    return defaultNewUserRoles;
  }

  public void setDefaultNewUserRoles(List<Role> defaultNewUserRoles) {
    this.defaultNewUserRoles = defaultNewUserRoles;
  }

  public SamlConfig defaultNewUserGroups(List<Group> defaultNewUserGroups) {
    this.defaultNewUserGroups = defaultNewUserGroups;
    return this;
  }

  public SamlConfig addDefaultNewUserGroupsItem(Group defaultNewUserGroupsItem) {
    if (this.defaultNewUserGroups == null) {
      this.defaultNewUserGroups = new ArrayList<Group>();
    }
    this.defaultNewUserGroups.add(defaultNewUserGroupsItem);
    return this;
  }

   /**
   * (Read-only) Groups that will be applied to new users the first time they login via Saml
   * @return defaultNewUserGroups
  **/
  @ApiModelProperty(value = "(Read-only) Groups that will be applied to new users the first time they login via Saml")
  public List<Group> getDefaultNewUserGroups() {
    return defaultNewUserGroups;
  }

  public void setDefaultNewUserGroups(List<Group> defaultNewUserGroups) {
    this.defaultNewUserGroups = defaultNewUserGroups;
  }

  public SamlConfig defaultNewUserRoleIds(List<Long> defaultNewUserRoleIds) {
    this.defaultNewUserRoleIds = defaultNewUserRoleIds;
    return this;
  }

  public SamlConfig addDefaultNewUserRoleIdsItem(Long defaultNewUserRoleIdsItem) {
    if (this.defaultNewUserRoleIds == null) {
      this.defaultNewUserRoleIds = new ArrayList<Long>();
    }
    this.defaultNewUserRoleIds.add(defaultNewUserRoleIdsItem);
    return this;
  }

   /**
   * (Write-Only) Array of ids of roles that will be applied to new users the first time they login via Saml
   * @return defaultNewUserRoleIds
  **/
  @ApiModelProperty(value = "(Write-Only) Array of ids of roles that will be applied to new users the first time they login via Saml")
  public List<Long> getDefaultNewUserRoleIds() {
    return defaultNewUserRoleIds;
  }

  public void setDefaultNewUserRoleIds(List<Long> defaultNewUserRoleIds) {
    this.defaultNewUserRoleIds = defaultNewUserRoleIds;
  }

  public SamlConfig defaultNewUserGroupIds(List<Long> defaultNewUserGroupIds) {
    this.defaultNewUserGroupIds = defaultNewUserGroupIds;
    return this;
  }

  public SamlConfig addDefaultNewUserGroupIdsItem(Long defaultNewUserGroupIdsItem) {
    if (this.defaultNewUserGroupIds == null) {
      this.defaultNewUserGroupIds = new ArrayList<Long>();
    }
    this.defaultNewUserGroupIds.add(defaultNewUserGroupIdsItem);
    return this;
  }

   /**
   * (Write-Only) Array of ids of groups that will be applied to new users the first time they login via Saml
   * @return defaultNewUserGroupIds
  **/
  @ApiModelProperty(value = "(Write-Only) Array of ids of groups that will be applied to new users the first time they login via Saml")
  public List<Long> getDefaultNewUserGroupIds() {
    return defaultNewUserGroupIds;
  }

  public void setDefaultNewUserGroupIds(List<Long> defaultNewUserGroupIds) {
    this.defaultNewUserGroupIds = defaultNewUserGroupIds;
  }

  public SamlConfig setRolesFromGroups(Boolean setRolesFromGroups) {
    this.setRolesFromGroups = setRolesFromGroups;
    return this;
  }

   /**
   * Set user roles in Looker based on groups from Saml
   * @return setRolesFromGroups
  **/
  @ApiModelProperty(value = "Set user roles in Looker based on groups from Saml")
  public Boolean isSetRolesFromGroups() {
    return setRolesFromGroups;
  }

  public void setSetRolesFromGroups(Boolean setRolesFromGroups) {
    this.setRolesFromGroups = setRolesFromGroups;
  }

  public SamlConfig groupsAttribute(String groupsAttribute) {
    this.groupsAttribute = groupsAttribute;
    return this;
  }

   /**
   * Name of user record attributes used to indicate groups. Used when &#39;groups_finder_type&#39; is set to &#39;grouped_attribute_values&#39;
   * @return groupsAttribute
  **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate groups. Used when 'groups_finder_type' is set to 'grouped_attribute_values'")
  public String getGroupsAttribute() {
    return groupsAttribute;
  }

  public void setGroupsAttribute(String groupsAttribute) {
    this.groupsAttribute = groupsAttribute;
  }

  public SamlConfig groups(List<SamlGroupRead> groups) {
    this.groups = groups;
    return this;
  }

  public SamlConfig addGroupsItem(SamlGroupRead groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<SamlGroupRead>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * (Read-only) Array of mappings between Saml Groups and Looker Roles
   * @return groups
  **/
  @ApiModelProperty(value = "(Read-only) Array of mappings between Saml Groups and Looker Roles")
  public List<SamlGroupRead> getGroups() {
    return groups;
  }

  public void setGroups(List<SamlGroupRead> groups) {
    this.groups = groups;
  }

  public SamlConfig groupsWithRoleIds(List<SamlGroupWrite> groupsWithRoleIds) {
    this.groupsWithRoleIds = groupsWithRoleIds;
    return this;
  }

  public SamlConfig addGroupsWithRoleIdsItem(SamlGroupWrite groupsWithRoleIdsItem) {
    if (this.groupsWithRoleIds == null) {
      this.groupsWithRoleIds = new ArrayList<SamlGroupWrite>();
    }
    this.groupsWithRoleIds.add(groupsWithRoleIdsItem);
    return this;
  }

   /**
   * (Read/Write) Array of mappings between Saml Groups and arrays of Looker Role ids
   * @return groupsWithRoleIds
  **/
  @ApiModelProperty(value = "(Read/Write) Array of mappings between Saml Groups and arrays of Looker Role ids")
  public List<SamlGroupWrite> getGroupsWithRoleIds() {
    return groupsWithRoleIds;
  }

  public void setGroupsWithRoleIds(List<SamlGroupWrite> groupsWithRoleIds) {
    this.groupsWithRoleIds = groupsWithRoleIds;
  }

  public SamlConfig authRequiresRole(Boolean authRequiresRole) {
    this.authRequiresRole = authRequiresRole;
    return this;
  }

   /**
   * Users will not be allowed to login at all unless a role for them is found in Saml if set to true
   * @return authRequiresRole
  **/
  @ApiModelProperty(value = "Users will not be allowed to login at all unless a role for them is found in Saml if set to true")
  public Boolean isAuthRequiresRole() {
    return authRequiresRole;
  }

  public void setAuthRequiresRole(Boolean authRequiresRole) {
    this.authRequiresRole = authRequiresRole;
  }

  public SamlConfig userAttributes(List<SamlUserAttributeRead> userAttributes) {
    this.userAttributes = userAttributes;
    return this;
  }

  public SamlConfig addUserAttributesItem(SamlUserAttributeRead userAttributesItem) {
    if (this.userAttributes == null) {
      this.userAttributes = new ArrayList<SamlUserAttributeRead>();
    }
    this.userAttributes.add(userAttributesItem);
    return this;
  }

   /**
   * (Read-only) Array of mappings between Saml User Attributes and Looker User Attributes
   * @return userAttributes
  **/
  @ApiModelProperty(value = "(Read-only) Array of mappings between Saml User Attributes and Looker User Attributes")
  public List<SamlUserAttributeRead> getUserAttributes() {
    return userAttributes;
  }

  public void setUserAttributes(List<SamlUserAttributeRead> userAttributes) {
    this.userAttributes = userAttributes;
  }

  public SamlConfig userAttributesWithIds(List<SamlUserAttributeWrite> userAttributesWithIds) {
    this.userAttributesWithIds = userAttributesWithIds;
    return this;
  }

  public SamlConfig addUserAttributesWithIdsItem(SamlUserAttributeWrite userAttributesWithIdsItem) {
    if (this.userAttributesWithIds == null) {
      this.userAttributesWithIds = new ArrayList<SamlUserAttributeWrite>();
    }
    this.userAttributesWithIds.add(userAttributesWithIdsItem);
    return this;
  }

   /**
   * (Read/Write) Array of mappings between Saml User Attributes and arrays of Looker User Attribute ids
   * @return userAttributesWithIds
  **/
  @ApiModelProperty(value = "(Read/Write) Array of mappings between Saml User Attributes and arrays of Looker User Attribute ids")
  public List<SamlUserAttributeWrite> getUserAttributesWithIds() {
    return userAttributesWithIds;
  }

  public void setUserAttributesWithIds(List<SamlUserAttributeWrite> userAttributesWithIds) {
    this.userAttributesWithIds = userAttributesWithIds;
  }

  public SamlConfig groupsFinderType(String groupsFinderType) {
    this.groupsFinderType = groupsFinderType;
    return this;
  }

   /**
   * Identifier for a strategy for how Looker will find groups in the SAML response. One of [&#39;grouped_attribute_values&#39;, &#39;individual_attributes&#39;]
   * @return groupsFinderType
  **/
  @ApiModelProperty(value = "Identifier for a strategy for how Looker will find groups in the SAML response. One of ['grouped_attribute_values', 'individual_attributes']")
  public String getGroupsFinderType() {
    return groupsFinderType;
  }

  public void setGroupsFinderType(String groupsFinderType) {
    this.groupsFinderType = groupsFinderType;
  }

  public SamlConfig groupsMemberValue(String groupsMemberValue) {
    this.groupsMemberValue = groupsMemberValue;
    return this;
  }

   /**
   * Value for group attribute used to indicate membership. Used when &#39;groups_finder_type&#39; is set to &#39;individual_attributes&#39;
   * @return groupsMemberValue
  **/
  @ApiModelProperty(value = "Value for group attribute used to indicate membership. Used when 'groups_finder_type' is set to 'individual_attributes'")
  public String getGroupsMemberValue() {
    return groupsMemberValue;
  }

  public void setGroupsMemberValue(String groupsMemberValue) {
    this.groupsMemberValue = groupsMemberValue;
  }

  public SamlConfig bypassLoginPage(Boolean bypassLoginPage) {
    this.bypassLoginPage = bypassLoginPage;
    return this;
  }

   /**
   * Bypass the login page when user authentication is required. Redirect to IdP immediately instead.
   * @return bypassLoginPage
  **/
  @ApiModelProperty(value = "Bypass the login page when user authentication is required. Redirect to IdP immediately instead.")
  public Boolean isBypassLoginPage() {
    return bypassLoginPage;
  }

  public void setBypassLoginPage(Boolean bypassLoginPage) {
    this.bypassLoginPage = bypassLoginPage;
  }

   /**
   * Link to get this item
   * @return url
  **/
  @ApiModelProperty(value = "Link to get this item")
  public String getUrl() {
    return url;
  }

  public SamlConfig can(Map<String, Boolean> can) {
    this.can = can;
    return this;
  }

  public SamlConfig putCanItem(String key, Boolean canItem) {
    if (this.can == null) {
      this.can = new HashMap<String, Boolean>();
    }
    this.can.put(key, canItem);
    return this;
  }

   /**
   * Operations the current user is able to perform on this object
   * @return can
  **/
  @ApiModelProperty(value = "Operations the current user is able to perform on this object")
  public Map<String, Boolean> getCan() {
    return can;
  }

  public void setCan(Map<String, Boolean> can) {
    this.can = can;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfig samlConfig = (SamlConfig) o;
    return Objects.equals(this.enabled, samlConfig.enabled) &&
        Objects.equals(this.idpCert, samlConfig.idpCert) &&
        Objects.equals(this.idpUrl, samlConfig.idpUrl) &&
        Objects.equals(this.idpIssuer, samlConfig.idpIssuer) &&
        Objects.equals(this.idpAudience, samlConfig.idpAudience) &&
        Objects.equals(this.allowedClockDrift, samlConfig.allowedClockDrift) &&
        Objects.equals(this.userAttributeMapEmail, samlConfig.userAttributeMapEmail) &&
        Objects.equals(this.userAttributeMapFirstName, samlConfig.userAttributeMapFirstName) &&
        Objects.equals(this.userAttributeMapLastName, samlConfig.userAttributeMapLastName) &&
        Objects.equals(this.newUserMigrationTypes, samlConfig.newUserMigrationTypes) &&
        Objects.equals(this.alternateEmailLoginAllowed, samlConfig.alternateEmailLoginAllowed) &&
        Objects.equals(this.testSlug, samlConfig.testSlug) &&
        Objects.equals(this.modifiedAt, samlConfig.modifiedAt) &&
        Objects.equals(this.modifiedBy, samlConfig.modifiedBy) &&
        Objects.equals(this.defaultNewUserRoles, samlConfig.defaultNewUserRoles) &&
        Objects.equals(this.defaultNewUserGroups, samlConfig.defaultNewUserGroups) &&
        Objects.equals(this.defaultNewUserRoleIds, samlConfig.defaultNewUserRoleIds) &&
        Objects.equals(this.defaultNewUserGroupIds, samlConfig.defaultNewUserGroupIds) &&
        Objects.equals(this.setRolesFromGroups, samlConfig.setRolesFromGroups) &&
        Objects.equals(this.groupsAttribute, samlConfig.groupsAttribute) &&
        Objects.equals(this.groups, samlConfig.groups) &&
        Objects.equals(this.groupsWithRoleIds, samlConfig.groupsWithRoleIds) &&
        Objects.equals(this.authRequiresRole, samlConfig.authRequiresRole) &&
        Objects.equals(this.userAttributes, samlConfig.userAttributes) &&
        Objects.equals(this.userAttributesWithIds, samlConfig.userAttributesWithIds) &&
        Objects.equals(this.groupsFinderType, samlConfig.groupsFinderType) &&
        Objects.equals(this.groupsMemberValue, samlConfig.groupsMemberValue) &&
        Objects.equals(this.bypassLoginPage, samlConfig.bypassLoginPage) &&
        Objects.equals(this.url, samlConfig.url) &&
        Objects.equals(this.can, samlConfig.can);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, idpCert, idpUrl, idpIssuer, idpAudience, allowedClockDrift, userAttributeMapEmail, userAttributeMapFirstName, userAttributeMapLastName, newUserMigrationTypes, alternateEmailLoginAllowed, testSlug, modifiedAt, modifiedBy, defaultNewUserRoles, defaultNewUserGroups, defaultNewUserRoleIds, defaultNewUserGroupIds, setRolesFromGroups, groupsAttribute, groups, groupsWithRoleIds, authRequiresRole, userAttributes, userAttributesWithIds, groupsFinderType, groupsMemberValue, bypassLoginPage, url, can);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    idpCert: ").append(toIndentedString(idpCert)).append("\n");
    sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
    sb.append("    idpIssuer: ").append(toIndentedString(idpIssuer)).append("\n");
    sb.append("    idpAudience: ").append(toIndentedString(idpAudience)).append("\n");
    sb.append("    allowedClockDrift: ").append(toIndentedString(allowedClockDrift)).append("\n");
    sb.append("    userAttributeMapEmail: ").append(toIndentedString(userAttributeMapEmail)).append("\n");
    sb.append("    userAttributeMapFirstName: ").append(toIndentedString(userAttributeMapFirstName)).append("\n");
    sb.append("    userAttributeMapLastName: ").append(toIndentedString(userAttributeMapLastName)).append("\n");
    sb.append("    newUserMigrationTypes: ").append(toIndentedString(newUserMigrationTypes)).append("\n");
    sb.append("    alternateEmailLoginAllowed: ").append(toIndentedString(alternateEmailLoginAllowed)).append("\n");
    sb.append("    testSlug: ").append(toIndentedString(testSlug)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    defaultNewUserRoles: ").append(toIndentedString(defaultNewUserRoles)).append("\n");
    sb.append("    defaultNewUserGroups: ").append(toIndentedString(defaultNewUserGroups)).append("\n");
    sb.append("    defaultNewUserRoleIds: ").append(toIndentedString(defaultNewUserRoleIds)).append("\n");
    sb.append("    defaultNewUserGroupIds: ").append(toIndentedString(defaultNewUserGroupIds)).append("\n");
    sb.append("    setRolesFromGroups: ").append(toIndentedString(setRolesFromGroups)).append("\n");
    sb.append("    groupsAttribute: ").append(toIndentedString(groupsAttribute)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    groupsWithRoleIds: ").append(toIndentedString(groupsWithRoleIds)).append("\n");
    sb.append("    authRequiresRole: ").append(toIndentedString(authRequiresRole)).append("\n");
    sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
    sb.append("    userAttributesWithIds: ").append(toIndentedString(userAttributesWithIds)).append("\n");
    sb.append("    groupsFinderType: ").append(toIndentedString(groupsFinderType)).append("\n");
    sb.append("    groupsMemberValue: ").append(toIndentedString(groupsMemberValue)).append("\n");
    sb.append("    bypassLoginPage: ").append(toIndentedString(bypassLoginPage)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    can: ").append(toIndentedString(can)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
