package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.xml.sax.Locator;
import org.openqa.selenium.By;
import pages.LocatorsInterface;
import utils.BaseClass;

import static pages.InformationClass.*;

public class MSG_BranchenMenuItemStepdefs extends BaseClass implements LocatorsInterface {
    @Given("User should be able to navigate to homePage")
    public void userShouldBeAbleToNavigateToHomePage() {

        open(url);
        if (cookiesButton != null)
            clickTo(cookiesButton);

    }





    @When("Usu It BrancenItem should be clickable")
    public void usuItBrancenItemShouldBeClickable() {
        clickTo(branchenMenuItem);
    }
    @Then("Usu It AutomotiveItem should be scroll")
    public void usuItAutomotiveItemShouldBeScroll() throws InterruptedException {
        scrollTo(automotiveMenuItem);
    }


    @Then("Usu It AutomotiveConsultingItem should be clickable")
    public void usuItAutomotiveConsultingItemShouldBeClickable() throws InterruptedException {
        scrollTo(automotiveConsultingItem);
        clickTo(automotiveConsultingItem);
    }


    @And("The user should be able to see the Automotive Consulting text")
    public void theUserShouldBeAbleToSeeTheAutomotiveConsultingText() {
        verifyElementContainsText(automotiveConsultingTitel, automotiveConsultingTitle);


    }





}