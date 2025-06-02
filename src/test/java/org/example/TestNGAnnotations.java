package org.example;

import org.testng.annotations.*;

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
}
