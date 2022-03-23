package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    private WebElement mouseOnDress;

     @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
     private WebElement casualDress;

     @FindBy(xpath = "//*[@class='product-image-container']/a[1]/img[1]")
     private WebElement hooverOnPrintedDress;

     @FindBy(xpath = "//*[@title='Add to cart']")
     private WebElement addToCart;

     ////*[@class='btn btn-default button button-medium']/span[1]

     @FindBy(xpath = "//*[@title='Proceed to checkout']/span[1]")
     private WebElement proceedToCheckout;

     @FindBy(xpath = "//*[@class='navigation_page']")
     private  WebElement  yourShoppingCart;

    // @FindBy(xpath = "//*[@class='btn btn-default button button-medium']/span[1]")
    // private WebElement firstProceedToCheckout;
     @FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium']/span[1]")
     private WebElement firstProceedToCheckout;

     @FindBy(id = "email")
     private WebElement userName;
     @FindBy(id = "passwd")
     private WebElement password;
     @FindBy(id = "SubmitLogin")
     private WebElement submitBtn;

     @FindBy(xpath = "//*[@class='button btn btn-default button-medium']/span[1]")
     private WebElement secondProceedToCheckout;

     @FindBy(id="cgv")
     private WebElement termsAndCondition;

    // @FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium']/span[1]")
    // private WebElement thirdProceedToCheckout;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    private WebElement thirdProceedToCheckout;

     @FindBy(xpath = "//*[@class='navigation_page']")
     private WebElement yourShoppingPage;

     @FindBy(xpath = "//*[@title='Pay by bank wire']")
     private WebElement payByBankWire;

     @FindBy(xpath = "//*[@class='navigation_page']")
     private WebElement bankWirePage;

     @FindBy(xpath = "//button[@class='button btn btn-default button-medium']/span")
     private WebElement confirmBtn;

     @FindBy(xpath = "//*[@class='navigation_page']")
     private WebElement confirmationPage;

     @FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
     private WebElement orderComplete;




    public  void selectDress() {
         Actions actions = new Actions(driver);
         actions.moveToElement(mouseOnDress).build().perform();}

    public void selectCasualDress(){
        casualDress.click();
    }

    public void hooverOnPrintedDress(){
        Actions a = new Actions(driver);
        a.moveToElement(hooverOnPrintedDress).build().perform();
    }
    public void clickAddToCart(){
        addToCart.click();

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
public void enterEmail(){
        userName.sendKeys("binee123@gmail.com");
}
public void enterPassword(){
        password.sendKeys("M630ela1");
}
public void clickOnSignInBtn(){
        submitBtn.click();
}

public void clickOnSecondProceedToCheckout(){
        secondProceedToCheckout.click();
}

public void clickOnTermsAndConditionBtn(){
        termsAndCondition.click();
}
public void clickOnThirdProceedToCheckout(){
        thirdProceedToCheckout.click();
}

public String getTextPaymentMethodPage(){
        return yourShoppingPage.getText();
}
public void clickOnPayByBankWire(){
        payByBankWire.click();
}

public String getTextPayBankWirePage(){
        return bankWirePage.getText();
}
    public void clickOnConfirmBtn(){
        confirmBtn.click();
    }
    public String getTextConfirmationPage(){
        return confirmationPage.getText();
    }
    public String getTextOrderComplete(){
        return orderComplete.getText();
    }



    }


