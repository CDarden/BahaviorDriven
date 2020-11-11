Feature: Techfios bank and cash New Account Functionality

Background:
Given User is on the Techfios Login Page

@NewAccount
Scenario Outline: User should be able to login with validate credentials
and open a new account
	When User enters the "<username>" and "<password>"
	And User clicks on the login button
	Then User should be able to see the DashBoard Page
	Then User clicks on bank and cash
	Then User on new account
	Then User fill up the form entering "<accountTitle>"and"<description>"and"<initialBalance>"and"<accountNumber>"and"<contactPerson>"and"<Contactphone>"and"<internetBankingUrl>"
	Then User should be able to see validate
Examples: 
| username | password | accountTitle | description | initialBalance | accountNumber | contactPerson | Contactphone | internetBankingUrl |
| demo@techfios.com | abc123 | Savings Account|NewAccount |25000|55556666777|Lindsay Harris|http://www.bankofamerica.com|
 