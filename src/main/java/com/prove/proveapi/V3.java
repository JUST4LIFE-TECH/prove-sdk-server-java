/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.proveapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prove.proveapi.models.errors.SDKError;
import com.prove.proveapi.models.operations.SDKMethodInterfaces.*;
import com.prove.proveapi.utils.HTTPClient;
import com.prove.proveapi.utils.HTTPRequest;
import com.prove.proveapi.utils.Hook.AfterErrorContextImpl;
import com.prove.proveapi.utils.Hook.AfterSuccessContextImpl;
import com.prove.proveapi.utils.Hook.BeforeRequestContextImpl;
import com.prove.proveapi.utils.JSON;
import com.prove.proveapi.utils.Retries.NonRetryableException;
import com.prove.proveapi.utils.SerializedBody;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class V3 implements
            MethodCallV3TokenRequest,
            MethodCallV3ChallengeRequest,
            MethodCallV3CompleteRequest,
            MethodCallV3StartRequest,
            MethodCallV3ValidateRequest {

    private final SDKConfiguration sdkConfiguration;

    V3(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Request OAuth token.
     * Send this request to request the OAuth token.
     * @return The call builder
     */
    public com.prove.proveapi.models.operations.V3TokenRequestRequestBuilder v3TokenRequest() {
        return new com.prove.proveapi.models.operations.V3TokenRequestRequestBuilder(this);
    }

    /**
     * Request OAuth token.
     * Send this request to request the OAuth token.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3TokenRequestResponse v3TokenRequestDirect() throws Exception {
        return v3TokenRequest(Optional.empty());
    }
    /**
     * Request OAuth token.
     * Send this request to request the OAuth token.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3TokenRequestResponse v3TokenRequest(
            Optional<? extends com.prove.proveapi.models.components.V3TokenRequest> request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/token");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.prove.proveapi.models.components.V3TokenRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("V3TokenRequest", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("V3TokenRequest", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("V3TokenRequest", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("V3TokenRequest", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.prove.proveapi.models.operations.V3TokenRequestResponse.Builder _resBuilder = 
            com.prove.proveapi.models.operations.V3TokenRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.prove.proveapi.models.operations.V3TokenRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.components.V3TokenResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.components.V3TokenResponse>() {});
                _res.withV3TokenResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.errors.Error>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Submit challenge.
     * Send this request to submit challenge information. Either a DOB or last 4 of SSN needs to be submitted if neither was submitted to the /start endpoint. It will return a correlation ID, user information, and the next step to call in the flow.
     * @return The call builder
     */
    public com.prove.proveapi.models.operations.V3ChallengeRequestRequestBuilder v3ChallengeRequest() {
        return new com.prove.proveapi.models.operations.V3ChallengeRequestRequestBuilder(this);
    }

    /**
     * Submit challenge.
     * Send this request to submit challenge information. Either a DOB or last 4 of SSN needs to be submitted if neither was submitted to the /start endpoint. It will return a correlation ID, user information, and the next step to call in the flow.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3ChallengeRequestResponse v3ChallengeRequestDirect() throws Exception {
        return v3ChallengeRequest(Optional.empty());
    }
    /**
     * Submit challenge.
     * Send this request to submit challenge information. Either a DOB or last 4 of SSN needs to be submitted if neither was submitted to the /start endpoint. It will return a correlation ID, user information, and the next step to call in the flow.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3ChallengeRequestResponse v3ChallengeRequest(
            Optional<? extends com.prove.proveapi.models.components.V3ChallengeRequest> request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v3/challenge");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.prove.proveapi.models.components.V3ChallengeRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("V3ChallengeRequest", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("V3ChallengeRequest", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("V3ChallengeRequest", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("V3ChallengeRequest", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.prove.proveapi.models.operations.V3ChallengeRequestResponse.Builder _resBuilder = 
            com.prove.proveapi.models.operations.V3ChallengeRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.prove.proveapi.models.operations.V3ChallengeRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.components.V3ChallengeResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.components.V3ChallengeResponse>() {});
                _res.withV3ChallengeResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.errors.Error>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Complete flow.
     * Send this request to verify the user and complete the flow. It will return a correlation ID, user information, and the next step to call in the flow.
     * @return The call builder
     */
    public com.prove.proveapi.models.operations.V3CompleteRequestRequestBuilder v3CompleteRequest() {
        return new com.prove.proveapi.models.operations.V3CompleteRequestRequestBuilder(this);
    }

    /**
     * Complete flow.
     * Send this request to verify the user and complete the flow. It will return a correlation ID, user information, and the next step to call in the flow.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3CompleteRequestResponse v3CompleteRequestDirect() throws Exception {
        return v3CompleteRequest(Optional.empty());
    }
    /**
     * Complete flow.
     * Send this request to verify the user and complete the flow. It will return a correlation ID, user information, and the next step to call in the flow.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3CompleteRequestResponse v3CompleteRequest(
            Optional<? extends com.prove.proveapi.models.components.V3CompleteRequest> request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v3/complete");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.prove.proveapi.models.components.V3CompleteRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("V3CompleteRequest", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("V3CompleteRequest", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("V3CompleteRequest", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("V3CompleteRequest", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.prove.proveapi.models.operations.V3CompleteRequestResponse.Builder _resBuilder = 
            com.prove.proveapi.models.operations.V3CompleteRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.prove.proveapi.models.operations.V3CompleteRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.components.V3CompleteResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.components.V3CompleteResponse>() {});
                _res.withV3CompleteResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.errors.Error>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Start flow.
     * Send this request to start a Prove flow. It will return a correlation ID and an authToken for the client SDK.
     * @return The call builder
     */
    public com.prove.proveapi.models.operations.V3StartRequestRequestBuilder v3StartRequest() {
        return new com.prove.proveapi.models.operations.V3StartRequestRequestBuilder(this);
    }

    /**
     * Start flow.
     * Send this request to start a Prove flow. It will return a correlation ID and an authToken for the client SDK.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3StartRequestResponse v3StartRequestDirect() throws Exception {
        return v3StartRequest(Optional.empty());
    }
    /**
     * Start flow.
     * Send this request to start a Prove flow. It will return a correlation ID and an authToken for the client SDK.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3StartRequestResponse v3StartRequest(
            Optional<? extends com.prove.proveapi.models.components.V3StartRequest> request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v3/start");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.prove.proveapi.models.components.V3StartRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("V3StartRequest", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("V3StartRequest", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("V3StartRequest", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("V3StartRequest", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.prove.proveapi.models.operations.V3StartRequestResponse.Builder _resBuilder = 
            com.prove.proveapi.models.operations.V3StartRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.prove.proveapi.models.operations.V3StartRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.components.V3StartResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.components.V3StartResponse>() {});
                _res.withV3StartResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.errors.Error>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Validate phone number.
     * Send this request to check the phone number entered/discovered earlier in the flow is validated. It will return a correlation ID and the next step.
     * @return The call builder
     */
    public com.prove.proveapi.models.operations.V3ValidateRequestRequestBuilder v3ValidateRequest() {
        return new com.prove.proveapi.models.operations.V3ValidateRequestRequestBuilder(this);
    }

    /**
     * Validate phone number.
     * Send this request to check the phone number entered/discovered earlier in the flow is validated. It will return a correlation ID and the next step.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3ValidateRequestResponse v3ValidateRequestDirect() throws Exception {
        return v3ValidateRequest(Optional.empty());
    }
    /**
     * Validate phone number.
     * Send this request to check the phone number entered/discovered earlier in the flow is validated. It will return a correlation ID and the next step.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.prove.proveapi.models.operations.V3ValidateRequestResponse v3ValidateRequest(
            Optional<? extends com.prove.proveapi.models.components.V3ValidateRequest> request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v3/validate");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.prove.proveapi.models.components.V3ValidateRequest>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("V3ValidateRequest", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("V3ValidateRequest", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("V3ValidateRequest", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("V3ValidateRequest", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.prove.proveapi.models.operations.V3ValidateRequestResponse.Builder _resBuilder = 
            com.prove.proveapi.models.operations.V3ValidateRequestResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.prove.proveapi.models.operations.V3ValidateRequestResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.components.V3ValidateResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.components.V3ValidateResponse>() {});
                _res.withV3ValidateResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.prove.proveapi.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.prove.proveapi.models.errors.Error>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
