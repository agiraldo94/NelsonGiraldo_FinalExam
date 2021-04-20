package com.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Iframe extends BasePage {

    public Iframe(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS,using = ".input-wrapper input[type=email]")
    public WebElement txtEmail;

    @FindBy(how = How.CSS,using = ".input-wrapper input[type=password]")
    public WebElement txtPassword;

    @FindBy(how = How.CSS,using = "button[aria-label='Log In']")
    public WebElement btnLogIn;

    @FindBy(how = How.CSS,using = "#cancel-account")
    public WebElement deleteOption;

}
