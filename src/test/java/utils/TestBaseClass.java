package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBaseClass {
    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\CucumberFramework\\src\\test\\resources\\global.properties");
        Properties prop = new Properties();
        prop.load(fileInputStream);
        String url = prop.getProperty("QAurl");


        if (driver == null) {
            if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
                driver = new ChromeDriver();

            }
            if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {

            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(url);

        }

        return driver;
    }


}
