Feature: Successfully register for Privathaftpflicht Insurance Offer

  Scenario Outline: Login with Valid Credentials
    Given browser is open
    And user enters <username> and <password> then click login
    Then confirm user is on the performance page
    Examples: 
      | username           | password |
      | fiyin009@gmail.com | password |
