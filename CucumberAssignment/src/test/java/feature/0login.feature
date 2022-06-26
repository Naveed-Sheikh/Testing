@login
Feature: Log functinality

  Background: Background section
    Given user is on login page
    
    Scenario Outline: login with valid credentials
    When user enter valid username "<username>" and password "<password>"
    And user clicks on login button
    Then user navigates to homepage

    Examples: 
      |username|password|
      |admin|Admin@123|




