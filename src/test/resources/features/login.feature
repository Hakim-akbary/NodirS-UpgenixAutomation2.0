Feature: A user should be able to login

  @Nodir
  Scenario Outline: Login as a user

    When the user enters "<email>" and "<password>"
    Then the user should be able to login

    Examples:
      | email                       | password          |
      | imm10@info.com              | inventorymanager  |
      | salesmanager15@info.com     | salesmanager      |
      | expensesmanager10@info.com  | expensesmanager   |
      | posmanager10@info.com       | posmanager        |
