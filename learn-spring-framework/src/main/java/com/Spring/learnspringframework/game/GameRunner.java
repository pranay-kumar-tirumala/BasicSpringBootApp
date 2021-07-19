package com.Spring.learnspringframework.game;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class GameRunner
{
    //private MarioGame game;
    //private SuperContraGame game;
    @Autowired
    private GamingConsoleInterface game;

    public GameRunner() {
    }
    //public GameRunner(MarioGame game) {this.game = game;}
    //public GameRunner(SuperContraGame game) {this.game = game;}
    public GameRunner(GamingConsoleInterface game) {this.game = game;}

    public void runGame(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
