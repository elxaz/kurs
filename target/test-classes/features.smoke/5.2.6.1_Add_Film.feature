Feature: user can add film
  Scenario:
    Given User can access main page
    Then User click at cabinet button
    And user click to authorization
    Then user enter login admin
    And user enter password admin
    Then click Log In button
    Then User click at cabinet button
    Given user can add film by clicking button
    Then user enter name of film
    And user enter url of film
    And user enter genre of film
    And user enter year of film
    And user enter director of film
    And user enter country of film
    And user enter link to poster
    And user enter description
    Then click send button
    And Validation