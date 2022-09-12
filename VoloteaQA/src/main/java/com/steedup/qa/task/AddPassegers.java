package com.steedup.qa.task;

import com.steedup.qa.models.Passengers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.steedup.qa.userinterface.AddPassegers.SELECT_PASSENGERS;

public class AddPassegers implements Task {

    private Passengers passengers;

    public AddPassegers(Passengers passengers){
        this.passengers=passengers;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PASSENGERS));
    }

    public static AddPassegers withTheDataInteger(Passengers dos){
        return new AddPassegers(dos);
    }
}
