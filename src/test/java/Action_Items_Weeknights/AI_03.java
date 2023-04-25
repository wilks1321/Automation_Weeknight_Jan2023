package Action_Items_Weeknights;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_03 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> Sports = new ArrayList<>();
        Sports.add("Basketball");
        Sports.add("Soccer");
        Sports.add("Handball");
        Sports.add("Baseball");

        //Set your web driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //Set Chrome options
        options.addArguments("start-maximized", "incognito");
        //Define the web driver for chrome
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < Sports.size(); i++) {

            //Navigate to Yahoo
            driver.navigate().to("https://www.yahoo.com/");
            Thread.sleep(5000);

            //Enter Array list into search
            driver.findElement(By.xpath("//*[@class='_yb_fkxkw']")).sendKeys(Sports.get(i));
            Thread.sleep(5000);
            //Click on Search Icon
            driver.findElement(By.xpath("//*[@id='ybar-search']")).submit();
            Thread.sleep(6000);

            //Capture the search number and Print results
            String results = driver.findElement(By.xpath("//*[@class=' fz-14 lh-22']")).getText();
            String[] arrayResult = results.split(" ");
            System.out.println("Search number is " + arrayResult[1]);
            Thread.sleep(3000);

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll down 800 pixels (based on your need adjust it by + or - 200)
            jse.executeScript("scroll(0,6000)");
            //wait a few seconds
            Thread.sleep(3000);

            //store all the header links into an arraylist of type WebElement
            driver.findElement(By.xpath("//*[text()='About this page']")).click();
            //wait a few seconds
            Thread.sleep(3000);

            String message = driver.findElement(By.xpath("//*[@class='msg success']")).getText();
            //Print message
            System.out.println("The message is " + message);

            //Declare the Array List with web elements
            //ArrayList<WebElement> relatedArticles = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@data-ylk,'elm:rhdln')]")));
            ArrayList<WebElement> relatedArticles = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@data-ylk,'elm:rhdln')]")));
            //Get the result using the index
            relatedArticles.get(0).click();
            //Wait a few seconds
            Thread.sleep(3000);
            WebElement narrowMessage = driver.findElement(By.xpath("//*[(@id='article_container')]"));
            //Capture the text
            String text = narrowMessage.getText();
            //Print message
            System.out.println(text);
            //Quit Driver
            driver.quit();
        }//End of loop


    }//End of main
}//End of Java
