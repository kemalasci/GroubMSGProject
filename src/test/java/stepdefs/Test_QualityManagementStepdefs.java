package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocatorsInterface;
import utils.BaseClass;

import static pages.InformationClass.*;

public class Test_QualityManagementStepdefs extends BaseClass implements LocatorsInterface {


    @When("MSG  Themen & Services Management should be clickable")
    public void msgThemenServicesManagementShouldBeClickable() {
        clickTo(themenServicesMenuItem);
    }

    @Then("MSG  Test & Quality Management should be scroll")
    public void msgTestQualityManagementShouldBeScroll() throws InterruptedException {
        sleep(2);
        scrollTo(testQualityManagementItem);
    }

    @And("MSG  crowdTesting should be clickable")
    public void msgCrowdTestingShouldBeClickable() {
        clickTo(crowdTestingItem);
        if (cookiesButton != null)
            clickTo(cookiesButton);
    }

    @Then("The user should be able to see the Digital Business Assurance text")
    public void theUserShouldBeAbleToSeeTheDigitalBusinessAssuranceText() {
        verifyElementContainsText(digitalBusinessTitle, digitalBusinessAssuranceTitle);
    }
}
