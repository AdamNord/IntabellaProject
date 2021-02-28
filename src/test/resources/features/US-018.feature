@wip
Feature:

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
	@IN-245 @IN-253 @IN-250
	Scenario: Truck Driver using (+) sign for adding Recent Email,Sticky Notes,Task List Widgets TEST (US.018)
		When user navigate to "Fleet" tab "Vehicles" module
		When Click the plus button on the right sidebar
		When Click Add button, corresponding to "Recent Emails"
		Then The counter number beside the added text counted
		When Click Add button, corresponding to "Sticky Note"
		Then The counter number beside the added text counted
		When Click Add button, corresponding to "Task List"
		Then The counter number beside the added text counted
		And Click close button
		Then Verify "recent emails","sticky note","task list" were added to sidebar
			

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
	#"" arasındakileri düzenle
	@IN-246 @IN-253 @IN-250
	Scenario: Truck Driver using "pin" sign for pin the page TEST(US.018)
		When user navigated to "Fleet" tab "Vehicle odometer" module
		When Click the pin icon on the right side of the page
		Then pin color turned into yellow
		Then verify pinned page added top of the dashboard
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
	#
	#{color:#FF0000} {color}
	@IN-247 @IN-253 @IN-250
	Scenario:   (US.018) Adding page to favorite list TEST
		When user navigated to "Fleet" tab "Vehicle odometer" module
		When Click the Favorites icon on the right side of the page.
		Then Favorite  icon turned yellow.
		When Click three line icon(right side on the page) usernames's beside
		Then opened the pop-up page(include History,Favorite,Most Viewed options)
		When select the Favorite option
		Then Verify your page is under favorite list	

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
	# {color:#FF0000}3-Truck driver can make the page favourite by using favourite sign{color} DEĞİŞKEN OLM
	@IN-248 @IN-253 @IN-250
	Scenario: (US.018) Favorite list after login TEST  
		When user navigated to "Fleet" tab "Vehicle odometer" module
		When Click the Favorites icon on the right side of the page.
		Then Favorite icon turned yellow.
		When Click three line icon(right side on the page) usernames's beside
		Then opened the pop-up page(include History,Favorite,Most Viewed options)
		When select the Favorite option
		Then Verify your page is under favorite list
		When logout the page
		When the user enters the driver information
		Then the user should be able to login
		When Click three line icon(right side on the page) usernames's beside
		Then opened the pop-up page(include History,Favorite,Most Viewed options)
		When select the Favorite option
		Then Verify your page is under favorite list
		#güncelle Jirada

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
	#
	# 
	@IN-249 @IN-250 @IN-253
	Scenario: (US.018) Removing from favorite list TEST  
		When user navigated to "Fleet" tab "Vehicle odometer" module
		Then opening vehicles page
		When Click the Favorites icon on the right side of the page.
		Then Favorite icon turned yellow.
		When Click three line icon(right side on the page) usernames's beside
		Then opened the pop-up page(include History,Favorite,Most Viewed options)
		When select the Favorite option
		Then Verify your page is under favorite list
		When Click the cross(X) sign near the favorite selection on the pop-up
		Then verify favorite icon changes from yellow color to white color