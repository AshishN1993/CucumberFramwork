package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver=driver;

    }
    private By topDeal = By.xpath("//*[text()='Top Deals']");
    private By search = By.xpath("//*[@placeholder='Search for Vegetables and Fruits']");
    private By productName = By.xpath("//h4[@class='product-name']");
    private By increament = By.xpath("//*[@class='increment']");
    private By addToCart =By.xpath("//*[text()='ADD TO CART']");


    public void navigateToTopDeals(){
        driver.findElement(topDeal).click();
    }

    public void searchProduct(String shortname){
        driver.findElement(search).sendKeys(shortname);
    }

    public String getProductName(){
        return  driver.findElement(productName).getText();

    }

    public String getTitleoflandingPage(){
        return  driver.getTitle();
    }

    public void addProducts(int a) throws InterruptedException {
        Thread.sleep(10000);
        for(int i =0;i<a;i++){
            driver.findElement(increament).click();
        }
        driver.findElement(addToCart).click();
    }
}
