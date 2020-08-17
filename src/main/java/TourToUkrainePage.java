import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourToUkrainePage extends BaseActions {
    public TourToUkrainePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void openTourToUkraine(){
        driver.findElement(Locators.TAB_TOUR_TO_UKRAINE).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlTourToUkraine);
    }

}
