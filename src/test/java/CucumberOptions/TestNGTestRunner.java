package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src\\test\\java\\features",glue = "stepDefinations",monochrome = true,
plugin={"html:target/cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target","rerun:target/failed_scenario.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
