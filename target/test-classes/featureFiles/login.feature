@regression
Feature: As a user I should able to login with registered email address

  @login
  Scenario: user should able to login successful with registered email address
    Given user is already registered
    When user click on the Sign in button on the home page
    And user enter an email and password
    And user click on the Sing In button on authentication page
    Then user should login successfully with welcome message "Welcome to your account. Here you can manage all of your personal information and orders."


