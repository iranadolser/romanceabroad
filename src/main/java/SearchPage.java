import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void openPrettyWomenTab(){

        driver.findElement(Locators.TAB_PRETTY_WOMEN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //implicit wait
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.searchURL);

        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.AGE_MAX));  //explicit wait
        driver.findElement(Locators.AGE_MAX);
        driver.findElement(Locators.AGE_MIN);
    }
    public void searchByMinMaxAge(){

        WebElement ageMax = driver.findElement(Locators.AGE_MAX);
        WebElement ageMin = driver.findElement(Locators.AGE_MIN);
        ageMax.click();
        getDropDownListIndex(ageMin,35);
        getDropDownListIndex(ageMax,36);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH);
        getDropDownListValue(ageMin,"54");
        getDropDownListValue(ageMax,"55");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH)); //explicit wait
        driver.findElement(Locators.BUTTON_SEARCH);
    }
}
