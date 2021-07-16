package com.Spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsoleInterface {
    @Override
    public void up(){
        System.out.println("Clicked Up");
    }
    @Override
    public void down(){
        System.out.println("Clicked Down");
    }
    @Override
    public void left(){
        System.out.println("Clicked Left");
    }
    @Override
    public void right(){
        System.out.println("Clicked Right");
    }
}
