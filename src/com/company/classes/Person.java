package com.company.classes;

import com.company.model.Customer;

import java.util.UUID;

public class Person extends Customer {
    private String pesel;
    private String name;
    private String surname;

    public Person() {
    }

    public Person(UUID id, String pesel, String name, String surname, String address, String phone) {
        super(id, address, phone);
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
