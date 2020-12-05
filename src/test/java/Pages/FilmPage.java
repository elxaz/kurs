package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmPage extends PageObject {

    @FindBy(xpath = "//textarea[@id='comment']")
    public WebElement commentaryField;

    @FindBy(xpath = "/html/body/div[2]/form/input[3]")
    public WebElement sendCommentary;

    @FindBy(xpath = "//*[contains(text(), 'Check')]")
    public WebElement textCommentary;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//body[1]/div[2]/form[2]/input[4]")
    public WebElement submit;

    @FindBy(xpath = "//h1[contains(text(),'Not Found')]")
    public WebElement error;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[5]/a")
    public WebElement deleteButton;

    @FindBy(className = "info")
    public WebElement pleaseRegister;

    @FindBy(name = "rating")
    public WebElement rating;
}
