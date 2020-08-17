import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class SearchTests extends BaseUI {

    @Test
    public void testPrettyWomenTab() {

        searchPage.openPrettyWomenTab();
        searchPage.searchByMinMaxAge();

    }
}
