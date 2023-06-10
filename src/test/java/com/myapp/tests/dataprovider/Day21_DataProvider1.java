package com.myapp.tests.dataprovider;

import com.myapp.utilities.DataProviderUtils;
import org.testng.annotations.Test;

public class Day21_DataProvider1 {


    @Test(dataProvider = "customerCredentials", dataProviderClass = DataProviderUtils.class)
    public void customerCredentialsTest(String usename, String pass){

        System.out.println("Usernames= "+usename);
        System.out.println("Passwords= "+pass);






    }
}
