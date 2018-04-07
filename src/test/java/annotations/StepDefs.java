package annotations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {

    @Given("^the response body tag (.*) contains the following values:$")
    public void the_response_body_tag_contains_the_following_values(String tag) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the response body attribute (.*) contains the following values:$")
    public void the_response_body_attribute_contains_the_following_values(String attribute) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the response body XPath (.*) contains the following values:$")
    public void the_response_body_XPath_contains_the_following_values(String xpath) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
