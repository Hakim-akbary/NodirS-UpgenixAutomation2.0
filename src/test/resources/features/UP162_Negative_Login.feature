Feature: User should not be able to login with wrong credentials


  @WIP
  Scenario Outline: Negative Login Scenario
    Given the user is on the login page
    When the user enters "<email>" and "<password>"
    Then the user should see "Wrong login/password"

    Examples:
      | email                                | password            |
      | james.smith@gmail.com                | Welcome             |
      | Simon.lang@yahoo.com                 | BestOfMeIsYetToCome |
      | Jonas.Skaghammar@microsoftoffice.com | GlasGiganten        |
      | Sebastian.Ibrahimovic@hotmail.com    | Overconfident       |


  @WIP
  Scenario Outline: User should not be able to login with blank credentials
    Given the user is on the login page
    When the user enters "<blankEmail>" and "<blankPassword>"
    Then the user should be reminded to "<fill in the field>"


    Examples:
      | blankEmail | blankPassword | fill in the field          |
      |            |               | Please fill in this field. |
      |            | password2     | Please fill in this field. |








