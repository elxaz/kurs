package Steps;

import Pages.LoginPage;
import org.openqa.selenium.Keys;
import java.util.Random;

public class LoginPageSteps {

    LoginPage loginPage;

    public String randomString(int kol) {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder sb = new StringBuilder(kol);
        Random random = new Random();

        for (int i = 0; i < kol; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }

        String output = sb.toString();
        return output;

    }

    String login = randomString(5);
    String email = randomString(5) + "@" + randomString(3) + "." + randomString(2);

    public void enterLoginAdmin() {
        loginPage.loginField.sendKeys("admin");
    }

    public void enterPasswordRoot() {
        loginPage.passwordField.sendKeys("root");
    }

    public void enterLoginUser() {
        loginPage.loginField.sendKeys("user");
    }

    public void enterPassword() {
        loginPage.passwordField.sendKeys("password");
    }

    public void enterRandomLogin() {
        loginPage.loginField.sendKeys(login);
    }

    public void enterPassword2() {
        loginPage.password2Field.sendKeys("password");
    }

    public void clickRegister() {
        loginPage.submitSignUpButton.click();
    }

    public void clickLogIn() {
        loginPage.submitLogIn.click();
    }

    public void enterAge() {
        loginPage.ageField.sendKeys("21");
    }

    public void enterEmail() {
        loginPage.emailField.sendKeys(email);
    }

    public void validation() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void clearLogin(){
        loginPage.loginField.click();
        String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
        loginPage.loginField.sendKeys(del);
    }

}
