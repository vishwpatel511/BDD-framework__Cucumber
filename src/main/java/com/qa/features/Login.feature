Feature: Demo blaze login feature

# Data-driven Testing Without using Examples keyword
#Scenario: Demo blaze login Test Scenario
#
#Given User should already be on the login Page
#When title of login page is Store
#Then User clicks on Login Button
#Then User enters "test123@yahoo.com" and "Test@123"
#Then User clicks on Login Button 
#Then User is on the Home Page

############# Data-driven Testing using Examples keyword
#Scenario Outline: Demo blaze login Test Scenario
#
#Given User should already be on the login Page
#When title of login page is Store
#Then User clicks on Login link
#Then User enters "<userName>" and "<password>"
#Then User clicks on Login Button 
#Then User is on the Home Page
#
#Examples:
#| userName         | password |
#| test123@yahoo.com| Test@123 |
#| admin@hotmail.com| admin@123|

############# Data-driven Testing using Data-table concept
# It is a quick and dirty way for data-driven approach 

#
#Scenario: Demo blaze login Test Scenario
#
#Given User should already be on the login Page
#When title of login page is Store
#Then User clicks on Login link
#Then User enters userName and password
#| test123@yahoo.com| Test@123 |
#
#Then User clicks on Login Button 
#Then User is on the Home Page
#
# ----------------------- Data driven approach using maps

Scenario: Demo blaze login Test Scenario

Given User should already be on the login Page
When title of login page is Store
Then User clicks on Login link
Then User enters userName and password

| userName            | password  |
| test123@yahoo.com   | Test@123  |
| admin456@hotmail.com| Admin@456 |
| tommy789@google.com | Tommy@789 |

Then User clicks on Login Button 
Then User is on the Home Page

