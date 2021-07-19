package com.Spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsoleInterface {
    @Override
    public void up(){
        System.out.println("Clicked Up in Contra");
    }
    @Override
    public void down(){
        System.out.println("Clicked Down in Contra");
    }
    @Override
    public void left(){
        System.out.println("Clicked Left in Contra");
    }
    @Override
    public void right(){
        System.out.println("Clicked Right in Contra");
    }
}
