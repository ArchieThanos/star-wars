Feature: UI Testing

  Scenario: Sorting movies by title and asserting last movie
    Given User is on the movies listing page
    When User sorts movies by title
    Then Last movie in the list should be "The Phantom Menace"

  Scenario: View details of a movie
    Given User is on the movies listing page
    When User selects the movie "The Empire Strikes Back"
    Then Movie details page should be displayed
    And "Species" list should contain "Wookie"
    And User should be able to go back to the main listing screen

  Scenario: Verifying movie details
    Given User is on the movie details page of "The Phantom Menace"
    Then "Planets" list should not contain "Camino"