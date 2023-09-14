package co.com.ejercicio.selenium.stepdefinition;
import co.com.ejercicio.selenium.steps.LoginStep;


import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    LoginStep loginStep;
    @When("he user enter the credentials")
    public void heUserEnterTheCredentials(){
        loginStep.enterCredentials();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
