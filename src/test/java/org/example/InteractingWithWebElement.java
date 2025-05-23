package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void interactWithElement() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        WebElement head = driver.findElement(By.xpath("//h1[normalize-space()='Student Registration Form']"));
        String headText = head.getText();
        System.out.println(headText);

        driver.findElement(By.cssSelector("#name")).sendKeys("Ashikujjaman");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("ashik@example.com");
        Thread.sleep(3000);

        WebElement gender = driver.findElement(By.xpath("//input[@id='gender']"));
        gender.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@id='mobile'])[1]")).sendKeys("01000000000");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#dob")).sendKeys("05/23/2025");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='subjects']")).sendKeys("Web Automation");

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(8) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Dhaka, Bangladesh");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//option[@value='NCR'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//option[@value='Meerut'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='picture']")).sendKeys("C:\\Users\\ashik_6mnfh2l\\OneDrive\\Desktop\\avatar-1.png");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);


    }
}
