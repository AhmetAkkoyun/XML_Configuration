package com.ahmetakkoyun.xml;

public class Mario implements IRunable {

    public void up(){
        System.out.println("Zıpla");
    }

    public void down(){
        System.out.println("Bir deliğe gir");
    }

    public void left(){
        System.out.println("Geri dön");
    }

    public  void right(){
        System.out.println("Hızlan");
    }

}
