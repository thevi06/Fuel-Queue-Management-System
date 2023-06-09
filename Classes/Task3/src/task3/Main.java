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
}
