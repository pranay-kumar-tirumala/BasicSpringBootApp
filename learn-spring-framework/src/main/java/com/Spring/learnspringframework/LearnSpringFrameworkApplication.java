package com.Spring.learnspringframework;

import com.Spring.learnspringframework.game.GameRunner;
import com.Spring.learnspringframework.game.MarioGame;
import com.Spring.learnspringframework.game.SuperContraGame;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) throws BeansException {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}