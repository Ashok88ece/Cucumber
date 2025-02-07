Feature: This is the login feature for Orange HRM App
Scenario: This is Login Scenario
Given User is on the Login 
When the user enter the valid below credentials to login
|Admin | admin123|
And user clicks the login button
Then  then user should see HRM Home page
