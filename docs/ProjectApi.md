# ProjectApi

All URIs are relative to *https://xxxxxxx.sys.xxxxxx.xxxx:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allGitBranches**](ProjectApi.md#allGitBranches) | **GET** /projects/{project_id}/git_branches | Get All Git Branchs
[**allGitConnectionTests**](ProjectApi.md#allGitConnectionTests) | **GET** /projects/{project_id}/git_connection_tests | Get All Git Connection Tests
[**allProjectFiles**](ProjectApi.md#allProjectFiles) | **GET** /projects/{project_id}/files | Get All Project Files
[**allProjects**](ProjectApi.md#allProjects) | **GET** /projects | Get All Projects
[**createGitDeployKey**](ProjectApi.md#createGitDeployKey) | **POST** /projects/{project_id}/git/deploy_key | Create Deploy Key
[**createProject**](ProjectApi.md#createProject) | **POST** /projects | Create Project
[**gitDeployKey**](ProjectApi.md#gitDeployKey) | **GET** /projects/{project_id}/git/deploy_key | Git Deploy Key
[**project**](ProjectApi.md#project) | **GET** /projects/{project_id} | Get Project
[**projectFile**](ProjectApi.md#projectFile) | **GET** /projects/{project_id}/files/file | Get Project File
[**projectValidationResults**](ProjectApi.md#projectValidationResults) | **GET** /projects/{project_id}/validate | Cached Project Validation Results
[**projectWorkspace**](ProjectApi.md#projectWorkspace) | **GET** /projects/{project_id}/current_workspace | Get Project Workspace
[**resetProjectToProduction**](ProjectApi.md#resetProjectToProduction) | **POST** /projects/{project_id}/reset_to_production | Reset To Production
[**resetProjectToRemote**](ProjectApi.md#resetProjectToRemote) | **POST** /projects/{project_id}/reset_to_remote | Reset To Remote
[**runGitConnectionTest**](ProjectApi.md#runGitConnectionTest) | **GET** /projects/{project_id}/git_connection_tests/{test_id} | Run Git Connection Test
[**updateProject**](ProjectApi.md#updateProject) | **PATCH** /projects/{project_id} | Update Project
[**validateProject**](ProjectApi.md#validateProject) | **POST** /projects/{project_id}/validate | Validate Project


<a name="allGitBranches"></a>
# **allGitBranches**
> List&lt;GitBranch&gt; allGitBranches(projectId)

Get All Git Branchs

### Get All Git Branches  Returns a list of git branches in the project repository 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    List<GitBranch> result = apiInstance.allGitBranches(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allGitBranches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |

### Return type

[**List&lt;GitBranch&gt;**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allGitConnectionTests"></a>
# **allGitConnectionTests**
> List&lt;GitConnectionTest&gt; allGitConnectionTests(projectId)

Get All Git Connection Tests

### Get All Git Connection Tests  Returns a list of tests which can be run against a project&#39;s git connection 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    List<GitConnectionTest> result = apiInstance.allGitConnectionTests(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allGitConnectionTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |

### Return type

[**List&lt;GitConnectionTest&gt;**](GitConnectionTest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allProjectFiles"></a>
# **allProjectFiles**
> List&lt;ProjectFile&gt; allProjectFiles(projectId, fields)

Get All Project Files

### Get All Project Files  Returns a list of the files in the project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    List<ProjectFile> result = apiInstance.allProjectFiles(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allProjectFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**List&lt;ProjectFile&gt;**](ProjectFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allProjects"></a>
# **allProjects**
> List&lt;Project&gt; allProjects(fields)

Get All Projects

### Get All Projects  Returns all projects visible to the current user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String fields = "fields_example"; // String | Requested fields
try {
    List<Project> result = apiInstance.allProjects(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Requested fields | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGitDeployKey"></a>
# **createGitDeployKey**
> String createGitDeployKey(projectId)

Create Deploy Key

### Create Git Deploy Key  Create a public/private key pair for authenticating ssh git requests from Looker to a remote git repository for a particular Looker project.  Returns the public key of the generated ssh key pair.  Copy this public key to your remote git repository&#39;s ssh keys configuration so that the remote git service can validate and accept git requests from the Looker server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    String result = apiInstance.createGitDeployKey(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createGitDeployKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="createProject"></a>
# **createProject**
> Project createProject(body)

Create Project

### Create A Project  dev mode required. - Call &#x60;update_session&#x60; to select the &#39;dev&#39; workspace.  &#x60;name&#x60; is required. &#x60;git_remote_url&#x60; is not allowed. To configure Git for the newly created project, follow the instructions in &#x60;update_project&#x60;.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project body = new Project(); // Project | Project
try {
    Project result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| Project | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gitDeployKey"></a>
# **gitDeployKey**
> String gitDeployKey(projectId)

Git Deploy Key

### Git Deploy Key  Returns the ssh public key previously created for a project&#39;s git repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    String result = apiInstance.gitDeployKey(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#gitDeployKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="project"></a>
# **project**
> Project project(projectId, fields)

Get Project

### Get A Project  Returns the project with the given project id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    Project result = apiInstance.project(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#project");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="projectFile"></a>
# **projectFile**
> ProjectFile projectFile(projectId, fileId, fields)

Get Project File

### Get Project File Info  Returns information about a file in the project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fileId = "fileId_example"; // String | File Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectFile result = apiInstance.projectFile(projectId, fileId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fileId** | **String**| File Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**ProjectFile**](ProjectFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="projectValidationResults"></a>
# **projectValidationResults**
> ProjectValidationCache projectValidationResults(projectId, fields)

Cached Project Validation Results

### Get Cached Project Validation Results  Returns the cached results of a previous project validation calculation, if any. Returns http status 204 No Content if no validation results exist.  Validating the content of all the files in a project can be computationally intensive for large projects. Use this API to simply fetch the results of the most recent project validation rather than revalidating the entire project from scratch.  A value of &#x60;\&quot;stale\&quot;: true&#x60; in the response indicates that the project has changed since the cached validation results were computed. The cached validation results may no longer reflect the current state of the project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectValidationCache result = apiInstance.projectValidationResults(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectValidationResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**ProjectValidationCache**](ProjectValidationCache.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="projectWorkspace"></a>
# **projectWorkspace**
> ProjectWorkspace projectWorkspace(projectId, fields)

Get Project Workspace

### Get Project Workspace  Returns information about the state of the project files in the currently selected workspace 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectWorkspace result = apiInstance.projectWorkspace(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**ProjectWorkspace**](ProjectWorkspace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetProjectToProduction"></a>
# **resetProjectToProduction**
> String resetProjectToProduction(projectId)

Reset To Production

### Reset a project to the revision of the project that is in production.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Id of project
try {
    String result = apiInstance.resetProjectToProduction(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#resetProjectToProduction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Id of project |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetProjectToRemote"></a>
# **resetProjectToRemote**
> String resetProjectToRemote(projectId)

Reset To Remote

### Reset a project development branch to the revision of the project that is on the remote.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Id of project
try {
    String result = apiInstance.resetProjectToRemote(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#resetProjectToRemote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Id of project |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runGitConnectionTest"></a>
# **runGitConnectionTest**
> GitConnectionTestResult runGitConnectionTest(projectId, testId)

Run Git Connection Test

### Run a git connection test  Run the named test on the git service used by this project and return the result. This is intended to help debug git connections when things do not work properly, to give more helpful information about why a git url is not working with Looker. They are intended to be run in the order they are returned from the /projects/ID/git_connection_tests endpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String testId = "testId_example"; // String | Test Id
try {
    GitConnectionTestResult result = apiInstance.runGitConnectionTest(projectId, testId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#runGitConnectionTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **testId** | **String**| Test Id |

### Return type

[**GitConnectionTestResult**](GitConnectionTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> Project updateProject(projectId, body, fields)

Update Project

### Update Project Configuration  Apply changes to a project&#39;s configuration.   #### Configuring Git for a Project  To set up a Looker project with a remote git repository, follow these steps:  1. Call &#x60;update_session&#x60; to select the &#39;dev&#39; workspace. 1. Call &#x60;create_git_deploy_key&#x60; to create a new deploy key for the project 1. Copy the deploy key text into the remote git repository&#39;s ssh key configuration 1. Call &#x60;update_project&#x60; to set project&#39;s &#x60;git_remote_url&#x60; ()and &#x60;git_service_name&#x60;, if necessary).  When you modify a project&#39;s &#x60;git_remote_url&#x60;, Looker connects to the remote repository to fetch metadata. The remote git repository MUST be configured with the Looker-generated deploy key for this project prior to setting the project&#39;s &#x60;git_remote_url&#x60;.  To set up a Looker project with a git repository residing on the Looker server (a &#39;bare&#39; git repo): 1. Call &#x60;update_session&#x60; to select the &#39;dev&#39; workspace. 1. Call &#x60;update_project&#x60; setting &#x60;git_remote_url&#x60; to nil and &#x60;git_service_name&#x60; to \&quot;bare\&quot;.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
Project body = new Project(); // Project | Project
String fields = "fields_example"; // String | Requested fields
try {
    Project result = apiInstance.updateProject(projectId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **body** | [**Project**](Project.md)| Project |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateProject"></a>
# **validateProject**
> ProjectValidation validateProject(projectId, fields)

Validate Project

### Validate Project  Performs lint validation of all lookml files in the project. Returns a list of errors found, if any.  Validating the content of all the files in a project can be computationally intensive for large projects. For best performance, call &#x60;validate_project(project_id)&#x60; only when you really want to recompute project validation. To quickly display the results of the most recent project validation (without recomputing), use &#x60;project_validation_results(project_id)&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectValidation result = apiInstance.validateProject(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#validateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project Id |
 **fields** | **String**| Requested fields | [optional]

### Return type

[**ProjectValidation**](ProjectValidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

