package com.cdvb.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to:");
        System.out.println("  _______ ____  ______  _____ ");
        System.out.println(" |__   __|__  ||  __  |/ __  |");
        System.out.println("    | |     ) /| |  | | |  | |");
        System.out.println("    | |    / / | |  | | |  | |");
        System.out.println("    | |   / /_ | |__| | |__| |");
        System.out.println("    |_|  |____||_____/|_____/ ");

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
