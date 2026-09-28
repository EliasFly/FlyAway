package com.puntoextraparcial.flyaway;

import org.springframework.boot.SpringApplication;

public class TestFlyAwayApplication {

    public static void main(String[] args) {
        SpringApplication.from(FlyAwayApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
