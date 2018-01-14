package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDatePicker {
    WebDriver driver;

    public JQueryDatePicker(WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo(){
        driver.get("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
    }

    public void pickFrom(){
        WebElement frameElement = driver.findElement(By.xpath("//input[@class='hasDatepicker' and @name='from']"));
        frameElement.click();
        selectDate("1");

    }

    public void pickTo(){
        WebElement frameElement = driver.findElement(By.xpath("//input[@class='hasDatepicker' and @name='to']"));
        frameElement.click();
        selectDate("30");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectDate(String date){
        By calendarxPath = By.xpath("//td[not(contains(@class,'ui-datepicker-month'))]/a[text()='"+date+"']");
        driver.findElement(calendarxPath).click();
    }

    public void assertionFrom(){
        WebElement element = driver.findElement(By.xpath("//input[@class='hasDatepicker' and @name='from']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String date = (String) jse.executeScript("return arguments[0].value", element);
        System.out.println("Date:- " + date);
        Assert.assertEquals("01/01/2018", date);
    }

    public void assertionTo(){
        WebElement element2 = driver.findElement(By.xpath("//input[@class='hasDatepicker' and @name='to']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String date = (String) jse.executeScript("return arguments[0].value", element2);
        System.out.println("Date:- " + date);
        Assert.assertEquals("01/30/2018", date);
    }
}
