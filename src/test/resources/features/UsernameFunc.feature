Feature: Automate Username Functionality

  @yek
  Scenario Outline: Automate Username Functionality <UsernameFunc>

    Given the user is on the login page
    When the user enters "<email>" and "<password>"
    Then the user should be able to login
    Given I should be able to see "<UsernameFunc>" on the top menu

    Examples:
      | email                      | password         | UsernameFunc       |
      | imm10@info.com             | inventorymanager | InventoryManager10 |
      | salesmanager15@info.com    | salesmanager     | SalesManager15     |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10  |
      | posmanager10@info.com      | posmanager       | POSManager10       |
