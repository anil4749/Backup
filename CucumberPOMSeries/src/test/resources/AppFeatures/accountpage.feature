Feature: Account Page Feature

Background:
Given user has already loged in to application
|Username|Password|
|moreanil633@gmail.com|Anil@1993|

Scenario: Account page title
Given user is on login page
When user gets title of the page
Then page title should be "My account - My Store"

Scenario: Accounts Section Count
Given user is on accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And account section count should be 6

