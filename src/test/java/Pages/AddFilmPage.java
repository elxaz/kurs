package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFilmPage extends PageObject {

    @FindBy(name = "filmName")
    public WebElement name;

    @FindBy(name = "filmURL")
    public WebElement url;

    @FindBy(name = "genre")
    public WebElement genre;

    @FindBy(name = "year")
    public WebElement year;

    @FindBy(name = "director")
    public WebElement director;

    @FindBy(name = "country")
    public WebElement country;

    @FindBy(name = "poster")
    public WebElement poster;

    @FindBy(className = "addBtn")
    public WebElement addButton;

    @FindBy(name = "description")
    public WebElement description;
}
