package com.vytrack.tests;

import com.vytrack.pages.HomePage;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class HomePageTest extends TestBase {

    @Test
    public void testHomePage(){

        //Given store/sales manager is on the homePage
        //Then verify user view 8 models names [verify the names]

         LoginPage loginPage = new LoginPage();
         loginPage.goTo();
         loginPage.login("storemanager65","UserUser123");

        HomePage homePage = new HomePage();

        for (WebElement eachModule : homePage.moduleNames) {
            System.out.println("eachModule.getText() = " + eachModule.getText());
        }


        assertEquals (homePage.moduleNames.size(),8);
    }




     }

