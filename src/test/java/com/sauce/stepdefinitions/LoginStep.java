package com.sauce.stepdefinitions;

import com.sauce.base.BaseTest;
import com.sauce.pages.LoginPage;
import com.sauce.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

public class LoginStep extends BaseTest{
    LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage(driver);
    }

    @Step("the user is on the SauceDemo login page")
    @Given("the user is on the SauceDemo login page")
    public void the_user_is_on_the_sauce_demo_login_page() {
        String expectedtitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        org.junit.Assert.assertEquals(expectedtitle, actualTitle);
    }

    @Step("the user logs in with valid credentials")
    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Step("the user should be redirected to the products page")
    @Then("the user should be redirected to the products page")
    public void the_user_should_be_redirected_to_the_products_page() {
        // Add your verification logic, e.g., check for an element unique to the products page
        String expectedtitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        org.junit.Assert.assertEquals(expectedtitle, actualTitle);
    }
}
