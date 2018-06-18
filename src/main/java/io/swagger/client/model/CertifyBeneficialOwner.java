package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CertifyBeneficialOwner {

    private Map<String, HalLink> links = new HashMap<String, HalLink>() ;
    private String status;

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
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  links: ").append(links).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
