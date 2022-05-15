package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
   public WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;

    }


    private By card = By.xpath("//*[@alt=\"Cart\"]");
    private By checkoutToProceed = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
    private By productNameonCheckout = By.xpath("//*[@class=\"product-name\"]");
    private By apply = By.xpath("//*[text()='Apply']");
    private By placeOrder = By.xpath("//*[text()='Place Order']");



   public void checkoutitems(){
        driver.findElement(card).click();
        driver.findElement(checkoutToProceed).click();
   }

   public boolean verifyPromoButton(){
        return driver.findElement(apply).isDisplayed();
   }

   public boolean verifyPlaceOrderButton(){
        return  driver.findElement(placeOrder).isDisplayed();
   }

   public String getProductName(){
        return driver.findElement(productNameonCheckout).getText();
   }

}
