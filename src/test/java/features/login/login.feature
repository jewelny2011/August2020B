Feature: login

  Scenario: Login with valid email and password
    Given :I am at talentTEK home page
    And   :I enter valid email
    And   :I enter valid password
    When  :I click on login button
    Then  :I will verify I successfully logged into my existing account
    And   :I close browser

