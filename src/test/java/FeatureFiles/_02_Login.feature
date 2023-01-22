Feature: Login Functionality

  Scenario Outline:  Enter  valid username and valid password and click Login button
    Given Navigate to Luna

    And Click on the element in the Form
      | sigIn |

    When User  sending the keys in the Form Content
      | email1    | <Email>    |
      | password1 | <Password> |


    And Click on the element in the Form
      | sigIn1 |

    Then  User Should login successfully



    Examples:
      | Email             | Password     |
      | yldz451@gmail.com | yildiz12Tu#2 |







