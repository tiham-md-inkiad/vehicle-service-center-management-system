package org.miancode.ss;

import java.util.ArrayList;



public class Employee {
    private String name;
    private String number;
    private String email;
    private String rank;


    private static ArrayList<Services> services;

    public Employee(String name, String number, String email,String rank) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.rank= rank;
        services= new ArrayList<>();
    }

    public Employee(String name, String number, String email, String rank, ArrayList<Services> services) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.rank= rank;
        Employee.services = services;

    }


    public void getDetails()
    {

        System.out.println("Name: "+ this.name+"\nNumber"+this.number+"\nEmail:"+ this.email+"\nrank"+ this.rank);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ArrayList<Services> getServices() {
        return services;
    }

    public void setServices(ArrayList<Services> services) {
        Employee.services = services;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
};



