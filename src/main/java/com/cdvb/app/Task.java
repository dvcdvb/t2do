package com.cdvb.app;

public class Task {

    String title;
    String description;
    int priority;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public void printTask() {
        System.out.println("[ ]" + " " + priority + " " + "//" + " " + title + " " + "//" + " " + description);
    }

}
