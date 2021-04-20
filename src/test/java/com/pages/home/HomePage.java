package com.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID,using = "global-user-trigger")
    public WebElement iconAccount;

    @FindBy(how = How.CSS,using = ".account-management li:nth-child(7)")
    public WebElement liLogin;

    @FindBy(how = How.CSS,using = ".account-management li:nth-child(9)")
    public WebElement liLogOut;

    @FindBy(how = How.CSS,using = ".account-management li:nth-child(5)")
    public WebElement liProfile;

    @FindBy(how = How.CSS,using = ".display-user")
    public WebElement liUser;

    @FindBy(how = How.ID, using = "disneyid-iframe")
    public WebElement iframe;
}
