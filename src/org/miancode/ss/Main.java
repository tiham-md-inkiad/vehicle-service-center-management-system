package org.miancode.ss;
import java.util.ArrayList;
import java.util.Scanner;


import static org.miancode.ss.Services.addservice;


public class Main {
    private static ArrayList<Customer>customers;
    private static ArrayList<Employee>employees;

    public static Scanner scanner;
    private static int id=0;
    private static int no=0;

    public static void main(String[] args) {
        customers= new ArrayList<>();
        employees= new ArrayList<>();
        System.out.println("welcome to  vscms ");
        loginPanel();

    }

    // TODO: 6/28/2021 exception handling o
    public static void loginPanel()
    {
        scanner=new Scanner(System.in);
        System.out.println("Enter admin name:");
        String name=scanner.nextLine();
        System.out.println("pasasword hint 5555:");
        System.out.println("Enter pasasword:");
        int password =scanner.nextInt();
        if(password==5555){
            showInitialOptions();

        }
        else{
            System.out.println("enter the right password: ");
            loginPanel();
        }
    }


    public static void showInitialOptions()
    {
        System.out.println("Please select one:"+
                "\n\t1.Customer's services."+
                "\n\t2.Employee's portal."+
                "\n\t3.Available services"+
                "\n\t4.Accessories for vehicle."+
                "\n\t4.show services details"+
                "\n\t5.Quit");
        scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice)
        {
            case 1:
                Customer_services();
                break;
            case 2:
                Employee_portal();
                break;
            case 4:
                Accessories_for_vehicle();
                break;
            case 5:
                Available_services();
                break;
            case 6:
                show_services_details();
                break;
            default:
                break;
        }
        showInitialOptions();
    }

    private static void Accessories_for_vehicle() {
        System.out.println("Please select one:"+
                "\n\t1.Bike Accessories "+
                "\n\t2.Cars Accessories"+
                "\n\t3.Other Accessories"+
                "\n\t4.Employee salary list"+
                "\n\t5.Quit");

    }


    private static void Available_services() {

    }

    private static void show_services_details() {
        Customer_service_options();

    }

    private static void Employee_portal() {
        System.out.println("Please select one:"+
                "\n\t1.search For Employee "+
                "\n\t2.Add new Employee"+
                "\n\t3.Employee list."+
                "\n\t4.Employee salary list"+
                "\n\t5.Quit");
        scanner=new Scanner(System.in);
        int choice= scanner.nextInt();
        switch (choice)
        {
            case 1:
                searchForEmployee();
                break;
            case 2:
                AddNewEmployee();

                break;
            case 3:
                Employee_list();
                break;
            case 4:
                Employee_salary_list();
                
                break;
            default:
                break;
        }
        
        showInitialOptions();

    }

    private static void Employee_list() {
        if(employees.size()>0)
        {
            for ( Employee p:  employees){

                id++;
                System.out.println("Employees id:"+id);
                p.getDetails();
                System.out.println("_____________");
            }
            showInitialOptions();

        }
        else
        {
            System.out.println("we do not have any Employee");
            System.out.println("to add new Employee enter 1");
            System.out.println("to go to main  menu enter 2");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    AddNewEmployee();
                    break;
                default:
                    showInitialOptions();
                    break;
            }
        }
    }

    private static void Employee_salary_list() {
    }

    private static void AddNewEmployee() {
        System.out.println("Adding a New Employee information ");
        System.out.println("Enter the Employee name:");
        String name= scanner.next();
        System.out.println("Enter the Employee number: ");
        String number= scanner.next();
        System.out.println("Enter the Employee email address: ");
        String email= scanner.next();
        System.out.println("Enter the Employee rank: ");
        String rank= scanner.next();
        if(name.equals("")||  number.equals("")||email.equals("")||rank.equals(""))
        {
            System.out.println("please enter all the information again ");
            AddNewEmployee();
        }
        else
        {
            boolean doseExist=false;
            for(Employee p:employees)
            {
                if (p.getName().equals(name)) {
                    doseExist = true;
                    break;
                }
            }
            if(doseExist)
            {
                System.out.println("we already have a customer named "+ name+" saved on this device");
                AddNewCustomers();
            }
            else
            {
                Employee employee=new Employee(name,number,email,rank);
                employees.add(employee);
                System.out.println(name +" Added successfully ");
            }
            Employee_portal();
        }

    }


    public static void searchForEmployee() {
        System.out.println("Please enter the Customer name: ");
        String name= scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name");
            searchForCustomer();
        }
        else
        {
            boolean doesExist= false;
            for (Employee p:employees)
            {
                if(p.getName().equals(name))
                {
                    doesExist=true;
                    p.getDetails();
                }

            }
            if(!doesExist)
            {
                AddNewEmployee();
            }
        }
        Employee_portal();
        
    }

    private static void Customer_services()
    {
        System.out.println("Please select one:"+
                "\n\t1.search For Customer "+
                "\n\t2.Add new Customer"+
                "\n\t3.Customer services:"+
                "\n\t4.Customer list:"+
                "\n\t5.Quit");
        scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice)
        {
            case 1:
                searchForCustomer();
                break;
            case 2:
                AddNewCustomers();

                break;
            case 3:
                Customer_service_options();
                break;
            case 4:
                Customer_lists();
                break;
            default:
                break;
        }
        showInitialOptions();

    }



    private static void searchForCustomer() {
        System.out.println("Please enter the Customer name: ");
        String name= scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name");
            searchForCustomer();
        }
        else
        {
            boolean doesExist= false;
            for (Customer c:customers)
            {
                if(c.getName().equals(name))
                {
                    doesExist=true;
                    c.getDetails();
                }

            }
            if(!doesExist)
            {
                AddNewCustomers();
            }
        }
        Customer_service_options();
    }

    private static void AddNewCustomers() {
        System.out.println("Adding a New Customer information ");
        System.out.println("Enter the Customer name:");
        String name= scanner.next();
        System.out.println("Enter the Customer number: ");
        String number= scanner.next();
        System.out.println("Enter the Customer email address: ");
        String email= scanner.next();
        if(name.equals("")||  number.equals("")||email.equals(""))
        {
            System.out.println("please enter all the information again ");
            AddNewCustomers();
        }
        else
        {
            boolean doseExist=false;
            for(Customer c:customers)
            {
                if (c.getName().equals(name)) {
                    doseExist = true;
                    break;
                }
            }
            if(doseExist)
            {
                System.out.println("we already have a customer named "+ name+" saved on this device");
                AddNewCustomers();
            }
            else
            {
                Customer customer=new Customer(name,number,email);
                customers.add(customer);
                System.out.println(name +" Added successfully ");
            }

        }
        Customer_service_options();
    }
    private static void Customer_lists() {
        if(customers.size()>0)
        {
            for ( Customer c:  customers){

                id++;
                System.out.println("Customer id:"+id);
                c.getDetails();
                System.out.println("_____________");
            }
            showInitialOptions();

        }
        else
        {
            System.out.println("you do not have any contacts");
            System.out.println("to add new contact enter 1");
            System.out.println("to go to main menu enter 2");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    AddNewCustomers();
                    break;
                default:
                    showInitialOptions();
                    break;
            }
        }

    }
    private static void Customer_service_options() {
        System.out.println("Please select one:"+
                "\n\t1.bike "+
                "\n\t2.car"+
                "\n\t3.others"+
                "\n\t4.Services details"+
                "\n\t5.Quit");
        scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice)
        {
            case 1:
                ServicesforBike();
                break;
            case 2:
                ServiceforCar();
                break;
            case 3:
                otherServices();
                break;
            case 4:
                serviceDetails();
                break;
            default:
                break;
        }
        showInitialOptions();
    }

    private static void serviceDetails() {
        ArrayList<Services> AllServices= new ArrayList<>();
        for(Customer c: customers)
        {
            AllServices.addAll(c.getServices());

        }
        if(AllServices.size()>0)
        {
            for (Services s: AllServices)

            {   no++;
                System.out.println("service no :"+no);
                s.INfo();
                System.out.println("_____________");

            }
        }
        else
        {
            System.out.println("You do not have any message please add a service ");
        }
        showInitialOptions();
    }




    private static void otherServices() {
    }

    private static void ServiceforCar() {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter your vecale name:");
        String vehicalname = input.nextLine();
        System.out.print("\n") ;
        System.out.print("Enter your Car Type:");
        String carType = input.nextLine();
        System.out.print("\n") ;
        System.out.print("Enter your carCc:");
        String carCc = input.nextLine();
        System.out.print("\n") ;
        Car car= new Car(vehicalname,carType,carCc);
        car.getDetails();
        addserviceDetails();
        
    }

    private static void ServicesforBike() {

        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter your vecale name:");
        String vehicalname = input.nextLine();
        System.out.print("\n") ;
        System.out.print("Enter your BikeType:");
        String BikeType = input.nextLine();
        System.out.print("\n") ;
        System.out.print("Enter your Bike cc:");
        String bikeCc = input.nextLine();
        System.out.print("\n") ;
        Bike b= new Bike(vehicalname,BikeType,bikeCc);
        b.getDetails();
        addserviceDetails();


    }


    private static void addserviceDetails() {
        System.out.println("enter the name for the bill:");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("please enter the name of the Customer:");
            AddNewCustomers();
        }
        else
            {
            boolean doseExist = false;
        for (Customer c :customers){
            if (c.getName().equals(name)) {
                doseExist = true;
            }
        }
        if(doseExist)
        {
            System.out.println("\n");
            addservice();
            String text=scanner.next();
            if(text.equals(""))
            {
                System.out.println("please enter some Services");
                addservice();
            }
            else
            {


                Services service =new Services();
                for (Customer c: customers)
                {
                    if (c.getName().equals(name))
                    {
                        ArrayList<Services> services = c.getServices ();
                        services .add(Services.addservice());
                        c.setServices (services);
                    }
                }
            }
        }
        else
        {
            System.out.println("There is no such coustomer");
        }
    }
    showInitialOptions();
}

}