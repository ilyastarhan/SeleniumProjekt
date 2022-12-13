package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookUrlTest {

    // Invoke Chrome Driver
// Navigate to Facebook homepage URL: https://www.facebook.com/
// Verify expected equals actual URL.
// Verify expected Title contains Facebook Word.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/";
        if(actualUrl.equals(expectedUrl))
            System.out.println("UrlTest PASSED!");
        else System.out.println("UrlTest FAILED!");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Facebook"))
            System.out.println("Title Test PASSED!");
        else System.out.println("Title Test FAILED!");
        driver.quit();

    }
}
