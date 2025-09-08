Feature: Existing Orders User Validation

  Scenario: Validate existing orders for existing_orders_user
    Given User launches their browser
    When User navigates to the BStackDemo Website
    And User logs in with existing_orders_user
    And Open Orders and sees
    Then User logs out of the site
