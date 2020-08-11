import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {
    @Test
    public void testHowWeWorkTab() {
        driver.findElement(Locators.TAB_HOW_WE_WORK).click();    //Verifies tab How We Work exists and works.
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlHowWeWork);

    }
}