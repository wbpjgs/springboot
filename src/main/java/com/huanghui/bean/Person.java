package com.huanghui.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Person
 * DATE: 2020/3/22
 * TIME: 16:47
 * VERSION:1.0.0
 * JDK 1.8
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 *
 * @ConfigurationProperties 告诉spring boot 本类中所有的属性
 * 和配置文件中相关的配置进行绑定
 * prefix ="person" 代表本类中的属性和配置文件中那个属性进行一一映射
 * @Component 表示这个类是容器中的组件，才能使用容器提供的@ConfigurationProperties
 * 编写配置文件有提醒功能可导入这个依赖spring-boot-configuration-processor
 *
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    @Email
    private String name;
    private Integer age;
    private Date birthday;
    private Boolean boss;
    private Map<String, Object> maps;
    private List<Object> list;
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String lastName) {
        this.name = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", boss=" + boss +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
