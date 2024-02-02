package com.git.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PruebaGIT.feature",
        glue = "com.git.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GITRunner {
}
