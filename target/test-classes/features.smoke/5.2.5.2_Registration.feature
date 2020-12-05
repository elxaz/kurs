Feature: user can register
  Scenario:
    Given User can access main page
    Then User click at cabinet button
    Then User click at register button
    Then user enter login
    Then user click register button
    And Validation
    And user enter email
    And user enter age
    And user delete login
    Then user click register button
    And Validation
    Then user enter login
    And user enter password
    Then user click register button
    And Validation
    And user enter password_2
    Then user click register button
    Then User click at cabinet button