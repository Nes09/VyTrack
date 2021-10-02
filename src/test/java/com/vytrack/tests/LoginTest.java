package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.assertTrue;

public class LoginTest extends TestBase {

    @Test
    public void testLogin(){

        LoginPage loginPage = new LoginPage();

        ArrayList<String> truckDriversUsers = new ArrayList<>();

        truckDriversUsers.addAll(Arrays.asList("user22" , "user22", "user23"));

        for (String eachUser : truckDriversUsers) {

            loginPage.goTo();

            loginPage.login(eachUser, "UserUser123");



            //assertTrue(loginPage.loginErrorMsgPresent());



        }
    }
}
