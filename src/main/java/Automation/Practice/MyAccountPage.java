package Automation.Practice;

import org.openqa.selenium.By;

public class MyAccountPage extends Utils {
    static String email;


    By _email = By.id("email_create");
    By _createAccount = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    By _registerConfirmationText = By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]");
    By _invalidEmail = By.xpath("//li[contains(text(),'Invalid email address.')]");
    By _email1 = By.id("email");
    By _password = By.id("passwd");
    By _signIn1 = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    By _signOut = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]");
    By _loginConfirmationText = By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]");


    public void enterEmail() {
        email = "test" + timeStamp() + "@test.com";
        typeText(_email, email);


    }

    public void clickOnCreateAccount() {
        clickOnElement(_createAccount);
    }

    public String registrationConfirmationMessage() {
        return getText(_registerConfirmationText);
    }

    public String errorForInvalidEmailAddress() {
        return getText(_invalidEmail);
    }

    public void enterEmailAndPassword() {
        typeText(_email1, email);
        typeText(_password, "sitaram");
    }

    public void clickOnSignIn() {
        clickOnElement(_signIn1);
    }

    public void clickOnSignOut() {
        clickOnElement(_signOut);
    }

    public String loginSuccessFullyMessage() {
        return getText(_loginConfirmationText);
    }

}
