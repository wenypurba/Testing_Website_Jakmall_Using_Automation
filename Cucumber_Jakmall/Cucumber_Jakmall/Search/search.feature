Feature: Test for Search Gaun from Jakmall 

Scenario: Test Search Gaun
			Given We are on login page and login
			When We input and search gaun
			And We are input min price
			And We are input max price
			Then We are click add to cart