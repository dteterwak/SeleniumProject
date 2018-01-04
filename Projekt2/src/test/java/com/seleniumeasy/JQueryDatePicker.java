package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDatePicker {
    WebDriver driver;

    public JQueryDatePicker(WebDriver driver){
        this.driver = driver;
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
}
