Feature: Make a flow of purchases.
  @BuyPath
  Scenario Outline: Purchasing process
    #Choose the 2 products
    Given User on product page
    When Select product Phones brand s6 other product Monitors brand Apple
    Then See cart
    And Checkout

    # Complete the purchase form
    When Data entry <Name> <Country> <City> <Credit_card> <Month> <Year>
    Then I finalize purchase

    #Data
  Examples:
    | Name | Country | City  | Credit_card | Month   | Year |
    | Hugo | Ecuador | Quito | 12345678910 | January | 1998 |

