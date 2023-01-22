Feature: Add address functionality

  Scenario Outline: User should be able to add item to cart

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
      | SizeMedium     |
      | colorItem      |
      | addToCart      |

    Then Success message should be displayed


    And Click on the element in the Order
      | clickBasket |
      | checkOut    |


#    When User send the keys in the shipping address
#      | streetAddress | turkey   |
#      | city          | kadikoy  |
#      | zipcode       | 23455    |
#      | phone         | 21230055 |
#      | stateProvince | istanbul |



    And Click on the element in the addres lines
      | next       |
      | placeOrder |

    Then  Order message should be displayed

    Examples:
      | Email             | Password     |
      | yldz451@gmail.com | yildiz12Tu#2 |


