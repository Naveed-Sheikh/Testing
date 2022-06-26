@deleteproduct

Feature: Delete Product


  Background: Background section
    Given user is on login page
    
  Scenario Outline: Delete Product from manufactures list
    When user enter valid username "<username>" and password "<password>"
    And user clicks on login button
    And user navigates to homepage
 		And user click on menu
 		And click on catalog
 		And click on manufactures
 		And user is on manufacture details page
 		And user select the item to delete
 		And user click on delete button
 		Then user is on manufacture page with delete success message
 		

 		
 		Examples: 
      |username|password|
      |admin|Admin@123|