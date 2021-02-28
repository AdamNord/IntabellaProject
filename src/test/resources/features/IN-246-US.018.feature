Feature: Truck Driver using "pin" sign for pin the page TEST

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
	# {color:#FF0000}2-Truck driver can pin the page by using pin sign{color}
	# 3-Truck driver can make the page favourite by using favourite sign
	#
	# 
	@IN-246 @IN-253 @IN-250
	Scenario: Truck Driver using "pin" sign for pin the page TEST(US.018)
		When user navigated to "Fleet" tab "Vehicle odometer" module
		Then Opening vehicle odometer list
		When Click the "pin" icon on the right side of the page
		Then top of the dashboard "learn how to use this page" text turn to "car,entities-system" button
	     Then pin color turned into yellow
		Then verify pinned page added top of the dashboard