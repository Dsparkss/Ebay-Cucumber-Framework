Feature: Advance page validation

  @advance
  Scenario: Advance page
    Given User is on the Ebay advance search page
    When User clicks on the Ebay Logo
    Then User will be redirecged to the Ebay Home Page

  @advanceitem
  Scenario: Advance search an item
    Given User is on the Ebay advance search page
    When user advance search an item
      | keyword    | exclude     | min | max |
      | i phone 11 | refurbished | 700 | 900 |
