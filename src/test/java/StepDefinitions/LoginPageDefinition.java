package StepDefinitions;

import Steps.LoginPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.Random;

public class LoginPageDefinition {

    @Steps
    LoginPageSteps loginPageSteps;

    @Then("^user enter email$")
    public void user_enter_email() {
        loginPageSteps.enterEmail();
    }

    @Then("^user enter age$")
    public void user_enter_age() {
        loginPageSteps.enterAge();
    }

    @Then("^user click register button$")
    public void user_click_register_button() {
        loginPageSteps.clickRegister();
    }

    @Then("^user enter login user$")
    public void user_enter_login_to_Log_In() {
        loginPageSteps.enterLoginUser();
    }

    @Then("^user enter login$")
    public void user_enter_random_login() {
        loginPageSteps.enterRandomLogin();
    }

    @Then("^user enter password$")
    public void user_enter_password() {
        loginPageSteps.enterPassword();
    }


    @Then("^user enter password_2$")
    public void user_enter_password_() {
        loginPageSteps.enterPassword2();
    }
    
    @Then("^user enter login admin")
    public void user_enter_login_admin() {
        loginPageSteps.enterLoginAdmin();
    }

    @Then("^user enter password admin$")
    public void user_enter_password_admin() {
        loginPageSteps.enterPasswordRoot();
    }

    @Then("^click Log In button$")
    public void click_Log_In_button() {
         loginPageSteps.clickLogIn();
    }

    @Then("^Validation$")
    public void validation() throws InterruptedException {
        loginPageSteps.validation();
    }

    @Then("^user delete login$")
    public void user_delete_login() {
        loginPageSteps.clearLogin();
    }

}
