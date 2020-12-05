  Feature: user can sort by genre
    Scenario:
      Given User can access main page
      Then user click on the filter button
      And user click on the filter by genre
      Then user enter genre of film in filter field
      Then user click send genre
      Given page with films is displayed