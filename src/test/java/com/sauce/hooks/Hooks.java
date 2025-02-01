package com.sauce.hooks;

import com.sauce.base.BaseTest;
import com.sauce.utils.ConfigReader;
import com.sauce.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        // Load configuration based on the environment
        String env = System.getProperty("env", "prod");
        ConfigReader.loadConfig(env);
        String baseUrl = ConfigReader.getProperty("url");

        // Initialize WebDriver and open the browser
        BaseTest.driver = DriverFactory.getDriver();
        BaseTest.driver.manage().window().maximize();
        BaseTest.driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        if (BaseTest.driver != null) {
            BaseTest.driver.quit();
        }
    }

}
