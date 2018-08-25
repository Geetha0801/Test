Feature: Editing a lead in Leaftaps


#Background: Load URL
#Given Open the browser
#And Maxmize the window
#And Load the url
#And Set the timeout

Scenario Outline: Edit Lead 


Given Enter user name as <username> 
And Enter password as <password> 
And Click Login button
And Click CRMSFA
And Click Leads
And Click Find Leads 
And Enter the First Name as <fname> 
And Click on Find Leads Button
And Wait for result   
And Click on resulting first Lead  
And Click Edit button 
And Clear company name  
And Change the Company name as <cname>  
When Click update  
Then Confirm the changed name as <cname> 

Examples:
|username|password|fname|cname|cname|
|DemoCSR|crmsfa|Geetha|CTS|CTS|
