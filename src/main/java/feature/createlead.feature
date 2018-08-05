Feature: Creating a lead in Leaftaps

Scenario: Positive Create Lead with all Mandatory values

Given Open the browser
And Maxmize the window
And Load the url
And Set the timeout
And Enter the user name as DemoSalesManager
And Enter the password as crmsfa
And Click the Login button
And Verify the login is successfull
And Click CRMSFA link
And Verify launch of MyHomePage
And Click Leads Tab
And Verify launch of MyLeadsPage
And Click the link Create Lead
And Enter the company Name as Accenture
And Enter the First Name as Geetha
And Enter the Last Name as S
When Click the submit button
Then Verify the first name of created Lead as Geetha