package Day4_03142023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_GoogleHome {
    public static void main(String[] args) throws InterruptedException {
        //set your web driver manager to indicate what type of browser/Driver you are using
        WebDriverManager.chromedriver().setup();
        //define the web driver/browser you want to use for your test
        WebDriver driver = new ChromeDriver();
        //Navigate to google home page
        driver.navigate().to("https://www.google.com");
        //Wait few seconds
        Thread.sleep(2000);
        //Quit the driver
        driver.quit();
    }//end of main
}//end of class
