package com.hyq.aop.aspectj.service;

import org.springframework.stereotype.Service;

/**
 * Created by heyuqiu on 2019/1/20.
 */
@Service
public class UserService {
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }
}
