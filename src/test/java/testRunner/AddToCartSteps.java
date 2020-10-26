package testRunner;

import Automation.Practice.CartSummaryPage;
import Automation.Practice.Homepage;
import Automation.Practice.ProductPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class AddToCartSteps {
    Homepage homepage = new Homepage();
    ProductPage productPage = new ProductPage();
    CartSummaryPage cartSummaryPage = new CartSummaryPage();

    @When("^user select a product from home page$")
    public void user_select_a_product_from_home_page() {
        homepage.clickOnDresses();

    }

    @When("^user navigate to product page$")
    public void user_navigate_to_product_page() {
        Assert.assertEquals("Casual Dresses", productPage.navigatedOnProductPage());

    }

    @When("^user click on the Add to cart button$")
    public void user_click_on_the_Add_to_cart_button() {
        productPage.clickOnAddToCartButton();

    }

    @When("^user on Proceed to checkout button on popup$")
    public void user_on_Proceed_to_checkout_button_on_popup() {
        productPage.clickOnProceedToCheckOut();

    }

    @Then("^user should navigate to cart summary page$")
    public void user_should_navigate_to_cart_summary_page() {
        Assert.assertEquals("Your shopping cart contains: 1 Product", cartSummaryPage.navigatedToCartSummaryPage());

    }

    @Then("^user should see product added in the cart$")
    public void user_should_see_product_added_in_the_cart() {
        cartSummaryPage.productAddedInCart();


    }


}
