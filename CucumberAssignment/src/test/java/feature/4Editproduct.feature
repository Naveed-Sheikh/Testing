@editproduct

Feature: Edit Product


  Background: Background section
    Given user is on login page
    
  Scenario Outline: Edit product with valid details
    When user enter valid username "<username>" and password "<password>"
    And user clicks on login button
    And user navigates to homepage
 		And user click on menu
 		And click on catalog
 		And click on manufactures
 		And user is on manufacture details page
 		And user click on edit button
 		And change manufactures details name "<name>" url "<url>" sort "<sort>"
 		And click on submit button
		Then user is on manufacture page with edited success message
 		 		
 		
 		Examples: 
      |username|password|name|url|sort|
      |admin|Admin@123|Highlander|www.highlander.com|6|