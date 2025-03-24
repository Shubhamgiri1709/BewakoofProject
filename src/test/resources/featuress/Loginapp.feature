Feature: Login



		Scenario: Login with invalid credentials
				Given I launch browser and navigate to the home page
				When I click on Login Button
				And I enter invalid phone number "*788805405" into phone number field
			  Then warning text message should be "Enter a valid Mobile Number"





	 Scenario: Verify user is unable to register with an empty Mobile Number field.
				Given I launch browser and navigate to the home page
				When I click on Login Button
				And I enter invalid phone number "" into phone number field
			  Then button should not be enabled 




	  Scenario: Verify user is unable to register with too long Mobile Number field.
				Given I launch browser and navigate to the home page
				When I click on Login Button
				And I enter invalid phone number "1234567890555" into phone number field
			  Then button should not be enabled 


		Scenario: Verify user is able to provide search in search field
				Given I launch browser and navigate to the home page
				When I clicked on search button
				And I provided search as "Shirts"
#
#
#	 Scenario: Verify user is able to provide search in search field and then clear the search field
#				Given I launch browser and navigate to the home page
#				When I clicked on search button
#				And I provided search as "Shirts"
#				And I cleared the search from search field
#
#
#
#		Scenario: Verify user is able to click on Men button
#				Given I launch browser and navigate to the home page
#				When I clicked on Men button
#
#				
#		Scenario: Verify user is able to click on Female button
#				Given I launch browser and navigate to the home page
#				When I clicked on Female button
#				
#				
#		Scenario: Verify user is able to click on Mobile Cover button
#				Given I launch browser and navigate to the home page
#				When I clicked on Mobile Cover button		
#		
#				
#		Scenario: Verify that after clicking on logo, page got refreshed
#				Given I launch browser and navigate to the home page
#				When I clicked on Logo of the website and page got refreshed	
#				
#				
#		Scenario: Verify user is able to click on Bewakoof Air button
#				Given I launch browser and navigate to the home page
#				When I clicked on Bewakoof Air
#				
#				
#		Scenario: Verify user is able to click on Offer button
#				Given I launch browser and navigate to the home page
#				When I clicked on Offer button
#				
#				
#		
#   #       Not working below 2 
#
#		
#Scenario: Verify user is able to apply filter functionality properly
#				Given I launch browser and navigate to the home page
#				When I clicked on Men button
#				And I clicked on T-shirt
#				And I clicked on Shirt
#				And I clicked on Joggers
#
#
#	Scenario: Verify user is able to apply filter functionality properly
#				Given I launch browser and navigate to the home page
#				When I clicked on Men button
#				And I clicked on T-shirt
#				And I clicked on Shirt
#				And I clicked on Joggers
#				Then I clicked on Clear All button
#				
#				
#		Scenario: Verify user is able to scroll down on the home page 
#				Given I launch browser and navigate to the home page
#				When I tried to scroll down on the home page
#				
#			
#		Scenario: Verify user is able to scroll to the bottom of home page 
#				Given I launch browser and navigate to the home page
#				When I tried to scroll down on the bottom of the home page
#			
#			
#		Scenario: Verify user is able to click on heavy duty button
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#			
#					
#					
#		Scenario: Verify user is able to click on heavy duty button
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				Then I validate the page title as "Bewakoof Heavy Duty"
#					
#					
#		Scenario: Verify user is able to click on heavy duty button
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				Then I validate the page title as "Bewakoof Heavy Duty"
#				Then I click on particular product
#		
#		
#		   NOT WORKING     *****************************
#		
#				
#				
#	  Scenario: Verify user is able to click on heavy duty button
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				Then I validate the page title as "Bewakoof Heavy Duty"
#				Then I click on particular product
#				Then I tried to change the product size as Small
#						
#			
#		 Scenario: Verify after new user or logged out user after clicking on favourite button user redirected to login page
#				Given I launch browser and navigate to the home page
#			  When I clickd on favourite button
#			  Then I redirected to login page		
#									
#			
#		 Scenario: Verify after new user or logged out user after clicking on favourite button user redirected to login page and validate it
#				Given I launch browser and navigate to the home page
#			  When I clickd on favourite button
#			  Then I redirected to login page
#			  Then I validate it with the URL "https://www.bewakoof.com/login?src=/"
#	
#		
#		Scenario: Verify user is able to click on Mobile Cover button
#				Given I launch browser and navigate to the home page
#				When I clicked on Mobile Cover button	
#				And I clicked on Choose your brand
#				And I clicked on Apple button
#				
#			
#        #I THINK IT WAS NOT WORKING BELOW 2 SCENARION
#
#	
#		Scenario: Verify user is able to click on Mobile Cover button
#				Given I launch browser and navigate to the home page
#				When I clicked on Mobile Cover button	
#				And I clicked on Choose your brand
#				And I clicked on Apple button
#				Then I clicked on Choose Your Model button
#											
#				
#		Scenario: Verify user is able to click on Mobile Cover button
#				Given I launch browser and navigate to the home page
#				When I clicked on Mobile Cover button	
#				And I clicked on Choose your brand
#				And I clicked on Apple button
#				Then I clicked on Choose Your Model button
#				Then I selected model as i Phone16 Pro Max
#			
#			
#			
#		Scenario: Verify user is able to click on Subscribe button
#				Given I launch browser and navigate to the home page	
#				When I clicked on Subscribe button
#				
#				
#		Scenario: Verify user is able to click on Subscribe button
#				Given I launch browser and navigate to the home page	
#				When I provided email as "abc@hmail.com"
#				When I clicked on Subscribe button
#				
#				
#								
#				
#		Scenario: Verify user is able to click on Subscribe button
#				Given I launch browser and navigate to the home page	
#				When I clicked on Site Map
#				
#				
#		Scenario: Verify user is able to click on Google Play store  button
#				Given I launch browser and navigate to the home page	
#				When I clicked on Google Play store button
#				
#				
#							
#		Scenario: Verify user is able to click on Game button
#				Given I launch browser and navigate to the home page	
#				When I clicked on Google Play store button
#				And I clicked on Games button	
#				#and action is not validated just url is printed
#		
#		
#		Scenario: Verify user is able to get all URL from the website
#				Given I launch browser and navigate to the home page	
#			  And I found out all URL and printed it
#		
		
		
		
		
		
		
		
		
	
	
	
	
		
