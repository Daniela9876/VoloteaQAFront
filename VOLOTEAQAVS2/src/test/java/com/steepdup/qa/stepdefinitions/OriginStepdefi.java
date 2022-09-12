package com.steepdup.qa.stepdefinitions;

import com.steepdup.qa.task.AddPassegers;
import com.steepdup.qa.task.Origin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class OriginStepdefi {


    @When("^click in origin$")
    public void clickInOrigin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Origin.origin());
    }

    @Then("^the user should see the available countries$")
    public void theUserShouldSeeTheAvailableCountries() {
    }
}
