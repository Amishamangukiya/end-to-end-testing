package org.example.step_defo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.ProductPage;

public class ProductPageSteps  extends DriverManager {

    DriverManager driverManager = new DriverManager();
    ProductPage pp =new ProductPage();


    @Given("^I am on homepage$")

    public void i_am_on_homepage() throws Throwable {


    }

    @Given("^I am mouser hover on dresses$")
    public void i_am_mouser_hover_on_dresses() throws Throwable {


    }

    @Given("^I click on casual dresses$")
    public void i_click_on_casual_dresses() throws Throwable {


    }

    @Given("^I mouser hover on printed dress$")
    public void i_mouser_hover_on_printed_dress() throws Throwable {


    }

    @Then("^I click on add to cart Btn$")
    public void i_click_on_add_to_cart_Btn() throws Throwable {


    }

    @Then("^I should see your shopping-cart page$")
    public void i_should_see_your_shopping_cart_page() throws Throwable {


    }

    @Then("^I click on proceed to checkout btn your shopping-cart page$")
    public void i_click_on_proceed_to_checkout_btn_your_shopping_cart_page() throws Throwable {


    }

    @Then("^I click on proceed to checkout btn on addresses page$")
    public void i_click_on_proceed_to_checkout_btn_on_addresses_page() throws Throwable {


    }

    @Then("^I click on terms of service check box$")
    public void i_click_on_terms_of_service_check_box() throws Throwable {


    }

    @Then("^I click on proceed to checkout btn on shipping page$")
    public void i_click_on_proceed_to_checkout_btn_on_shipping_page() throws Throwable {


    }

    @Then("^I should see your payment method page$")
    public void i_should_see_your_payment_method_page() throws Throwable {


    }

    @Then("^I click on pay by bank wire btn$")
    public void i_click_on_pay_by_bank_wire_btn() throws Throwable {


    }

    @Then("^I should see Bank-wire payment page$")
    public void i_should_see_Bank_wire_payment_page() throws Throwable {


    }

    @Then("^I click on confirm my order btn$")
    public void i_click_on_confirm_my_order_btn() throws Throwable {


    }

    @Then("^I should see Order confirmation page$")
    public void i_should_see_Order_confirmation_page() throws Throwable {

    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {

    }


}
