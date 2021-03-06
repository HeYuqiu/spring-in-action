package com.hyq.aop.aspectj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by heyuqiu on 2019/1/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testProxy() {
        System.out.println("After Proxy......");
        userService.sayHello("hetiantian");
    }
}