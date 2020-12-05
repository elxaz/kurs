package StepDefinitions;

import Steps.CountryFilterPageSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CountryFilterDefinition {

    @Steps
    CountryFilterPageSteps countryFilterPageSteps;

    @Then("^user enter country of film in filter field$")
    public void user_enter_country_of_film() {
        countryFilterPageSteps.enterCountry();
    }

    @Then("^user click send country$")
    public void user_click_send_country() {
        countryFilterPageSteps.clickSend();
    }

}
