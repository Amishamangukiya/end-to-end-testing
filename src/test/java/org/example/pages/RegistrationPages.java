package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPages extends DriverManager {
    DriverManager driverManager= new DriverManager();
    @FindBy(xpath ="//a[@class='login']")
    private WebElement singInBtn;


    @FindBy(id ="email_create")
    private WebElement emailInputBox;

    @FindBy(xpath ="//button[@id='SubmitCreate']")
    private  WebElement creatAnAccontBox;

     @FindBy(id ="customer_firstname")
     private  WebElement firstNAmeFeild;

     @FindBy(id = "customer_lastname")
     private  WebElement lastnameFeild;

     @FindBy(id = "passwd")
     private WebElement passwordFeild;

     @FindBy(id = "address1")
     private WebElement addressFeild;

     @FindBy(id = "city")
     private WebElement cityFeild;

     @FindBy(xpath = "//select[@id='id_state']")
     private WebElement stateFeild;

     @FindBy(id = "postcode")
     private WebElement postalFeild;

     @FindBy(id = "id_country")
     private WebElement countryFeild;

     @FindBy(id = "phone_mobile")
     private WebElement mobileFeild;

     @FindBy(xpath = "//button[@id='submitAccount']")
     private WebElement registerBtn;

     @FindBy(xpath = "//span[@class='navigation_page']")
     private WebElement creatAccountPageText;

     @FindBy(xpath ="//h1[@class='page-heading']")
     private WebElement myAcount ;

     public void clickSingInBtn() {
        singInBtn.click();
    }

    public void enterEmail() {
        int myRandomNumber = driverManager.generateRandomNumber();
           emailInputBox.sendKeys("meghs@gmail.com");

    }
    public  void clickOnCreatAnAccountBtn(){
        creatAnAccontBox.click();
    }

    public void enterFirstName(String firstname) {
        firstNAmeFeild.sendKeys(firstname);
    }
    public void enterLastName(String lastname) {
        lastnameFeild.sendKeys(lastname);
    }
    public  void enterPassword(String password){
         postalFeild.sendKeys(password);}

    public void enterAdrress(String address){
         addressFeild.sendKeys(address);}
    public  void enterCity(String city) {
        cityFeild.sendKeys(city);
    }
    public void enterPostalCode(String postalcode) {
        postalFeild.sendKeys(postalcode);
    }
    public void enterMobileNo(String mobilenumber){
         mobileFeild.sendKeys(mobilenumber);


//   public void enterRegistrationDetail(String firstname,String lastname ,String password,String address,String city,String postalcode,String mobileNo){
//firstNAmeFeild.sendKeys(firstname);
//lastnameFeild.sendKeys(lastname);
//passwordFeild.sendKeys(password);
//addressFeild.sendKeys(address);
//
//cityFeild.sendKeys(city);
//
//postalFeild.sendKeys(postalcode);
//mobileFeild.sendKeys(mobileNo);


     }
     public void selectState( String state){
         Select se= new Select(stateFeild);
         se.selectByValue(state);
     }
     public  void selectCountry(String country ){
         Select se= new Select(countryFeild);
         se.selectByValue(country);

         //public void selectCountrySelection(String countryName) {
         //        Select select = new Select(countrySelection);
         //        select.selectByVisibleText(countryName);
         //    }
     }
     public  void clickOnRegistationBtn(){
         registerBtn.click();
     }
   public  String getPageText(){
         return  creatAccountPageText.getText();

}
public String getMyAccountText(){
       return  myAcount.getText();
}



}
