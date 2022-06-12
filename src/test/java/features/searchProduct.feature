Feature: Search and Place the order for Products
  @smoke
  Scenario Outline: Search Experience for prodcut search in both home and Offers page
    Given User is on GreenCart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    Then User searched for <Name> shortname in offerpage in offers page
    And Validate prodcut name in offer page matches with landing page

    Examples:
    | Name |
    | Tom  |
    | Beet |
