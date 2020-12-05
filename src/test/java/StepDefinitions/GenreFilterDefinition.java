package StepDefinitions;

import Steps.GenreFilterPageSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class GenreFilterDefinition {

    @Steps
    GenreFilterPageSteps genreFilterPageSteps;

    @Then("^user enter genre of film in filter field$")
    public void user_enter_genre_of_film() {
        genreFilterPageSteps.enterGenre();
    }

    @Then("^user click send genre$")
    public void user_click_send_genre() {
        genreFilterPageSteps.clickSend();
    }

}
