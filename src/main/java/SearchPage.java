import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void openPrettyWomenTab() {

        driver.findElement(Locators.TAB_PRETTY_WOMEN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //implicit wait
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.searchURL);

        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.AGE_MAX));  //explicit wait
        driver.findElement(Locators.AGE_MAX);
        driver.findElement(Locators.AGE_MIN);
    }

    public void searchByMinMaxAge() {

        WebElement ageMax = driver.findElement(Locators.AGE_MAX);
        WebElement ageMin = driver.findElement(Locators.AGE_MIN);
        ageMax.click();
        getDropDownListIndex(ageMin, 35);
        getDropDownListIndex(ageMax, 36);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH);
        getDropDownListValue(ageMin, "18");
        getDropDownListValue(ageMax, "55");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH);
    }

    public void sortingByMinMaxAge() {

        WebElement ageMax = driver.findElement(Locators.AGE_MAX);
        WebElement ageMin = driver.findElement(Locators.AGE_MIN);
        getDropDownListValue(ageMin, "18");
        getDropDownListValue(ageMax, "80");

        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'People found:')]")))); //explicit wait

        driver.findElement(By.xpath("//div[contains(text(),'People found:')]"));

        WebElement peopleFound = driver.findElement(By.xpath("//div[contains(text(),'People found:')]"));
        String peopleFoundString = peopleFound.getText();
        System.out.println(peopleFoundString);
        //Boolean
        Boolean stringResults = peopleFoundString.contains("71");
        System.out.println(stringResults);
        //Condition with string
        if (peopleFoundString.contains("71"))
            System.out.println("For ages from 18 to 80 are correct number of applicants found.");
        else {
            System.out.println("Wrong count of applicants while searching");
        }
    }

    public void agesByMinMaxAge() {

        WebElement ageMax = driver.findElement(Locators.AGE_MAX);
        WebElement ageMin = driver.findElement(Locators.AGE_MIN);
        Select fromAge = new Select(ageMin);
        Select toAge = new Select(ageMax);
        System.out.println();
        System.out.println("For the ages groups below:");
        //Loop

        for (int i = 0; i < 62; i++) {

            fromAge.selectByIndex(i);
            toAge.selectByIndex(i + 1);

            wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
            driver.findElement(Locators.BUTTON_SEARCH).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait

            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'People found')]"))));
            WebElement peopleFound = driver.findElement(By.xpath("//*[contains(text(),'People found')]"));
            String peopleFoundString = peopleFound.getText();

            System.out.println("From " + (18 + i) + "to " + (19 + i) + ": " + peopleFoundString);

            //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //implicit wait

            /*WebElement refreshPage = driver.findElement(By.xpath("//button[@id='main_search_button_user_line']"));
            wait.until(ExpectedConditions.elementToBeClickable(refreshPage));
            refreshPage.click();*/
      }
        Boolean ageSelectControlPresence = ageMin.isDisplayed();
        Assert.assertTrue(ageSelectControlPresence);

    }
}