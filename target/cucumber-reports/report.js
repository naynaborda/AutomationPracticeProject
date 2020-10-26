$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddToCartProduct.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should able to add the product into cart",
  "description": "",
  "id": "as-a-user-i-should-able-to-add-the-product-into-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 31618036299,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should able to add product to cart",
  "description": "",
  "id": "as-a-user-i-should-able-to-add-the-product-into-cart;user-should-able-to-add-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@addToCart"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user select a product from home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user navigate to product page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on the Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user on Proceed to checkout button on popup",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should navigate to cart summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should see product added in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.user_select_a_product_from_home_page()"
});
formatter.result({
  "duration": 106689320699,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.user_navigate_to_product_page()"
});
formatter.result({
  "duration": 57643501,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.user_click_on_the_Add_to_cart_button()"
});
formatter.result({
  "duration": 298321601,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.user_on_Proceed_to_checkout_button_on_popup()"
});
formatter.result({
  "duration": 5948376800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.user_should_navigate_to_cart_summary_page()"
});
formatter.result({
  "duration": 59296700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartSteps.user_should_see_product_added_in_the_cart()"
});
formatter.result({
  "duration": 188060900,
  "status": "passed"
});
formatter.after({
  "duration": 30400,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I should able to login with registered email address",
  "description": "",
  "id": "as-a-user-i-should-able-to-login-with-registered-email-address",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 20737507301,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should able to login successful with registered email address",
  "description": "",
  "id": "as-a-user-i-should-able-to-login-with-registered-email-address;user-should-able-to-login-successful-with-registered-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already registered",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter an email and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the Sing In button on authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should login successfully with welcome message \"Welcome to your account. Here you can manage all of your personal information and orders.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_already_registered()"
});
formatter.result({
  "duration": 11682500500,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 1567868101,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_an_email_and_password()"
});
formatter.result({
  "duration": 282315201,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_the_Sing_In_button_on_authentication_page()"
});
formatter.result({
  "duration": 1632002200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to your account. Here you can manage all of your personal information and orders.",
      "offset": 53
    }
  ],
  "location": "LoginSteps.user_should_login_successfully_with_welcome_message(String)"
});
formatter.result({
  "duration": 37590500,
  "status": "passed"
});
formatter.after({
  "duration": 21000,
  "status": "passed"
});
formatter.uri("registration.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to register successfully with all mandatory detail on sign up page",
  "description": "so that user can access an account",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 14297679900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should able create an account and sign in successfully",
  "description": "",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page;user-should-able-create-an-account-and-sign-in-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter an email address in email address field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user navigate to create an account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter all mandatory field data",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should registered successfully with welcome message \"Welcome to your account. Here you can manage all of your personal information and orders.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 2358914301,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_enter_an_email_address_in_email_address_field()"
});
formatter.result({
  "duration": 219461000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 103201600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_navigate_to_create_an_account_page()"
});
formatter.result({
  "duration": 3256687400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_enter_all_mandatory_field_data()"
});
formatter.result({
  "duration": 1262018201,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_register_button()"
});
formatter.result({
  "duration": 2195486600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to your account. Here you can manage all of your personal information and orders.",
      "offset": 58
    }
  ],
  "location": "RegistrationSteps.user_should_registered_successfully_with_welcome_message(String)"
});
formatter.result({
  "duration": 58193300,
  "status": "passed"
});
formatter.after({
  "duration": 19300,
  "status": "passed"
});
formatter.before({
  "duration": 14602865001,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should able to see an error for mandatory field on account creation page",
  "description": "",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page;user-should-able-to-see-an-error-for-mandatory-field-on-account-creation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@errorValidation"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should see an error for email address mandatory field \"Invalid email address.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enter an email address in email address field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user should see mandatory fields errors for first name \"firstname is required.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should see mandatory fields errors for last name \"lastname is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should see mandatory fields errors for password \"passwd is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user should see mandatory fields errors for address \"address1 is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user should see mandatory fields errors for city \"city is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user should see mandatory fields errors for state \"This country requires you to choose a State.\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user should see mandatory fields errors for zip code \"The Zip/Postal code you\u0027ve entered is invalid. It must follow this format: 00000\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user should see mandatory fields errors for mobile phone \"You must register at least one phone number.\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 6352817000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 110744801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address.",
      "offset": 60
    }
  ],
  "location": "RegistrationSteps.user_should_see_an_error_for_email_address_mandatory_field(String)"
});
formatter.result({
  "duration": 804137300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_enter_an_email_address_in_email_address_field()"
});
formatter.result({
  "duration": 185957900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 91403301,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_the_register_button()"
});
formatter.result({
  "duration": 13763250200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstname is required.",
      "offset": 56
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_first_name(String)"
});
formatter.result({
  "duration": 41646500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastname is required.",
      "offset": 55
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_last_name(String)"
});
formatter.result({
  "duration": 42909499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passwd is required.",
      "offset": 54
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_password(String)"
});
formatter.result({
  "duration": 32063800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "address1 is required.",
      "offset": 53
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_address(String)"
});
formatter.result({
  "duration": 29494800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city is required.",
      "offset": 50
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_city(String)"
});
formatter.result({
  "duration": 35082601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This country requires you to choose a State.",
      "offset": 51
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_state(String)"
});
formatter.result({
  "duration": 43957400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Zip/Postal code you\u0027ve entered is invalid. It must follow this format: 00000",
      "offset": 54
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_zip_code(String)"
});
formatter.result({
  "duration": 40070299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You must register at least one phone number.",
      "offset": 58
    }
  ],
  "location": "RegistrationSteps.user_should_see_mandatory_fields_errors_for_mobile_phone(String)"
});
formatter.result({
  "duration": 29866700,
  "status": "passed"
});
formatter.after({
  "duration": 18100,
  "status": "passed"
});
});