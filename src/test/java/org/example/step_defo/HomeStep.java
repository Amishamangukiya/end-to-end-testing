package org.example.step_defo;

import cucumber.api.java.en.Given;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;
import org.example.pages.RegistrationPages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomeStep extends DriverManager {

    DriverManager driverManager=new DriverManager();
    HomePage homePage=new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

        String actualUrl = driverManager.getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl,is(endsWith("http://automationpractice.com/index.php")));

        String actualTextOnHomePage= homePage.getTextHomePage();
        System.out.println(actualTextOnHomePage);
        assertThat(actualTextOnHomePage,is(equalToIgnoringCase("Automation Practice Website")));
    }
}
