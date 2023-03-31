Feature: Login Feature

  Background:
    Given Navigate to parabank

  Scenario Outline: User logging in
    When  user enter username as "<username>" and "<password>"
    And  user Click on the login button
    Then Success message should be displayed
    Examples:
      | username |  | password |
      | ahmet123 |  | ahmet321 |


