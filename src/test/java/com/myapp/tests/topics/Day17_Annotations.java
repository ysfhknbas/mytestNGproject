package com.myapp.tests.topics;

import org.testng.annotations.*;

public class Day17_Annotations {

    /*
    @Before and @After: 5 annotations : suite > test > group > class > method
    @Test(enable = false) disables the test case like ignore but stronger
    @Test(priority = number) assign by number
    */

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after Test");
    }

    @BeforeGroups(groups = "Regression")
    public void beforeGroups(){
        System.out.println("before Groups");
    }

    @AfterGroups(groups = "Regression")
    public void afterGroups(){
        System.out.println("after Groups");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }


    @Test(priority = -1)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(groups = "Regression")
    public void test3(){
        System.out.println("Test 3");
    }

    @Test(enabled = false)
    public void test4(){
        System.out.println("Test 4");
    }

    @Test(priority = 1)
    public void test5(){
        System.out.println("Test 5");
    }

    @Test() @Ignore
    public void test6(){
        System.out.println("Test 6");
    }

    @Test(groups = "Regression")
    public void test7(){
        System.out.println("Test 7");
    }

    @Test()
    public void test8(){
        System.out.println("Test 8");
    }





}
