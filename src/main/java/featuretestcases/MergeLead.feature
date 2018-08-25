Feature: Merging leads in Leaftaps


#Background: Load URL
#Given Open the browser
#And Maxmize the window
#And Load the url
#And Set the timeout

Scenario Outline: Merge Lead 


Given Enter user name as <username> 
And Enter password as <password> 
And Click Login button
And Click CRMSFA
And Click Leads
And Click Merge Lead 
And Click from icon 
And Switch Window <child> 
And Wait for window  
And Enter Lead Id as <sID>
And Click Find Button  
And Wait for window  
And Click first Lead Id   
And Hold  
And Switch to Parent Window <parent>  
And Click to icon 
And Switch Window <child>
And Wait for window
And Enter Lead Id as <dID>
And Click Find Button 
And Wait for window 
And Click first Lead Id  
And Hold 
And Switch to Parent Window <parent>  
When Click Merge
And Accept Alert 
And Click Find Leads tab 
And Wait for result
And Enter the Lead ID as <sID>
And Wait for result
And Click on Find Leads Button
And Wait for result
Then Verify the resulting Lead as <msg>


Examples:
|username|password|child|sID|parent|child|dID|parent|sID|msg|
|DemoSalesManager|crmsfa|1|10049|0|1|10050|0|10049|No records to display|
