Feature: Login

#  @loginPositive
#  Scenario: Successful login
#    Given User is on HomePage
#    When User clicks on User icon
#    Then User verifies Login form
#    When User enters valid data
#    And User clicks on Anmelden button
#    Then User verifies user name status
#    When User clicks on User icon
#    Then User verifies user name
#


  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User is on HomePage
    When User clicks on User icon
    Then User verifies Login form
    And User enters valid email and invalid password
      | email   | passwort  |
      | <email> | <password> |
    And User clicks on Anmelden button
    Then User verifies Error Message
    And User quites browser
    Examples:
      | email       | password  |
      | hans@gm.com | qwert007! |
      | hans@gm.com | Qwert0077 |
      | hans@gm.com | QWERT007! |
      | hans@gm.com | Qwert!!!! |


#  .headerElement__icon--login
