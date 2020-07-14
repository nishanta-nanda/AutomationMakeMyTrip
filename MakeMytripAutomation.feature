Feature:Flight Booking MakeMytrip


TestCase1:
Scenario Outline:Search for a given flight source/destination and get the fares
Given user logs in to MakeMyTrip
When user searches for <FROM> and <TO> in drop down
Then get the fares of the flights

Examples:To  From
|Bombay|
|GOA|
|Kolkata|


TestCase2:
Scenario Outline:Select the best itinerary based on the fastest and cheapest travel.
Given user logs in to MakeMyTrip
When user searches for <FROM> and <TO> in drop down
Then get the fares of the flights
Then sort the results based on best itinerary based on the fastest and cheapest travel.

Examples:To  From
|Bombay|
|GOA|
|Kolkata|

TestCase2:
Scenario Outline:If there are multiple itinerary options, select the evening flight but that should be the
fastest.
Given user logs in to MakeMyTrip
When user searches for <FROM> and <TO> in drop down
Then get the fares of the flights
Then sort the results and select the evening flight with less time of travel

Examples:To  From
|Bombay|
|GOA|
|Kolkata|
