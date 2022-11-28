package com.jm;

public class UserBean {
    private String name;
    private int number;

    public int getNumber() {
        return number;
    }

    public void addNumber(){
        number++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
