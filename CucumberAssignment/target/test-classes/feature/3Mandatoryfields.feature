@mandatoryfield

Feature: Mandatory Fields


  Background: Background section
    Given user is on login page
    
  Scenario Outline: Check mandatory field validation
    When user enter valid username "<username>" and password "<password>"
    And user clicks on login button
    And user navigates to homepage
 		And user click on menu
 		And click on catalog
 		And click on manufactures
 		And user is on manufacture details page
 		And click on Add button
 		And click on submit button
 		Then user will get mandatory field validation
 		
 		
 		 	Examples: 
      |username|password|
      |admin|Admin@123|