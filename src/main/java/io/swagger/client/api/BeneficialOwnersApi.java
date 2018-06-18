package io.swagger.client.api;

import com.sun.jersey.multipart.FormDataMultiPart;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.model.BeneficialOwner;
import io.swagger.client.model.CertifyBeneficialOwner;
import io.swagger.client.model.CreateBeneficialOwner;
import io.swagger.client.model.CreateCustomer;
import io.swagger.client.model.Customer;
import io.swagger.client.model.Unit$;
import io.swagger.client.model.UpdateCustomer;
import sun.util.resources.et.CalendarData_et;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BeneficialOwnersApi {
    private ApiClient apiClient;

    private String[] authNames = new String[] { "oauth2" };

    public BeneficialOwnersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BeneficialOwnersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new beneficial owner.
     *
     * @param body Beneficial Owner to create.
     * @return Unit$
     */
    public Unit$ create (CreateBeneficialOwner body, String customerId) throws ApiException {
        Object postBody = body;

        // create path and map variables
        String path = "/customers/{id}/beneficial-owners".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(customerId));;

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, String> formParams = new HashMap<String, String>();

        final String[] accepts = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        try {
            String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
            if(response != null){
                return (Unit$) apiClient.deserialize(response, "", Unit$.class);
            }
            else {
                return null;
            }
        } catch (ApiException ex) {
            throw ex;
        }
    }

    /**
     * Get a beneficial owner by id
     *
     * @param id Id of beneficial owner to get.
     * @return BeneficialOwner
     */
    public BeneficialOwner getBeneficialOwner (String id) throws ApiException {
        Object postBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getBeneficialOwner");
        }



        // if a URL is provided, extract the ID
        URL u;
        try {
            u = new URL(id);
            id = id.substring(id.lastIndexOf('/') + 1);
        }
        catch (MalformedURLException mue) {
            u = null;
        }


        // create path and map variables
        String path = "/beneficial-owners/{id}".replaceAll("\\{format\\}","json")
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, String> formParams = new HashMap<String, String>();





        final String[] accepts = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        if(contentType.startsWith("multipart/form-data")) {
            boolean hasFields = false;
            FormDataMultiPart mp = new FormDataMultiPart();

            if(hasFields)
                postBody = mp;
        }
        else {

        }

        try {
            String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
            if(response != null){
                return (BeneficialOwner) apiClient.deserialize(response, "", BeneficialOwner.class);
            }
            else {
                return null;
            }
        } catch (ApiException ex) {
            throw ex;
        }
    }


    /**
     * Change the certification status of business verified Customer account
     *
     * @param body CertifyBeneficialOwner.
     * @param customerId Id of associated beneficial-owners to certify.
     * @return CertifyBeneficialOwner
     */
    public CertifyBeneficialOwner certify (CertifyBeneficialOwner body, String customerId) throws ApiException {
        Object postBody = body;

        // create path and map variables
        String path = "/customers/{id}/beneficial-ownership".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(customerId));;

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, String> formParams = new HashMap<String, String>();

        final String[] accepts = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        try {
            String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
            if(response != null){
                return (CertifyBeneficialOwner) apiClient.deserialize(response, "", CertifyBeneficialOwner.class);
            }
            else {
                return null;
            }
        } catch (ApiException ex) {
            throw ex;
        }
    }

    /**
     * Update beneficial owner record. Beneficial owner's record can be updated only if verification status is incomplete.
     *
     * @param body BeneficialOwner to update.
     * @param id Id of beneficial-owner to update.
     * @return BeneficialOwner
     */
    public BeneficialOwner updateBeneficialOwner (CreateBeneficialOwner body, String id) throws ApiException {
        Object postBody = body;

        // create path and map variables
        String path = "/beneficial-owners/{id}".replaceAll("\\{format\\}","json")
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, String> formParams = new HashMap<String, String>();

        final String[] accepts = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {
                "application/vnd.dwolla.v1.hal+json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        try {
            String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
            if(response != null){
                return (BeneficialOwner) apiClient.deserialize(response, "", BeneficialOwner.class);
            }
            else {
                return null;
            }
        } catch (ApiException ex) {
            throw ex;
        }
    }

}
