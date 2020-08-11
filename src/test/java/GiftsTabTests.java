import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTabTests extends BaseUI {

    @Test
    public void testGiftsTab() {
        driver.findElement(Locators.TAB_GIFTS).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlGifts);

    }
}
