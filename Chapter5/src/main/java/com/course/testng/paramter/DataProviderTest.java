package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataPovider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi",20},
                {"wanger",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法的name="+name+"；age="+age);

    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法的name="+name+"；age="+age);

    }
    @DataProvider(name = "methodData")
    public Object[][] providerDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan", 100},
                    {"lisi",200},
                    {"wanger",300}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wuwu", 55},
                    {"zhaoliu",66}
            };
        }

        return result;
    }

}
