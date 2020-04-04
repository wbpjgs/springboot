package com.huanghui.controller;

import com.fasterxml.jackson.core.sym.NameN;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: HelloController
 * DATE: 2020/3/22
 * TIME: 10:35
 * VERSION:1.0.0
 * JDK 1.8
 */

@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping(value = "/hello")
    public String hello() {
        return  "Hello World" + name;
    }
}
