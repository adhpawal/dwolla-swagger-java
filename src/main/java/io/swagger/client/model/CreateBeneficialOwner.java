package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBeneficialOwner {

    private String firstName = null;
    private String lastName = null;
    private String ssn = null;
    private String dateOfBirth = null;
    private Address address = null;
    private Passport passport = null;

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("passport")
    public Passport getPassport() {
        return passport;
    }
    public void setPassport(Passport passport) {
        this.passport = passport;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  firstName: ").append(firstName).append("\n");
        sb.append("  lastName: ").append(lastName).append("\n");
        sb.append("  ssn: ").append(ssn).append("\n");
        sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
        sb.append("  address: ").append(address).append("\n");
        sb.append("  passport: ").append(passport).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
