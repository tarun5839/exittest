@PrefrenceScreen
Feature: To Test the Feature Of Prefrences Functionalities.

  Background: Launching of the Application and Reaching to the Opening Screen
    Given I am on the First Screen of the Apidemos Application

  @Testone
  Scenario Outline: To check Prefrences of Xml Text input in the Box
    And I click on the Prefrence btn
    When I click  Prefrence from Xml btn and select the EditText box
    And I Enter the Details "<Text>" and submit
    Then I should see the  Prefrences list

    Examples: 
      | Text           |
      | HelloTest!!!!! |