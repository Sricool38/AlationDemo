Feature: To Navigate to Bookes category and validate the details of the product in Amazon.com 

@Test 
Scenario Outline:
Validate the product information in search result page & product details page in Amazon 
	When change the search category to 'Books' 
	# To reuse this step for different category just change the name inside single quotes
	And  I search item <productType> 
	# To reuse this step for different product, just change or add the product in Example section below
	Then I should be directed to the search results of "<productType>" 
	And verify the product details in search result page 
	Then select the first available product in the page 
	And verify the product details in product detail page 
	And Validate the product details in PDP with SRP 
	
	Examples: 
		| productType  |
		| data catalog |
		
