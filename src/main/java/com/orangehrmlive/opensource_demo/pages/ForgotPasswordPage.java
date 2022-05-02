package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotPasswordMessage = By.xpath("//div[@class='head']");

    public String getForgotPasswordMessage(){

        return getTextFromElement(forgotPasswordMessage);
    }
}
