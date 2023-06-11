package com.myapp.tests.dataprovider;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day22_DataProvider3 {

    RentalHomePage rentalHomePage = new RentalHomePage();
    RentalLoginPage rentalLoginPage = new RentalLoginPage();

    @Test(dataProvider = "customerDataProvider",dataProviderClass = DataProviderUtils.class)
    public void customerLoginTest(String username, String pass){
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
        WaitUtils.waitFor(1);
        rentalHomePage.login.click();
        WaitUtils.waitFor(1);
        rentalLoginPage.email.sendKeys(username);
        WaitUtils.waitFor(1);
        rentalLoginPage.pass.sendKeys(pass);
        WaitUtils.waitFor(1);
        rentalLoginPage.loginbtn.click();
        WaitUtils.waitFor(1);
        ReusableMethods.verifyElementDisplayed(rentalHomePage.userID);
        WaitUtils.waitFor(1);
        rentalHomePage.userID.click();
        WaitUtils.waitFor(1);
        rentalHomePage.logout.click();
        WaitUtils.waitFor(1);
        rentalHomePage.ok.click();
        WaitUtils.waitFor(1);
        Driver.closeDriver();
    }
}
