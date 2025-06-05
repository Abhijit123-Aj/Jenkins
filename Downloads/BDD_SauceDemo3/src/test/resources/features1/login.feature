Feature: Login

  Scenario: Successfull login of SauceDemo
    Given the user is on login page
    When the user enters username as "standard_user" and password as "secret_sauce" and click login button
    Then the user validates the text Products

  Scenario: Failure login of SauceDemo
    Given the user is on login page
    When the user enters username as "standard_user" and password as "secret_sauce1" and click login button
    Then the user validates error message
