@avatar
Feature: As a user I should be able to see my avatar on the top menu

  Scenario Outline: as a user "<User>"

    Given the user is on the login page
    When the user enters "<email>" and "<password>"
    Then the user should be able to login
    And  the user should be see avatar functionality on the top

    Examples:
      | email                      | password         | User              |
      | imm10@info.com             | inventorymanager | imm10             |
      | salesmanager15@info.com    | salesmanager     | salesmanager15    |
      | expensesmanager10@info.com | expensesmanager  | expensesmanager10 |
      | posmanager10@info.com      | posmanager       | posmanager10      |