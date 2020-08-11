import org.testng.annotations.Test;

public class SignInTabTest extends BaseUI {

    @Test
    public void testSignInTab(){
        //Verifies tab Sign In.
        driver.findElements(Locators.TAB_SIGN_IN).get(Data.indexTabSignIn).click();

    }
}
