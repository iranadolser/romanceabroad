import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTabTests extends BaseUI {

    //String currentUrlUnderTest;

    @Test
    public void testBlogTab(){
        driver.findElement(Locators.TAB_BLOG).click();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.getExpectedUrlBlog);

    }
}
