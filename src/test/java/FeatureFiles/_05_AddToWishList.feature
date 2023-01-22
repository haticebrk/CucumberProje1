Feature: Add to wish list functionality

  Scenario Outline: User should be able to add to Wish list


    Given Navigate to Luna
    And Click on the element in the Form
      | sigIn |

    When User  sending the keys in the Form Content
      | email1    | <Email>    |
      | password1 | <Password> |


    And Click on the element in the Form
      | sigIn1 |


    And Click on the element in the Top Menu
      | women |


    And Click on the element in the Order
      | jackets        |
      | oliviaZiplight |
      | addToWishlist  |

    Then Success message should be displayed

    Examples:
      | Email             | Password     |
      | yldz451@gmail.com | yildiz12Tu#2 |