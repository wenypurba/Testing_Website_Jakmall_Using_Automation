Feature: Test for Jakmall (https://www.jakmall.com/)

Scenario: Test Register with Valid Credentials
	Given We are on Daftar Page
	When We inputs the correct form data
	Then We can register successfully