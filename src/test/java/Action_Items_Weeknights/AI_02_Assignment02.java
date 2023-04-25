package Action_Items_Weeknights;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AI_02_Assignment02 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> Sports = new ArrayList<>();
        Sports.add("Basketball");
        Sports.add("Soccer");
        Sports.add("Handball");
        Sports.add("Baseball");

        //Set your web driver
        WebDriverManager.chromedriver().setup();
        //Define the web driver for chrome
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < Sports.size(); i++) {

            //Navigate to Bing
            driver.navigate().to("https://www.bing.com/");
            Thread.sleep(5000);

            //Enter Array list into search
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Sports.get(i));
            Thread.sleep(5000);
            //Click on Search Icon
            driver.findElement(By.xpath("//*[@id='search_icon']")).click();
            Thread.sleep(6000);

            //Capture the search number and Print results
            String results = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            String[] arrayResult = results.split(" ");
            System.out.println("Search number is " + arrayResult[1]);
            Thread.sleep(3000);

        }//End of loop
        //Quit the driver
        driver.quit();

    }//End of main
}//End of Java