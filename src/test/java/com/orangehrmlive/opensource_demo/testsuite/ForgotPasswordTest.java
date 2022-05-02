package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.ForgotPasswordPage;
import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    //create the logintest object
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        loginPage.clickOnForgotPassword();
        //* Verify the text ‘Forgot Your Password?’
        //this os form requirement
        String expectedforgotPasswordText = "Forgot Your Password?";
        String actualForgotPasswordText = forgotPasswordPage.getForgotPasswordMessage();
        Assert.assertEquals(expectedforgotPasswordText,actualForgotPasswordText,"forgot password not match");
    }
}
