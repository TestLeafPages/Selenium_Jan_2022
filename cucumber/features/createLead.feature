Feature: LeafTaps login functionality

Background:
Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps'


Scenario: Create lead with mandatory info
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed


