import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

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
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method) {


        // Check if parameter passed from TestNG is 'firefox'

        if (browser.equalsIgnoreCase("firefox")) {

            // Create firefox instance

            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

            driver = new FirefoxDriver();

        }

        // Check if parameter passed as 'chrome'

        else if (browser.equalsIgnoreCase("chrome")) {

            // Set path to chromedriver.exe

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            // Create chrome instance

            driver = new ChromeDriver();

            driver.get("chrome://settings/clearBrowserData");

        } else if (browser.equalsIgnoreCase("IE")) {

            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");

            driver = new InternetExplorerDriver();

            driver.manage().deleteAllCookies();


        } else {

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            driver = new ChromeDriver();

            driver.get("chrome://settings/clearBrowserData");

        }

        //System.setProperty("webriver.chrome.driver","chromedriver.exe");
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