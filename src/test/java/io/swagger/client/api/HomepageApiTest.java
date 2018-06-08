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
import io.swagger.client.model.HomepageItem;
import io.swagger.client.model.HomepageSection;
import io.swagger.client.model.ValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HomepageApi
 */
@Ignore
public class HomepageApiTest {

    private final HomepageApi api = new HomepageApi();

    
    /**
     * Get All Homepage Items
     *
     * ### Get information about all homepage items. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allHomepageItemsTest() throws ApiException {
        String fields = null;
        String sorts = null;
        String homepageSectionId = null;
        List<HomepageItem> response = api.allHomepageItems(fields, sorts, homepageSectionId);

        // TODO: test validations
    }
    
    /**
     * Get All Homepage sections
     *
     * ### Get information about all homepage sections. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allHomepageSectionsTest() throws ApiException {
        String fields = null;
        String sorts = null;
        List<HomepageSection> response = api.allHomepageSections(fields, sorts);

        // TODO: test validations
    }
    
    /**
     * Create Homepage Item
     *
     * ### Create a new homepage item. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHomepageItemTest() throws ApiException {
        HomepageItem body = null;
        String fields = null;
        HomepageItem response = api.createHomepageItem(body, fields);

        // TODO: test validations
    }
    
    /**
     * Create Homepage section
     *
     * ### Create a new homepage section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHomepageSectionTest() throws ApiException {
        HomepageSection body = null;
        String fields = null;
        HomepageSection response = api.createHomepageSection(body, fields);

        // TODO: test validations
    }
    
    /**
     * Delete Homepage Item
     *
     * ### Delete a homepage item. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHomepageItemTest() throws ApiException {
        Long homepageItemId = null;
        String response = api.deleteHomepageItem(homepageItemId);

        // TODO: test validations
    }
    
    /**
     * Delete Homepage section
     *
     * ### Delete a homepage section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHomepageSectionTest() throws ApiException {
        Long homepageSectionId = null;
        String response = api.deleteHomepageSection(homepageSectionId);

        // TODO: test validations
    }
    
    /**
     * Get Homepage Item
     *
     * ### Get information about a homepage item. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void homepageItemTest() throws ApiException {
        Long homepageItemId = null;
        String fields = null;
        HomepageItem response = api.homepageItem(homepageItemId, fields);

        // TODO: test validations
    }
    
    /**
     * Get Homepage section
     *
     * ### Get information about a homepage section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void homepageSectionTest() throws ApiException {
        Long homepageSectionId = null;
        String fields = null;
        HomepageSection response = api.homepageSection(homepageSectionId, fields);

        // TODO: test validations
    }
    
    /**
     * Update Homepage Item
     *
     * ### Update a homepage item definition. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHomepageItemTest() throws ApiException {
        Long homepageItemId = null;
        HomepageItem body = null;
        String fields = null;
        HomepageItem response = api.updateHomepageItem(homepageItemId, body, fields);

        // TODO: test validations
    }
    
    /**
     * Update Homepage section
     *
     * ### Update a homepage section definition. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHomepageSectionTest() throws ApiException {
        Long homepageSectionId = null;
        HomepageSection body = null;
        String fields = null;
        HomepageSection response = api.updateHomepageSection(homepageSectionId, body, fields);

        // TODO: test validations
    }
    
}
