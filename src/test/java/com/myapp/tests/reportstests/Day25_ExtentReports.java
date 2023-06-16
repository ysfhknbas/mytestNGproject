package com.myapp.tests.reportstests;

import com.myapp.pages.OrangeHRMDashboardPage;
import com.myapp.pages.OrangeHRMLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ExtentReportUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Day25_ExtentReports {

    @Test
    public void extentReportsTest() throws IOException {
        ExtentReportUtils.pass("Testing starts...");
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        OrangeHRMDashboardPage orangeHRMDashboardPage= new OrangeHRMDashboardPage();

        ExtentReportUtils.pass("Going to the url..."+ConfigReader.getProperty("orange_app_url"));
        Driver.getDriver().get(ConfigReader.getProperty("orange_app_url"));

        ExtentReportUtils.pass("Entering username as Admin...");
        orangeHRMLoginPage.username.sendKeys("Admin");

        ExtentReportUtils.pass("Entering password as admin123...");
        orangeHRMLoginPage.password.sendKeys("admin123");

        ExtentReportUtils.passAndCaptureSS("Credentials are entered...");

        ExtentReportUtils.pass("Clicking on the submit button...");
        orangeHRMLoginPage.submitButton.click();

//      Verify the login is successful
        ExtentReportUtils.pass("Verifying the login...");
        Assert.assertTrue(orangeHRMDashboardPage.profile.isDisplayed());

        //ExtentReportUtils.pass("Test is complete...");
        ExtentReportUtils.passAndCaptureSS("Test is complete...");
        ExtentReportUtils.flush();
        Driver.closeDriver();
    }
}
