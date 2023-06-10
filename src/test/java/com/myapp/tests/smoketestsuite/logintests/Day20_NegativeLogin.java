package com.myapp.tests.smoketestsuite.logintests;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import com.myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_NegativeLogin {

    @Test
    public void negativeLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.login.click();

        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.email.sendKeys("fake@bluerentalcars.com");
        rentalLoginPage.pass.sendKeys("fakepass");
        rentalLoginPage.loginbtn.click();
        //WaitUtils.waitForVisibility(rentalLoginPage.errorMessage,3);
        //Assert.assertTrue(rentalLoginPage.errorMessage.getText().contains("not found"));
        ReusableMethods.verifyActualAndExpectedTextMatch("User with email fake@bluerentalcars.com not found",rentalLoginPage.errorMessage);

        Driver.closeDriver();



    }

}
