package com.qcby.service.Impl;

import com.qcby.service.HelloService;

/**
 * @Author: 申劭明
 * @Date: 2019/9/1 15:10
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void saySomething(String msg) {
        System.out.println(msg);
    }
}
