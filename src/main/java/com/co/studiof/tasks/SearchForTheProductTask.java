package com.co.studiof.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.Keys;

import static com.co.studiof.userinterfaces.HomePageUI.TXT_SEARCHER;
import static com.co.studiof.userinterfaces.SearchPageUI.LBL_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchForTheProductTask implements Task {

    private final String product;

    public SearchForTheProductTask(String product) { this.product = product; }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.keyValues(product).into(TXT_SEARCHER).thenHit(Keys.ENTER),
                Click.on(LBL_PRODUCT)
        );
    }

    public static SearchForTheProductTask withProduct(String product) {
        return new SearchForTheProductTask(product);
    }

}
