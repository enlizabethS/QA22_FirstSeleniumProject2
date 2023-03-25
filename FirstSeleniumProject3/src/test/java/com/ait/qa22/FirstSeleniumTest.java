package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp(){}
    @BeforeMethod
    public void setUp() {
         driver = new FirefoxDriver();
//        driver = new SafariDriver();
        driver.get("https://www.google.com");
    }

    //test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!!!");
    }

    //after - tearDown(){}
//    @AfterMethod
//    public void tearDown(){
//
//    }
}
