import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration() {

        homePage.clickLinkJoinToday();
        homePage.getStartedPartOne();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is checked");
        }

        homePage.getStartedPartTwo();
    }
}
