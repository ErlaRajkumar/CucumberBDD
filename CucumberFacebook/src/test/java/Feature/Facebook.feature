Feature: Testing the end to end feature of Facebook using the messenger feature

Scenario: Testing the Messenger Feature with the valid credentials

Given the Browser Is Launched and user enters the URL
When the user enters the valid  credentials mailid and password
And click on the login button
Then facebook Homepage displayed 
And the user select the messenger icon
And select the friend
And click on the like button
And close the tab
Then user select account option
And select logout option
