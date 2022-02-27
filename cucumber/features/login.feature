Feature: LeafTaps login functionality

Background:
Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps'

Scenario Outline: Login with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: Login with negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed


