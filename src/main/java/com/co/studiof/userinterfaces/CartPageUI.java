package com.co.studiof.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPageUI {

    public static final Target BTN_SEND = Target.the("YES, SEND IT")
            .locatedBy("//span[text()='Sí, Envíamelo']");

    public static final Target LBL_TERMS_COND = Target.the("Accept terms and conditions")
            .locatedBy("//input[@id='checkout-politica']");


    public static final Target BTN_FINISH_PURCHASE = Target.the("Finish purchase")
            .locatedBy("////a[@id='cart-to-orderform']");


}
