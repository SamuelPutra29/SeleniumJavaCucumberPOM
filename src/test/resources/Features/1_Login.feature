@sanity

Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://demoqa.com/login"
    Then User clicks on New User