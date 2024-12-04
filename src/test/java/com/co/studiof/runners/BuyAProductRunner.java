package com.co.studiof.runners;

import com.co.studiof.utils.BeforeSuite;
import com.co.studiof.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/buyAProduct.feature",
        tags = "@BuyAProduct",
        glue = "com.co.studiof.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

@RunWith(PersonalizedRunner.class)

public class BuyAProductRunner {

    @BeforeSuite

    public static void test() throws InvalidFormatException, IOException {

        DataToFeature.overrideFeatureFiles("./src/test/resources/features/buyAProduct.feature");

    }
}