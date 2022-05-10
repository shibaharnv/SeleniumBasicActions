Feature: Validating Geophy's Evra Home Page

  @Test
  Scenario: Verifying the contents present in the home page

    Given  User opens evra home page
    Then   Validate header,login button and map section in home page