package com.huanghui.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: BandWidth
 * DATE: 2020/3/22
 * TIME: 18:04
 * VERSION:1.0.0
 * JDK 1.8
 */
@Component
public class BandWidth {
    //从配置文件中获取单个属性值
    @Value("${bandwidth.name}")
    private String name;
    //使用spEl表达式计算值
    @Value("#{22*5}")
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BandWidth{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
