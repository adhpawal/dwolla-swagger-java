package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    private String address1 = null;
    private String address2 = null;
    private String address3 = null;
    private String city = null;
    private String stateProvinceRegion = null;
    private String postalCode = null;
    private String country = null;

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("address3")
    public String getAddress3() {
        return address3;
    }
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("city")
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("stateProvinceRegion")
    public String getStateProvinceRegion() {
        return stateProvinceRegion;
    }
    public void setStateProvinceRegion(String stateProvinceRegion) {
        this.stateProvinceRegion = stateProvinceRegion;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  address1: ").append(address1).append("\n");
        sb.append("  address2: ").append(address2).append("\n");
        sb.append("  address3: ").append(address3).append("\n");
        sb.append("  city: ").append(city).append("\n");
        sb.append("  stateProvinceRegion: ").append(stateProvinceRegion).append("\n");
        sb.append("  postalCode: ").append(postalCode).append("\n");
        sb.append("  country: ").append(country).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
