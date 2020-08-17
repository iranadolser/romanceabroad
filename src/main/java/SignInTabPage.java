import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTabPage extends BaseActions {
    public SignInTabPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void openSignInTab(){

        driver.findElements(Locators.TAB_SIGN_IN).get(Data.indexTabSignIn).click();
    }

}
