Feature: The login feature for Orange HRM Application
Scenario Outline:  Login feature of HRM Admin
Given User Role is on the Login page
When User enter the "<Username>" and "<Password>"
And User clicks the login button

Examples:
|Username | Password|
|Admin | admin123|
|Admin | admin123|