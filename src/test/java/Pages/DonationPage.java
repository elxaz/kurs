package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonationPage extends PageObject {

    @FindBy(xpath = "//body/form[@id='payment']/input[5]")
    public WebElement payButton;

}
