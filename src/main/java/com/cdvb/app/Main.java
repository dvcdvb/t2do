package com.cdvb.app;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> todoList = new ArrayList<>();

        System.out.println("--- Welcome to: T2DO ---");

        String title = "";
        String description = "";
        int priority = 0;

        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Title of your To-Do");
            title = myObj.nextLine();
            if (title.equals("exit")) {
                break;
            }

            System.out.println("Enter Description");
            description = myObj.nextLine();
            if (description.equals("exit")) {
                break;
            }

            System.out.println("Enter Priority (1-3)");
            priority = myObj.nextInt();

            Task newTask = new Task(title, description, priority);
            todoList.add(newTask);

            for (Task t : todoList) {
                t.printTask();
            }

        } while (!title.equals("exit"));

        ;

    }
}
