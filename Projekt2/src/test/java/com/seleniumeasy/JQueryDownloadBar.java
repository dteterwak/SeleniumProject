package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JQueryDownloadBar {

    WebDriver driver;

    public JQueryDownloadBar(WebDriver driver){
        this.driver = driver;
    }

    public void startDownload(){
        driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
        try{
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']")).click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
