package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefination {

    public String offerPageProdcutName;
    TestContextSetup testContextSetup;
    public OfferPageStepDefination( TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }


    @Then("^User searched for (.+) shortname in offerpage in offers page$")
    public void user_searched_for_shortname_in_offerpage_in_offers_page(String shortname) throws InterruptedException {
        OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
        LandingPage landingPage = testContextSetup.pageObjectManager.landingPage;
        landingPage.navigateToTopDeals();
        testContextSetup.genericUtils.navigateToWindow();
        offerPage.searchProduct(shortname);
        Thread.sleep(10000);
        offerPageProdcutName = offerPage.getProductName();

    }

    @Then("Validate prodcut name in offer page matches with landing page")
    public void validate_prodcut_name_in_offer_page_matches_with_landing_page() {
        Assert.assertEquals(offerPageProdcutName,testContextSetup.landingPageprodcutName);
    }

}
