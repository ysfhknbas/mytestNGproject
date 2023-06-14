package com.myapp.tests.listeners;

import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


@Listeners(com.myapp.utilities.ListenersUtil.class)
public class ListenersTest1 {

    @Test
    public void test1(){
        System.out.println("pass");
        assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("fail");
        assertTrue(false);
    }
    @Test
    public void test3() {
        System.out.println("skip");
        throw new SkipException("Skip this test case");
    }
    @Test
    public void test4(){
        System.out.println("Fail-Exception");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().findElement(By.id("wrong id"));
        throw new NoSuchElementException("No Such");
    }

}
