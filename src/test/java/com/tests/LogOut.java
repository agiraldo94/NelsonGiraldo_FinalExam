package com.tests;

import com.pages.home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogOut extends BaseTests{

    @Test
    public void doLogOut(){
        driver.getDriver().switchTo().frame(0);
        HomePage homePage =  getHomePage();
        homePage.iconAccount.click();
        homePage.liLogOut.click();
        Assert.assertTrue(homePage.liUser.getText().length()==8);
    }
}
