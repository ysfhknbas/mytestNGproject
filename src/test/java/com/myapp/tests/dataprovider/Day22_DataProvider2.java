package com.myapp.tests.dataprovider;

import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day22_DataProvider2 {

    @DataProvider
    public Object[][] productListProvider(){

        Object productList[][] ={
                {"tesla"},
                {"rivian"},
                {"nio"},
                {"lucid"},
                {"bmw"},
                {"volvo"}
                                };
        return productList;
    }

    @DataProvider
    public Object[][] adminInfoProvider(){

        Object admin[][]=   {
                {"admin1","12345"},
                {"admin2","41546"},
                {"admin3","65465"}
                            };
        return admin;
    }


    @Test(dataProvider="productListProvider")
    public void producyTest(String data)
    {
            System.out.println(data);

            Driver.getDriver().get("https://google.com");
            Driver.getDriver().findElement(By.name("q")).sendKeys(data, Keys.ENTER);
            Assert.assertFalse(Driver.getDriver().getTitle().contains(data));
            Driver.closeDriver();
    }




    @Test(dataProvider = "adminInfoProvider")
    public void adminTest(String adnin, String pass){
        System.out.println("admin = "+adnin+" *** "+"pass = "+pass);

    }






}
