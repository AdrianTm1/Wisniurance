package com.company.model;

import java.util.UUID;

public abstract class Customer {

    private UUID id;
    private String address;
    private String phone;

    public Customer() {
    }

    public Customer(UUID id, String address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
