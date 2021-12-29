package com.course.testng.suite;

import org.testng.annotations.*;

public class LoginTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 运行啦");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 运行啦");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 运行啦");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 运行啦");
    }

    @Test
    public void Login(){
        System.out.println("淘宝登录成功!!!");
    }
}
