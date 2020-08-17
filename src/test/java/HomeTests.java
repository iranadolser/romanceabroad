import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseUI {

    @Test
    public void testBookNowlink(){

        homePage.clickBookNowLink();
    }

    @Test
    public void testSignInTab(){
        driver.findElements(Locators.TAB_SIGN_IN).get(Data.indexTabSignIn).click();     //Verifies tab Sign In.

    }


    @Test

    public void iFrame(){
        WebElement iFrm = driver.findElement(By.xpath("//div[@class='video']//iframe"));
        driver.switchTo().frame(iFrm);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class ='ytp-large-play-button ytp-button']"))); //explicit wait
        driver.findElement(By.xpath("//button[@class ='ytp-large-play-button ytp-button']")).click();

        WebElement play_button = driver.findElement(By.xpath("//button[@class ='ytp-large-play-button ytp-button']"));

    }

}
