package Steps;

import Pages.GenreFilterPage;

public class GenreFilterPageSteps {

    GenreFilterPage genreFilterPage;

    public void enterGenre() {
        genreFilterPage.genreField.sendKeys("Триллер");
    }

    public void clickSend() {
        genreFilterPage.sendButton.click();
    }

}
