Feature: 

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Only truck driver can access to vehicle odometer page
	#2-Sales manager or store manager can not access vehicle odometer page
	@IN-228 @IN-233
	Scenario: US-024 Only truck driver can access to Vehicle Odometer Page Test
		When the user navigate to Fleet module and click on the Vehicle Odometer
		Then the user should navigate to Vehicles Odometers page
		When the user click on the Create Vehicle Odometer
		Then the user should navigate to Create Vehicle Odometer page
		When the user updated the values and click on the Save and Close
#		Then Entity saved should appear at the top of the page