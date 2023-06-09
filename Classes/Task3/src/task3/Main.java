package task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int x1 = 0;
    static int FuelStock = 6600;
    static int x2 = 7;
    static int x3 = 14;

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);

        String[] Pump = new String[21];


        int Pump1free = 0;
        int Pump2free = 0;
        int Pump3free = 0;


        int menuCount = 1;

        System.out.println("*****Fuel Queue Management System.*****\n");

        System.out.println("100 or VFQ: View all Fuel Queues.");
        System.out.println("101 or VEQ: View all Empty Fuel Queues");
        System.out.println("102 or ACQ: Add customers to the Queue.");
        System.out.println("103 or RCQ: Remove a customer from a Queue.");
        System.out.println("104 or PCQ: Remove a served customer.");
        System.out.println("105 or VCS: View customers sorted alphabetically.");
        System.out.println("106 or SPD: Store Program Data into file");
        System.out.println("107 or LPD: Load Program Data from file.");
        System.out.println("108 or STK: View Remaining Fuel Stock.");
        System.out.println("109 or AFS: Add Fuel Stock.");
        System.out.println("999 or EXT: Exit the Program.");

        while (menuCount > -1) {

            System.out.println("Enter your option  :");
            String MenuOpt = scn.next();
            MenuOpt=MenuOpt.toUpperCase();

            if (MenuOpt.equals("100") || MenuOpt.equals("VFQ")) {
                ViewFuelQueues(Pump, Pump1free, Pump2free, Pump3free);
            } else if (MenuOpt.equals("101") || MenuOpt.equals("VEQ")) {
                ViewEmptyQueue(Pump, Pump1free, Pump2free, Pump3free);
            } else if (MenuOpt.equals("102") || MenuOpt.equals("ACQ")) {
                AddCustomers(Pump);
            } else if (MenuOpt.equals("103") || MenuOpt.equals("RCQ")) {
                RemoveCustomers(Pump);

            } else if (MenuOpt.equals("104") || MenuOpt.equals("PCQ")) {
                RemoveServedCustomer(Pump);

            } else if (MenuOpt.equals("105") || MenuOpt.equals("VCS")) {
                SortedNames(Pump);

            } else if (MenuOpt.equals("106") || MenuOpt.equals("SPD")) {
                StoreDataIntoFile(Pump);

            } else if (MenuOpt.equals("107") || MenuOpt.equals("LPD")) {
                LoadData(Pump);

            } else if (MenuOpt.equals("108") || MenuOpt.equals("STK")) {
                RemainingFuel();

            } else if (MenuOpt.equals("109") || MenuOpt.equals("AFS")) {
                ADDFuel();

            } else if (MenuOpt.equals("999") || MenuOpt.equals("EXT")) {
                System.exit(0);

            } else {
                System.out.println("Invalid input!!!");
            }

            menuCount++;
        }
    }

    //view the fuel Queue
    public static void ViewFuelQueues(String[] ThePump, int Pump1free, int Pump2free, int Pump3free) {

        for (int x = 0; x < 6; x++) {
            System.out.println(ThePump[x]);
        }
        for (int x = 0; x < 6; x++) {
            if (ThePump[x] == null) {
                Pump1free++;
                if (Pump1free == 6) {
                    System.out.println("Queue 1 is empty");
                }
            }
        }
        System.out.println("Pump 1: available slots amount is " + Pump1free);
        System.out.println("-------------------------------------------------------------\n");

        for (int x = 7; x < 13; x++) {
            System.out.println(ThePump[x]);
        }
        for (int x = 7; x < 13; x++) {
            if (ThePump[x] == null) {
                Pump2free++;
                if (Pump2free == 6) {
                    System.out.println("Queue 2 is empty");
                }
            }
        }
        System.out.println("Pump 2: available slots amount is " + Pump2free);
        System.out.println("-------------------------------------------------------------\n");

        for (int x = 14; x < 20; x++) {
            System.out.println(ThePump[x]);
        }
        for (int x = 14; x < 20; x++) {
            if (ThePump[x] == null) {
                Pump3free++;
                if (Pump3free == 6) {
                    System.out.println("Queue 3 is empty");
                }
            }
        }
        System.out.println("Pump 3: available slots amount is " + Pump3free);
        System.out.println("-------------------------------------------------------------\n");
    }

    //View Empty fuel Queue
    public static void ViewEmptyQueue(String[] ThePump, int Pump1free, int Pump2free, int Pump3free) {
        for (int x = 0; x < 6; x++) {
            if (ThePump[x] == null) {
                Pump1free++;
                if (Pump1free == 6) {
                    System.out.println("Queue 1 is empty");
                }
            }
        }
        for (int x = 7; x < 13; x++) {
            if (ThePump[x] == null) {
                Pump2free++;
                if (Pump2free == 6) {
                    System.out.println("Queue 2 is empty");
                }
            }
        }

        for (int x = 14; x < 20; x++) {
            if (ThePump[x] == null) {
                Pump3free++;
                if (Pump3free == 6) {
                    System.out.println("Queue 3 is empty");
                }
            }
        }
    }
}
