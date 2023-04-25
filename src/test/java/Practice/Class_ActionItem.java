package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Class_ActionItem {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> Cities = new ArrayList<>();
        Cities.add("Vegas");
        Cities.add("Austin");
        Cities.add("Los Angeles");

        //Set your web driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //Set Chrome options
        options.addArguments("start-maximized");
        //Define the web driver for chrome
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < Cities.size(); i++) {

            //Navigate to Hotels
            driver.navigate().to("https://www.hotels.com/");
            Thread.sleep(1000);

            //Click on search fields
            try {
                driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click on going to " + e);
            }//end of going to search field

            //Type in cities in search field
            try {
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(Cities.get(i));
            } catch (Exception e) {
                System.out.println("Unable to click on going to " + e);
            }

            //Wait a few seconds
            Thread.sleep(2000);
            //Click on first suggestion
            driver.findElement(By.xpath("//*[@class='uitk-action-list-item-content']")).click();
            //Wait a few seconds
            Thread.sleep(2000);
            //Click search button
            driver.findElement(By.xpath("//*[@id='search_button']")).click();
            //Wait a few seconds
            Thread.sleep(2000);
            //Click the resort according to location

        }



    }//End of main
}//End of Class
