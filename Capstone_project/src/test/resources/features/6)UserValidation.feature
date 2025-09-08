Feature: Locked User Validation

  Scenario: Validate locked account message
    Given User launches their Browser
    When User navigates to the BStackDEMO site
    And User logs in with locked_user
    Then Validate locked account message
