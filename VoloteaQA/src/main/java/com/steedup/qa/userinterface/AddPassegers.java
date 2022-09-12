package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPassegers {
    public static final Target SELECT_PASSENGERS= Target
           .the("Selecciona apartado de pasajeros")
            .located(By.className("(//*[@class='v7-sf__label'])[1]"));

}
