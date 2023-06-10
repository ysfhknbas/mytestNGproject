package com.myapp.tests.smoketestsuite.logintests;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class Day20_BadLogin {
    @Test
    public void badLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.login.click();

        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.email.sendKeys("jack@gmail.com");
        rentalLoginPage.pass.sendKeys("fakepass");
        rentalLoginPage.loginbtn.click();

        ReusableMethods.verifyActualAndExpectedTextMatch("Bad credentials",rentalLoginPage.errorMessage);

        Driver.closeDriver();






    }
}