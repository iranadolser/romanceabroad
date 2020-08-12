import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    @Test
    public void testPrettyWomenTab() {
        driver.findElement(Locators.TAB_PRETTY_WOMEN).click();              //Verifies tab Pretty Women (search)
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.searchURL);

    }
}
