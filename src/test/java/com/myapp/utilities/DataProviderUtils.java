package com.myapp.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] customerCredentials(){

        Object[][] customerInfo = {
                {"customer1","12345"},
                {"customer2","54321"},
                {"customer3","65445"}
        };
        return customerInfo;
    }

    @DataProvider
    public Object[][] customerDataProvider(){
        Object[][] customer={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
                            };
        return customer;
    }


    @DataProvider
    public Object[][] excelCustomerDataProvider(){

        String path ="./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();

    }



}
