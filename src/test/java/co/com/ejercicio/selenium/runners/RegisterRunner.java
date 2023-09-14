package co.com.ejercicio.selenium.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        glue = "co.com.ejercicio.selenium.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegisterRunner {
}
