import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PhotoTabPage extends BaseActions {

    public PhotoTabPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void openPhotoTab(){

        driver.findElement(Locators.TAB_PHOTOS).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlPhotos);

    }
}
