import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ui_steps {

    @Given("the user is on the movies listing page")
    public void userIsOnMoviesListingPage() {
        // Implement code to navigate to the movies listing page
        System.out.println("hello");
    }

    @When("the user sorts movies by title")
    public void userSortsMoviesByTitle() {
        // Implement code to sort movies by title
    }

    @Then("the last movie in the list should be {string}")
    public void lastMovieInListShouldBe(String movieTitle) {
        // Implement code to verify the last movie in the list
    }

    @When("the user selects the movie {string}")
    public void userSelectsMovie(String movieTitle) {
        // Implement code to select a specific movie
    }

    @Then("the movie details page should be displayed")
    public void movieDetailsPageShouldBeDisplayed() {
        // Implement code to verify the movie details page is displayed
    }

    @Then("the {string} list should contain {string}")
    public void verifyListContains(String listName, String item) {
        // Implement code to verify if a list contains a specific item
    }

    @Then("the user should be able to go back to the main listing screen")
    public void userShouldBeAbleToGoBack() {
        // Implement code to verify the back button functionality
    }

    @Given("the user is on the movie details page of {string}")
    public void userIsOnMovieDetailsPage(String movieTitle) {
        // Implement code to navigate to the movie details page
    }

    @Then("the {string} list should not contain {string}")
    public void verifyListDoesNotContain(String listName, String item) {
        // Implement code to verify if a list does not contain a specific item
    }
}