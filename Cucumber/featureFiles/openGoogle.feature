Feature: To search Google.com feature
Scenario: Google Search Scenario
	Given User entering google.co.in
	When User typing at Search term "envirocal"
	And Enter return key
	Then Envirocal pages were open 
	

