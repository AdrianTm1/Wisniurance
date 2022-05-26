package com.company.classes;

import java.math.BigDecimal;
import java.util.Date;

public class Risk {
    private Integer id;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private Date protectionFrom;
    private Date protectionTo;
    private String description;
    private String policyType;

    public Risk() {
    }

    public Risk(Integer id, BigDecimal minPrice, BigDecimal maxPrice, Date protectionFrom, Date protectionTo, String description, String policyType) {
        this.id = id;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.protectionFrom = protectionFrom;
        this.protectionTo = protectionTo;
        this.description = description;
        this.policyType = policyType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Date getProtectionFrom() {
        return protectionFrom;
    }

    public void setProtectionFrom(Date protectionFrom) {
        this.protectionFrom = protectionFrom;
    }

    public Date getProtectionTo() {
        return protectionTo;
    }

    public void setProtectionTo(Date protectionTo) {
        this.protectionTo = protectionTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
}
