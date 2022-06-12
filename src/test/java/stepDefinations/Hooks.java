package stepDefinations;

import com.aventstack.extentreports.reporter.FileUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import utils.TestContextSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public TestContextSetup testContextSetup;


    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @After
    public void closebrowser() throws IOException {
        testContextSetup.testBaseClass.WebDriverManager().quit();
    }

    @AfterStep
    public void AddScreenShot(Scenario scenario) throws IOException {
        WebDriver driver = testContextSetup.testBaseClass.WebDriverManager();
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(source);
        scenario.attach(fileContent,"image/png","image");

    }





}
