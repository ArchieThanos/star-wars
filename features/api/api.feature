Feature: API Testing

  Scenario: Getting list of movies and verifying count
    Given User makes a request to get the list of movies
    Then Movies count should be 6

  Scenario: Getting details for third movie and verifying director
    Given User gets the details of the 3rd movie
    Then The director of the movie should be "Richard Marquand"

  Scenario: Getting details for fifth movie and verifying producers
    Given User gets the details of the 5th movie
    Then Producers should not include "Gary Kurtz, George Lucas"