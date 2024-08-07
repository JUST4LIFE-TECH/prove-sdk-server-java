/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.prove.proveapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class V3ChallengeRequestResponse implements com.prove.proveapi.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Successful request.
     */
    private Optional<? extends com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse;

    @JsonCreator
    public V3ChallengeRequestResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3ChallengeResponse, "v3ChallengeResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3ChallengeResponse = v3ChallengeResponse;
    }
    
    public V3ChallengeRequestResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Successful request.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse() {
        return (Optional<com.prove.proveapi.models.components.V3ChallengeResponse>) v3ChallengeResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3ChallengeRequestResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3ChallengeRequestResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3ChallengeRequestResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful request.
     */
    public V3ChallengeRequestResponse withV3ChallengeResponse(com.prove.proveapi.models.components.V3ChallengeResponse v3ChallengeResponse) {
        Utils.checkNotNull(v3ChallengeResponse, "v3ChallengeResponse");
        this.v3ChallengeResponse = Optional.ofNullable(v3ChallengeResponse);
        return this;
    }

    /**
     * Successful request.
     */
    public V3ChallengeRequestResponse withV3ChallengeResponse(Optional<? extends com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse) {
        Utils.checkNotNull(v3ChallengeResponse, "v3ChallengeResponse");
        this.v3ChallengeResponse = v3ChallengeResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V3ChallengeRequestResponse other = (V3ChallengeRequestResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v3ChallengeResponse, other.v3ChallengeResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3ChallengeResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeRequestResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3ChallengeResponse", v3ChallengeResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Successful request.
         */
        public Builder v3ChallengeResponse(com.prove.proveapi.models.components.V3ChallengeResponse v3ChallengeResponse) {
            Utils.checkNotNull(v3ChallengeResponse, "v3ChallengeResponse");
            this.v3ChallengeResponse = Optional.ofNullable(v3ChallengeResponse);
            return this;
        }

        /**
         * Successful request.
         */
        public Builder v3ChallengeResponse(Optional<? extends com.prove.proveapi.models.components.V3ChallengeResponse> v3ChallengeResponse) {
            Utils.checkNotNull(v3ChallengeResponse, "v3ChallengeResponse");
            this.v3ChallengeResponse = v3ChallengeResponse;
            return this;
        }
        
        public V3ChallengeRequestResponse build() {
            return new V3ChallengeRequestResponse(
                contentType,
                statusCode,
                rawResponse,
                v3ChallengeResponse);
        }
    }
}

