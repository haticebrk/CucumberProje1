Feature: Register Account

  Scenario:Create an Account
    Given Navigate to Luna

    And Click on the element in the Form
      | createAnAccount |


    And  User  sending the keys in the Form Content

      | firstName       | ayse                |
      | lastname        | yildiz              |
      | email           | yldz45189@gmail.com |
      | lastname        | yildiz              |
      | password        | yildiz12Tu#2        |
      | confirmPassword | yildiz12Tu#2        |

    And Click on the element in the Form
      | CreateAccountButton |

    Then User should be able to successfully get an account


