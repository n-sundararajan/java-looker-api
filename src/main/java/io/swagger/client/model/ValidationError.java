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
import io.swagger.client.model.ValidationErrorDetail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidationError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-08T15:12:41.902+05:30")
public class ValidationError {
  @SerializedName("message")
  private String message = null;

  @SerializedName("errors")
  private List<ValidationErrorDetail> errors = null;

  @SerializedName("documentation_url")
  private String documentationUrl = null;

   /**
   * Error details
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Error details")
  public String getMessage() {
    return message;
  }

  public ValidationError errors(List<ValidationErrorDetail> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationError addErrorsItem(ValidationErrorDetail errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationErrorDetail>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error detail array
   * @return errors
  **/
  @ApiModelProperty(value = "Error detail array")
  public List<ValidationErrorDetail> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationErrorDetail> errors) {
    this.errors = errors;
  }

   /**
   * Documentation link
   * @return documentationUrl
  **/
  @ApiModelProperty(required = true, value = "Documentation link")
  public String getDocumentationUrl() {
    return documentationUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.message, validationError.message) &&
        Objects.equals(this.errors, validationError.errors) &&
        Objects.equals(this.documentationUrl, validationError.documentationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errors, documentationUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
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

