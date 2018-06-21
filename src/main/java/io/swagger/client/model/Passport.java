package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Passport {

    private String number = null;
    private String country = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     **/
    @ApiModelProperty(value = "")
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
        sb.append("  number: ").append(number).append("\n");
        sb.append("  country: ").append(country).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
