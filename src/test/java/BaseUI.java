import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String homeURL = "https://romanceabroad.com/";
    HomePage homePage;
    BlogTabPage blogTabPage;
    GiftsTabPage giftsTabPage;
    HowWeWorkPage howWeWorkPage;
    PhotoTabPage photoTabPage;
    SearchPage searchPage;
    SignInTabPage signInTabPage;
    TourToUkrainePage tourToUkrainePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait (driver, 10);

        homePage = new HomePage(driver, wait);
        blogTabPage = new BlogTabPage(driver, wait);
        giftsTabPage = new GiftsTabPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        photoTabPage = new PhotoTabPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        signInTabPage = new SignInTabPage(driver, wait);
        tourToUkrainePage = new TourToUkrainePage(driver, wait);

        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }

}