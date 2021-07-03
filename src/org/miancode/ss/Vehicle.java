package org.miancode.ss;


public class Vehicle extends Services {
   public String vehiclename;


    public Vehicle(String vehiclename) {
        this.vehiclename = vehiclename;

    }

    public Vehicle() {

    }


    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        vehiclename = vehiclename;
    }

    public void getDetails()
    {
        System.out.println("Name: "+ this.vehiclename);
    }


}
