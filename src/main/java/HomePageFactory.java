import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

    private WebDriver driver;

    @FindBy(css = ".text-justify+button")
    public WebElement popupHomePageButton;

    @FindBy(css = "#navbarLoginButton>span")
    private WebElement loginButton;

    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPageFactory navigateToLoginPage() {
        popupHomePageButton.click();
        loginButton.click();
        return new LoginPageFactory(driver);
    }

    }
