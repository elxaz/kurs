package StepDefinitions;

import Steps.YearFilterSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class YearFilterDefinition {

    @Steps
    YearFilterSteps yearFilterSteps;

    @Then("^user click on the select with years$")
    public void user_click_on_the_select_with_years() {
         yearFilterSteps.selectYear();
    }

    @Then("^user choose 2020$")
    public void user_choose_2020() {
        yearFilterSteps.select2020();
    }

    @Then("^user choose 1900$")
    public void user_choose_1900() {
        yearFilterSteps.select1900();
    }

    @Then("^user click send year$")
    public void user_click_send_year() {
        yearFilterSteps.clickSubmit();
    }
    
}
