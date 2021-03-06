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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.ScheduledPlan;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledPlanApi
 */
@Ignore
public class ScheduledPlanApiTest {

    private final ScheduledPlanApi api = new ScheduledPlanApi();

    
    /**
     * Get All Scheduled Plans
     *
     * ### List all scheduled plans which belong to the requesting user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allScheduledPlansTest() throws ApiException {
        Long userId = null;
        String fields = null;
        List<ScheduledPlan> response = api.allScheduledPlans(userId, fields);

        // TODO: test validations
    }
    
    /**
     * Create Scheduled Plan
     *
     * ### Schedule a Look or Dashboard by creating a scheduled plan.  Admins can create scheduled plans on behalf of other users by specifying a user id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createScheduledPlanTest() throws ApiException {
        ScheduledPlan body = null;
        ScheduledPlan response = api.createScheduledPlan(body);

        // TODO: test validations
    }
    
    /**
     * Delete Scheduled Plan
     *
     * ### Delete the scheduled plan with the specified id.  Admins can delete other users&#39; Scheduled Plans. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteScheduledPlanTest() throws ApiException {
        Long scheduledPlanId = null;
        String response = api.deleteScheduledPlan(scheduledPlanId);

        // TODO: test validations
    }
    
    /**
     * Get Scheduled Plan
     *
     * ### Get information about a scheduled plan.  Admins can fetch information about other users&#39; Scheduled Plans. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlanTest() throws ApiException {
        Long scheduledPlanId = null;
        String fields = null;
        ScheduledPlan response = api.scheduledPlan(scheduledPlanId, fields);

        // TODO: test validations
    }
    
    /**
     * Run Scheduled Plan Once
     *
     * ### Schedule a Look or Dashboard to run once _now_ with a scheduled plan.  This can be useful for testing a Scheduled Plan before committing to a production schedule.  Admins can create scheduled plans on behalf of other users by specifying a user id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlanRunOnceTest() throws ApiException {
        ScheduledPlan body = null;
        ScheduledPlan response = api.scheduledPlanRunOnce(body);

        // TODO: test validations
    }
    
    /**
     * Scheduled Plans for Dashboard
     *
     * ### Get scheduled plans by using a dashboard id for the requesting user or a specified user id (with :see_schedules permission) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlansForDashboardTest() throws ApiException {
        Long dashboardId = null;
        Long userId = null;
        String fields = null;
        List<ScheduledPlan> response = api.scheduledPlansForDashboard(dashboardId, userId, fields);

        // TODO: test validations
    }
    
    /**
     * Scheduled Plans for Look
     *
     * ### Get scheduled plans by using a look id for the requesting user or a specified user id (with :see_schedules permission) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlansForLookTest() throws ApiException {
        Long lookId = null;
        Long userId = null;
        String fields = null;
        List<ScheduledPlan> response = api.scheduledPlansForLook(lookId, userId, fields);

        // TODO: test validations
    }
    
    /**
     * Scheduled Plans for LookML Dashboard
     *
     * ### Get scheduled plans by using a LookML dashboard id for the requesting user or a specified user id (with :see_schedules permission) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlansForLookmlDashboardTest() throws ApiException {
        Long lookmlDashboardId = null;
        Long userId = null;
        String fields = null;
        List<ScheduledPlan> response = api.scheduledPlansForLookmlDashboard(lookmlDashboardId, userId, fields);

        // TODO: test validations
    }
    
    /**
     * Scheduled Plans for Space
     *
     * ### Get scheduled plans by using a space id for the requesting user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduledPlansForSpaceTest() throws ApiException {
        Long spaceId = null;
        String fields = null;
        List<ScheduledPlan> response = api.scheduledPlansForSpace(spaceId, fields);

        // TODO: test validations
    }
    
    /**
     * Update Scheduled Plan
     *
     * ### Update the scheduled plan with the specified id.  Admins can update other users&#39; Scheduled Plans. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateScheduledPlanTest() throws ApiException {
        Long scheduledPlanId = null;
        ScheduledPlan body = null;
        ScheduledPlan response = api.updateScheduledPlan(scheduledPlanId, body);

        // TODO: test validations
    }
    
}
