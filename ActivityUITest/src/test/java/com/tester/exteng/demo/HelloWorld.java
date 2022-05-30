package com.tester.exteng.demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorld {
    public static AndroidDriver driver;

    public void setup() throws MalformedURLException {

        //负责启动服务端时的参数设置,本质上是key value的对象,用来告诉Appium服务器，被测试的安卓系统的环境，app叫什么名等等。
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android"); //被测移动端系统什么名
        caps.setCapability("platformVersion", "10.0.0");//系统版本

        caps.setCapability("deviceName", "3f945c88");    //用adb devices 获取到的。

        // 设置输入法是为了可以输入中文，启用Unicode输入，默认 false。
        caps.setCapability("unicodeKeyboard", "True");
        caps.setCapability("resetKeyboard", "True");


        //正常app的包名、和启动的activity用aapt命令进行获取：adb shell dumpsys window | grep mCurrentFocus
        // 被测app的包名
        caps.setCapability("appPackage", "com.baidu.searchbox");   //
        // 被测app的启动activity
        caps.setCapability("appActivity", "com.baidu.searchbox.MainActivity");//被测app的入口activity
        caps.setCapability("sessionOverride", true);
        // 如果把这项注释掉就是默认状态，默认状态是测试后停止并清除应用程序数据，不要卸载apk
        caps.setCapability("noReset", true);

        //命令超时时间
        caps.setCapability("newCommandTimeout", 600);
        //初始化，0.0.0.0:4723为a服务端
        //与Appium Server 建立通信的链接！

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        // 实例化一个Android driver
        driver = new AndroidDriver(url, caps);
    }


}
