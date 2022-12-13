package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstSeleniumScript {


    // Create main method.
// System.setProperty(“”,””);System.setProperty("webdriver.chrome.driver","/Users/Garry/Documents/seleniumdependencies/drivers/chromedriver");
// (Windows) System.setProperty("webdriver.chrome.driver","C:\\Users\\Garry\\Documents\\seleniumdependencies\\drivers\\chromedriver.exe");
// Chrome driver oluşturun.
//WebDriver driver = new ChromeDriver();
// ‘’https://www.google.com’’ adresinden google ana sayfasını açın.


    public static void main(String[] args) {


        //Adim 1 - Chrome driver imizin pathini belirtiyoruz. (Projeye tanitiyoruz)
        System.setProperty("webdriver.chrome.driver", "Dependencies\\drivers\\chromedriver.exe");


        // Adim 2 - driver objemizi olusturmus olduk.
        WebDriver driver = new ChromeDriver();

        // Adim 3 - https://www.google.com adresini ziyaret ettik
        driver.get("https://www.google.com");


    }
}