Feature: The login feature for Envirocal ERP Application
Scenario Outline:  Login feature of Envirocal ERP
Given Various User Role is on the Login page
When User Enter the  Valid "<Username>" and "<Password>"
And User Clicks the login button

Examples:
|Username | Password|
|envirocal84@gmail.com | Password@321|
|dummycal82@gmail.com | envirocal|
|dummycal85@gmail.com| envirocal85|
|envirocal85@gmail.com| Password@123|