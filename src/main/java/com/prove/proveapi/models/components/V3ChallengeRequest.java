/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V3ChallengeRequest {

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    /**
     * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<? extends String> dob;

    /**
     * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last4SSN")
    private Optional<? extends String> last4SSN;

    @JsonCreator
    public V3ChallengeRequest(
            @JsonProperty("correlationId") String correlationId,
            @JsonProperty("dob") Optional<? extends String> dob,
            @JsonProperty("last4SSN") Optional<? extends String> last4SSN) {
        Utils.checkNotNull(correlationId, "correlationId");
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(last4SSN, "last4SSN");
        this.correlationId = correlationId;
        this.dob = dob;
        this.last4SSN = last4SSN;
    }
    
    public V3ChallengeRequest(
            String correlationId) {
        this(correlationId, Optional.empty(), Optional.empty());
    }

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    /**
     * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> dob() {
        return (Optional<String>) dob;
    }

    /**
     * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> last4SSN() {
        return (Optional<String>) last4SSN;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    public V3ChallengeRequest withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    /**
     * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3ChallengeRequest withDob(String dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    /**
     * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3ChallengeRequest withDob(Optional<? extends String> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    /**
     * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    public V3ChallengeRequest withLast4SSN(String last4SSN) {
        Utils.checkNotNull(last4SSN, "last4SSN");
        this.last4SSN = Optional.ofNullable(last4SSN);
        return this;
    }

    /**
     * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    public V3ChallengeRequest withLast4SSN(Optional<? extends String> last4SSN) {
        Utils.checkNotNull(last4SSN, "last4SSN");
        this.last4SSN = last4SSN;
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
        V3ChallengeRequest other = (V3ChallengeRequest) o;
        return 
            java.util.Objects.deepEquals(this.correlationId, other.correlationId) &&
            java.util.Objects.deepEquals(this.dob, other.dob) &&
            java.util.Objects.deepEquals(this.last4SSN, other.last4SSN);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            correlationId,
            dob,
            last4SSN);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeRequest.class,
                "correlationId", correlationId,
                "dob", dob,
                "last4SSN", last4SSN);
    }
    
    public final static class Builder {
 
        private String correlationId;
 
        private Optional<? extends String> dob = Optional.empty();
 
        private Optional<? extends String> last4SSN = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }

        /**
         * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(String dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        /**
         * DOB is the date of birth in this format: YYYY-MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(Optional<? extends String> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        /**
         * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
         */
        public Builder last4SSN(String last4SSN) {
            Utils.checkNotNull(last4SSN, "last4SSN");
            this.last4SSN = Optional.ofNullable(last4SSN);
            return this;
        }

        /**
         * Last4SSN is the last 4 numbers of the social security number. Acceptable characters are: numeric.
         */
        public Builder last4SSN(Optional<? extends String> last4SSN) {
            Utils.checkNotNull(last4SSN, "last4SSN");
            this.last4SSN = last4SSN;
            return this;
        }
        
        public V3ChallengeRequest build() {
            return new V3ChallengeRequest(
                correlationId,
                dob,
                last4SSN);
        }
    }
}

