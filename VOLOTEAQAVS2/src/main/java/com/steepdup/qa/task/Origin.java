package com.steepdup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.steepdup.qa.userinterface.Origin.*;


public class Origin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLIC_ORIG));
        actor.attemptsTo(Click.on(CLIC_COUNTRY));
        actor.attemptsTo(Click.on(CLIC_CITY));
        actor.attemptsTo(Click.on(CLIC_FECHA));
        actor.attemptsTo(Click.on(CLIC_SOLOIDA));
        actor.attemptsTo(Click.on(BUSCAR));
    }
    public static Origin origin(){
        return Tasks.instrumented(Origin.class);
    }

}
