package com.tests;

import com.config.Driver;
import com.pages.home.HomePage;
import com.pages.home.Iframe;
import org.testng.annotations.*;

public class BaseTests {
    Driver driver;

    private HomePage homePage;
    private Iframe iframe;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void setUpDriver(String browser){
        driver = new Driver(browser);
        homePage = new HomePage(driver.getDriver());
        iframe = new Iframe(driver.getDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void close(){
        driver.getDriver().quit();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public Iframe getIframe() {
        return iframe;
    }
}
