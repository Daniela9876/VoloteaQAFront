package com.steepdup.qa.stepdefinitions;

import com.steepdup.qa.task.Cookies;
import com.steepdup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CookiesStepDefin {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Daniela G.M");
    }
    @Given("^user is on the volotea page$")
    public void userIsOnTheVoloteaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }

    @When("^click in button accept cookies$")
    public void clickInButtonAcceptCookies() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Cookies.cookies());

    }

    @Then("^the user should see the home page$")
    public void theUserShouldSeeTheHomePage() {

    }

}
