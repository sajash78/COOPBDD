package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.HomePage;

public class HomePageSteps {
    HomePage homePage = new  HomePage();

    @Given("^user is on the home page of the website$")
    public void user_is_on_the_home_page_of_the_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user searchers insurance$")
    public void user_searchers_insurance() throws Throwable {
        Thread.sleep(5000);
        homePage.policy();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to see all insurance options$")
    public void user_should_be_able_to_see_all_insurance_options() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
