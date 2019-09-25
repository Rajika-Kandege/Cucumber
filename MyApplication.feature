@tag
Feature: Test Gamil smoke scenario
  @tag1
  Scenario: Test Login with valid credintials
    Given Open Chrome and start application
   
    When I enter valid username and password
    
  
    Then User should be able to login successfully
