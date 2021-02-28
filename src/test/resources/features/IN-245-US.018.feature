Feature: Truck Driver using (+) sign for sidebar widget,pins and favorite pages TEST

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
	#{color:#FF0000}1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign{color}
	# 2-Truck driver can pin the page by using pin sign
	# 3-Truck driver can make the page favourite by using favourite sign
	#
	# 
	@IN-245 @IN-250
	Scenario: Truck Driver using (+) sign for sidebar widget,pins and favorite pages TEST (US.018)
		When user navigated to "Fleet" tab "Vehicle odometer" module
		And Click the plus button on the right sidebar
		Then opening "Sidebar Widgets" box
		When Click "Add" button, corresponding to "Recent Emails"
		Then The counter number beside the added text counted
		When Click "Add" button, corresponding to "Sticky Note"
		Then The counter number beside the added text counted
		When Click "Add" button, corresponding to "Task List"
		Then The counter number beside the added text counted
		And Click close button
		Then Verify "recent emails","sticky note","task list" were added to sidebar

		