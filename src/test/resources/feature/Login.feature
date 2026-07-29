Feature: verifying the Omrbranch login page
   Scenario Outline: verify the login with valid credentials
    Given User is on the login page
    When User enters the "<userName>" and "<password>"
    And User click the Login button
    Then the User should verify the success Login message
    
Examples:
    |userName|password|
    |Kirthigavengadesan@gmail.com|Kiru@1999|
   