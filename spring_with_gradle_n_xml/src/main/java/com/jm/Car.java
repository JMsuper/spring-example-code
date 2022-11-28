package com.jm;

public class Car {
    private Engine v8;

    public Car(){
        System.out.println("Car 생성자");
    }

    public Engine getEngine(){
        return v8;
    }

    public void setEngine(Engine e){
        this.v8 = e;
    }

    public void run(){
        System.out.println("엔진을 이용해 달린다.");
        v8.exec();
    }
}
