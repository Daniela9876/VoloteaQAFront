package com.steepdup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.steepdup.qa.userinterface.AddPassegers.CLIC_PASSEGERS;
import static com.steepdup.qa.userinterface.AddPassegers.SELECT_PASSENGERS;

public class AddPassegers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PASSENGERS));
        actor.attemptsTo(Click.on(CLIC_PASSEGERS));


    }
    public static AddPassegers addPassegers(){
        return Tasks.instrumented(AddPassegers.class);
    }
}
