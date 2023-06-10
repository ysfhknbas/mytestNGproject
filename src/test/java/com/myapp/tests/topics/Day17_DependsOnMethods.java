package com.myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day17_DependsOnMethods {

    @Test
    public void homePage(){

        System.out.println("on the home page");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "homePage")
    public void searchPage(){
        System.out.println("on the search page");

    }

    @Test
    public void checkoutPage(){
        System.out.println("on the checkout page");

    }


}
