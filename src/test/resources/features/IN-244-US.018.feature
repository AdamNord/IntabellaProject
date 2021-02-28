Feature: 

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to delete selected specific vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can delete selected vehicle odometer.
	@IN-244
	Scenario: Truck driver deleting selected vehicle odometer TEST(US.022)
		When user navigate to "Fleet" tab "Vehicle Odometer" module
		Then opening "Vehicle Odometer" page
		When Select any specific vehicle odometers' check-box on the left side in the page  
		Then top of on the vehicle odometers' checkboxes line is changing from "  " to "-"
		When Click the ''3 dot'' button on the right side of page and on the same row with vehicle odometer's properties' header
		Then obtained to "delete" option
		When click to "delete"  button
		Then opened the"delete confirmation" pop-up window page
		When click the "yes,delete" option on the "delete confirmation" pop-up window page
		Then Verify selected vehicle odometer's line is deleted
		Then Verify seen "One entity was deleted" message top of and middle of the page, after selected vehicle odometer's line is deleted