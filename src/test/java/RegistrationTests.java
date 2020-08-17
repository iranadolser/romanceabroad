import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration(){

        homePage.clickLinkJoinToday();
        homePage.getStartedPartOne();
        homePage.getStartedPartTwo();

    }
}
