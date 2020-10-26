package Automation.Practice;

import org.openqa.selenium.By;

public class CartSummaryPage extends Utils {
    By _cartSummary = By.xpath("//*[@id=\"cart_title\"]/span");
    By _productAdded = By.xpath("//b[contains(text(),'Cart')]");

    public String navigatedToCartSummaryPage() {
        return getText(_cartSummary);
    }

    public void productAddedInCart() {
        mouseHover(_productAdded);
    }

}
