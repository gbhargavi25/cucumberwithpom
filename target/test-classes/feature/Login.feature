Feature: Login functionality

Background:
Given User navigates to login page

@validCredentials

Scenario Outline: Login with valid credentials
#Given User navigates to login page
When User enters valid email address <username> into email field
And User enters valid password <password> into password field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|username								|password			|
|gbhargavi25@gmail.com	|satyadurga		|
|gbhargavi45@gmail.com	  |satyadurga		|
|bhargavig@gmail.com	  |satyadurga		|

@invalidCredentials

Scenario: Login with invalid credentials
#Given User navigates to login page
When User enters invalid email address into email field
And User enters invalid password "1gjyfyt577" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

@invalidCredentials

Scenario: Login with valid email and invalid password
#Given User navigates to login page
When User enters valid email address "gbhargavi25@gmail.com" into email field
And User enters invalid password "jhdbhdsgg" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

@invalidCredentials

Scenario: Login with invalid email and valid password
#Given User navigates to login page
When User enters invalid email address into email field
And User enters valid password "satyadurga" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

@withoutCredentials

Scenario: Login without providing any credentails
#Given User navigates to login page
When User dont enter email address into email field
And User dont enter password into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch 
