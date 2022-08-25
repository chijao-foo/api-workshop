/*
 * Swagger Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PetsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PetsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createPets
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPetsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPetsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createPetsCall(_callback);
        return localVarCall;

    }

    /**
     * Create a pet
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void createPets() throws ApiException {
        createPetsWithHttpInfo();
    }

    /**
     * Create a pet
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createPetsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = createPetsValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create a pet (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPetsAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPetsValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPets
     * @param limit How many items to return at one time (max 100) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of pets </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPetsCall(Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPetsValidateBeforeCall(Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPetsCall(limit, _callback);
        return localVarCall;

    }

    /**
     * List all pets
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @return List&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of pets </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<Pet> listPets(Integer limit) throws ApiException {
        ApiResponse<List<Pet>> localVarResp = listPetsWithHttpInfo(limit);
        return localVarResp.getData();
    }

    /**
     * List all pets
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of pets </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Pet>> listPetsWithHttpInfo(Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listPetsValidateBeforeCall(limit, null);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all pets (asynchronously)
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of pets </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPetsAsync(Integer limit, final ApiCallback<List<Pet>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPetsValidateBeforeCall(limit, _callback);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for showPetById
     * @param petId The id of the pet to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showPetByIdCall(String petId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pet/{petId}"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call showPetByIdValidateBeforeCall(String petId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling showPetById(Async)");
        }
        

        okhttp3.Call localVarCall = showPetByIdCall(petId, _callback);
        return localVarCall;

    }

    /**
     * Info for a specific pet
     * 
     * @param petId The id of the pet to retrieve (required)
     * @return Pet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Pet showPetById(String petId) throws ApiException {
        ApiResponse<Pet> localVarResp = showPetByIdWithHttpInfo(petId);
        return localVarResp.getData();
    }

    /**
     * Info for a specific pet
     * 
     * @param petId The id of the pet to retrieve (required)
     * @return ApiResponse&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Pet> showPetByIdWithHttpInfo(String petId) throws ApiException {
        okhttp3.Call localVarCall = showPetByIdValidateBeforeCall(petId, null);
        Type localVarReturnType = new TypeToken<Pet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Info for a specific pet (asynchronously)
     * 
     * @param petId The id of the pet to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showPetByIdAsync(String petId, final ApiCallback<Pet> _callback) throws ApiException {

        okhttp3.Call localVarCall = showPetByIdValidateBeforeCall(petId, _callback);
        Type localVarReturnType = new TypeToken<Pet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
