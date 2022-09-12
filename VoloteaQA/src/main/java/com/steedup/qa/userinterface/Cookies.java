package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cookies {

    public static final Target ACEPT_COOKIES= Target
            .the("Aceptar cookies")
            .located(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
}
