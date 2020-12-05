package StepDefinitions;

import Steps.AddFilmSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class AddFilmPageDefinition {

    @Steps
    AddFilmSteps addFilmSteps;
    
    @Then("^user enter name of film$")
    public void user_enter_name_of_film() {
        addFilmSteps.enterName();
    }

    @Then("^user enter url of film$")
    public void user_enter_url_of_film() {
        addFilmSteps.enterUrl();
    }

    @Then("^user enter genre of film$")
    public void user_enter_genre() {
        addFilmSteps.enterGenre();
    }

    @Then("^user enter year of film$")
    public void user_enter_year_of_film() {
         addFilmSteps.enterYear();
    }

    @Then("^user enter director of film$")
    public void user_enter_director_of_film() {
         addFilmSteps.enterDirector();
    }

    @Then("^user enter country of film$")
    public void user_enter_country_of_film() {
         addFilmSteps.enterCountry();
    }

    @Then("^user enter link to poster$")
    public void user_enter_link_to_poster() {
         addFilmSteps.enterPoster();
    }

    @Then("^user enter description$")
    public void user_enter_description() {
        addFilmSteps.enterDescription();
    }

    @Then("^click send button$")
    public void click_send_button() {
         addFilmSteps.clickSubmit();
    }

    @Then("^user click logo$")
    public void user_click_logo() {
        addFilmSteps.clickLogo();
    }

    @Then("^user delete url of film$")
    public void user_delete_url_of_film() {
        addFilmSteps.clearUrl();
    }
    
}
