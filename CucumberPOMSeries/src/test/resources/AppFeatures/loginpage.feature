Feature:Login
Scenario: Login Page
Given user is on login page
When user gets title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password Link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When users enters username "moreanil633@gmail.com"
And user enter password "Anil@1993"
And user click on login button
Then user gets title of the page
And page title should be "My account - My Store"

Scenario: Check Create account/Register
Given user is on login page
When user enter emailID "more.anil633@gmail.com"
And click on create an account button
Then registore button should be display


