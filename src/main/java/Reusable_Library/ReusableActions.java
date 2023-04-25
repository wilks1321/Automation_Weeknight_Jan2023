package Reusable_Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ReusableActions {
    public static WebDriver setUpDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start maximized for windows
        options.addArguments("start-maximized");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of web driver method

    public static void clickAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element: " + elementName + " reason: " + e);
        }
    }//end of click action

    // Get Text Action
    public static String getText(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String returnText = "";
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            returnText = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text: " + elementName + " reason: " + e);
        }
        return returnText;
    }//end of getText method


        //Send Keys Action
    public static void sendKeysAction(WebDriver driver, String xpath, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.clear();
            element.sendKeys(userInput);
        } catch (Exception e) {
            System.out.println("Unable to send keys to: " + elementName + " for reason: " + e);
        }
    }//end of send keys action


    //Start of SelectByText method
    public static void selectByText(WebDriver driver, String xpath, String selectValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select selectByText = new Select(element);
            selectByText.selectByVisibleText(selectValue);
            System.out.println("Successfully selected by text from element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by text from element " + elementName + ": " + e);
        }
    }//end of selectbyText method


    //Start of scrollByPixelsAction
    public static void scrollByPixelsAction(WebDriver driver, int pixels) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(("scroll(0, " + pixels + ")"));
    }//end of scroll action


    //Start of MouseHoverAction
    public static void mouseHover(WebDriver driver,String xpath,String elementName){
        WebDriverWait wait= new WebDriverWait(driver,10);

        try{
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Actions mouseAction= new Actions(driver);
            mouseAction.moveToElement(element).perform();
            System.out.println("successfully hover over element");
        } catch (Exception e){
            System.out.println("unable to hover over element");
        }
    }// end of mousehover


    //Start of clickByIndex method
    public static void clickByIndex(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
            System.out.println("Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ": " + e);
        }
    }//end of clickByIndex method

    //Start of Submit Action
    public static void submitAction(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on element: " + elementName + " for reason: " + e);
        }
    }//End of submitAction

    //Start of sendMethodKeysByIndex
    public static void sendKeysByIndex(WebDriver driver, String xpath, String userValue, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
        }
    }//end of sendkeys method

    //Start of switchToTabByIndex
    public static void switchToTabByIndex(WebDriver driver, int tabNumber){
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        // switch to the new tab by index of 1
        driver.switchTo().window(tabs.get(tabNumber));
    }//End of switching tabs

}//End of class
