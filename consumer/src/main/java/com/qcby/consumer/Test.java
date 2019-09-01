package com.qcby.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qcby.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: 申劭明
 * @Date: 2019/9/1 16:42
 */
@Component
public class Test {

    @Reference
    private static HelloService helloService;

    public static void main(String[] args) {
        helloService.saySomething("BeryAllen");
    }
}
