package org.miancode.ss;

import java.util.Scanner;


public class Services {

    public int serviceNO=0;

    public Services() {

    }

    public static Services addservice() {
        System.out.println("Bellow services ar Available" +
                "\n\t1 Engine Services "+
                "\n\t2.Mobile change"+
                "\n\t3.full service"+
                "\n\t4.others");
        System.out.print("which service do you want?");
        Scanner input = new Scanner(System.in) ;
        int choice=input.nextInt();

        switch (choice)
        {
            case 1:
                engineservices();
                break;
            case 2:
                mobilchnage();
                break;
            case 3:
                fullService();
                break;
            default:
                break;
        }

        return null;
    }

    public void INfo(){
        System.out.println("service no:"+serviceNO++);
        fullService();
        mobilchnage();
        engineservices();


    }
    private static void fullService() {System.out.println("cost=41646 taka");
    }

    private static void mobilchnage() {System.out.println("cost=41646 taka");
    }

    public static void engineservices() {
        System.out.println("cost=41646 taka");
    }



}
