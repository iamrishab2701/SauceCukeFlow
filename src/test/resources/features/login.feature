Feature: SauceDemo Login

  Scenario: Successful login
    Given the user is on the SauceDemo login page
    When the user logs in with valid credentials
    Then the user should be redirected to the products page