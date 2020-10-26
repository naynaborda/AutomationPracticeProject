package Automation.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuits extends BaseTest {
    Homepage homepage = new Homepage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AccountCreationPage accountCreationPage = new AccountCreationPage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    ProductPage productPage = new ProductPage();
    CartSummaryPage cartSummaryPage = new CartSummaryPage();

    @Test
    public void registerSuccessfully() {
        homepage.clickOnSignIn();
        myAccountPage.enterEmail();
        myAccountPage.clickOnCreateAccount();
        String expectedResult = "CREATE AN ACCOUNT";
        String actualResult = accountCreationPage.navigatedOnCreateAccount();
        Assert.assertEquals(actualResult, expectedResult, "User is not navigated to create account page");
        accountCreationPage.fillingMandatoryDataForRegistration();
        accountCreationPage.clickOnRegisterButton();
        String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actualText = myAccountPage.registrationConfirmationMessage();
        Assert.assertEquals(expectedText, actualText, "User is not registered successfully");


    }

    @Test
    public void registerUnSuccessfully() {
        homepage.clickOnSignIn();
        myAccountPage.clickOnCreateAccount();
        String expectedResult = "Invalid email address.";
        String actualResult = myAccountPage.errorForInvalidEmailAddress();
        Assert.assertEquals(expectedResult, actualResult, "User can click on create a account ");
        myAccountPage.enterEmail();
        myAccountPage.clickOnCreateAccount();
        accountCreationPage.clickOnRegisterButton();
        String expectedText = "firstname is required.";
        String actualText = authenticationPage.mandatoryFieldsErrorForFirstName();
        Assert.assertEquals(expectedText, actualText, "FirstName is not required");
        String expectedText1 = "lastname is required.";
        String actualText1 = authenticationPage.mandatoryFieldsErrorForLastName();
        Assert.assertEquals(expectedText1, actualText1, "LastName is not required");
        String expectedText2 = "passwd is required.";
        String actualText2 = authenticationPage.mandatoryFieldsErrorForPassword();
        Assert.assertEquals(expectedText2, actualText2, "Password is not required");
        String expectedText3 = "address1 is required.";
        String actualText3 = authenticationPage.mandatoryFieldsErrorForAddress1();
        Assert.assertEquals(expectedText3, actualText3, "Address is not required");
        String expectedText4 = "city is required.";
        String actualText4 = authenticationPage.mandatoryFieldsErrorForCity();
        Assert.assertEquals(expectedText4, actualText4, "City is not required");
        String expectedText5 = "This country requires you to choose a State.";
        String actualText5 = authenticationPage.mandatoryFieldErrorForState();
        Assert.assertEquals(expectedText5, actualText5, "State is not required");
        String expectedText6 = "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
        String actualTest6 = authenticationPage.mandatoryFieldErrorForPostCode();
        Assert.assertEquals(expectedText6, actualTest6, "Postcode is not required");
        String expectedText7 = "You must register at least one phone number.";
        String actualText7 = authenticationPage.mandatoryFieldErrorForPhoneNumber();
        Assert.assertEquals(expectedText7, actualText7, "PhoneNumber is not required");

    }

    @Test
    public void loginSuccessfully() {
        homepage.clickOnSignIn();
        myAccountPage.enterEmail();
        myAccountPage.clickOnCreateAccount();
        String expectedResult = "CREATE AN ACCOUNT";
        String actualResult = accountCreationPage.navigatedOnCreateAccount();
        Assert.assertEquals(actualResult, expectedResult, "User is not navigated to create account page");
        accountCreationPage.fillingMandatoryDataForRegistration();
        accountCreationPage.clickOnRegisterButton();
        String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actualText = myAccountPage.registrationConfirmationMessage();
        Assert.assertEquals(expectedText, actualText, "User is not registered successfully");
        myAccountPage.clickOnSignOut();
        homepage.clickOnSignIn();
        myAccountPage.enterEmailAndPassword();
        myAccountPage.clickOnSignIn();
        String expectedMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actualMessage = myAccountPage.loginSuccessFullyMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "User is not log in successfully");


    }

    @Test
    public void addToCartProduct() {
        homepage.clickOnDresses();
        String expectedText = "Casual Dresses";
        String actualText = productPage.navigatedOnProductPage();
        Assert.assertEquals(expectedText, actualText, "User not navigated to product page");
        productPage.clickOnAddToCartButton();
        productPage.clickOnProceedToCheckOut();
        String expectedResult = "Your shopping cart contains: 1 Product";
        String actualResult = cartSummaryPage.navigatedToCartSummaryPage();
        Assert.assertEquals(expectedResult, actualResult, "User not navigated to CartSummaryPage");
        cartSummaryPage.productAddedInCart();


    }
}
