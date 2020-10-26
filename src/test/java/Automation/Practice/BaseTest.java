package Automation.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser(loadProp.readProperties("browserName"));
        driver.get(loadProp.readProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
