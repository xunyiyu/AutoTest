package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1() {
        System.out.println("Test测试用例1-2");
    }

    @Test
    public void testCase2() {
        System.out.printf("testCase222222 Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test测试用例2-2");
    }

    @BeforeMethod
    public void beforMethod() {
        System.out.println("beforeMethod在测试用例方法前执行");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod在测试用例方法后执行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("---beforeClass----类之前执行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("---afterClass----类之后执行");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("---beforeSuite---");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("---afterSuite---");

    }
}
