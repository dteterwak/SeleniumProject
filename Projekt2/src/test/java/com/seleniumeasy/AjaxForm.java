package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxForm {
    WebDriver driver;

    public AjaxForm(WebDriver driver) {
        this.driver = driver;
    }

    public void AjaxFormSubmit() {
        driver.findElement(By.id("btn-submit")).click();

        driver.findElement(By.id("title")).sendKeys("Name");
        driver.findElement(By.id("description")).sendKeys("Comment");

        driver.findElement(By.id("btn-submit")).click();


        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
