Feature:  Bill Pay Functionality
  Background:

    Given Navigate to parabank
    When user Click on the login button
    And user enter username as "<username>" and "<password>"
    Then User should logged in
    Scenario Outline: Bill Pay
    When user click on the billpay button
      And user should fill the payee informations



      Examples:
        |  |




