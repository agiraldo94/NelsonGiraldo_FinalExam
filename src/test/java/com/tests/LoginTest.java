package com.tests;

import com.pages.home.HomePage;
import com.pages.home.Iframe;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests{

    Logger log = Logger.getLogger("Login");

    @Test
    @Parameters({"user","password"})
    public void doLogin(String user, String password) {
        try {
            HomePage homePage = getHomePage();
            Iframe iframe = getIframe();
            homePage.iconAccount.click();
            homePage.liLogin.click();
            driver.getDriver().switchTo().frame(homePage.iframe);
            driver.getDriverWait().until(ExpectedConditions.visibilityOf(iframe.txtEmail));
            iframe.txtEmail.sendKeys(user);
            iframe.txtPassword.sendKeys(password);
            iframe.btnLogIn.click();
            Assert.assertTrue(homePage.liUser.getText().length()>8);
        }catch (Exception e){
            log.error(e.getMessage());
        }

    }
}
