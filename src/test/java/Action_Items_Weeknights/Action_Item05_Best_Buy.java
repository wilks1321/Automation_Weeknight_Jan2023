package Action_Items_Weeknights;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;

public class Action_Item05_Best_Buy {
    public static void main(String[] args) throws InterruptedException {
        //Define the webDriver from Reusable Library
        WebDriver driver = ReusableActions.setUpDriver();
        //Navigate to Best Buy home page
        driver.navigate().to("https://www.bestbuy.com");

        //enter keyword macbook on the search field
        ReusableActions.sendKeysAction(driver, "//*[@id='gh-search-input']", "macbook", "SearchField");

        //click on the search icon
        ReusableActions.clickAction(driver, "//*[@aria-label='submit search']", "SearchButton");
        Thread.sleep(2000);

        //on the top right select by dropdown by selecting 'Best Selling' //use selectByText method here since it is in a select tag
        ReusableActions.selectByText(driver, "//*[@id='sort-by-select']", "Best Selling","Sort By");

        //click on the first macbook link // you can use clickByIndex/ClickMethod here
        ReusableActions.clickByIndex(driver, "//*[@class='product-image ']", 0, "MacbookLink");
        Thread.sleep(2000);

        //Scroll down to "Add to cart" function by Scroll with Pixel
        ReusableActions.scrollByPixelsAction(driver, (2200));
        Thread.sleep(2000);

        //Click on "Add to cart" function
        ReusableActions.clickAction(driver, "//*[@data-sku-id='6509650']", "addToCart");
        Thread.sleep(1000);

        // On pop up capture "Cart Subtotal (1 items) and Print out amount
        String total = ReusableActions.getText(driver,"//*[@class='shop-cart-subtotal']","subTotal");
        System.out.println(total);
        Thread.sleep(2000);

        //mouseHover over "Continue Shopping"
        ReusableActions.mouseHover(driver,"//*[@class='c-button-link continue-shopping']","Continue shopping");

        //Click on "Continue shopping" function
        ReusableActions.clickAction(driver, "//*[@class='c-button-link continue-shopping']", "clickContinueShopping");
        Thread.sleep(1000);

        //Quit the driver
        driver.quit();

    }//End of main
}//End of class
