Feature: End-to-End BStackDemo Shopping Flow

  Scenario Outline: Complete shopping journey with login
    Given User launches browser
    When User navigates to BStackDemo site
    And User logs in with valid credentials
    And User should be logged in successfully

    And User searches and adds first product to cart
    And Product should be visible in cart

    And User proceeds to checkout
    And Checkout page should be displayed

    And User enters shipping details with firstname "<FirstName>", lastname "<LastName>", address "<Address>", state "<State>", and pincode "<Pincode>"
    And Shipping address should be saved
    
    And User downloads order receipt
    And Order receipt should be downloaded

    And User clicks Continue shopping
    Then User should be redirected to shopping home page

    Examples:
      | FirstName | LastName | Address      | State   | Pincode |
      | Samarth    | Yadav        | Khargone   | Madhya pradesh    | 451001  |
      

    
