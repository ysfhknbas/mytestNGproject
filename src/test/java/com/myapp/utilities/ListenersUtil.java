package com.myapp.utilities;
import org.testng.IRetryAnalyzer;
import org.testng.*;
import org.testng.annotations.IAnnotation;
import org.testng.ITestContext;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ListenersUtil implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {

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
        // System.out.println("onTestSuccess : once after each failed test cases(@Test) :"+result.getName());
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
    private int retryCount = 0;
    private static final int maxRetryCount = 3;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
    @Override
    public void transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testmethod){

        annotation.setRetryAnalyzer(ListenersUtil.class);
    }






}
