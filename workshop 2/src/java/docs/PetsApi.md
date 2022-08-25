# PetsApi

All URIs are relative to *http://petstore.swagger.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPets**](PetsApi.md#createPets) | **POST** /pet | Create a pet |
| [**listPets**](PetsApi.md#listPets) | **GET** /pet | List all pets |
| [**showPetById**](PetsApi.md#showPetById) | **GET** /pet/{petId} | Info for a specific pet |


<a name="createPets"></a>
# **createPets**
> createPets()

Create a pet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://petstore.swagger.io/v2");

    PetsApi apiInstance = new PetsApi(defaultClient);
    try {
      apiInstance.createPets();
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#createPets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Null response |  -  |
| **0** | unexpected error |  -  |

<a name="listPets"></a>
# **listPets**
> List&lt;Pet&gt; listPets(limit)

List all pets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://petstore.swagger.io/v2");

    PetsApi apiInstance = new PetsApi(defaultClient);
    Integer limit = 56; // Integer | How many items to return at one time (max 100)
    try {
      List<Pet> result = apiInstance.listPets(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#listPets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| How many items to return at one time (max 100) | [optional] |

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged array of pets |  * x-next - A link to the next page of responses <br>  |
| **0** | unexpected error |  -  |

<a name="showPetById"></a>
# **showPetById**
> Pet showPetById(petId)

Info for a specific pet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://petstore.swagger.io/v2");

    PetsApi apiInstance = new PetsApi(defaultClient);
    String petId = "petId_example"; // String | The id of the pet to retrieve
    try {
      Pet result = apiInstance.showPetById(petId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#showPetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **petId** | **String**| The id of the pet to retrieve | |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response to a valid request |  -  |
| **0** | unexpected error |  -  |

