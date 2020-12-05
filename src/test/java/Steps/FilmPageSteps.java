package Steps;

import Pages.FilmPage;
import org.junit.Assert;

public class FilmPageSteps {

    FilmPage filmPage;

    public void enterCommentary(){
        filmPage.commentaryField.sendKeys("Check");
    }

    public void loadCommentary(){
        filmPage.sendCommentary.click();
    }

    public void isCommentary(){
        Assert.assertTrue(filmPage.textCommentary.isDisplayed());
    }

    public void isWatch(){
        Assert.assertFalse(filmPage.error.isDisplayed());
    }

    public void enterCount(){
        filmPage.quantity.sendKeys("100");
    }

    public void clickSubmit() {
        filmPage.submit.submit();
    }

    public void clickDelete() {
        filmPage.deleteButton.click();
    }

    public void isNotDelete(){
        Assert.assertFalse(filmPage.deleteButton.isDisplayed());
    }

    public void isNotCommentary(){
        Assert.assertFalse(filmPage.commentaryField.isDisplayed());
    }

    public void isPleaseRegister() {
        Assert.assertTrue(filmPage.pleaseRegister.isDisplayed());
    }

    public void isUserElements() {
        Assert.assertTrue(filmPage.commentaryField.isDisplayed());
        Assert.assertTrue(filmPage.rating.isDisplayed());
    }

}
