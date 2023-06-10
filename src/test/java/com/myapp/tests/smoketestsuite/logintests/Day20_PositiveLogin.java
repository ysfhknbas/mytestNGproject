package com.myapp.tests.smoketestsuite.logintests;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class Day20_PositiveLogin {


    @Test
    public void adminLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.login.click();

        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.email.sendKeys(ConfigReader.getProperty("rental_email"));
        rentalLoginPage.pass.sendKeys(ConfigReader.getProperty("rental_pass"));
        rentalLoginPage.loginbtn.click();

        ReusableMethods.verifyElementDisplayed(rentalHomePage.userID);
        Driver.closeDriver();







    }
}
