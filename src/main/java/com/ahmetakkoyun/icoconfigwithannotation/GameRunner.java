package com.ahmetakkoyun.icoconfigwithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    IRunable game;

    // const injection
//    public GameRunner(IRunable game)  {
//        this.game = game;
//    }

    public void run(){
        System.out.println("oyun çalışıyor ==> "+game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
