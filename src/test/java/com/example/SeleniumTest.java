package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() throws Exception {
        // Connect to the Selenium server via the service URL
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), new ChromeOptions());
    }

    @Test
    public void testOpenWebsite() {
        driver.get("https://selenium.dev");
        // Add assertions here
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
