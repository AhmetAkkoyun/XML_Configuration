package com.ahmetakkoyun.annotation.qualifier;

import org.springframework.stereotype.Component;

@Component
public interface IRunableQualifier {

    public void up();

    public void down();
    public void left();

    public  void right();

}
