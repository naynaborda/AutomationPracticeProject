@regression
Feature: User should able to register successfully with all mandatory detail on sign up page
  so that user can access an account

  @registration
  Scenario: User should able create an account and sign in successfully
    When user click on the Sign in button on the home page
    And user enter an email address in email address field
    And user click on the create an account button
    Then user navigate to create an account page
    And user enter all mandatory field data
    And user click on the register button
    Then user should registered successfully with welcome message "Welcome to your account. Here you can manage all of your personal information and orders."

  @errorValidation
  Scenario: User should able to see an error for mandatory field on account creation page
    When user click on the Sign in button on the home page
    And user click on the create an account button
    Then user should see an error for email address mandatory field "Invalid email address."
    When user enter an email address in email address field
    And user click on the create an account button
    And user click on the register button
    Then user should see mandatory fields errors for first name "firstname is required."
    And user should see mandatory fields errors for last name "lastname is required."
    And user should see mandatory fields errors for password "passwd is required."
    And user should see mandatory fields errors for address "address1 is required."
    And user should see mandatory fields errors for city "city is required."
    And user should see mandatory fields errors for state "This country requires you to choose a State."
    And user should see mandatory fields errors for zip code "The Zip/Postal code you've entered is invalid. It must follow this format: 00000"
    And user should see mandatory fields errors for mobile phone "You must register at least one phone number."

