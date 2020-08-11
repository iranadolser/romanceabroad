import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    String homeURL = "https://romanceabroad.com/";


    @BeforeMethod
    public void setUp(){
        System.setProperty("webriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }
}
