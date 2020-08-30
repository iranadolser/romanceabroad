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
        //Assert.assertSame(ageMin,"18");
        //Assert.assertEquals(ageMax,"55");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH);

    }


    public void sortingByMinMaxAge() {

        WebElement ageMax = driver.findElement(Locators.AGE_MAX);
        WebElement ageMin = driver.findElement(Locators.AGE_MIN);
        Select fromAge = new Select(ageMin);
        Select toAge = new Select(ageMax);


        for (int i = 18; i < 45; i++) {

            fromAge.selectByIndex(i);
            toAge.selectByIndex(i + 1);

            String fromAgeString = ageMin.getText();
            String toAgeString = ageMax.getText();

            System.out.println(fromAgeString + "_" + toAgeString);
            wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
            driver.findElement(Locators.BUTTON_SEARCH).click();


            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("//div[@class='lh30']")))); //explicit wait
            driver.findElement(By.cssSelector("//div[@class='lh30']")).click();

            WebElement peopleFound = driver.findElement(By.cssSelector("//div[@class='lh30']"));
            String peopleFoundString = peopleFound.getText();
            System.out.println(peopleFoundString);
            driver.findElement(By.xpath("//a[contains(text(),'List view')]")).click();

        }

    }

}









