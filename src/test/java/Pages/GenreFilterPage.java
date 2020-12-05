package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenreFilterPage extends PageObject {

    @FindBy(name = "genre")
    public WebElement genreField;

    @FindBy(className = "countryBtn")
    public WebElement sendButton;

}
