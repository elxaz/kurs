package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YearFilterPage extends PageObject {

    @FindBy(name = "yearSelect")
    public WebElement yearSelect;

    @FindBy(xpath = "/html/body/div/form/select/option[121]")
    public WebElement select2020;

    @FindBy(xpath = "/html/body/div/form/select/option[1]")
    public WebElement select1900;

    @FindBy(xpath = "/html/body/div/form/input")
    public WebElement submitFilterButton;

}
