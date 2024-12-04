package com.co.studiof.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ProductNameValidation implements Question<Boolean> {

    protected Target element;

    public ProductNameValidation(Target element){
        this.element = element;
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).isEnabled();
    }

    public static Question<Boolean> value(Target element) {
        return new ProductNameValidation(element);
    }
}
