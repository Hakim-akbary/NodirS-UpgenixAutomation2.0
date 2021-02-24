@UP-168-WIP
Feature: As a user I should be able to go all modules I have right to access via links on the top menu

  Background:
    Given the user is on the login page

  Scenario Outline:Users should be able to go all modules they have right to access via links on the top menu
    When the user enters "<email>" and "<password>"
    Then the user should be able to login
    Then verify the "<userAccountName>"
    And the user clicks on the modules to verify following page titles respectively

      | #Inbox - Odoo               |
      | Meetings - Odoo               |
      | Notes - Odoo                  |
      | Contacts - Odoo               |
      | Pipeline - Odoo               |
      | Quotations - Odoo             |
      | Dashboard - Odoo              |
      | Point of Sale - Odoo          |
      | Requests for Quotation - Odoo |
      | Inventory - Odoo              |
      | Repair Orders - Odoo          |
      | Customer Invoices - Odoo      |
      | Mass Mailings - Odoo          |
      | Events - Odoo                 |
      | Employees - Odoo              |
      | Leaves Summary - Odoo         |
      | My Expenses to Submit - Odoo  |
      | Maintenance Teams - Odoo      |
      | My Dashboard - Odoo           |

    Examples:
      | email                   | password     | userAccountName |
      | salesmanager15@info.com | salesmanager | SalesManager15  |
