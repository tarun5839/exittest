@ViewScreen
Feature: To Test The View Screen Features with Scroll and Swipe Function

  Background: Launching the Application and Reaching to the App First screen
    Given I am on the First Screen and Click on the Views btn
    When I swipe and Scroll Down in App

  @Test
  Scenario Outline: To Check View Feature
    When I click on the Searchview btn
    And I click on Filter btn
    When I enter the "<TestText>" in the box
    Then I should be able to see the Text Results on below Screen

    Examples: 
      | TestText       |
      | Fresh Truffles |
