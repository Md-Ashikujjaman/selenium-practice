package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Locators extends DriverSetup{

    @Test
    public void testLocator() throws InterruptedException {
        driver.get("https:www.google.com");
        WebElement searchArea = driver.findElement(By.id("APjFqb"));
        searchArea.sendKeys("Dhaka");
        Thread.sleep(3000);

        driver.findElement(By.className("gNO89b")).click();

        Thread.sleep(5000);
    }
}
