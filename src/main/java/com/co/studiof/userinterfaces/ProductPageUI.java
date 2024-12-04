package com.co.studiof.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPageUI {

    public static final Target BTN_ADD_TO_CART = Target.the("Add to cart")
            .locatedBy("//button[contains(@class, 'product__button--buy') and text()='AGREGAR AL CARRITO']");

    public static final Target BTN_GO_TO_PAY = Target.the("Go to pay")
            .locatedBy("//a[contains(@class, 'summary__button--checkout') and text()='Ir a pagar']");

}
