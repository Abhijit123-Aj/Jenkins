Feature: Login to SauceDemo

  Scenario Outline: Successful login of SauceDemo
    Given the user is on login page
    When the user enters username as "<username>" and password as "<password>" and click login button
    Then the user validates the text Products

    Examples:
      | username        | password      |
      | standard_user   | secret_sauce  |
      | locked_out_user | secret_sauce  |
