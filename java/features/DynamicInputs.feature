Feature: Leads feature in leaftaps application

Scenario Outline: Create lead scenario with valid test data

Given Set the Environment
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful
When Click on the crmsfa link
And Click on the leads tab
And Click on the create lead link
Given Enter the company name as <cname>
And Enter the first name as <fname>
And Enter the last name as <lname>
And Enter the phone number as <phno>
When Click on the submit button
Then Retrive and print the lead id and verify the company name as <cname> and fist name as <fname> and last name as <lname> 

Examples:
|cname|fname|lname|phno|
|'Omega'|'Karthick'|'Ravics'|'81484456'|
|'Exela'|'Azar'|'hasim'|'97154588'|
