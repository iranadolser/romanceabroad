import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BlogTabPage extends BaseActions {
    public BlogTabPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }

    public void openTabBlog(){

        driver.findElement(Locators.TAB_BLOG).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.getExpectedUrlBlog);

    }

}
