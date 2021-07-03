package org.miancode.ss;
import java.util.ArrayList;


public class Customer {
        private String name;
        private String number;
        private String email;


        private static ArrayList<Services> services;

        public Customer(String name, String number, String email) {
            this.name = name;
            this.number = number;
            this.email = email;
            services= new ArrayList<>();
        }

        public Customer(String name, String number, String email, ArrayList<Services> services) {
            this.name = name;
            this.number = number;
            this.email = email;
            Customer.services = services;

        }


    public void getDetails()
        {

            System.out.println("Name: "+ this.name+"\nNumber"+this.number+"\nEmail:"+ this.email);

            Services.addservice();
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
            Customer.services = services;
        }


    };




