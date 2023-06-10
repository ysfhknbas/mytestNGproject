package com.myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day18_Assertions {

    @Test
    public void hardAssertion(){

        System.out.println("Starting the test case");
        Assert.assertTrue(true);
        System.out.println("line 13 codes");
        Assert.assertEquals(2,4);
        System.out.println("line 15 codes");
    }


    @Test
    public void softAssertion(){

        System.out.println("starting test case");
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(true);
        System.out.println("line 26");
        softAssert.assertEquals(3,4);
        System.out.println("line 28");
        softAssert.assertAll("test finished"); // last code
        System.out.println("line 30");  // will not run
    }

    @Test
    public void hardAssert2(){
        System.out.println("line35");
        assert  6>4;
        System.out.println("line37");
        assert 6<4;
        System.out.println("line 39");


    }

}
