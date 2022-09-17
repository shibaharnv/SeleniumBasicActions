Feature: Validate login functionality

  Scenario: Check login is sucessful with valid credentials

    Given user is on login page
    When User enters the username and password
    And Clicks on sign in button
    Then User is navigated to home town