import org.openqa.selenium.By;

public class Locators {

    //Home Page
    public static final By LOGO_IMG = By.xpath("//div[@id='pjaxcontainer']/div/div/div/a/img");
    public static final By LINK_BOOK_NOW = By.xpath("//a[contains(text(),'BOOK NOW')]");
    public static final By TAB_HOW_WE_WORK = By.xpath("//a[contains(text(),'HOW WE WORK')]");
    public static final By TAB_PRETTY_WOMEN = By.xpath("//a[contains(text(),'PRETTY WOMEN')]");
    public static final By LINK_JOIN_TODAY = By.xpath("//a[contains(text(),'JOIN TODAY!')]");
    public static final By TAB_PHOTOS = By.xpath("//a[text()='PHOTOS']");
    public static final By TAB_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By TAB_TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By TAB_BLOG= By.xpath("//a[contains(text(),'BLOG')]");
    public static final By TAB_SIGN_IN = By.xpath("//a[@id='ajax_login_link']");


    //Registration
    public static final By EMAIL = By.cssSelector("input#email");
    public static final By PASSWORD = By.cssSelector("input#email");
    public static final By REGISTRATION_FORM = By.xpath("//*[@id='third-registration-page']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_USERNAME = By.xpath("//input[@id='nickname']");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("//input[@name='data[phone]']");
    public static final By TEXT_FIELD_LOCATION = By.xpath("//input[@placeholder='Type your location']");
    public static final By CONFIRMATION = By.xpath("//input[@id='confirmation']");



}