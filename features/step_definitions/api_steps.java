import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class api_steps {

    private Response response;

    @Given("User makes a request to get the list of movies")
    public void userMakesRequestToListMovies() {
        response = given().get("https://swapi.dev/api/films/");
    }

    @Then("Movies count should be {int}")
    public void verifyMoviesCount(int expectedCount) {
        response.then().assertThat().statusCode(200);
        int actualCount = response.jsonPath().getList("results").size();
        Assert.assertEquals(expectedCount, actualCount, "Incorrect movies count");
    }

    @When("User gets the details of the {int}th movie")
    public void userGetsMovieDetails(int movieIndex) {
        String movieUrl = response.jsonPath().getString("results[" + (movieIndex - 1) + "].url");
        response = given().get(movieUrl);
    }

    @Then("Director of the movie should be {string}")
    public void verifyDirectorOfMovie(String expectedDirector) {
        response.then().assertThat().statusCode(200);
        String actualDirector = response.jsonPath().getString("director");
        Assert.assertEquals(expectedDirector, actualDirector, "Incorrect director");
    }

    @Then("Producers should not include {string}")
    public void verifyProducersNotInclude(String producer) {
        response.then().assertThat().statusCode(200);
        List<String> producers = response.jsonPath().getList("producer");
        Assert.assertFalse(producers.contains(producer), "Producers include " + producer);
    }
}