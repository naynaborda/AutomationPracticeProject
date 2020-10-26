package Automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ProductPage extends Utils {
    By _casualDresses = By.linkText("Casual Dresses");
    By _printedDresses = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
    By _addToCart = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]");
    By _proceedToCheckOut = By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]");

    public String navigatedOnProductPage() {
        return getText(_casualDresses);
    }

    public void clickOnAddToCartButton() {
        mouseHover(_printedDresses);
        clickOnElement(_addToCart);

    }

    public void clickOnProceedToCheckOut() {
        clickOnElement(_proceedToCheckOut);
    }


}
