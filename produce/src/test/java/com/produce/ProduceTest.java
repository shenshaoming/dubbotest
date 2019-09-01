package com.produce;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: 申劭明
 * @Date: 2019/9/1 15:21
 */
public class ProduceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            //按任意键退出
            System.in.read();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
