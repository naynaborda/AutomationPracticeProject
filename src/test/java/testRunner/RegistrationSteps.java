package testRunner;

import Automation.Practice.*;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class RegistrationSteps {
    Homepage homepage = new Homepage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AccountCreationPage accountCreationPage = new AccountCreationPage();
    AuthenticationPage authenticationPage = new AuthenticationPage();

    @When("^user click on the Sign in button on the home page$")
    public void user_click_on_the_Sign_in_button_on_the_home_page() {
        homepage.clickOnSignIn();

    }

    @When("^user enter an email address in email address field$")
    public void user_enter_an_email_address_in_email_address_field() {
        myAccountPage.enterEmail();

    }

    @When("^user click on the create an account button$")
    public void user_click_on_the_create_an_account_button() {
        myAccountPage.clickOnCreateAccount();

    }

    @Then("^user navigate to create an account page$")
    public void user_navigate_to_create_an_account_page() {
        Assert.assertEquals("CREATE AN ACCOUNT", accountCreationPage.navigatedOnCreateAccount());


    }

    @Then("^user enter all mandatory field data$")
    public void user_enter_all_mandatory_field_data() {
        accountCreationPage.fillingMandatoryDataForRegistration();

    }

    @Then("^user click on the register button$")
    public void user_click_on_the_register_button() {
        accountCreationPage.clickOnRegisterButton();

    }

    @Then("^user should registered successfully with welcome message \"([^\"]*)\"$")
    public void user_should_registered_successfully_with_welcome_message(String registerSuccessfullyMessage) {
        Assert.assertEquals(registerSuccessfullyMessage, myAccountPage.registrationConfirmationMessage());

    }

    //from here second scenario
    @Then("^user should see an error for email address mandatory field \"([^\"]*)\"$")
    public void user_should_see_an_error_for_email_address_mandatory_field(String inValidEmail) {
        Assert.assertEquals(inValidEmail, myAccountPage.errorForInvalidEmailAddress());

    }

    @Then("^user should see mandatory fields errors for first name \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_first_name(String firstNameError) {
        Assert.assertEquals(firstNameError, authenticationPage.mandatoryFieldsErrorForFirstName());

    }

    @Then("^user should see mandatory fields errors for last name \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_last_name(String lastNameError) {
        Assert.assertEquals(lastNameError, authenticationPage.mandatoryFieldsErrorForLastName());

    }

    @Then("^user should see mandatory fields errors for password \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_password(String passwordError) {
        Assert.assertEquals(passwordError, authenticationPage.mandatoryFieldsErrorForPassword());

    }

    @Then("^user should see mandatory fields errors for address \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_address(String address1Error) {
        Assert.assertEquals(address1Error, authenticationPage.mandatoryFieldsErrorForAddress1());

    }

    @Then("^user should see mandatory fields errors for city \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_city(String cityError) {
        Assert.assertEquals(cityError, authenticationPage.mandatoryFieldsErrorForCity());

    }

    @Then("^user should see mandatory fields errors for state \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_state(String stateError) {
        Assert.assertEquals(stateError, authenticationPage.mandatoryFieldErrorForState());

    }

    @Then("^user should see mandatory fields errors for zip code \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_zip_code(String postcodeError) {
        Assert.assertEquals(postcodeError, authenticationPage.mandatoryFieldErrorForPostCode());

    }

    @Then("^user should see mandatory fields errors for mobile phone \"([^\"]*)\"$")
    public void user_should_see_mandatory_fields_errors_for_mobile_phone(String phoneNumberError) {
        Assert.assertEquals(phoneNumberError, authenticationPage.mandatoryFieldErrorForPhoneNumber());

    }


}
