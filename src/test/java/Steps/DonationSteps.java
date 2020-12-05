package Steps;

import Pages.DonationPage;

public class DonationSteps {

    DonationPage donationPage;

    public void clickSubmit() {
        donationPage.payButton.click();
    }

}
