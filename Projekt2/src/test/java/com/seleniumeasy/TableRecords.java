package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableRecords {
    WebDriver driver;

    public TableRecords(WebDriver driver){
        this.driver = driver;
    }

    public void filterTable(){
        driver.findElement(By.xpath("//button[@data-target='cancelado']")).click();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@data-target='all']")).click();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@data-target='all']")).click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
