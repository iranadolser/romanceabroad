import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftsTabPage extends BaseActions {
    public GiftsTabPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }

    public void openGiftsTab(){

        driver.findElement(Locators.TAB_GIFTS).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlGifts);

    }

}
