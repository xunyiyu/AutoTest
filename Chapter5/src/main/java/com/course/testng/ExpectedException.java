package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    //预期结果为一个异常时——异常测试（）例如传入不合法参数

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是异常测试case执行");
    }

    //成功异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是异常测试case执行_成功");
        throw new RuntimeException();
    }
}
