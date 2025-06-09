package de.reiqu.win_challenge;

import org.springframework.boot.SpringApplication;

public class TestWinChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.from(WinChallengeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
