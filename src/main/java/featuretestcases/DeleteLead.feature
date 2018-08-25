Feature: Deleting a lead in Leaftaps


#Background: Load URL
#Given Open the browser
#And Maxmize the window
#And Load the url
#And Set the timeout

Scenario Outline: Delete Lead 


Given Enter user name as <username> 
And Enter password as <password> 
And Click Login button
And Click CRMSFA
And Click Leads
And Click Find Leads 
And Click Phone Tab  
And Enter Phone Number as <phone>  
And Click on Find Leads Button
And Wait for result 
And Get first resulting lead id   
And Click on resulting first Lead  
And Click Delete button  
And Click Find Leads  
And Enter the Lead ID as <LID> 
When Click on Find Leads Button 
Then Verify the resulting Lead as <expected> 

Examples:
|username|password|phone|LID|expected|
|DemoCSR|crmsfa|8526797571|11246|No records to display|
