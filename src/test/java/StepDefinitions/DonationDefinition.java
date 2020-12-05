package StepDefinitions;

import Steps.DonationSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;


public class DonationDefinition {

    @Steps
    DonationSteps donationSteps;

    @Then("^click pay$")
    public void click_submit() {
        donationSteps.clickSubmit();

    }

}
