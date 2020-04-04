package com.huanghui;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: MainApplication
 * DATE: 2020/3/22
 * TIME: 10:31
 * VERSION:1.0.0
 * JDK 1.8
 */
@SpringBootApplication
public class MainApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
