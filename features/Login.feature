Feature: BookCart application demo

Scenario: Login should be success

Given User should navigate to the application
And User clicks on the login link
And User enter the username as ortoni
And user enter the password as pass1234
When User click the login button
Then login should be success

Scenario: Login should be fail

Given User should navigate to the application
And User clicks on the login link
And User enter the username as karthick
And user enter the password as passkarthi
When User click the login button
But login should fail