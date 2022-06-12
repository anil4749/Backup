Feature:Login
Scenario: Login Page
Given user is on login page
When user gets title of the page
Then page tilte should be "Loin"

Scenario: Successful login with valid credential
Given User Launch Crom Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on login
Then Page Title shoud be "Dashboard / nopCommerce administration"
When User click  on logout link
Then Page Title should be "Your store. Login"a