#		##    Ntot working properly below 1
#		
#		
#		
#		Scenario: Verify user is able to click on My bag button
#				Given I launch browser and navigate to the home page	
#			  And I clicked on My Bag
#			  # not clicking
#		
#		










#	  Scenario: Verify user is able to click on heavy duty button and sort it
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				And I clicked on Sort by 
#				
#		
#	  Scenario: Verify user is able to click on heavy duty button and sort it and click on New Arrival
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				And I clicked on Sort by 
#				And I clicked on New Arrival
#		
#		
#		Scenario: Verify user is able to click on heavy duty button and sort it and click on New Arrival and scroll down to the bottom
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				And I clicked on Sort by 
#				And I clicked on New Arrival
#				And I scroll down to the bottom of page
#		
#		
#		Scenario: Verify user is able to click on heavy duty button and sort it and click on New Arrival and scroll down to the bottom and went to top again
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				And I clicked on Sort by 
#				And I clicked on New Arrival
#				And I scroll down to the bottom of page
#				And I clicked on Go To Top button
#		
#				
#		Scenario: Verify user is able to click on heavy duty button
#				Given I launch browser and navigate to the home page
#				When I tried to click on heave duty button
#				And I clicked on Sort by 
#				And I clicked on New Arrival
#				And I scroll down to the bottom of page
#				And I clicked on Go To Top button
#				And I clicked on first product
#
#
#
#
#
#
#
#
   #Scenario: Verify user is able to select size as small
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				
#				
#				
#				
#	 Scenario:  Verify user is able to select size as small and click on front facing person
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#			
#				
#				
#		Scenario: Verify user is able to check shirts type as Round Neck
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"				
 #
 #
 #
   #Scenario: Verify user is able to click on Fanbook button
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#				And I clicked on see Add to cart
#			
#			

#	
#	
#	
#		Scenario: Verify user is able to aAdd to Bag
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#			
#			
#		Scenario: Verify user is able to Add To Cart
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#				And I clicked on see Add to cart
#			
#			
#			
#						
#		Scenario: Verify user is able to increase quantity as Ten
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#				And I clicked on see Add to cart
#				And I wanted to change the quantity for ten
#			
#			
#			
#		Scenario: Verify user is able to confirm quantity as Ten
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#				And I clicked on see Add to cart
#				And I wanted to change the quantity for ten
#				And I changed quantity for the ten
#			  Then I confirmed the changes
#
#
#
#			
#		Scenario: Verify user is able to click on  Proceed button
#				Given I launch browser and navigate to the home page2
#				And I Selected shirt size as Small
#				And I selected image that is facing front side and a full human image
#				Then I checked the type of neck as "Round Neck"
#				Then I clicked on Add To Bag
#				And I clicked on see Add to cart
#				And I wanted to change the quantity for ten
#				And I changed quantity for the ten
#			  Then I confirmed the changes
#			  Then I clicked on proceed button
#			
#			
			
	
	
	
	
	
	
	
	
	
	
	
					
#		Scenario: Verify user is able to log out
#				Given I launch browser and navigate to the home page3
#				And I click on profile icon
			
			
			
#		Scenario: Verify user is able to click on Subscribe button
#				Given I launch browser and navigate to the home page	
#				And I checked whether swpier button is enabled or not
			
	
	
	
	
	
		Scenario: Verify user is able to click on Subscribe button
				Given I launch browser and navigate to the home page	
				When I provided email as "abc@hmail.com"
				When I clicked on Subscribe button		
				
				
				
				
		Scenario: Verify user is able to click on Subscribe button
				Given I launch browser and navigate to the home page	
				When I provided email as "abc@hmail.com"
				When I clicked on Subscribe button
			
			
			
			
			
			
			
			
				