package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        FuelSystem fuelSystem;
        int queueId;
        int adding;
        ArrayList<String> customers = new ArrayList<>();

        int FuelStock = 6600;
        Passenger passenger;
        FuelQueue[] pumps = new FuelQueue[5];
        for (int i=0; i<pumps.length; i++) {
            pumps[i] = new FuelQueue(i);
        }

        Scanner scn = new Scanner(System.in);

        System.out.println("****Fuel Queue Management System.****\n");

        System.out.println("100 or VFQ: View all Fuel Queues.");
        System.out.println("101 or VEQ: View all Empty Queues");
        System.out.println("102 or ACQ: Add customer to a Queue.");
        System.out.println("103 or RCQ: Remove a customer from a Queue.");
        System.out.println("104 or PCQ: Remove a served customer.");
        System.out.println("105 or VCS: View Customers Sorted in alphabetical order.");
        System.out.println("106 or SPD: Store Program Data into file");
        System.out.println("107 or LPD: Load Program Data from file.");
        System.out.println("108 or STK: View Remaining Fuel Stock.");
        System.out.println("109 or AFS: Add Fuel Stock.");
        System.out.println("110 or IFQ: Income of Fuel");
        System.out.println("999 or EXT: Exit the Program.");
