package Steps;

import Pages.CabinetPage;
import org.junit.Assert;

public class CabinetPageSteps {

    CabinetPage cabinetPage;
    public void clickPreLogIn() {
        cabinetPage.authorizationButton.click();
    }

    public void clickPreRegister() {
        cabinetPage.registrationButton.click();
    }

    public void isUserDisplayed() {
        Assert.assertTrue(cabinetPage.userName.isDisplayed());
    }

    public void isButtonsDisplayed() {
        Assert.assertTrue(cabinetPage.authorizationButton.isDisplayed());
        Assert.assertTrue(cabinetPage.registrationButton.isDisplayed());
    }

    public void isAllDisplayed() {
        Assert.assertTrue(cabinetPage.addFilmButton.isDisplayed());
        Assert.assertTrue(cabinetPage.changePhotoButton.isDisplayed());
        Assert.assertTrue(cabinetPage.deletePhotoButton.isDisplayed());
        Assert.assertTrue(cabinetPage.deleteProfileButton.isDisplayed());
        Assert.assertTrue(cabinetPage.logOutButton.isDisplayed());
    }

    public void clickLogOut() {
        cabinetPage.logOutButton.click();
    }
}
