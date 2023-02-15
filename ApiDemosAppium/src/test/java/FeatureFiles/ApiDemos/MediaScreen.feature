@MediaScreen
Feature: To Test The Features of Media Screen of the Application Api Demos

  Background: Launching of the Application and Reaching to the Opening Page
    Given I am on the First Screen and Click on the Media btn

  @Testone
  Scenario: To Test Audio Player btn Functionality
    When I click Mediaplayer btn
    And I Click on Playaudio From src
    Then I Should be Able To see the Playing Audio Screen

  @Testtwo
  Scenario: To Test Audio Fx Working in app
    When I click on the  AudioFx btn 
    And I click on VideoPlayer from local file
    Then I validate that Audio is playing

  @Testthree
  Scenario: To Test Video playing visibility
    When I click Mediaplayer btn of app
    And I click on VideoPlayer from file
    Then I validate that Video is playing
