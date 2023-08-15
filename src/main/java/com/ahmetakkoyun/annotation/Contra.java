package com.ahmetakkoyun.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Contra implements IRunable {

    public void up(){
        System.out.println("Zıpla");
    }

    public void down(){
        System.out.println("Eğil");
    }

    public void left(){
        System.out.println("Geri git");
    }

    public  void right(){
        System.out.println("Ateş Et");
    }
}
