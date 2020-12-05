package Steps;

import Pages.MainPage;
import org.junit.Assert;

public class MainPageSteps {

    MainPage mainPage;

    public void goToMainPage(){
        mainPage.open();
    }

    public void isElementsDisplayed(){
        Assert.assertTrue(mainPage.films.isDisplayed());
        Assert.assertTrue(mainPage.header.isDisplayed());
        Assert.assertTrue(mainPage.footer.isDisplayed());
        Assert.assertTrue(mainPage.dropDownButton.isDisplayed());
        Assert.assertTrue(mainPage.loginButton.isDisplayed());
        Assert.assertTrue(mainPage.logo.isDisplayed());
        Assert.assertTrue(mainPage.nameOfSite.isDisplayed());
    }

    public void clickCabinet() {
        mainPage.loginButton.click();
    }

    public void clickAddFilm() {
        mainPage.addFilmButton.click();
    }

    public void clickFilm() {
        mainPage.anyFilm.click();
    }

    public void clickFilter() {
        mainPage.dropDownButton.click();
    }

    public void clickFilterYear() {
        mainPage.yearFilter.click();
    }

    public void clickFilterCountry() {
        mainPage.countryFilter.click();
    }

    public void clickFilterGenre() {
        mainPage.genreFilter.click();
    }

    public void isFilms() {
        Assert.assertTrue(mainPage.films.isDisplayed());
    }

    public void enterSearch() {
        mainPage.searchField.sendKeys("check");
    }

    public void clickSearch() {
        mainPage.searchButton.click();
    }

    public void isSearch(){
        Assert.assertTrue(mainPage.nameOfFilm.isDisplayed());
    }

    public void clickRandomFilms() {
        mainPage.randomFilmsButton.click();
    }


}
