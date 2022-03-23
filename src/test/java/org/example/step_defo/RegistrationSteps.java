package org.example.step_defo;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPages;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class RegistrationSteps extends DriverManager {
    RegistrationPages rp = new RegistrationPages();

    List<Map<String,String>> data;



    @When("^I click on sign in btn$")
    public void i_click_on_sign_in_btn() throws Throwable {
        rp.clickSingInBtn();



    }

    @When("^I enter valid e-mail address \"([^\"]*)\"$")
    public void i_enter_valid_e_mail_address(String arg1) throws Throwable {
rp.enterEmail();

    }

    @When("^I click on create  an account$")
    public void i_click_on_create_an_account() throws Throwable {
rp.clickOnCreatAnAccountBtn();
    }

    @Then("^I should see create an account page$")
    public void i_should_see_create_an_account_page() throws Throwable {
rp.getPageText();

        String actualText= rp.getPageText();
        System.out.println(actualText);
        assertThat(actualText,is(equalToIgnoringCase( "Authentication")));


    }

    @Then("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable dataTable) throws Throwable {


        data = dataTable.asMaps(String.class, String.class);
        rp.enterFirstName(data.get(0).get("firstname"));
        rp.enterLastName(data.get(0).get("lastname"));
        rp.enterPassword(data.get(0).get("password"));
        rp.enterAdrress(data.get(0).get("address"));
        rp.enterCity(data.get(0).get("city"));
        rp.enterPostalCode(data.get(0).get("postalcode"));

        rp.enterMobileNo(data.get(0).get("mobilenumber"));

        rp.selectState("state");
        rp.selectCountry("country");

    }



    @Then("^I click on register btn$")
    public void i_click_on_register_btn() throws Throwable {
        rp.clickOnRegistationBtn();

    }

    @Then("^I should successfully register$")
    public void i_should_successfully_register() throws Throwable {

        String actText = rp.getMyAccountText();
        System.out.println(actText);
        assertThat(actText,is(equalToIgnoringCase("MY ACCOUNT")));
    }


}
