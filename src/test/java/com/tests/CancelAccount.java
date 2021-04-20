package com.tests;

import com.pages.home.HomePage;
import com.pages.home.Iframe;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CancelAccount extends LoginTest {

    @Test
    @Parameters({"user","password"})
    public void cancel(String user, String password){
        doLogin(user,password);
        HomePage homePage = getHomePage();
        Iframe iframe = getIframe();
        homePage.iconAccount.click();
        driver.getDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(homePage.iframe));
        JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", iframe.deleteOption);
        iframe.deleteOption.click();
    }
}
