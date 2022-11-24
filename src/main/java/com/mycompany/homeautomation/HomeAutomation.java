/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.homeautomation;

import java.util.Scanner;

public class HomeAutomation {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is the door of the room is open ? Yes || No");
        String DoorOpenClosed = myObj.nextLine();

        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is the person is under the shower ? Yes || No");
        String Person_Under_OR_not = myObj1.nextLine();

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is the mobile is fully charged ? Yes || No");
        String Mobile_charging_detector = myObj2.nextLine();

        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is the home is locked ? Yes || No");
        String Lock_detector = myObj3.nextLine();

        System.out.println("\n");

        Automation light = new LightAutomation(DoorOpenClosed);
        light.automate();

        Automation AC = new ShowerAutomation(Person_Under_OR_not);
        AC.automate();

        Automation Door = new PlugAutomation(Mobile_charging_detector);
        Door.automate();

        Automation Lock = new LockAutomation(Lock_detector);
        Lock.automate();
        
        Automation Testing = new UnitTesting();

        System.out.println("\n");
        System.out.println("Light Automation through Door Open and closed");
        System.out.println("Shower Automation detect person under Shower");
        System.out.println("Plug Automation detect when mobile fully charged");
        System.out.println("Lock Automation through Mobile");

    }
}
