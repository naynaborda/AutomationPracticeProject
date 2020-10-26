package Automation.Practice;

import org.openqa.selenium.By;

public class AuthenticationPage extends Utils {
    By _firstNameError = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[3]");
    By _lastNameError = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[2]");
    By _passwordError1 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[4]");
    By _addressError = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[5]");
    By _cityError = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[6]");
    By _stateError = By.xpath("//li[contains(text(),'This country requires you to choose a State.')]");
    By _postcodeError = By.xpath("//li[contains(text(),\"The Zip/Postal code you've entered is invalid. It \")]");
    By _phoneNumberError = By.xpath("//li[contains(text(),'You must register at least one phone number.')]");

    public String mandatoryFieldsErrorForFirstName() {
        return getText(_firstNameError);
    }

    public String mandatoryFieldsErrorForLastName() {
        return getText(_lastNameError);
    }

    public String mandatoryFieldsErrorForPassword() {
        return getText(_passwordError1);
    }

    public String mandatoryFieldsErrorForAddress1() {
        return getText(_addressError);
    }

    public String mandatoryFieldsErrorForCity() {
        return getText(_cityError);
    }

    public String mandatoryFieldErrorForState() {
        return getText(_stateError);
    }

    public String mandatoryFieldErrorForPostCode() {
        return getText(_postcodeError);
    }

    public String mandatoryFieldErrorForPhoneNumber() {
        return getText(_phoneNumberError);
    }
}
