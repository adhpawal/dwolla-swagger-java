package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FundingSourceAccountInformation {

    private Map<String, HalLink> links = new HashMap<String, HalLink>();
    String accountNumber;
    String routingNumber;

    /**
     **/
    @ApiModelProperty(value = "")
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
    @JsonProperty("accountNubmer")
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("routingNubmer")
    public String getRoutingNumber() {
        return routingNumber;
    }
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FundingSourceAccountInformation{");
        sb.append("links=").append(links);
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", routingNumber='").append(routingNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
