package com.example.actions;

import org.openqa.selenium.support.PageFactory;
import com.example.locators.LoginPageLocators;
import com.example.utils.HelperClass;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null; 
	
    public LoginPageActions() {

    	this.loginPageLocators = new LoginPageLocators();

		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
    
    public void login(String strUserName, String strPassword) {
 
        // Fill user name
    	loginPageLocators.userName.sendKeys(strUserName);
 
        // Fill password
    	loginPageLocators.password.sendKeys(strPassword);
 
        // Click Login button
    	loginPageLocators.login.click();
 
    }
    
    // Get the error message when invalid credentials are provided
    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }
    
 
   // Get the error message when username is blank
   public String getMissingUsernameText() {
        return loginPageLocators.missingUsernameErrorMessage.getText();
    }
   
}