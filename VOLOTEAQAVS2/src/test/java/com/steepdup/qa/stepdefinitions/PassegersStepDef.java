package com.steepdup.qa.stepdefinitions;

import com.steepdup.qa.task.AddPassegers;
import com.steepdup.qa.task.Cookies;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PassegersStepDef {

    @Given("^user is on the volotea home page$")
    public void userIsOnTheVoloteaHomePage() {

    }

    @When("^selecting the number of passengers in adults$")
    public void selectingTheNumberOfPassengersInAdults() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AddPassegers.addPassegers());

    }

    @Then("^the user should see that the baby section is disabled$")
    public void theUserShouldSeeThatTheBabySectionIsDisabled() {

    }

}
