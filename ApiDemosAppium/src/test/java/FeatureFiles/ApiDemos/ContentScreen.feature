@ContentScreen
Feature: To Test The Content Screen Features

  Background: Launching of the Application and Reaching to the Opening Page
    Given I am on the First Screen and Click on the Content Btn

  @Testone
  Scenario: To Test Assets Btn Functionality 
    And  I click on the assets btn 
    When I Click on the Read Assets btn
    Then I Should be Able to See the Assets Text Page 
    

  @Testtwo
  Scenario: To test Provider Contact Screen Visibility
    And I click on Provider box
    When I click on Pick Contact Box
    And  I select The  Contact btn
    Then I Should be able to see the Page


