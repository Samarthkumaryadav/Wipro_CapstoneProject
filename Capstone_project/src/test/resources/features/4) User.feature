Feature: Favourites User Validation

  Scenario: Validate favourites for fav_user
    Given User launches the Browser
    When User navigates to the BStackDemo site
    And User logs in with fav_user
    And Open Favourites and see items
    Then User logs out of site
