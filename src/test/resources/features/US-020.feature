Feature:

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		

	#User Story : (US-020)
	#As a Truck Driver When I click on any vehicle odometers in the grid, I should be able to see general informations.
	#Acceptance Criterias:
	#1-Truck Driver can see all informations about specific vehicle odometer.
	@IN-241 @IN-242
	Scenario: US-020 Truck Driver can see all informations about specific vehicle odometer.
		When the user navigated to "Fleet" and "Vehicle Odometers"sees 
		Then the user verify sees all informations about specific "Vehicle Odometers" page.