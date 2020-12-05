package Steps;

import Pages.CountryFilterPage;

public class CountryFilterPageSteps {

    CountryFilterPage countryFilterPage;

    public void enterCountry() {
        countryFilterPage.countryField.sendKeys("США");
    }

    public void clickSend() {
        countryFilterPage.sendButton.click();
    }
}
