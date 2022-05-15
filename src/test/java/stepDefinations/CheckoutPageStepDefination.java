package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

import java.io.IOException;


public class CheckoutPageStepDefination {

    TestContextSetup testContextSetup;
    public CheckoutPage checkoutPage;

    public CheckoutPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
    }




    @Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
    public void User_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name){
        checkoutPage.checkoutitems();
        Assert.assertEquals( testContextSetup.landingPageprodcutName,checkoutPage.getProductName().split("-")[0].trim());

    }

    @And("Verify user has ability to enter promo code and place the order")
    public void Verify_user_has_ability_to_enter_promo_code_and_place_the_order(){
        Assert.assertTrue(checkoutPage.verifyPromoButton());
        Assert.assertTrue(checkoutPage.verifyPlaceOrderButton());

    }




}
