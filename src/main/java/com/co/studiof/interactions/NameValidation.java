package com.floristeriamundoflor.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.floristeriamundoflor.userinterfaces.CarritoUI.LBL_NOMBRE_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidacionNombre implements Task {

    private String producto;

    public ValidacionNombre(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(LBL_NOMBRE_PRODUCTO, isPresent()).forNoMoreThan(150).seconds()
        );

        String validacion = LBL_NOMBRE_PRODUCTO.resolveFor(actor).getText();

        if (!producto.equals(validacion)) {
            throw new IllegalArgumentException("El texto producto no coincide");
        }


    }

    public static ValidacionNombre conElProducto(String producto) {
        return new ValidacionNombre(producto);
    }

}
