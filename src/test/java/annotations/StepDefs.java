package annotations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {

    @Given("^the response body tag (.*) contains the following values:$")
    @And("^the response body attribute (.*) contains the following values:$")
    @Then("^the response body XPath (.*) contains the following values:$")
    public void the_response_body_contains_the_following_values(String xpath) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
