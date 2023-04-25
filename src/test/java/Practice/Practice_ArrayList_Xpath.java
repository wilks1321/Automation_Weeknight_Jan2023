package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Practice_ArrayList_Xpath {
    public static void main(String[] args) throws InterruptedException {

        //Set your ArrayList variables that will be searched in Bing
        ArrayList<String> Sports = new ArrayList<>();
        Sports.add("Basketball");
        Sports.add("Handball");
        Sports.add("Baseball");

            //Set your web driver
            WebDriverManager.chromedriver().setup();
            //Define the web driver for chrome
            WebDriver driver = new ChromeDriver();

            for (int i = 0; i < Sports.size(); i++) {

            //Navigate to Driver
            driver.navigate().to("http://www.bing.com/");
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Sports.get(i));
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            Thread.sleep(5000);

            //Capture the search number and Print results

        }
    }//End of main
}//End of Java
