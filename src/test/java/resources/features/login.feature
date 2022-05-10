Feature: Validate login functionality

  Scenario: Check login is sucessful with valid credentials

    Given user is on login page
    When User enters the username and password
    And Clicks on sign in button
    Then User is navigated to home town


  @CreatePetWithImage @Test
  Scenario Outline: Create a pet with image

    Given Setting up the request sepecification for create pet with image
    When  The user hits the endpoint with "<httpmethod>"
#    Then Validate the <statuscode> from response
#     And Store the petId from the response body
    Then Store the petId from the response body

    Examples:
      | httpmethod | statuscode |
      | POST       | 200        |