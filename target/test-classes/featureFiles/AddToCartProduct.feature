Feature: As a user I should able to add the product into cart

  @addToCart
  Scenario: user should able to add product to cart
    When user select a product from home page
    And user navigate to product page
    And user click on the Add to cart button
    And user on Proceed to checkout button on popup
    Then user should navigate to cart summary page
    And user should see product added in the cart

