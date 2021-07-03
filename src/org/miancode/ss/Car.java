package org.miancode.ss;

public class Car extends Vehicle{
    public String carType;
    public String carCc;
    public Car() {
        super();
    }
    public Car(String vehiclename, String carType, String carCc) {
        super(vehiclename);
        this.carType = carType;
        this.carCc = carCc;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarCc() {
        return carCc;
    }

    public void setCarCc(String carCc) {
        this.carCc = carCc;
    }
    public void getDetails()
    {
        super.getDetails();
        System.out.println("car type "+ this.carType);
        System.out.println("Car cc: "+ this.carCc);
        addservice();

    }

}
