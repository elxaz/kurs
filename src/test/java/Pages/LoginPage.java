package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(name = "login")
    public WebElement loginField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(name = "do_login")
    public WebElement submitLogIn;

    @FindBy(name = "email")
    public WebElement emailField;

    @FindBy(name = "age")
    public WebElement ageField;

    @FindBy(name = "password_2")
    public WebElement password2Field;

    @FindBy(name = "do_signup")
    public WebElement submitSignUpButton;

}
