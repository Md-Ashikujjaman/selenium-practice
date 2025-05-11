package org.example;


import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class FirstTest extends DriverSetup{


    @Test
    public void testWebPageLoad() {
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testWebPageTitle(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

}

