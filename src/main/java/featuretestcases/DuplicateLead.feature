Feature: Duplicating a lead in Leaftaps


#Background: Load URL
#Given Open the browser
#And Maxmize the window
#And Load the url
#And Set the timeout

Scenario Outline: Duplicate Lead 


Given Enter user name as <username> 
And Enter password as <password> 
And Click Login button
And Click CRMSFA
And Click Leads
And Click Find Leads 
And Click Email Tab   
And Enter Email as <email>   
And Click on Find Leads Button
And Wait for result  
And Get first resulting lead first name 
And Click on resulting first Lead  
When Click Duplicate Leads button   
Then Verify Lead Title as <title>  
Then Wait  
Then Verify Forename as <fname> 

Examples:
|username|password|email|title|fname|
|DemoCSR|crmsfa|gitaa0801@gmail.com|DuplicateLead|Geetha|
