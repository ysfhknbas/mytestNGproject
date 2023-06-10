package com.myapp.tests.topics;

import com.myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Day18_FirstDriverTest {

    @Test
    public void firstDriverTest(){

        Driver.getDriver().get("https://amazon.com");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));


        Driver.closeDriver();

    }
}
