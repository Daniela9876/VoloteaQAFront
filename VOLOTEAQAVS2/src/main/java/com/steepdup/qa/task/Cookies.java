package com.steepdup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.steepdup.qa.userinterface.Cookies.ACEPT_COOKIES;

public class Cookies implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACEPT_COOKIES));
    }
    public static Cookies cookies(){
        return Tasks.instrumented(Cookies.class);
    }

}
