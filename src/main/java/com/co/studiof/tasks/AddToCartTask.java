package com.co.studiof.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static com.co.studiof.userinterfaces.CartPageUI.*;
import static com.co.studiof.userinterfaces.ProductPageUI.BTN_ADD_TO_CART;
import static com.co.studiof.userinterfaces.ProductPageUI.BTN_GO_TO_PAY;

public class AddToCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_GO_TO_PAY),
                JavaScriptClick.on(LBL_TERMS_COND),
                JavaScriptClick.on(BTN_FINISH_PURCHASE)

        );
    }

    public static AddToCartTask withProduct() {
        return new AddToCartTask();
    }
}

