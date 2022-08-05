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
   #User should be able to go to Usu It Service Management web page
  #  And The user should be able to fill the web presentation form
  #  Then the user should be able to click the Submit button
  #
