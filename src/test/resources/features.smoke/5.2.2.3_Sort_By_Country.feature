Feature: user can sort by country
  Scenario:
    Given User can access main page
    Then user click on the filter button
    And user click on the filter by country
    Then user enter country of film in filter field
    Then user click send country
    Given page with films is displayed