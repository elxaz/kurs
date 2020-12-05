package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CabinetPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Авторизация')]")
    public WebElement authorizationButton;

    @FindBy(xpath = "//a[contains(text(),'Регистрация')]")
    public WebElement registrationButton;

    @FindBy(xpath = "//a[contains(text(),'Добавить фильм')]")
    public WebElement addFilmButton;

    @FindBy(xpath = "//a[contains(text(),'Изменить аватара')]")
    public WebElement changePhotoButton;

    @FindBy(xpath = "//a[contains(text(),'Удалить фото профиля')]")
    public WebElement deletePhotoButton;

    @FindBy(xpath = "//a[contains(text(),'Удалить профиль')]")
    public WebElement deleteProfileButton;

    @FindBy(xpath = "//a[contains(text(),'Выйти')]")
    public WebElement logOutButton;

    @FindBy(xpath = "/html/body/div[3]/h2")
    public WebElement userName;
}
