package co.com.ejercicio.selenium.steps;

import co.com.ejercicio.selenium.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();
    @Step
    public void openBrowser(){
        registerPage.open();
    }

    @Step
    public void  enterName(){
        registerPage.getDriver().findElement(registerPage.getTXT_FIRST_NAME())
                .sendKeys(
                        "Mauro"
                );
    }
    @Step
    public void  enterLastName(){
        registerPage.getDriver().findElement(registerPage.getTXT_LAST_NAME())
                .sendKeys(
                        "Celis"
                );
    }

    @Step
    public void  enterUserName(){
        registerPage.getDriver().findElement(registerPage.getTXT_USER_NAME())
                .sendKeys(
                        "andrekxus299@gmail.com"
                );
    }
    @Step
    public void  password(){
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys(
                        "12345678"
                );
        Actions actions = new Actions(registerPage.getDriver());
        actions.sendKeys(Keys.TAB).perform();
    }
    @Step
    public void  enterRegister(){
        registerPage.getDriver().findElement(registerPage.getBTN_REGISTER())
                .sendKeys(Keys.ENTER);
    }

}

