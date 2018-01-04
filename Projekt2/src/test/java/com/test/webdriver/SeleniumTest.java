package com.test.webdriver;

import com.seleniumeasy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.seleniumeasy.BasicCheckbox;

public class SeleniumTest {

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","J:/Selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
    }


    @Test
    public void testSelenium1(){

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

        SimpleForm object = new SimpleForm(driver);

        object.clickOnTextBox("TEST");
        object.totalAB("10","27");

        Assert.assertTrue(driver.getPageSource().contains("37"));
        Assert.assertTrue(driver.getPageSource().contains("TEST"));

        driver.quit();
    }

    @Test
    public void testSelenium2(){

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        BasicCheckbox object = new BasicCheckbox(driver);

        object.clickOnCheckBox();
        object.clickOnCheckBoxButton();

        Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));

        driver.quit();

    }

    @Test
    public void testSelenium3(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        BasicRadiobutton object = new BasicRadiobutton(driver);

        object.singleRadio();
        object.groupRadio();

        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
        Assert.assertFalse(driver.getPageSource().contains("Radio button 'Female' is checked"));

        Assert.assertTrue(driver.getPageSource().contains("Sex : Female"));
        Assert.assertTrue(driver.getPageSource().contains("Age group: 15 - 50"));
        driver.quit();
    }

    @Test
    public void testSelenium4(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        BasicDropdown object = new BasicDropdown(driver);

        object.chooseDay();
        object.multipleSelect();

        Assert.assertTrue(driver.getPageSource().contains("Day selected :- Wednesday"));
        Assert.assertTrue(driver.getPageSource().contains("Options selected are : Texas,New Jersey,California"));
    }

    @Test
    public void testSelenium5(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        AjaxForm object = new AjaxForm(driver);

        object.AjaxFormSubmit();

        Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));


        driver.quit();

    }


    @Test
    public void testSelenium6(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");

        InputForm object = new InputForm(driver);

        object.fillForm();

        driver.quit();
    }

    @Test
    public void testSelenium7(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/jquery-date-picker-demo.html");

        JQueryDatePicker object = new JQueryDatePicker(driver);

        object.pickFrom();
        object.pickTo();

        driver.quit();
    }

    @Test
    public void testSelenium8(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");

        JQueryDownloadBar object = new JQueryDownloadBar(driver);

        object.startDownload();
        driver.quit();
    }

    @Test
    public void testSelenium9(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");

        TableSearchFilter object = new TableSearchFilter(driver);

        object.filter();

        driver.quit();
    }

    @Test
    public void testSelenium10(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/table-records-filter-demo.html");

        TableRecords object = new TableRecords(driver);

        object.filterTable();

        driver.quit();
    }

}
