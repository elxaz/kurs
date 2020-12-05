package StepDefinitions;

import Steps.FilmPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class FilmPageDefinition {

    @Steps
    FilmPageSteps filmPageSteps;

    @Then("^user enter his commentary$")
    public void user_enter_his_commentary() {
         filmPageSteps.enterCommentary();
    }

    @Then("^user click send commentary button$")
    public void user_click_send_commentary_button() {
         filmPageSteps.loadCommentary();
    }

    @Given("^user can see his commentary$")
    public void user_can_see_his_commentary() {
         filmPageSteps.isCommentary();
    }

    @Then("^user can see frame$")
    public void user_watch_film(){
        filmPageSteps.isWatch();
    }

    @Then("^enter count of payment$")
    public void enter_count_of_payment() {
        filmPageSteps.enterCount();
    }

    @Then("^click submit$")
    public void click_submit() {
        filmPageSteps.clickSubmit();
    }

    @Then("^click delete button$")
    public void click_delete_film() {
        filmPageSteps.clickDelete();
    }

    @Then("^user can't see button$")
    public void user_cant_see_button_delete() {
        filmPageSteps.isNotDelete();
    }

    @Then("^user can't see commentary field$")
    public void user_cant_see_commentary_field() {
        filmPageSteps.isNotCommentary();
    }

    @Given("^user can see all the guest elements$")
    public void user_can_see_all_the_guest_elements() {
        filmPageSteps.isPleaseRegister();
    }

    @Given("^user can see all the user elements$")
    public void user_can_see_all_the_user_elements() {
        filmPageSteps.isUserElements();
    }

}
