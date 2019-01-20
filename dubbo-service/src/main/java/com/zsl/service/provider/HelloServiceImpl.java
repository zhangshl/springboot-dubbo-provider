package com.zsl.service.provider;

import com.zsl.client.HelloService;

public class HelloServiceImpl implements HelloService {
    static int i = 0;
    @Override
    public String sayHello(String name) {
//        i++;
//        if (i % 3 == 0) {
//            throw new RuntimeException("ex");
//        }
        return "Hello " + name + "!";
    }
}