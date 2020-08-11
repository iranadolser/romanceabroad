import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTabTests extends BaseUI {

    @Test
    public void testPhotoTab() {
        driver.findElement(Locators.TAB_PHOTOS).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlPhotos);

    }

}
