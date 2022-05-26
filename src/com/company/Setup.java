package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Setup {
    private Connection conn;
    private Statement st;

    public Setup() {
        try {
            String url = "jdbc:sqlite:./baza.sqlite";
            this.conn = DriverManager.getConnection(url);
            this.st = this.conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /*create table policy
            (
                    id                text   not null
                    constraint policy_pk
                    primary key,
                    insuranceHolder   text   not null,
                    insuredPerson     text   not null,
                    beneficiaryPerson text   not null,
                    risk              text   not null,
                    startDate         date   not null,
                    endDate           date   not null,
                    price             double not null
            );

    create unique index policy_id_uindex
    on policy (id);
*/



    public void createTablePolicy() {
        String createTableSQL2 = "create table policy" +
                "(" +
                "id text not null" +
                " constraint policy_pk" +
                " primary key," +
                "insuranceHolder text not null," +
                "insuredPerson text not null," +
                "beneficiaryPerson text not null," +
                "risk text not null," +
                "startDate date not null," +
                "endDate date not null," +
                "price double not null" +
                ");";
        try {
            st.execute(createTableSQL2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTableDamage() {
    String createTableSQL3 = "create table damage" +
            "(" +
            "    id          int  not null" +
            "        constraint damages_pk" +
            "            primary key," +
            "    policy_id   int  not null" +
            "        references policy" +
            "            on update restrict," +
            "    documents   text not null," +
            "    damage_type text not null" +
            "            on update restrict," +
            "    victim      text not null" +
            ");";

        try {
            st.execute(createTableSQL3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTableIncident() {
    String createTableSQL4 = "create table incident" +
            "(" +
            "id int not null" +
            "constraint event_pk" +
            "primary key," +
            "date date not null," +
            "damages text not null" +
            "references damages," +
            "incident_place text not null," +
            "incident_course text not null" +
            ");";
        try {
            st.execute(createTableSQL4);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTableIRisk() {
    String createTableSQL5 = "create table risk" +
            "(" +
            "id int not null" +
            " constraint risks_pk" +
            " primary key," +
            "min_price       Decimal not null," +
            "max_price       Decimal not null," +
            "protection_from Date    not null," +
            "protection_to   Date    not null," +
            "description     Text    not null," +
            "policy_type     Text    not null" +
            " references policy_type" +
            " on update restrict" +
            ");";

        try {
            st.execute(createTableSQL5);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTablePerson() {
        String createTableSQL6 = "create table person" +
                "(" +
                "id Text not null primary key," +
                "address Text not null," +
                "phone Text not null," +
                "pesel Text not null," +
                "name Text not null," +
                "surname Text not null" +
                ");";
        try {
            st.execute(createTableSQL6);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTableCompany() {
        String createTableSQL7 = "create table company" +
                "(" +
                "id Text not null" +
                "primary key," +
                "address Text not null," +
                "phone Text not null," +
                "NIP Text not null," +
                "REGON Text not null," +
                "representative Text not null" +
                ");";
        try {
            st.execute(createTableSQL7);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
