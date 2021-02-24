Feature: 

	Background:
		#@IN-216
		Given The user is on the login page
		When the user enters valid credentials
		Then User should be able to login

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