package com.boardgame.battlefield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BattlefieldApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattlefieldApplication.class, args);
    }

}
