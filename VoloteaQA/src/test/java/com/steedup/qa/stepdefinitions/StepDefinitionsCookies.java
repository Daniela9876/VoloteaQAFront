package com.steedup.qa.stepdefinitions;

import com.steedup.qa.task.Cookies;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefinitionsCookies {


    @When("^clic in button accept cookies$")
    public void clicInButtonAcceptCookies() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Cookies.cookies());

    }

    @Then("^the user should see the home page$")
    public void theUserShouldSeeTheHomePage() {

    }


}
