@cancelbutton

Feature: Cancel Button


  Background: Background section
    Given user is on login page
    
  Scenario Outline: Cancel button functionality
    When user enter valid username "<username>" and password "<password>"
    And user clicks on login button
    And user navigates to homepage
 		And user click on menu
 		And click on catalog
 		And click on manufactures
 		And user is on manufacture details page
 		And click on Add button
 		And click on Cancel button
 		Then user is on manufacture details page
 		
 			Examples: 
      |username|password|
      |admin|Admin@123|