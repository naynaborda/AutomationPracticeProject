package testRunner;

import Automation.Practice.AccountCreationPage;
import Automation.Practice.Homepage;
import Automation.Practice.MyAccountPage;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class LoginSteps {
    Homepage homepage = new Homepage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AccountCreationPage accountCreationPage = new AccountCreationPage();

    @Given("^user is already registered$")
    public void user_is_already_registered() {
        homepage.clickOnSignIn();
        myAccountPage.enterEmail();
        myAccountPage.clickOnCreateAccount();
        Assert.assertEquals("CREATE AN ACCOUNT", accountCreationPage.navigatedOnCreateAccount());
        accountCreationPage.fillingMandatoryDataForRegistration();
        accountCreationPage.clickOnRegisterButton();
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", myAccountPage.registrationConfirmationMessage());
        myAccountPage.clickOnSignOut();
    }

    @When("^user enter an email and password$")
    public void user_enter_an_email_and_password() {
        myAccountPage.enterEmailAndPassword();

    }

    @When("^user click on the Sing In button on authentication page$")
    public void user_click_on_the_Sing_In_button_on_authentication_page() {
        myAccountPage.clickOnSignIn();

    }

    @Then("^user should login successfully with welcome message \"([^\"]*)\"$")
    public void user_should_login_successfully_with_welcome_message(String loginConfirmationMessage) {
        Assert.assertEquals(loginConfirmationMessage, myAccountPage.loginSuccessFullyMessage());

    }

}
