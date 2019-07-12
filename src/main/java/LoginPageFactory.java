import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageFactory {

    private WebDriver driver;

    @FindBy(css = "div .mat-form-field-infix>input#email")
    private WebElement userNameEmail;

    @FindBy(css = "div .mat-form-field-infix>input#password")
    private WebElement password;

    @FindBy(css = "#navbarLoginButton>span")
    private WebElement loginBtn;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageFactory authenticate(String user, String pass){
        userNameEmail.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
        return new HomePageFactory(driver);
    }
}
