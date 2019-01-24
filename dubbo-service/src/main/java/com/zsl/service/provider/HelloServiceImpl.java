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
        System.out.println("222222222");
        return "Hello " + name + "!";
    }
}