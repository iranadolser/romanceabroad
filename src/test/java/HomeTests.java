import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTests extends BaseUI {


    @Test
    public void checkingOutTabs() {
        List<WebElement> links = driver.findElements(Locators.TABS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.homeURL);
            links = driver.findElements(Locators.TABS);

        }
    }

    /*@Test
    public void iFrame() {
        WebElement iFrm = driver.findElement(Locators.IFRAME_VIDEO);
        driver.switchTo().frame(iFrm);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_PLAY)); //explicit wait
        driver.findElement(Locators.BUTTON_PLAY).click();
    }*/

    @Test
    public void testBookNowlink() {

        homePage.clickBookNowLink();
    }

}
