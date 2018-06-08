
# LookmlModelExplore

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Fully qualified name model plus explore name |  [optional]
**name** | **String** | Explore name |  [optional]
**description** | **String** | Description |  [optional]
**label** | **String** | Label |  [optional]
**scopes** | **List&lt;String&gt;** | Scopes |  [optional]
**canTotal** | **Boolean** | Can Total |  [optional]
**canSave** | **Boolean** | Can Save |  [optional]
**canExplain** | **Boolean** | Can Explain |  [optional]
**canPivotInDb** | **Boolean** | Can pivot in the DB |  [optional]
**hasTimezoneSupport** | **Boolean** | Has timezone support |  [optional]
**supportsCostEstimate** | **Boolean** | Cost estimates supported |  [optional]
**connectionName** | **String** | Connection name |  [optional]
**nullSortTreatment** | **String** | How nulls are sorted, possible values are \&quot;low\&quot;, \&quot;high\&quot;, \&quot;first\&quot; and \&quot;last\&quot; |  [optional]
**files** | **List&lt;String&gt;** | List of model source files |  [optional]
**sourceFile** | **String** | Primary source_file file |  [optional]
**projectName** | **String** | Name of project |  [optional]
**modelName** | **String** | Name of model |  [optional]
**viewName** | **String** | Name of view |  [optional]
**hidden** | **Boolean** | Is hidden |  [optional]
**sqlTableName** | **String** | A sql_table_name expression that defines what sql table the view/explore maps onto. Example: \&quot;prod_orders2 AS orders\&quot; in a view named orders. |  [optional]
**accessFilterFields** | **List&lt;String&gt;** | (DEPRECATED) Array of access filter field names |  [optional]
**accessFilters** | [**List&lt;LookmlModelExploreAccessFilter&gt;**](LookmlModelExploreAccessFilter.md) | Access filters |  [optional]
**aliases** | [**List&lt;LookmlModelExploreAlias&gt;**](LookmlModelExploreAlias.md) | Aliases |  [optional]
**alwaysFilter** | [**List&lt;LookmlModelExploreAlwaysFilter&gt;**](LookmlModelExploreAlwaysFilter.md) | Always filter |  [optional]
**conditionallyFilter** | [**List&lt;LookmlModelExploreConditionallyFilter&gt;**](LookmlModelExploreConditionallyFilter.md) | Conditionally filter |  [optional]
**indexFields** | **List&lt;String&gt;** | Array of index fields |  [optional]
**sets** | [**List&lt;LookmlModelExploreSet&gt;**](LookmlModelExploreSet.md) | Sets |  [optional]
**errors** | [**List&lt;LookmlModelExploreError&gt;**](LookmlModelExploreError.md) | Errors |  [optional]
**fields** | [**LookmlModelExploreFieldset**](LookmlModelExploreFieldset.md) | Fields |  [optional]
**joins** | [**List&lt;LookmlModelExploreJoins&gt;**](LookmlModelExploreJoins.md) | Views joined into this explore |  [optional]
**groupLabel** | **String** | Label used to group explores in the navigation menus |  [optional]



