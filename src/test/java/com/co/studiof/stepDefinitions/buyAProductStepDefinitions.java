package com.co.studiof.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.studiof.tasks.AddToCartTask;
import com.co.studiof.tasks.SearchForTheProductTask;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class buyAProductStepDefinitions {

    @Before
    public void setStage() { setTheStage (new OnlineCast());}

    @Given("The page {string} is opened")
    public void thePageIsOpened(String url) {

        WebDriverManager.chromedriver().setup();
        theActorCalled("Robot").wasAbleTo(Open.url(url));
        System.out.println(url);

    }
    @When("search for the product {string}")
    public void searchForTheProduct(String product) {

        OnStage.theActorInTheSpotlight().attemptsTo(

                SearchForTheProductTask.withProduct(product)

        );
    }

    @When("add product to cart {string}")
    public void addProductToCart(String product) {

        OnStage.theActorInTheSpotlight().attemptsTo(

                AddToCartTask.withProduct()

        );


    }

    @When("fill billing data {string} {string}")
    public void fillBillingData(String destinatario, String correo) {

    }
    @Then("see purchase summary")
    public void seePurchaseSummary() {

    }
}
