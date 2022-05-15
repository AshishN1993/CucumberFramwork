package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;

import java.io.IOException;


public class LandingPageStepDefination {

    TestContextSetup testContextSetup;
    LandingPage landingPage;

    public LandingPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }

    @Given("User is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() throws IOException {

        Assert.assertTrue(landingPage.getTitleoflandingPage().contains("GreenKart"));

    }
    @When("^User searched with Shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {

        landingPage.searchProduct(shortname);
        Thread.sleep(10000);
        testContextSetup.landingPageprodcutName = landingPage.getProductName().split("-")[0].trim();
        System.out.println("Extracted Product Name " +testContextSetup.landingPageprodcutName);
    }

    @And("^Added (.+) times selected product to cart$")
    public void Added_times_selected_product_to_cart(String a) throws InterruptedException {
        landingPage.addProducts(Integer.parseInt(a));
    }


}
