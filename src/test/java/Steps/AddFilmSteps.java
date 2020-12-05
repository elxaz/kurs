package Steps;

import Pages.AddFilmPage;
import Pages.MainPage;
import org.openqa.selenium.Keys;

public class AddFilmSteps {

    AddFilmPage addFilmPage;
    MainPage mainPage;

    public void enterName(){
        addFilmPage.name.sendKeys("check");
    }

    public void enterUrl(){
        addFilmPage.url.sendKeys("check");
    }

    public void enterGenre(){
        addFilmPage.genre.sendKeys("check");
    }

    public void enterYear(){
        addFilmPage.year.sendKeys("2020");
    }

    public void enterDirector(){
        addFilmPage.director.sendKeys("check");
    }

    public void enterCountry(){
        addFilmPage.country.sendKeys("check");
    }

    public void enterPoster(){
        addFilmPage.poster.sendKeys("check");
    }

    public void clickSubmit(){
        addFilmPage.addButton.click();
    }

    public void clearUrl(){
        addFilmPage.url.click();
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        addFilmPage.url.sendKeys(del);
    }

    public void enterDescription(){
        addFilmPage.description.sendKeys("check");
    }

    public void clickLogo() {
        mainPage.logo.submit();
    }
}
