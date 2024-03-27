# https://tutorialsninja.com/demo/

Feature: Place Order

  Scenario: Search single item
    Given User is on Home Page
    When User search an item "MacBook Air"
    Then Item must be listed 
    
 # Scenario: Add item to the cart
  
 	#  Given User should be on search result page
  #  When User add item to cart
  #  Then Item must be added 

 # Scenario: Checkout Order
  #  When User do checkout
   # Then Should navigate to Checkout page
