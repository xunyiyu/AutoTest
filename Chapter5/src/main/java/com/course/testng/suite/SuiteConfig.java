package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest1 运行啦");
    }


}
