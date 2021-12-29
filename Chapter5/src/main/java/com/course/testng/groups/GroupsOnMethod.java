package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void testgroup1() {
        System.out.println("testgroup1 执行啦");
    }

    @Test(groups = "server")
    public void testgroup2() {
        System.out.println("testgroup2 执行啦");
    }


    @Test(groups = "client")
    public void testgroup3() {
        System.out.println("testgroup3 执行啦");
    }

    @Test(groups = "client")
    public void testgroup4() {
        System.out.println("testgroup4 执行啦");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！");
    }


    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！");
    }
}
