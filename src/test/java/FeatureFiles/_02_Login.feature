Feature: Login Feature

  Background:
    Given Navigate to parabank

  Scenario Outline: User logging in
    When  user enter username as "<username>" and "<password>"
    And  user Click on the login button
    Then User should logged in
    And  click on the logout button

    Examples:
      | username |  | password |
      | ahmet123 |  | ahmet321 |


  Scenario: user logging in fail
    When user enter username as "hasan123" and "hasan321"
    And  user Click on the login button
    Then login shoul fail


