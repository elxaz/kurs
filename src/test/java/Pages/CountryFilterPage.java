package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountryFilterPage extends PageObject {

    @FindBy(name = "country")
    public WebElement countryField;

    @FindBy(className = "countryBtn")
    public WebElement sendButton;

}
