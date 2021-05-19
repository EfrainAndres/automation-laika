Feature: automationpractice.com

  Background:
    Given I launch the browser
    When I login with valid credentials

  Scenario: Order T-Shirt
    Then I Order T-Shirts
    And I Verify the T-Shirt order in order history

  Scenario: Update Personal Information
    Then I update "First name"
    And I Verify the updated "First name"
