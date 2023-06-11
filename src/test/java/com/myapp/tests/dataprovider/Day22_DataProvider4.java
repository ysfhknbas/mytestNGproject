package com.myapp.tests.dataprovider;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.*;
import org.testng.annotations.Test;

public class Day22_DataProvider4 {



    @Test(dataProvider = "excelCustomerDataProvider",dataProviderClass = DataProviderUtils.class)
    public void customerLoginTest(String username, String pass){
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
        RentalHomePage rentalHomePage = new RentalHomePage();
        RentalLoginPage rentalLoginPage = new RentalLoginPage();

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
