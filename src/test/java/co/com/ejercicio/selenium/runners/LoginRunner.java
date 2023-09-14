package co.com.ejercicio.selenium.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "co.com.ejercicio.selenium.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
