import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String homeURL = "https://romanceabroad.com/";


    @BeforeMethod
    public void setUp(){
        System.setProperty("webriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait (driver, 10);
        driver.get(homeURL);
    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }

    public void getDropDownListIndex(WebElement element,int index){
        Select DropDown = new Select(element);
        DropDown.selectByIndex(index);

    }

    public void getDropDownListValue(WebElement element,String age) {
        Select DropDown = new Select(element);
        DropDown.selectByValue(age);

    }
}