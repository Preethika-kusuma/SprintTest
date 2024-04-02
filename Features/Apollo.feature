
Feature: Login to Apollo247 
 
  #Scenario: Login Apollo247
    #Given I want to login Apollo247 
    #When I enter mobile number "9515069470"
    #And I click on continue button
    #And validate the otp
    #And click on verify otp
    #Then the page is successfully redirected into login page
    #
  Background: On Medicine Page
  Given I am on home page
  When I clicked on medicine module
  Then Navigated to medicine page 
    
 #	Scenario: Into Medicine page
 #	Given I want to click on Medicine page
 #	When I click on medicine page
 #	And medicine page will open
  #Then I sucessfully entered into medicine page
  
  Scenario: Into Health Devices page
  Given clicked on health devices
  When click on product
  And enter pincode
  And apply pincode for order
  Then pincode will entered
  
  Scenario: Into Ayurveda page
  Given I clicked on Ayurveda page
  When I click on category
  And I click on add button
  And I select Herbs products
  Then I will get similar products
  
  Scenario: Into Personal care page
  Given I want to click on personal care page
  When I click on personal care page
  And click on Nivea Natural Glow Roll On Deodorant for Women
  And select the price value
  And click on Add to cart
  Then product is added cart
  
   Scenario: Into cart page
  Given I want to click on cart page
  Then I am on my cart page
  
  Scenario Outline: Into Searchbar
  Given I want to search medicine
  When I search for <medicine_name> 
  And It should display all similar items
  Then medicine should be appear
  
  Examples:
  |medicine_name|
  |"Novology"|
  
  

  
  #Scenario Outline: Login to Medicine page
  #Given successful login into Apollo247
  #And select the <medicine_name>
  #And select on <medicine_quantity>
  #And click on add to chart
  #Then I should see medicne_name
  #
    #Examples: 
      #|medicine_name  | medicne_quantity | 
      #| Sona Chandi Chyawanprash 500 |  3 |
      #|Itone Eye Drops| 10 ml|
      #
