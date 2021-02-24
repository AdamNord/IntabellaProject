Feature:

  Background:
		#@IN-216
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	#2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
  @IN-223 @IN-225
  Scenario: US-19 Driver can create vehicle odometer Test
    When the user navigate to Fleet module and click on the Vehicle Odometer
    Then the user should navigate to Vehicles Odometers page
    When the user click on the Create Vehicle Odometer
    Then the user should navigate to Create Vehicle Odometer page
    When the user updated the values and click on the Save and Click
    Then Entity saved should appear at the top of the page
		