Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName	|bhargavi												|
|lastName		|veeravalli										|
|email      |rajujunnu@gmail.com					|
|telephone	|1356655744									|
|password		|satyadurga											|
|confirm_password|satyadurga|
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account with all fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName	|bhargavi												|
|lastName		|guduri										|
|telephone	|5752675416									|
|password		|123456											|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates a duplicate account
Given User navigates to Register Account page
When User enters the details into below fields
|firstName	|bhargavi												|
|lastName		|guduri									|
|email			|gbhargavi@gmail.com			|
|telephone	|9100349635									|
|password		|satyadurga											|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to Register Account page
When User dont enter any details into fields
And User clicks on Continue button
Then User should get proper warning messages for every mandatory field
