
# ScheduledPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when ScheduledPlan was created |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when ScheduledPlan was last updated |  [optional]
**title** | **String** | Title |  [optional]
**userId** | **Long** | User Id which owns this ScheduledPlan |  [optional]
**user** | [**UserPublic**](UserPublic.md) | User who owns this ScheduledPlan |  [optional]
**runAsRecipient** | **Boolean** | Whether schedule is ran as recipient (only applicable for email recipients) |  [optional]
**enabled** | **Boolean** | Whether the ScheduledPlan is enabled |  [optional]
**nextRunAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the ScheduledPlan will next run (null if running once) |  [optional]
**lastRunAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the ScheduledPlan was last run |  [optional]
**lookId** | **Long** | Id of a look |  [optional]
**dashboardId** | **Long** | Id of a dashboard |  [optional]
**lookmlDashboardId** | **String** | Id of a LookML dashboard |  [optional]
**filtersString** | **String** | Query string to run look or dashboard with |  [optional]
**dashboardFilters** | **String** | Alias for filters_string field |  [optional]
**requireResults** | **Boolean** | Delivery should occur if running the dashboard or look returns results |  [optional]
**requireNoResults** | **Boolean** | Delivery should occur if the dashboard look does not return results |  [optional]
**requireChange** | **Boolean** | Delivery should occur if data have changed since the last run |  [optional]
**sendAllResults** | **Boolean** | Will run an unlimited query and send all results. |  [optional]
**crontab** | **String** | Vixie-Style crontab specification when to run |  [optional]
**datagroup** | **String** | Name of a datagroup; if specified will run when datagroup triggered (can&#39;t be used with cron string) |  [optional]
**timezone** | **String** | Timezone for interpreting the specified crontab (default is Looker instance timezone) |  [optional]
**queryId** | **String** | Query id |  [optional]
**scheduledPlanDestination** | [**List&lt;ScheduledPlanDestination&gt;**](ScheduledPlanDestination.md) | Scheduled plan destinations |  [optional]
**runOnce** | **Boolean** | Whether the plan in question should only be run once (usually for testing) |  [optional]
**includeLinks** | **Boolean** | Whether links back to Looker should be included in this ScheduledPlan |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]



