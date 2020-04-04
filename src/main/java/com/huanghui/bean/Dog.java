package com.huanghui.bean;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Dog
 * DATE: 2020/3/22
 * TIME: 16:46
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
