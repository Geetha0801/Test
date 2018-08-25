Feature: Creating a lead in Leaftaps


#Background: Load URL
#Given Open the browser
#And Maxmize the window
#And Load the url
#And Set the timeout

Scenario Outline: Create Lead with all Mandatory values


Given Enter user name as <username> 
And Enter password as <password> 
And Click Login button
And Click CRMSFA
And Click Leads
And Click Create Lead
And Enter company Name as <cname>  
And Enter First Name as <fname> 
And Enter Last Name as <lname> 
And Enter the phone number as <phone>   
And Enter the email as <email> 
When Click submit button 
Then Verify first name of created Lead as <fname>  

Examples:
|username|password|cname|fname|lname|phone|email|fname|
|DemoCSR|crmsfa|Accenture|Geetha|S|8526797571|gitaa0801@gmail.com|Geetha|
