import org.openqa.selenium.By;

public class Locators {

    //Home Page
    public static final By LINK_BOOK_NOW = By.xpath("//a[contains(text(),'BOOK NOW')]");
    public static final By TAB_HOW_WE_WORK = By.xpath("//a[contains(text(),'HOW WE WORK')]");
    public static final By TAB_PRETTY_WOMEN = By.xpath("//a[contains(text(),'PRETTY WOMEN')]");
    public static final By LINK_JOIN_TODAY = By.xpath("//a[contains(text(),'JOIN TODAY!')]");
    public static final By TAB_PHOTOS = By.xpath("//a[text()='PHOTOS']");
    public static final By TAB_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By TAB_TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By TAB_BLOG= By.xpath("//a[contains(text(),'BLOG')]");
    public static final By TAB_SIGN_IN = By.xpath("//a[@id='ajax_login_link']");

    public static final By IFRAME_VIDEO = By.xpath("//div[@class='video']//iframe");
    public static final By BUTTON_PLAY = By.xpath("//button[@class ='ytp-large-play-button ytp-button']");


    //Registration
    public static final By EMAIL = By.cssSelector("input#email");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_USERNAME = By.xpath("//input[@id='nickname']");
    public static final By TEXT_FIELD_PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By TEXT_FIELD_LOCATION = By.xpath("//input[@placeholder='Type your location']");

    public static final By DAYS = By.cssSelector("#daySelect");
    public static final By SELECT_DAY = By.xpath("//li[@data-handler='selectDay']//a[text()='30']");
    public static final By MONTHS = By.cssSelector("#monthSelect");
    public static final By SELECT_MONTH = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']");
    public static final By YEARS = By.cssSelector("#yearSelect");
    public static final By SELECT_YEAR = By.xpath("//li[@data-handler='selectYear']//a[text()='1979']");

    //Searh
    public static final By AGE_MAX = By.cssSelector("select[name='age_max']");
    public static final By AGE_MIN = By.cssSelector("select[name='age_min']");
    public static final By BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");


}
