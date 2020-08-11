import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI{

    @Test
    public void testTourToUkraineTab() {
        driver.findElement(Locators.TAB_TOUR_TO_UKRAINE).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlTourToUkraine);

    }
}
