package co.com.ejercicio.selenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/registration-login-example/#/register")
public class RegisterPage extends PageObject {
    By TXT_FIRST_NAME = By.xpath("//input[@id='firstName']");
    By TXT_LAST_NAME = By.xpath("//input[@name='lastName']");
    By TXT_USER_NAME = By.xpath("//input[@id='username']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");
    By BTN_REGISTER = By.xpath("//button[@type='submit']");

    public By getTXT_FIRST_NAME() {
        return TXT_FIRST_NAME;
    }

    public void setTXT_FIRST_NAME(By TXT_FIRST_NAME) {
        this.TXT_FIRST_NAME = TXT_FIRST_NAME;
    }

    public By getTXT_LAST_NAME() {
        return TXT_LAST_NAME;
    }

    public void setTXT_LAST_NAME(By TXT_LAST_NAME) {
        this.TXT_LAST_NAME = TXT_LAST_NAME;
    }

    public By getTXT_USER_NAME() {
        return TXT_USER_NAME;
    }

    public void setTXT_USER_NAME(By TXT_USER_NAME) {
        this.TXT_USER_NAME = TXT_USER_NAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_REGISTER() {
        return BTN_REGISTER;
    }

    public void setBTN_REGISTER(By BTN_REGISTER) {
        this.BTN_REGISTER = BTN_REGISTER;
    }


}
