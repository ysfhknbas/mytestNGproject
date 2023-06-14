package com.myapp.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtil implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart : once before all test cases(@Test) :"+context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish : once after all test cases(@Test) :"+context.getName());
    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart : once before each test cases(@Test) :"+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess : once after each passing test cases(@Test) :"+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure : once after each failed test cases(@Test) :"+result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped : once after each skipped test cases(@Test) :"+result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage : once based on total test success percent :"+result.getName());
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout : once after each failed test case due to time out issue :"+result.getName());
    }
}
