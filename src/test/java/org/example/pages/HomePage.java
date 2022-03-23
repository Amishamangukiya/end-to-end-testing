package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    @FindBy(xpath = "//h1[contains(text(),'Automation Practice Website')]")
    private WebElement yourLogoText;

    public String getTextHomePage(){
        return yourLogoText.getText();
    }


}
