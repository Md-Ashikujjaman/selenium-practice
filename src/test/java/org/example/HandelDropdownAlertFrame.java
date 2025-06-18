package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandelDropdownAlertFrame extends DriverSetup{

    @Test
    public void interactWithDropdown() throws InterruptedException{

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownMenu = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownMenu);
        dropdownMenu.click();

        select.selectByIndex(2);
        Thread.sleep(3000);
        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println(selected_option.getText());

        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
//        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println(selected_option.getText());

        select.selectByValue("2");
//        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println(selected_option.getText());

        Thread.sleep(3000);




        List<WebElement> all_options = select.getOptions();
        System.out.println(all_options.size());
        for (WebElement option: all_options){
            System.out.println(option.getText());
        }
//        select.deselectAll();
//        select.deselectByIndex(2);

        /*Web Alert Handling*/

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        
    }
}