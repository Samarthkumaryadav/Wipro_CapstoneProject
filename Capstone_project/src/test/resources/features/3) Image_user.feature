Feature: Image Not Loading User Validation

  Scenario: Validate login for image_not_loading_user
    Given User launches Browser
    When User navigates to BStackDemo Website
    And User logs in with image_not_loading_user
    And Validate that user logged in successfully
    Then User will log out
