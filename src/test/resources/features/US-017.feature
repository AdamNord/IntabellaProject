Feature: Truck_Driver_filtering_functions_in_Vehicle_Odometer

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login


	#As a Truck Driver I should be able to use all filtering functions
	#
	#1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button

  Scenario: Test of IN-18 Truck Driver filtering functions in Vehicle Odometer module US-017
    And the user navigates to "Fleet" , "Vehicle Odometer"
    Then the user should be able to see the page "Vehicle Odometer"
    When the user clicks "Grid Settings" button
#    And the user selects demanded columns
#    Then the user should see the columns in correct number and order