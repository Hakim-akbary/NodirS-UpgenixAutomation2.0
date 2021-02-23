Feature: Activities Functionality

  @ozgur
  Scenario Outline: Activities Functionality Check <user>

    Given the user is on the login page
    When the user enters "<email>" and "<password>"
    Then the user should be able to login
    And Users should be able to see Activities link on the top menu

    Examples:
      | email                      | password         | user               |
      | imm10@info.com             | inventorymanager | InventoryManager10 |
      | salesmanager15@info.com    | salesmanager     | SalesManager15     |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10  |
      | posmanager10@info.com      | posmanager       | POSManager10       |