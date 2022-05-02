package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    //create the logintest object
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter “Admin” username
        loginPage.enterUserName("Admin");
        // Enter “admin123 password
        loginPage.enterPassword("admin123");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the ‘Welcome’ text is display
        //this os form requirement
        String expectedLogInText = "Welcome";
        String actualLogInText = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedLogInText,actualLogInText.substring(0,7),"text is not match");
    }

}
