package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForm {

    WebDriver driver;

    public InputForm(WebDriver driver){
        this.driver = driver;
    }

    public void fillForm(){
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("(512)152-3151");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Pabianicka");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Lodz");
        driver.findElement(By.name("state")).click();
        driver.findElement(By.xpath("//option[text()='Texas']")).click();
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("5125");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.www.com");
        driver.findElement(By.xpath("//input[@value='yes']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Very important message");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();


        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
