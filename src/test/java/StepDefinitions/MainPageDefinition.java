package StepDefinitions;

import Steps.CabinetPageSteps;
import Steps.MainPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MainPageDefinition {

    @Steps
    MainPageSteps mainPageSteps;
    @Steps
    CabinetPageSteps cabinetPageSteps;

    @Given("^User can access main page$")
    public void user_can_access_main_page() {
        mainPageSteps.goToMainPage();
    }

    @Then("^User can see all the elements correctly$")
    public void user_can_see_all_the_elements_correctly() {
        mainPageSteps.isElementsDisplayed();

    }

    @When("^User click at cabinet button$")
    public void user_click_at_LogIn_button() {
         mainPageSteps.clickCabinet();
         
    }

    @Given("^user can add film by clicking button$")
    public void user_can_add_film_by_clicking_button() {
        mainPageSteps.clickAddFilm();
    }

    @Given("^added film to main page$")
    public void added_film_to_main_page() {

    }

    @Then("^user click at any page of film$")
    public void user_click_at_any_page_of_film() {
        mainPageSteps.clickFilm();
    }

    @Then("^user click on the filter button$")
    public void user_click_on_the_filter_button() {
        mainPageSteps.clickFilter();
    }


    @Then("^user click on the filter by year$")
    public void user_click_on_the_filter_by_year() {
         mainPageSteps.clickFilterYear();
    }

    @Then("^user click on the filter by country$")
    public void user_click_on_the_filter_by_country() {
        mainPageSteps.clickFilterCountry();
    }

    @Then("^user click on the filter by genre$")
    public void user_click_on_the_filter_by_genre() {
        mainPageSteps.clickFilterGenre();
    }

    @Given("^page with films is displayed$")
    public void page_with_films_is_displayed() {
        mainPageSteps.isFilms();
    }

    @Given("^user can see his username$")
    public void user_can_see_his_username() {
        cabinetPageSteps.isUserDisplayed();
    }

    @Then("^user enter search query$")
    public void user_enter_search_query() {
        mainPageSteps.enterSearch();
    }

    @Then("^user click search$")
    public void user_click_search() {
        mainPageSteps.clickSearch();
    }

    @Then("^user click on the random films$")
    public void user_click_on_the_random_films() {
        mainPageSteps.clickRandomFilms();
    }

    @Then("^searched results appeared$")
    public void searched_results_appeared() {
        mainPageSteps.isSearch();
    }

}
