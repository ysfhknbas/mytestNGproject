package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalLoginPage {

   public RentalLoginPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }


   @FindBy(id="formBasicEmail")
    public WebElement email;


   @FindBy(id= "formBasicPassword")
    public WebElement pass;


   @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginbtn;

   @FindBy(xpath ="//div[@role='alert']" )
    public WebElement errorMessage;
}
