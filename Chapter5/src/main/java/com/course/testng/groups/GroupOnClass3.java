package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "taecher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("groupOnClass3 的 teacher1111 运行");
    }

    public void teacher2(){
        System.out.println("groupOnClass3 的 teacher222222 运行");
    }
}
