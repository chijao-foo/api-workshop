# openapi_client.PetsApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_pets**](PetsApi.md#create_pets) | **POST** /pet | Create a pet
[**list_pets**](PetsApi.md#list_pets) | **GET** /pet | List all pets
[**show_pet_by_id**](PetsApi.md#show_pet_by_id) | **GET** /pet/{petId} | Info for a specific pet


# **create_pets**
> create_pets()

Create a pet

### Example


```python
import time
import openapi_client
from openapi_client.api import pets_api
from openapi_client.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://petstore.swagger.io/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pets_api.PetsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Create a pet
        api_instance.create_pets()
    except openapi_client.ApiException as e:
        print("Exception when calling PetsApi->create_pets: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Null response |  -  |
**0** | unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_pets**
> Pets list_pets()

List all pets

### Example


```python
import time
import openapi_client
from openapi_client.api import pets_api
from openapi_client.model.error import Error
from openapi_client.model.pets import Pets
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://petstore.swagger.io/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pets_api.PetsApi(api_client)
    limit = 1 # int | How many items to return at one time (max 100) (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List all pets
        api_response = api_instance.list_pets(limit=limit)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling PetsApi->list_pets: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| How many items to return at one time (max 100) | [optional]

### Return type

[**Pets**](Pets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged array of pets |  * x-next - A link to the next page of responses <br>  |
**0** | unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **show_pet_by_id**
> Pet show_pet_by_id(pet_id)

Info for a specific pet

### Example


```python
import time
import openapi_client
from openapi_client.api import pets_api
from openapi_client.model.error import Error
from openapi_client.model.pet import Pet
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://petstore.swagger.io/v2"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pets_api.PetsApi(api_client)
    pet_id = "petId_example" # str | The id of the pet to retrieve

    # example passing only required values which don't have defaults set
    try:
        # Info for a specific pet
        api_response = api_instance.show_pet_by_id(pet_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling PetsApi->show_pet_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pet_id** | **str**| The id of the pet to retrieve |

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
**200** | Expected response to a valid request |  -  |
**0** | unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

