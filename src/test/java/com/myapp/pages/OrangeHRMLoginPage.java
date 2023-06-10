package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {

    public OrangeHRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //POM
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;



}
