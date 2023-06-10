package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalHomePage {

    public RentalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement ok;

}
