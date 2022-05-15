package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    public String landingPageprodcutName;
    public String ProductNameonCheckoutPage;
    public PageObjectManager pageObjectManager;
    public  TestBaseClass testBaseClass;
    public GenericUtils genericUtils;

    public  TestContextSetup() throws IOException {
        testBaseClass = new TestBaseClass();
        pageObjectManager = new PageObjectManager(testBaseClass.WebDriverManager());
        genericUtils = new GenericUtils(testBaseClass.WebDriverManager());
    }
}
