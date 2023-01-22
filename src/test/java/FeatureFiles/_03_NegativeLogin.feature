Feature: Login invalidFunctionality


Scenario Outline: Enter  invalid username and invalid password and click Login button


Given Navigate to Luna


And Click on the element in the Form
| sigIn |

When User  sending the keys in the Form Content
| email1    | <Email>    |
| password1 | <Password> |


And Click on the element in the Form
| sigIn1 |


Then Invalid message should be displayed


Examples:
| Email            | Password |
| ahmt23@gmail.com | 12yu78Y  |