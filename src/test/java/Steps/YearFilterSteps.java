package Steps;

import Pages.YearFilterPage;

public class YearFilterSteps {

    YearFilterPage yearFilterPage;

    public void selectYear() {
        yearFilterPage.yearSelect.click();
    }

    public void select2020() {
        yearFilterPage.select2020.click();
    }

    public void select1900() {
        yearFilterPage.select1900.click();
    }

    public void clickSubmit() {
        yearFilterPage.submitFilterButton.submit();
    }

}
