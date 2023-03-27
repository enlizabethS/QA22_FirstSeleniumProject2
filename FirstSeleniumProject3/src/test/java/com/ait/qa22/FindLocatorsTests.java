package com.ait.qa22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindLocatorsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void startFindLocatorTest() {
       driver.findElement(By.id("city"));
       driver.findElement(By.className("input-label"));
       driver.findElement(By.name("viewport"));
        driver.findElement(By.linkText("Let the car work"));
        WebElement element = driver.findElement(By.partialLinkText("car"));
        System.out.println(element.getText());
    }
    @Test
    public void findElementByCssSelectorTest(){
//        driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector(".input-label"));
        driver.findElement(By.cssSelector("[href='/search']"));
        driver.findElement(By.cssSelector("[for*='ate']"));
        driver.findElement(By.cssSelector("[for^='da']"));
        driver.findElement(By.cssSelector("[for$='tes']"));
        driver.findElement(By.cssSelector(".ng-untouched.ng-pristine.ng-invalid.pac-target-input"));
        driver.findElement(By.xpath("//*[@ = '']"));
    }
    @Test
    public void findElementByXpathTest(){
        driver.findElement(By.xpath("//*[@id ='city']"));
        driver.findElement(By.xpath("//*[@class='input-label']"));
        driver.findElement(By.xpath("//*[@href='/search']"));
        driver.findElement(By.xpath("//*[contains(.,'ate')]"));
        driver.findElement(By.xpath("//*[starts-with(@for,'dat')]"));
    }

    @AfterMethod()
    public void tearDown(){
        driver.quit();
    }
}
