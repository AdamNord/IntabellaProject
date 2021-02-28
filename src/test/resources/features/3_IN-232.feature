Feature: 

	Background:
		#@IN-232
		Given the user is on the login page
		When the user enters the store manager information
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
	@IN-231 @IN-233
	Scenario: US-024 Store manager can not access vehicle odometer page Test
		When the store manager navigate to Fleet module and click on the Vehicle Odometer
		Then You do not have permission to perform this action. notification should be seen