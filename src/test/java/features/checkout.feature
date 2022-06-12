Feature: Search and Place the order for Products
  @smoke
  Scenario Outline: Search Experience for prodcut search in both home and Offers page
    Given User is on GreenCart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    And Added <Inc> times selected product to cart
    Then User proceeds to checkout and validate the <Name> items in checkout page
    And Verify user has ability to enter promo code and place the order

    Examples:
    | Name |   | Inc |
    | Tom  |   |  3  |
