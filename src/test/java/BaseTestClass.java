import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTestClass {

    public  static  WebDriver driver;
    private static DriversPath driversPath = new DriversPath();

    @Before
    public void setUpTest() {
        System.setProperty("webdriver.chrome.driver", driversPath.getDriverDirPath() + "chromedriver" + driversPath.getDriverExtension());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static HomePageFactory loginValidUser() {
        String userName = "liliana.ghiorghita.testing@gmail.com";
        String password = "Qwerty.2017QW";
        HomePageFactory homePageFactory
                = new HomePageFactory(driver);
        homePageFactory.navigateToLoginPage();
        LoginPageFactory loginPageFactory
                = PageFactory.initElements(driver, LoginPageFactory.class);
        homePageFactory = loginPageFactory.authenticate(userName, password);

        return homePageFactory;
    }
}