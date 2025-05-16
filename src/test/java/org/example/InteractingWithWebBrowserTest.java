package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class InteractingWithWebBrowserTest extends DriverSetup{

    @Test
    public void testBrowserTask() throws InterruptedException{
        driver.get("https://google.com/gmail/");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.manage().window().minimize();
        Thread.sleep(1000);


        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com/en");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/maps/");
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);



        String tabHandel = driver.getWindowHandle();
        System.out.println("Instagram: " + tabHandel);


        List<String> handelsId = new ArrayList<>(driver.getWindowHandles());

        for (String handle: handelsId ){
            System.out.println(handle);
        }

        driver.close();

        driver.switchTo().window(handelsId.get(0));
        Thread.sleep(3000);



    }

}
