/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class V3CompleteAddressEntryRequest {

    /**
     * Address is the street address of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends String> address;

    /**
     * City of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<? extends String> city;

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extendedAddress")
    private Optional<? extends String> extendedAddress;

    /**
     * Postal code is the zip code of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<? extends String> postalCode;

    /**
     * Region is the state or locality of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<? extends String> region;

    @JsonCreator
    public V3CompleteAddressEntryRequest(
            @JsonProperty("address") Optional<? extends String> address,
            @JsonProperty("city") Optional<? extends String> city,
            @JsonProperty("extendedAddress") Optional<? extends String> extendedAddress,
            @JsonProperty("postalCode") Optional<? extends String> postalCode,
            @JsonProperty("region") Optional<? extends String> region) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        this.address = address;
        this.city = city;
        this.extendedAddress = extendedAddress;
        this.postalCode = postalCode;
        this.region = region;
    }
    
    public V3CompleteAddressEntryRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Address is the street address of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> address() {
        return (Optional<String>) address;
    }

    /**
     * City of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> city() {
        return (Optional<String>) city;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> extendedAddress() {
        return (Optional<String>) extendedAddress;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> postalCode() {
        return (Optional<String>) postalCode;
    }

    /**
     * Region is the state or locality of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> region() {
        return (Optional<String>) region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Address is the street address of the individual.
     */
    public V3CompleteAddressEntryRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Address is the street address of the individual.
     */
    public V3CompleteAddressEntryRequest withAddress(Optional<? extends String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * City of the individual.
     */
    public V3CompleteAddressEntryRequest withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    /**
     * City of the individual.
     */
    public V3CompleteAddressEntryRequest withCity(Optional<? extends String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public V3CompleteAddressEntryRequest withExtendedAddress(String extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = Optional.ofNullable(extendedAddress);
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public V3CompleteAddressEntryRequest withExtendedAddress(Optional<? extends String> extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = extendedAddress;
        return this;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    public V3CompleteAddressEntryRequest withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    public V3CompleteAddressEntryRequest withPostalCode(Optional<? extends String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public V3CompleteAddressEntryRequest withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public V3CompleteAddressEntryRequest withRegion(Optional<? extends String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        V3CompleteAddressEntryRequest other = (V3CompleteAddressEntryRequest) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.city, other.city) &&
            java.util.Objects.deepEquals(this.extendedAddress, other.extendedAddress) &&
            java.util.Objects.deepEquals(this.postalCode, other.postalCode) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            city,
            extendedAddress,
            postalCode,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3CompleteAddressEntryRequest.class,
                "address", address,
                "city", city,
                "extendedAddress", extendedAddress,
                "postalCode", postalCode,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> address = Optional.empty();
 
        private Optional<? extends String> city = Optional.empty();
 
        private Optional<? extends String> extendedAddress = Optional.empty();
 
        private Optional<? extends String> postalCode = Optional.empty();
 
        private Optional<? extends String> region = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Address is the street address of the individual.
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        /**
         * Address is the street address of the individual.
         */
        public Builder address(Optional<? extends String> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * City of the individual.
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        /**
         * City of the individual.
         */
        public Builder city(Optional<? extends String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Extended address is the apartment number or other extended address information.
         */
        public Builder extendedAddress(String extendedAddress) {
            Utils.checkNotNull(extendedAddress, "extendedAddress");
            this.extendedAddress = Optional.ofNullable(extendedAddress);
            return this;
        }

        /**
         * Extended address is the apartment number or other extended address information.
         */
        public Builder extendedAddress(Optional<? extends String> extendedAddress) {
            Utils.checkNotNull(extendedAddress, "extendedAddress");
            this.extendedAddress = extendedAddress;
            return this;
        }

        /**
         * Postal code is the zip code of the individual.
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        /**
         * Postal code is the zip code of the individual.
         */
        public Builder postalCode(Optional<? extends String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Region is the state or locality of the individual.
         */
        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * Region is the state or locality of the individual.
         */
        public Builder region(Optional<? extends String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public V3CompleteAddressEntryRequest build() {
            return new V3CompleteAddressEntryRequest(
                address,
                city,
                extendedAddress,
                postalCode,
                region);
        }
    }
}

