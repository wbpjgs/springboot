package com.huanghui.beantest;

import com.huanghui.bean.BandWidth;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: BandWidthTest
 * DATE: 2020/3/22
 * TIME: 18:07
 * VERSION:1.0.0
 * JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BandWidthTest {
    @Autowired
    private BandWidth bandWidth;

    @Test
    public void test(){
        System.out.println(bandWidth);
    }
}
