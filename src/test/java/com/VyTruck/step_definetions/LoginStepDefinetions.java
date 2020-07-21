package com.VyTruck.step_definetions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinetions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
      System.out.println("user is on the login page");
    }
    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("user logs in as a store manager");

    }
    @Then("user should be able to see Dashboard page title")
    public void user_should_be_able_to_see_dashboard_page_title() {
        System.out.println("user should be able to see Dashboard page title");
    }

}
