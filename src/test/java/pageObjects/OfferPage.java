package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    public WebDriver driver;

    public OfferPage(WebDriver driver){
        this.driver=driver;
    }


    private By topDeal = By.xpath("//*[text()='Top Deals']");
    private By search = By.xpath("//*[@id=\"search-field\"]");
    private By getProductName = By.cssSelector("tr td:nth-child(1)");


    public void searchProduct(String shortname){
        driver.findElement(search).sendKeys(shortname);
    }

    public String getProductName(){
       return driver.findElement(getProductName).getText();
    }


}


