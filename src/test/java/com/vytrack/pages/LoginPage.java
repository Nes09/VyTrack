package com.vytrack.pages;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginPage {

    @FindBy(id="prependedInput")
    public WebElement usernameField;

    @FindBy(id ="prependedInput2")
    public WebElement passwordFiled;

    @FindBy(id="_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement errorMsg;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void goTo(){Driver.getDriver().get(ConfigurationReader.read("url"));}


    public void login(String username,String password){


        this.usernameField.sendKeys(username);
        this.passwordFiled.sendKeys(password);
        this.loginButton.click();

    }

    public boolean loginErrorMsgPresent(){
        return this.errorMsg.isDisplayed();
    }
}
