package StepDefinitions;

import Steps.CabinetPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CabinetDefinition {

    @Steps
    CabinetPageSteps cabinetPageSteps;

    @Given("^authorization and registration are displayed$")
    public void authorization_and_registration_are_displayed() {
        cabinetPageSteps.isButtonsDisplayed();
    }

    @Given("^displayed all the elements of logged user$")
    public void displayed_all_the_elements_of_logged_user() {
        cabinetPageSteps.isAllDisplayed();
    }

    @Then("^User click at register button$")
    public void user_click_at_register_button() {
        cabinetPageSteps.clickPreRegister();
    }

    @Then("^user click to authorization$")
    public void click_to_authorization() {
        cabinetPageSteps.clickPreLogIn();
    }

    @Then("^user click log out$")
    public void click_to_log_out() {
        cabinetPageSteps.clickLogOut();
    }
}
