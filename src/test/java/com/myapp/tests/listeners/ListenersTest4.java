package com.myapp.tests.listeners;

import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ListenersTest4 {

    @Test(retryAnalyzer = com.myapp.utilities.ListenersUtil.class)
    public void test4(){
        System.out.println("Fail-Exception");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().findElement(By.id("wrong id"));
        //   throw new NoSuchElementException("No Such");
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
