package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {

    // Go to the Amazon URL: https://www.amazon.com/
    // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String sourceCode = driver.getPageSource();
        if(sourceCode.contains("MEOW") || sourceCode.contains("Performance Metrics"))
            System.out.println("Page source Test PASSED");
        else System.out.println("Page source Test FAILED!");
        driver.quit();

    }
}
