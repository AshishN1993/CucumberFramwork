package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {
    public WebDriver driver;

public  GenericUtils(WebDriver driver){
    this.driver = driver;
}

    public void navigateToWindow() {
        Set<String> allOpenTaps = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();
        Iterator<String> itr = allOpenTaps.iterator();

        while (itr.hasNext()) {

            String childWindow = itr.next();

            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

    }

}
