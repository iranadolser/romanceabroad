import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseUI {

    @Test public void testHomePageLogo(){
        driver.findElement(Locators.LOGO_IMG);   //Verifies Logo exists at top Home Page. How to test it's in right place and size?

    }

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
    public void testJoinTodayLink(){
        driver.findElement(Locators.LINK_JOIN_TODAY).click();     //Verifies the link at the very bottom of home page
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.getExpectedUrlJoinToday);

    }

}
