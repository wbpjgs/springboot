package com.huanghui.beantest;

import com.huanghui.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.soap.Addressing;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: ControllerTest
 * DATE: 2020/3/22
 * TIME: 18:13
 * VERSION:1.0.0
 * JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {

    @Autowired
    private HelloController helloController;


    @Test
    public void test() {
        System.out.println(helloController.hello());
    }
}
