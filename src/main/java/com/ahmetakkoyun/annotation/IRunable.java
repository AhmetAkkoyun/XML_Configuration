package com.ahmetakkoyun.annotation;

import org.springframework.stereotype.Component;

@Component
public interface IRunable {

    public void up();

    public void down();
    public void left();

    public  void right();

}
