package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.HomePage;
import page_objects.ResultsPage;

import java.sql.DriverManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class SearchStepDef {

    private HomePage homePage=new HomePage();
     private String searchItem;

    @Then("^I should see respective products$")
    public void i_should_see_respective_products()
    {
       String actualUrl= homePage.getCurrentUrl();
       assertThat(actualUrl,endsWith(searchItem));

    }
    @When("^I do a search for product \"([^\"]*)\"$")
    public void iDoASearchForProduct(String item)
    {
        searchItem=item;
        homePage.doSearch(item);

    }
}



