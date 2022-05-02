package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("txtUsername");
    By passwordField = By.xpath("//input[@id='txtPassword']");
    By loginButton = By.name("Submit");
    By welcomeLoginText = By.partialLinkText("Welcome");
    By forgotPasswordLink = By.linkText("Forgot your password?");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeMessage(){
        return getTextFromElement(welcomeLoginText);
    }

    public void clickOnForgotPassword(){
        clickOnElement(forgotPasswordLink);
    }

}
