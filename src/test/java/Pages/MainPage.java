package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(className = "dropbtn")
    public WebElement dropDownButton;

    @FindBy(className = "smalllogo")
    public WebElement logo;

    @FindBy(className = "plates")
    public WebElement films;

    @FindBy(className = "loginImg")
    public WebElement loginButton;

    @FindBy(className = "header")
    public WebElement header;

    @FindBy(className = "footer")
    public WebElement footer;

    @FindBy(xpath = "//a[contains(text(),'Добавить фильм')]")
    public WebElement addFilmButton;

    @FindBy(xpath = "//tbody/tr[1]/th[1]/div[1]/a[1]/img[1]")
    public WebElement anyFilm;

    @FindBy(xpath = "//*[@id=\"myDropdown\"]/a[1]")
    public WebElement yearFilter;

    @FindBy(name = "filmSearch")
    public WebElement searchField;

    @FindBy(xpath = "//input[@id='myInputBtn']")
    public WebElement searchButton;

    @FindBy(xpath = "//xmp[contains(text(),'check')]")
    public WebElement nameOfFilm;

    @FindBy(xpath = "//div[contains(text(),'© ICS-media 2020')]")
    public WebElement nameOfSite;

    @FindBy(xpath = "//a[contains(text(),'Фильтр по стране')]")
    public WebElement countryFilter;

    @FindBy(xpath = "//a[contains(text(),'Фильтр по жанру')]")
    public WebElement genreFilter;

    @FindBy(xpath = "//a[contains(text(),'Что посмотреть')]")
    public WebElement randomFilmsButton;
}
