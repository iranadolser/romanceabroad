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

        //driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();
        //comented are just checking old fashion way; all work;

        WebElement NextButton = driver.findElement(Locators.BUTTON_NEXT);       //WebElement declaring option.
        NextButton.click();



        //Below are just for praticing

        driver.findElement(By.xpath("//a[@class='nav-link'][@href='https://romanceabroad.com/media/index']"));

        driver.get(Data.searchURL);
        driver.findElement(By.cssSelector("#main_search_button_user_line"));
        driver.findElement(By.cssSelector("select[name='age_max']"));
        driver.findElement(By.cssSelector("#age_max"));
        driver.findElement(By.xpath("//select[@id='age_max']"));
        driver.findElement(By.xpath("//button[@id='main_search_button_user_line']"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-white']"));

    }
}
