package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandelDropdownAlertFrame extends DriverSetup{

    @Test
    public void interactWithDropdown() throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownMenu = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownMenu);
        dropdownMenu.click();

        select.selectByIndex(2);

        Thread.sleep(3000);
    }
}