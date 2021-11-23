Feature: Hotel Booking in Adactin Application

Scenario Outline: User Login
Given User Launch the Adactin Application
When User Enter the "<username>" in the Username field
And User Enter the "<password>" in the Password field
Then User Click on the Login Button and it Navigates to the Search Hotel page

Examples:
|username|password|
|logo1234|Bannana@123|

Scenario: Search Hotel
When User select the locations
And User select the hotels
And User select the room type
And User select the number of rooms
And User enter the check in date
And User enter the check out date
And User select the number of adults
And User select the number of childrens
Then user Click the Search button and it Navigates to Select hotel page

Scenario: Select Hotel
When user select the ratio button
Then user click the Continue button and it navigates to Book A Hotel page

