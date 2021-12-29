package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("groupOnClass1 的 stu1111 运行");
    }

    public void stu2(){
        System.out.println("groupOnClass1 的 stu222222 运行");
    }
}
