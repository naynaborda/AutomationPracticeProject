package Automation.Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    public void selectBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browserdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browserdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }


    }
}
