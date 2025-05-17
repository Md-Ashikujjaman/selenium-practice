package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class FindElementByLocators extends DriverSetup{

    @Test
    public void eightLocators() throws InterruptedException {
        driver.get("https://www.startech.com.bd/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.sendKeys("laptop");
        driver.findElement(By.xpath("//button[text()='search']")).click();

        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@class='XDyW0e']")).click();
        Thread.sleep(3000);

    }

}
