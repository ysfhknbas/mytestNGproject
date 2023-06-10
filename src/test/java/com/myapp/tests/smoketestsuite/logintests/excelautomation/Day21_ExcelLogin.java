package com.myapp.tests.smoketestsuite.logintests.excelautomation;

import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ExcelUtils;
import com.myapp.utilities.ReusableMethods;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class Day21_ExcelLogin {

    RentalHomePage rentalHomePage = new RentalHomePage();
    RentalLoginPage rentalLoginPage = new RentalLoginPage();
    ExcelUtils excelUtils;
    List<Map<String,String>> datalist;


    @Test
    public void customerLoginTest(){
        String path ="./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        excelUtils = new ExcelUtils(path,sheetName);
        datalist = excelUtils.getDataList();
        //System.out.println(datalist);

        for (Map<String,String> maps: datalist) {

            Driver.getDriver().get(ConfigReader.getProperty("blue_rental_home"));
            rentalHomePage.login.click();
            rentalLoginPage.email.sendKeys(maps.get("username"));
            rentalLoginPage.pass.sendKeys(maps.get("password"));
            rentalLoginPage.loginbtn.click();
            ReusableMethods.verifyElementDisplayed(rentalHomePage.userID);
            rentalHomePage.userID.click();
            rentalHomePage.logout.click();
            rentalHomePage.ok.click();
        }
        rentalHomePage.ok.click();
        Driver.closeDriver();
    }
}
