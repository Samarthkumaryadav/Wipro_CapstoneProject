
Feature: Shopping flow for demouser

  Scenario: Complete shopping journey for demouser
    Given User launches the browser
    When User navigates to BStackDemo website
    
    And User logs in with demouser
    And User performs shopping flow with brands:
    

    And User searches for "iPhone"
    And Apply Low to High filter
    And Apply High to Low filter

    And User clicks Privacy Policy Read More
    And Privacy Policy page should open

    And User clicks Offers page
    And Offers message should be validated

    Then User logs out
