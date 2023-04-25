package Day4_03142023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //set your web driver manager to indicate what type of browser/Driver you are using
        WebDriverManager.chromedriver().setup();
        //define the web driver/browser you want to use for your test
        WebDriver driver = new ChromeDriver();
        //Navigate to google home page
        driver.navigate().to("https://www.google.com");
        //Wait few seconds
        Thread.sleep(2000);
        //Enter the keyword BMW to search Field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");
        //Hit submit on the Google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //Wait few seconds for page to load
        Thread.sleep(2000);
        //Capture the search results
        String results = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Result is " + results);
        //Using split function we can extract out the search number from the entire text
        String[] arrayResult = results.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        //Finally quit your browser to clear session
        driver.quit();
    }//End of main
}//End of Class
