import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void openHowWeWorkTab(){

        driver.findElement(Locators.TAB_HOW_WE_WORK).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlHowWeWork);
    }
}
