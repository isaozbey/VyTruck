package com.VyTruck.step_definetions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CreateCarStepDefinetions {

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user is logs in with {string} and {string} credentials")
    public void user_is_logs_in_with_and_credentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user navigate to {string} and {string}")
    public void user_navigate_to_and(String string, String string2) {
        System.out.println("USer navigate to tab abd module"+string+" "+string);
    }
    @Then("user click on create car button")
    public void user_click_on_create_car_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user enter vehicles information")
    public void user_enter_vehicles_information(List dataTable) {

    }
}
