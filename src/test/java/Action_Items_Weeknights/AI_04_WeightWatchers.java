package Action_Items_Weeknights;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_04_WeightWatchers {
    public static void main(String[] args) throws InterruptedException {

        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome option
        ChromeOptions options = new ChromeOptions();
        // Add the options for maximizing and Incognito
        options.addArguments("start-maximized", "Incognito");
        //Define the chrome driver to use for your test
        WebDriver driver = new ChromeDriver(options);

        //Create an array list of different zipcodes
        ArrayList<String> ZipCode = new ArrayList<>();
        ZipCode.add("11372");//index 0 or i = 0
        ZipCode.add("11375");//index 1 or i = 1
        ZipCode.add("11370");//index 2 or i = 2

        for (int i = 0; i < ZipCode.size(); i++) {

            //go to Weightwatchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/");
            //wait a bit
            Thread.sleep(2000);

            //click on Find a workshop
            try {
                driver.findElement(By.xpath("//*[@icon='location']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click on Find a workshop " + e);
            }//end of going to search try catch block

            //click on In-Person
            try {
                driver.findElement(By.xpath("//*[@class='iconWrapper-1dvW4']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click on In-Person function " + e);
            }//end of going to search try catch block

            //click on "Search for location, zipCode or city" bar and type in ZipCode in Search Field
            try {
                driver.findElement(By.xpath("//*[@title='location-search']")).sendKeys(ZipCode.get(i));
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to Type ZipCode " + e);
            }//end of going to search try catch block
            //Click on search button function
            try {
                driver.findElement(By.xpath("//*[@aria-label='Submit']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click on Search button function " + e);
            }//end of going to search try catch block
            Thread.sleep(2000);

            //Scroll to first Studio Link
            try {
                //Scroll to First studio link
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,800)");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to Scroll to first Studio Link " + e);
            }//end of going to search try catch block
            Thread.sleep(2000);
            try {
                ArrayList<WebElement> StudioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[@class='container-3SE46']")));
                if (i == 0) {
                    StudioLinks.get(1).click();
                } else if (i == 1) {
                    StudioLinks.get(2).click();
                } else if (i == 2) {
                    StudioLinks.get(0).click();
                }
            } catch (Exception e) {
                System.out.println("Unable to click on Studio link " + e);
            }
            Thread.sleep(2000);


            try {
                // capture all tabs
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                // switch to new tabs
                driver.switchTo().window(tabs.get(1));
                //wait 3 seconds
                Thread.sleep(3000);
            } catch (Exception e) {

                //capture the Address
                String studioAddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                //Print address
                String[] arrayResult = studioAddress.split("In-Person");
                System.out.println("The studio address is " + arrayResult[0]);


                try {
                    //Scroll to in-person workshop
                    JavascriptExecutor jse = (JavascriptExecutor) driver;
                    jse.executeScript("scroll(0,800)");
                    Thread.sleep(2000);
                } catch (Exception e1) {
                    System.out.println("Unable to Scroll to in-person workshop schedule" + e);
                }//end of scrolling down to in-person workshop schedule
                Thread.sleep(2000);

                try {
                    String schedule = driver.findElement(By.xpath("//*[@class='workshopSchedule-2foP8']")).getText();
                    //print out dates
                    System.out.println(schedule);
                } catch (Exception e1) {
                    System.out.println("Unable to capture and print out amenities.." + e);
                    Thread.sleep(4000);

                    driver.quit();
                    }
                }//End of capture
            }//End of catch
        }//End of Main
    }//End of Java

