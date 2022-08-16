Feature:MSG Themen & Services page functionality

  @smoke
  Scenario: User should be able to use MSG  Test & Quality Management Page functionality
    Given User should be able to navigate to homePage
    When MSG  Themen & Services Management should be clickable
    Then MSG  Test & Quality Management should be scroll
    And  MSG  crowdTesting should be clickable
    Then The user should be able to see the Digital Business Assurance text

    #

   #
