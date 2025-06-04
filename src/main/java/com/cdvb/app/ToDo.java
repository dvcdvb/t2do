package com.cdvb.app;

public class ToDo {

    String Title;
    String Description;
    int Priority;

    public void todoTake(String Title, String Description, int Priority) {
        this.Title = Title;
        this.Description = Description;
        this.Priority = Priority;
    }

}
