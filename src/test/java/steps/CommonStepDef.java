package steps;

import cucumber.api.java.en.Given;
import page_objects.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class CommonStepDef {

 private  HomePage homePage =new HomePage();
    @Given("^Iam on a homepage$")
    public void iam_on_a_homepage()
    {

       String actualUrl= homePage.getCurrentUrl();
       assertThat(actualUrl,is(endsWith(".co.uk/")));

    }


}
