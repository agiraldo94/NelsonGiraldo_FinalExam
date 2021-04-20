package com.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        driver.get("https://www.espn.com/?src=com&_adblock=true");
    }

}
