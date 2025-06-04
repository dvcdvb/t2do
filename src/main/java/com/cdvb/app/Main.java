package com.cdvb.app;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<Double>();

        System.out.println("--- Welcome to: T2DO ---");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Title of your To-Do");

        String Title = myObj.nextLine();

        System.out.println("Enter Description");
        String Description = myObj.nextLine();

        System.out.println("Enter Priority (1-3)");
        int Priority = myObj.nextInt();

        System.out.println("------T2DO------");
        System.out.println("[ ]" + " " + Priority + " " + "//" + " " + Title + " " + "//" + " " + Description);
        System.out.println("------T2DO------");

    }
}
