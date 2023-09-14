package co.com.ejercicio.selenium.steps;
import co.com.ejercicio.selenium.pages.LoginPage;
import co.com.ejercicio.selenium.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
public class LoginStep {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    @Step
    public void enterCredentials(){
        registerPage.getDriver().findElement(loginPage.getTXT_USER_NAME())
                .sendKeys(
                        "andrekxus299@gmail.com"
                );
        registerPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys(
                        "12345678"
                );
        registerPage.getDriver().findElement(loginPage.getBTN_LOGIN())
                .click();

    }
}
