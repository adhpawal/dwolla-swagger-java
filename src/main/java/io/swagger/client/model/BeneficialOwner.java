package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficialOwner {

    private Map<String, HalLink> links = new HashMap<String, HalLink>() ;
    private Object embedded = null;
    private String id = null;
    private String firstName = null;
    private String lastName = null;
    private String title = null;
    private String ssn = null;
    private String dateOfBirth = null;
    private Address address = null;
    private Passport passport = null;
    private String verificationStatus = null;
    private String locationHeader;

    /**
     **/
    @ApiModelProperty( value = "")
    @JsonProperty("_links")
    public Map<String, HalLink> getLinks() {
        return links;
    }
    public void setLinks(Map<String, HalLink> links) {
        this.links = links;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("_embedded")
    public Object getEmbedded() {
        return embedded;
    }
    public void setEmbedded(Object embedded) {
        this.embedded = embedded;
    }

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

    /**
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("verificationStatus")
    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * Used to deserialize Location field in
     * HTTP headers, primarily for HAL-styled
     * POST requests.
     **/
    @JsonProperty("Location")
    public String getLocationHeader() { return locationHeader; }
    public void setLocationHeader(ArrayList<String> locationHeader) { this.locationHeader = locationHeader.get(0); }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  links: ").append(links).append("\n");
        sb.append("  embedded: ").append(embedded).append("\n");
        sb.append("  id: ").append(id).append("\n");
        sb.append("  firstName: ").append(firstName).append("\n");
        sb.append("  lastName: ").append(lastName).append("\n");
        sb.append("  title: ").append(title).append("\n");
        sb.append("  ssn: ").append(ssn).append("\n");
        sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
        sb.append("  address: ").append(address).append("\n");
        sb.append("  status: ").append(verificationStatus).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
