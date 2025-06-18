package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class TestNGAnnotations {

    @Test()
    public void testCase2(){
        System.out.println("Normal Test case 2");
    }

    @Test(priority = 1)
    public void testCase1(){
        System.out.println("Normal Test case 1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute After every method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute Before every class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute After every class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute Before every Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute After every Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute first");
    }


    @Test
    public void TestAssertion(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getTitle();

        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Test done 1");
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        System.out.println("Test done 2");

        SoftAssert softAssert= new SoftAssert();
        System.out.println("Send keys");
        softAssert.assertEquals(1,1);
        System.out.println("Click on element");
        softAssert.assertFalse(false);
        System.out.println("visible");
        softAssert.assertTrue(true);
        softAssert.assertAll();


    }
}
