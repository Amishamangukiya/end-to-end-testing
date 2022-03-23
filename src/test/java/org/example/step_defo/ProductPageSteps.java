package org.example.step_defo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ProductPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class ProductPageSteps  extends DriverManager {

    DriverManager driverManager = new DriverManager();
    ProductPage pp =new ProductPage();




    @Given("^I am mouser hover on dresses$")
    public void i_am_mouser_hover_on_dresses() throws Throwable {

    pp.selectDress();
    }

    @Given("^I click on casual dresses$")
    public void i_click_on_casual_dresses() throws Throwable {
    pp.selectCasualDress();

    }

    @Given("^I mouser hover on printed dress$")
    public void i_mouser_hover_on_printed_dress() throws Throwable {
        pp.hooverOnPrintedDress();

    }

    @Then("^I click on add to cart Btn$")
    public void i_click_on_add_to_cart_Btn() throws Throwable {
        pp.clickAddToCart();
        pp.clickOnProceedToCheckout();
    }

    @Then("^I should see your shopping-cart page$")
    public void i_should_see_your_shopping_cart_page() throws Throwable {

        String actText = pp.getYourShoppingCart();
        System.out.println(actText);
        assertThat(actText,is(equalToIgnoringCase("Your shopping cart")));

    }

    @Then("^I click on proceed to checkout btn your shopping-cart page$")
    public void i_click_on_proceed_to_checkout_btn_your_shopping_cart_page() throws Throwable {
       pp.clickOnFirstProceedToCheckout();

    }
    @Then("^I enter  e-mail address \"([^\"]*)\"$")
    public void i_enter_e_mail_address(String arg1) throws Throwable {

        pp.enterEmail();
    }

    @Then("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
        pp.enterPassword();
    }
    @Then("^I click on sign in button$")
    public void i_click_on_sign_in_button() throws Throwable {
        pp.clickOnSignInBtn();
    }


    @Then("^I click on proceed to checkout btn on addresses page$")
    public void i_click_on_proceed_to_checkout_btn_on_addresses_page() throws Throwable {

     pp.clickOnSecondProceedToCheckout();
    }

    @Then("^I click on terms of service check box$")
    public void i_click_on_terms_of_service_check_box() throws Throwable {
    pp.clickOnTermsAndConditionBtn();

    }

    @Then("^I click on proceed to checkout btn on shipping page$")
    public void i_click_on_proceed_to_checkout_btn_on_shipping_page() throws Throwable {
    pp.clickOnThirdProceedToCheckout();

    }

    @Then("^I should see your payment method page$")
    public void i_should_see_your_payment_method_page() throws Throwable {
        String actualTextOnPaymentMethodPage=pp.getTextPaymentMethodPage();
        System.out.println(actualTextOnPaymentMethodPage);
        assertThat(actualTextOnPaymentMethodPage,is(equalToIgnoringCase("Your payment method")));

    }

    @Then("^I click on pay by bank wire btn$")
    public void i_click_on_pay_by_bank_wire_btn() throws Throwable {
    pp.clickOnPayByBankWire();

    }

    @Then("^I should see Bank-wire payment page$")
    public void i_should_see_Bank_wire_payment_page() throws Throwable {
        String actualTextOnBankWirePaymentPage=pp.getTextPayBankWirePage();
        System.out.println(actualTextOnBankWirePaymentPage);
        assertThat(actualTextOnBankWirePaymentPage,is(equalToIgnoringCase("Bank-wire payment.")));

    }

    @Then("^I click on confirm my order btn$")
    public void i_click_on_confirm_my_order_btn() throws Throwable {
    pp.clickOnConfirmBtn();

    }

    @Then("^I should see Order confirmation page$")
    public void i_should_see_Order_confirmation_page() throws Throwable {
        String actualTextOnConfirmationPage=pp.getTextConfirmationPage();
        System.out.println(actualTextOnConfirmationPage);
        assertThat(actualTextOnConfirmationPage,is(equalToIgnoringCase("Order confirmation")));

    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        String actualTextOnOrderCompletePage=pp.getTextOrderComplete();
        System.out.println(actualTextOnOrderCompletePage);
        assertThat(actualTextOnOrderCompletePage,is(equalToIgnoringCase("Your order on My Store is complete.")));

    }


}
