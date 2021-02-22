
Feature: User should be able to see all modules on the top menu

  @UP-167-KM
  Scenario:User should be able to see all modules on the top menu
    Given the user is on the login page
    When the user enters "salesmanager15@info.com" and "salesmanager"
    Then the user should be able to login
    And User should be able to see all modules on the top menu
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |