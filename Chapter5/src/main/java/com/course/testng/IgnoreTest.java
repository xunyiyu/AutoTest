package com.course.testng;

import org.testng.annotations.*;

public class IgnoreTest {

    @Test
    public void iginorela(){
        System.out.println("iginor1 执行");
    }

    @Test(enabled = false)
    public void iginorela2(){
        System.out.println("iginor2 执行");
    }
}