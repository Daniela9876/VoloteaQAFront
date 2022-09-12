package com.steepdup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPassegers {
    public static final Target SELECT_PASSENGERS= Target
            .the("Selecciona pasajeros adultos")
            .located(By.xpath("(//span[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));
    public static final Target CLIC_PASSEGERS= Target
            .the("click en pasajeros")
            .located(By.xpath("//*[@class='v7-sf__group-item v7-is-filled']//input[@id='input-text_sf-passenger']"));

}
