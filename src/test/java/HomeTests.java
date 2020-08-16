import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseUI {


    @Test
    public void testBookNowlink(){
        driver.findElement(Locators.LINK_BOOK_NOW).click();  //Verifies link Book Now at the very top of page exists and works.
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.expectedUrlBookNow);

    }

    @Test
    public void testSignInTab(){
        driver.findElements(Locators.TAB_SIGN_IN).get(Data.indexTabSignIn).click();     //Verifies tab Sign In.

    }

    @Test
    public void testJoinTodayLink() {
        driver.findElement(Locators.LINK_JOIN_TODAY).click();     //Verifies the link at the very bottom of home page
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest, Data.getExpectedUrlJoinToday);
    }
    @Test

    public void iFrame(){
        WebElement iFrm = driver.findElement(By.xpath("//div[@class='video']//iframe"));
        driver.switchTo().frame(iFrm);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class ='ytp-large-play-button ytp-button']"))); //explicit wait
        driver.findElement(By.xpath("//button[@class ='ytp-large-play-button ytp-button']")).click();

        WebElement play_button = driver.findElement(By.xpath("//button[@class ='ytp-large-play-button ytp-button']"));
        //play_button.click();

    }

}
