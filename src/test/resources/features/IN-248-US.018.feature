Feature: Truck Driver using "favorite" sign for making the page favorite TEST

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		

	#*User Story :* 
	#
	#As a Truck Driver I should be able to use sidebar, widget, pins and favourite pages
	#
	# 
	#
	#_*Acceptance Criterias:*_
	#
	#1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
	# 2-Truck driver can pin the page by using pin sign
	# {color:#FF0000}3-Truck driver can make the page favourite by using favourite sign{color}
	@IN-248 @IN-253 @IN-250
	Scenario: Truck Driver using "favorite" sign for making the page favorite TEST  (US.018) 
		When user navigated to "Fleet" tab "Vehicle odometer" module
		#vehicle page e göre ilerlediğimiz için vehicle page e göre ilerleyeceğiz burada da
		Then opening vehicles page
		When Click the "Favorites" icon on the right side of the page.
		Then "Favorite " icon turned yellow.
		When Click "three line" icon(right side on the page) usernames's beside
		Then opened the pop-up page(include "History,Favorite,Most Viewed" options)
		When select the "Favorite" option
		Then Verify your page is under favorite list
		When logout the page
		And again,login as a truck driver
		Then Verify "Favorites" icon on the right side of the page is still choosen with yellow color
		