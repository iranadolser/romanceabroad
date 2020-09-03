import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SearchTests extends BaseUI {

    @Test
    public void testPrettyWomenTab() {

        searchPage.openPrettyWomenTab();
        searchPage.searchByMinMaxAge();
        searchPage.searchByMinMaxAge();
        searchPage.sortingByMinMaxAge();
        searchPage.agesByMinMaxAge();

        driver.findElement(By.xpath("//div[contains(@class,'slick-slide slick-current slick-active')]//img"));

    }

}
