Feature: Creating a lead in Leaftaps
@sanity
Scenario Outline: Positive Create Lead with all Mandatory values

Given Open the browser
And Maxmize the window
And Load the url
And Set the timeout
And Enter the user name as <username>
And Enter the password as <password>
And Click the Login button
And Verify the login is successfull
And Click CRMSFA link
And Verify launch of MyHomePage
And Click Leads Tab
And Verify launch of MyLeadsPage
And Click the link Create Lead
And Enter the company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click the submit button
Then Verify the first name of created Lead as <fName>

Examples:
|username|password|cName|fName|lName|fName|
|DemoCSR|crmsfa|Accenture|Poomthi|S|Poomathi|


@smoke
Scenario Outline: Negative Create Lead with all Mandatory values

Given Open the browser
And Maxmize the window
And Load the url
And Set the timeout
And Enter the user name as <username>
And Enter the password as <password>
And Click the Login button
And Verify the login is successfull
And Click CRMSFA link
And Verify launch of MyHomePage
And Click Leads Tab
And Verify launch of MyLeadsPage
And Click the link Create Lead
And Enter the company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click the submit button
Then Verify the first name of created Lead as <fName>
Examples:
|username|password|cName|fName|lName|fName|
|DemoSalesManager|crmsfa|Accenture|Geetha|S|Geetha|
