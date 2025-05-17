package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
public class Locators extends DriverSetup{

    @Test
    public void testLocator() throws InterruptedException {
        /*driver.get("https:www.google.com");
        WebElement searchArea = driver.findElement(By.id("APjFqb"));
        searchArea.sendKeys("Dhaka");
        Thread.sleep(3000);

        driver.findElement(By.className("gNO89b")).click();

        driver.switchTo().newWindow(WindowType.TAB);*/
        driver.get("https://www.google.com/maps/");
        driver.manage().window().fullscreen();
//        driver.findElement(By.cssSelector("button[aria-label='মেনু']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("button.aAaxGf.T2ozWe")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("English")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[href*='google.com/maps'][href*='hl=en']")).click();
        /*driver.findElement(By.className("wR3cXd")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("aAaxGf")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("English")).click();*/
//        Thread.sleep(2000);

        WebElement searchInMap = driver.findElement(By.className("xiQnY"));
        searchInMap.sendKeys("Farmgate Metro Rail Station");
        Thread.sleep(2000);
        driver.findElement(By.className("mL3xi")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("g88MCb")).click();
        Thread.sleep(2000);

        WebElement startPoint = driver.findElement(By.className("tactile-searchbox-input"));
        driver.findElement(By.className("tactile-searchbox-input")).clear();
        startPoint.sendKeys("Manik Mian Avenue West Bus Stop");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[aria-label = 'খুঁজুন']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.className("m6Uuef")).click();
        driver.findElement(By.cssSelector("button[data-tooltip = 'হাঁটা']")).click();
        Thread.sleep(10000);
//walking distance
        String byRoad = driver.findElement(By.id("section-directions-trip-title-0")).getText();
        System.out.println("Road : " + byRoad);
        String distance = driver.findElement(By.xpath("//div[contains(text(),'কি.মি.')]")).getText();
        System.out.println("Distance: " + distance);
        String timeneed = driver.findElement(By.xpath("//div[contains(text(),'মিনিট')]")).getText();
        System.out.println("Expected Time : " + timeneed);
        Thread.sleep(5000);
    }
}
