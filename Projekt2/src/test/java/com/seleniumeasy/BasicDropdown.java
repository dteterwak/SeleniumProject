package com.seleniumeasy;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasicDropdown {

    WebDriver driver;


    public BasicDropdown(WebDriver driver)
    {
        this.driver = driver;
    }

    public void navigateTo(){
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    }

    public void chooseDay(){
        WebElement element = driver.findElement(By.id("select-demo"));
        Select se = new Select(element);
        se.selectByValue("Wednesday");
    }

    public void multipleSelect(){
        WebElement element = driver.findElement(By.id("multi-select"));
        Select se = new Select(element);

        se.selectByValue("Texas");
        se.selectByValue("New Jersey");
        se.selectByValue("California");

        List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
        for (WebElement webElement : allSelectedOptions)
        {
            System.out.println("You have selected ::"+ webElement.getText());
        }

        driver.findElement(By.xpath("//button[@id='printAll']")).click();


        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Day selected :- Wednesday"));
        Assert.assertTrue(driver.getPageSource().contains("Options selected are : Texas,New Jersey,California"));
    }


}
