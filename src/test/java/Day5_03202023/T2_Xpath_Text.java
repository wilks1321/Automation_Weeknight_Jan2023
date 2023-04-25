package Day5_03202023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_Xpath_Text {
    public static void main(String[] args) throws InterruptedException {
        //set up your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start maximized for windows
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //options.addArguments("headless");
        //for mac users use the below line of code
        //options.addArguments("start-fullscreen");
        //or you can use below
        //options.addArguments("--kiosk");
        //define the web driver and pass the options
        WebDriver driver = new ChromeDriver(options);
        //go to google home page
        driver.navigate().to("https://www.yahoo.com/");
        //wait a few seconds
        Thread.sleep(2000);
        //Click on sign in button
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();
        //wait a few seconds
        Thread.sleep(3000);
        //Go back to Yahoo.com
        driver.navigate().back();
        Thread.sleep(3000);
        //Click on bell icon(notification icon)
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor')]")).click();
        Thread.sleep(3000);
        //End driver
        driver.quit();
    }//End of main
}//End of class
