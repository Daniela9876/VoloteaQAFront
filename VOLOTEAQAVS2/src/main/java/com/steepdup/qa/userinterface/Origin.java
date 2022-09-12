package com.steepdup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {

    public static final Target CLIC_ORIG = Target
            .the("click en origen")
            .located(By.xpath("(//span[@class='v7-sf__text capitalize'])[1]"));

    public static final Target CLIC_COUNTRY = Target
            .the("click en pais")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[1]"));

    public static final Target CLIC_CITY = Target
            .the("click en ciudad")
            .located(By.xpath("(//div[@class='v7-card__box']//ul[@class='v7-card__data'])[4]"));

    public static final Target CLIC_FECHA = Target
            .the("click en fecha")
            .located(By.xpath("(//div[@class='v7-calendar__table || v7-cal']//*[@class='v7-cal__day block-ui-click ng-star-inserted'])[1]"));

    public static final Target CLIC_SOLOIDA = Target
            .the("click en fecha")
            .located(By.xpath("(//*[@class='v7-input-switch__label'])[2]"));

    public static final Target BUSCAR = Target
            .the("click en fecha")
            .located(By.xpath("(//span[@class='v7-btn__text v7-btn__text--icon ng-star-inserted'])[1]"));




}
