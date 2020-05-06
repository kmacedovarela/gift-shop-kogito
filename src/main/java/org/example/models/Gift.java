package org.example.models;

import java.math.BigDecimal;

public class Gift {

    private Long id;
    private String productName;
    private BigDecimal price;
    private Boolean available;
    protected org.example.models.Buyer buyer;

    private String buyerName;
    private String buyerMembership;

    public Gift() {
    }

    public String getBuyerMembership() {
        return buyerMembership;
    }

    public void setBuyerMembership(final String buyerMembership) {
        this.buyerMembership = buyerMembership;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(final String buyerName) {
        this.buyerName = buyerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }



    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    // public Buyer getBuyer() {
    //     return buyer;
    // }

    // public void setBuyer(org.example.models.Buyer buyer) {
    //     this.buyer = buyer;
    // }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(final Boolean available) {
        this.available = available;
    }

    

    public Gift(final Long id, final String productName, final BigDecimal price, final Boolean available, final String buyerName,
            final String buyerMembership) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.available = available;
        this.buyerName = buyerName;
        this.buyerMembership = buyerMembership;
    }

    public org.example.models.Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(org.example.models.Buyer buyer) {
        this.buyer = buyer;
    }

    public Gift(Long id, String productName, BigDecimal price, Boolean available, Buyer buyer, String buyerName,
            String buyerMembership) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.available = available;
        this.buyer = buyer;
        this.buyerName = buyerName;
        this.buyerMembership = buyerMembership;
    }

  
}