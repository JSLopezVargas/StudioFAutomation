package com.co.studiof.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class DismissAlert implements Interaction {

    public static DismissAlert now() {
        return new DismissAlert();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.dismiss(); // Rechaza la alerta
    }
}
