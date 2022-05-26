package com.company.service;

import com.company.classes.Company;
import com.company.classes.Person;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class CustomerService {
    private Statement st;

    public CustomerService(Statement st) {
        this.st = st;
    }

    public void addPerson(Person person) {
        try {
            st.execute("INSERT INTO person (id, address, phone, pesel, name, surname) VALUES ('" +
                    UUID.randomUUID() + "','" +
                    person.getAddress() + "','" +
                    person.getPhone() + "','" +
                    person.getPesel() + "','" +
                    person.getName() + "','" +
                    person.getSurname() + "');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addCompany(Company company) {

        try {
            st.execute("INSERT INTO company (id, address, phone, NIP, REGON, representative) VALUES ('" +
                    UUID.randomUUID() + "','" +
                    company.getAddress() + "','" +
                    company.getPhone() + "','" +
                    company.getNIP() + "','" +
                    company.getREGON() + "','" +
                    company.getRepresentative() + "');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
