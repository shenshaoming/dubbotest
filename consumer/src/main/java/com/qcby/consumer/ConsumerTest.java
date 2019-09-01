package com.qcby.consumer;

import com.qcby.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author : 申劭明
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        HelloService demoService = (HelloService) context.getBean("helloService");

        demoService.saySomething("啊哈哈哈");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
