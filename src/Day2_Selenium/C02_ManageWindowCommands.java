package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowCommands {

    // Go to the Amazon URL : https://www.amazon.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(190,70));

        driver.manage().window().setSize(new Dimension(600,800));
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println("Browserin boyutu test ediliyor");
        if(width==600 && height==800)
            System.out.println("Boyut testi PASSED");
        else
            System.out.println("Boyut testi FAILED");

        System.out.println("Browserin pozisyonu test ediliyor");

        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();
        if(x==190 && y==70)
            System.out.println("Pozisyon testi PASSED");
        else System.out.println("Pozisyon testi FAILED");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());



        driver.quit();
    }
}
