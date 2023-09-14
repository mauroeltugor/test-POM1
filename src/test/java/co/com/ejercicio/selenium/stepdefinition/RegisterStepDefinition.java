package co.com.ejercicio.selenium.stepdefinition;
import co.com.ejercicio.selenium.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class RegisterStepDefinition {
    @Steps
    RegisterStep register;
    @Given("he user is on the web page")
    public void heUserIsOnTheWebPage() {
        register.openBrowser();
    }
    @When("he user enter the data for the register")
    public void heUserEnterTheDataForTheRegister() {
        register.enterName();
        register.enterLastName();
        register.enterUserName();
        register.password();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("he could see login")
    public void heCouldSeeLogin() {
        register.enterRegister();
    }
}

