package org.miancode.ss;

public class Bike extends Vehicle{
    public String bikeType;
    public String bikeCc;


    public Bike() {
        super();
    }



    public Bike(String vehiclename, String bikeType, String bikeCc) {
        super(vehiclename);
        this.bikeType = bikeType;
        this.bikeCc = bikeCc;

    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeCc() {
        return bikeCc;
    }

    public void setBikeCc(String bikeCc) {
        this.bikeCc = bikeCc;
    }
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Bike type: "+ this.bikeType);
        System.out.println("Bike cc "+ this.bikeCc);
        addservice();



    }


    }
