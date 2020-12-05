Feature: user can sort by year
  Scenario:
    Given User can access main page
    Then user click on the filter button
    And user click on the filter by year
    Then user click on the select with years
    And user choose 2020
    Then user click send year
    Given page with films is displayed