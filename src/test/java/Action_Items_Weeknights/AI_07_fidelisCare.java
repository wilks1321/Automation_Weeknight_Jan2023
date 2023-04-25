package Action_Items_Weeknights;

import Day12_04112023.TestParent;
import Reusable_Library.ReusableActions;
import org.testng.annotations.Test;

public class AI_07_fidelisCare extends TestParent {
    @Test(priority = 1)
    public void tc001_clickOnSearchElement() throws InterruptedException {
        //navigate to fideliscare.org
        driver.navigate().to("https://www.fideliscare.org");
        //next we need to click on the Search button on the right top corner
        ReusableActions.clickAction(driver, "//*[@class='tool dropdown search']", "SearchBar");
        Thread.sleep(2000);

        //Enter get dental coverage in search bar
        ReusableActions.sendKeysByIndex(driver, "//*[@class='form-control search-input']", "Dental coverage", 0, "searchValue");
        Thread.sleep(2000);
        //Click on search Icon
        ReusableActions.clickAction(driver, "//*[@class='input-group-btn']", "ClickIcon");
        // capture the search result
        String Result = ReusableActions.getText(driver, "//*[@class='gsc-result-info-container']", "Result");
        String[] number = Result.split(" ");
        //print out the result
        System.out.println("The search number is " + number[1]);
        Thread.sleep(2000);
        //click on get coverage link
        ReusableActions.clickByIndex(driver, "//*[@class='gsc-resultsbox-visible']", 0, "Get Dental Coverage");
        Thread.sleep(2000);
    }// End of test case 1

        @Test(priority = 2)
        public void tc002_switchToTabs() throws InterruptedException {
            //Scroll to "First Name" Bar
            ReusableActions.scrollByPixelsAction(driver, (500));
            //Click on first name bar
            ReusableActions.clickAction(driver, "//*[@class='form-control width-lg ng-pristine ng-invalid ng-touched']", "First Name bar");
            //Enter your first name
            ReusableActions.sendKeysByIndex(driver, "//*[@class='form-control width-lg ng-pristine ng-invalid ng-touched']", "Wilkyns", 0, "FirstName");
            // Click on Last Name bar
            ReusableActions.clickAction(driver, "//*[@id='lastName']", "Last Name bar");


    }

}//End of main
