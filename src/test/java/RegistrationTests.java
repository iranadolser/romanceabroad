import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration(){

        driver.findElement(Locators.LINK_JOIN_TODAY).click(); //Verifies the link at the very bottom of home page
        Data.currentUrlUnderTest = driver.getCurrentUrl();
        System.out.println(Data.currentUrlUnderTest);
        Assert.assertEquals(Data.currentUrlUnderTest,Data.getExpectedUrlJoinToday);

        driver.findElement(Locators.EMAIL).click();
        driver.findElement(Locators.EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);

        driver.findElement(Locators.REGISTRATION_FORM);
        //driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        //driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        //driver.findElement(Locators.TEXT_FIELD_LOCATION).sendKeys(Data.location);
        //driver.findElement(Locators.CONFIRMATION).click();
        //driver.findElement(Locators.BUTTON_NEXT).click();

    }
}
