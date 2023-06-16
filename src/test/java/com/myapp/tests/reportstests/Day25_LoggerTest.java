package com.myapp.tests.reportstests;

import com.myapp.utilities.LoggerUtils;
import org.testng.annotations.Test;

public class Day25_LoggerTest {

    @Test
    public void test1(){
        LoggerUtils.info("info LOG");
        LoggerUtils.warn("warn LOG");
        LoggerUtils.error("error LOG");
    }
}
