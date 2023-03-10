package com.krafttech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class LoginPages extends BasePage {

    public LoginPages() {

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(name = "email")
    public WebElement userEmailInput_loc;

    @FindBy(name = "password")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton_loc;

    @FindBy(xpath = "//*[contains(text(),'Email address or password is incorrect')]")
    public WebElement warningMessage_loc;


    public void loginUser(){

        String username= ConfigurationReader.get("userEmail");
        String password=ConfigurationReader.get("password");

        userEmailInput_loc.sendKeys(username);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();
    }

}
