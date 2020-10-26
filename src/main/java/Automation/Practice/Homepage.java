package Automation.Practice;

import org.openqa.selenium.By;

public class Homepage extends Utils {
    By _signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By _dresses = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");

    public void clickOnSignIn() {
        clickOnElement(_signIn);
    }

    public void clickOnDresses() {
        clickOnElement(_dresses);
    }
}
