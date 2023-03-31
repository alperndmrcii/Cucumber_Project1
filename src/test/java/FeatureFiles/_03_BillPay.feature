Feature:  Bill Pay Functionality

  Scenario Outline: Bill Pay
    Given Navigate to parabank
    And user enter username as "ahmet123" and "ahmet321"
    And  user Click on the login button
    When user click on the billpay button
    And user should fill the payee informations
      | payeeName          | <payeeName>          |
      | payeeAdressStreet  | <adressStreet>       |
      | payeeAdressCity    | <adressCity>         |
      | payeeState         | <adressState>        |
      | payeeZipCode       | <zipCode>            |
      | payeePhoneNumber   | <payeePhoneNumber>   |
      | payeeAccount       | <payeeAccount>       |
      | payeeVerifyAccount | <payeeVerifyAccount> |
      | payeeAmount        | <payeeAmount>        |

    And user click on the send payment button
    Then success message should displayed

    Examples:
      | payeeName | adressStreet | adressCity | adressState | zipCode | payeePhoneNumber | payeeAccount | payeeVerifyAccount | payeeAmount |
      | Electric  | Kazimdirik   | Bornova    | İzmir       | 35353   | 05555555555      | 21231        | 21231              | 85          |
      | Su        | Çankaya   | Dar geldi sana    | Ankara       | 35353   | 05555555555      | 212311        | 212311              | 45          |
      | Dogalgaz  | Çek çek   |  dünyanın   |  Kahrını da       | 35353   | 05555555555      | 2123111        | 2123111              | 120          |












