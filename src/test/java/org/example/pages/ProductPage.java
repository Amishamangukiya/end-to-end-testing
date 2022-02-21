package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/a")
    private WebElement mouseOnDress;

     @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
     private WebElement casualDress;

     @FindBy(xpath = "//*[@title='Add to cart']")
     private WebElement addToCart;

     @FindBy(xpath = "//*[@title='Proceed to checkout']")
     private WebElement proceedToCheckout;

     @FindBy(className = "breadcrumb clearfix")
     private  WebElement  yourShoppingCart;

     @FindBy(xpath = "//*[@class='btn btn-default button button-medium']")
     private WebElement firstProceedToCheckout;

     @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
     private WebElement secondProceedToCheckout;

     @FindBy(xpath = "//input[@id='cgv']")
     private WebElement termsAndCondition;

     @FindBy(xpath = "//button[@name='processCarrier']")
     private WebElement thirdProceedToCheckout;




    public  void selectDress() {
         Actions actions = new Actions(driver);
         actions.moveToElement(mouseOnDress).build().perform();}

    public void selectCasualDress(){
        casualDress.click();
    }
    public void MouseAddToCart(){
        Actions a = new Actions(driver);
        a.moveToElement(addToCart).build().perform();
    }
public void clickOnProceedToCheckout(){
        proceedToCheckout.click();
}

public  String getYourShoppingCart(){
        return  yourShoppingCart.getText();
}

public void clickOnFirstProceedToCheckout(){
        firstProceedToCheckout.click();
}

public void clickOnSecondProceedToCkeckout(){
        secondProceedToCheckout.click();
}

public void clickOnTermsAndConditionBtn(){
        termsAndCondition.click();
}
public void clickOnThirdProceedToCheckout(){
        thirdProceedToCheckout.click();
}




    }


