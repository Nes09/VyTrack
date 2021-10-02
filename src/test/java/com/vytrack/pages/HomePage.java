package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class HomePage {

@FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    public  List<WebElement> moduleNames;


public HomePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}



}




