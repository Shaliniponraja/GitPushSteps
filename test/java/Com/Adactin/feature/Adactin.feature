 Feature: Hotel Booking In Adactin Application
 Scenario: User login into the Web Application
 Given user launch the Adactin application
 When user enter the username in user field
 And user enter the password in the password field
 Then user enter the login button and navigate to the search hotel page
 
Scenario: User Enter the Search hotel page
 When user select the location in location field
 When And user select the hotel in the Hotel field
 When  d user select the room type in rooom field
 When user select the no of available in the no of room field
 When  user enter the Check In Date And clear the default check in date
 When  user clear the default check out date Given user enter the out date in Check out date box
 When user select the Adults per Room in Adaults per room check box
 When user select the Children per Room  in Children per Room box
 Then user enter the search box button and navigate in to the Select Hotel page
 