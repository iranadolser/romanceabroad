import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePage extends BaseActions {
    public HomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }
    public void clickLinkJoinToday(){

        driver.findElement(Locators.LINK_JOIN_TODAY).click();  //link at the bottom of home page
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.getExpectedUrlJoinToday);
    }

    public void getStartedPartOne(){

        driver.findElement(Locators.EMAIL).click();
        driver.findElement(Locators.EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void getStartedPartTwo(){

        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(generateNewNumber(Data.username,5));
        driver.findElement(Locators.DAYS).click();
        driver.findElement(Locators.SELECT_DAY).click();
        driver.findElement(Locators.MONTHS).click();
        driver.findElement(Locators.SELECT_MONTH).click();
        driver.findElement(Locators.YEARS).click();
        driver.findElement(Locators.SELECT_YEAR).click();

        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.TEXT_FIELD_LOCATION).sendKeys(Data.location);
        driver.findElement(Locators.CHECKBOX_CONFIRMATION);
    }

    public void clickBookNowLink(){

        driver.findElement(Locators.LINK_BOOK_NOW).click();  //Verifies link Book Now at the very top of page exists and works.
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.expectedUrlBookNow);
    }
}
