package com.company;

import com.company.classes.Company;
import com.company.classes.Person;
import com.company.service.CustomerService;

import java.sql.*;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static DBConnection dbConnection = new DBConnection();
    static Statement st = dbConnection.getNewSt();
    static CustomerService customerService = new CustomerService(st);
    static Setup setup = new Setup();

    public static void main(String args[]) {

        System.out.println("""
                            P - nowy person
                            C - nowe company
                            h - pomoc
                            e - wyjscie
                            """);

        char option = ' ';
        String inputString;

        bigLoop:
        while (true) {
            inputString = scanner.nextLine();
            option = inputString.length() > 0 ?  (char) inputString.getBytes()[0] : 'h';
            switch (option) {
                case 'P' -> {
                    addNewPerson();
                    break;
                }
                case 'C' -> {
                    addNewCompany();
                    break;
                }
                case 'e' -> {
                    break bigLoop;
                }
                case 'h' -> {
                    System.out.println("""
                            Wpisz litere aby wykonac akcje:
                            P - nowy person
                            C - nowe company
                            h - pomoc
                            e - wyjscie
                            
                            """);
                    break;
                }
                default -> {
                    System.out.println("Wpisz h po pomoc");
                    break;
                }
            }
        }
    }

    private static void addNewPerson() {
        Person newPerson = new Person();
        System.out.println("Name: ");
        newPerson.setName(scanner.nextLine());
        System.out.println("Surname: ");
        newPerson.setSurname(scanner.nextLine());
        System.out.println("Phone: ");
        newPerson.setPhone(scanner.nextLine());
        System.out.println("Pesel: ");
        newPerson.setPesel(scanner.nextLine());
        System.out.println("Address: ");
        newPerson.setAddress(scanner.nextLine());

        customerService.addPerson(newPerson);
    }

    private static void addNewCompany() {
        Company newCompany = new Company();
        System.out.println("NIP: ");
        newCompany.setNIP(scanner.nextLine());
        System.out.println("REGON: ");
        newCompany.setREGON(scanner.nextLine());
        System.out.println("phone: ");
        newCompany.setPhone(scanner.nextLine());
        System.out.println("Representative: ");
        newCompany.setRepresentative(scanner.nextLine());
        System.out.println("Address: ");
        newCompany.setAddress(scanner.nextLine());

        customerService.addCompany(newCompany);
    }

}

