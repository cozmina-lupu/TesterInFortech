import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageFactory {

    private WebDriver driver;

    @FindBy(css = "div .mat-form-field-infix>input#email")
    private WebElement userNameEmail;

    @FindBy(css = "div .mat-form-field-infix>input#password")
    private WebElement password;

    @FindBy(css = "#loginButton>span")
    private WebElement loginBtn;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageFactory authenticate(String user, String pass){
        userNameEmail.sendKeys(user);
        password.sendKeys(pass);
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
        return new HomePageFactory(driver);
    }
}
