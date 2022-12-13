package Alistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.de");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("Java");
        driver.findElement(By.className("RNmpXc")).click();



    }
}