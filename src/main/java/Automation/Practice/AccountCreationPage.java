package Automation.Practice;

import org.openqa.selenium.By;

public class AccountCreationPage extends Utils {
    By _createAccount = By.xpath("//h1[contains(text(),'Create an account')]");
    By _gender = By.id("id_gender1");
    By _customerFirstName = By.id("customer_firstname");
    By _customerLastName = By.id("customer_lastname");
    By _password = By.id("passwd");
    By _address = By.id("address1");
    By _city = By.id("city");
    By _state = By.id("id_state");
    By _postCode = By.id("postcode");
    By _country = By.id("id_country");
    By _mobilePhone = By.id("phone_mobile");
    By _registerBtn = By.xpath("//*[@id=\"submitAccount\"]/span");


    public String navigatedOnCreateAccount() {
        return getText(_createAccount);


    }

    public void fillingMandatoryDataForRegistration() {
        clickOnElement(_gender);
        typeText(_customerFirstName, "Ram");
        typeText(_customerLastName, "Sita");
        typeText(_password, "sitaram");
        typeText(_address, "2,SitaramNagar");
        typeText(_city, "Ayodhya");
        typeText(_state, "Alabama");
        typeText(_postCode, "12345");
        typeText(_country, "United States");
        typeText(_mobilePhone, "07843598765");

    }

    public void clickOnRegisterButton() {
        clickOnElement(_registerBtn);

    }
}
