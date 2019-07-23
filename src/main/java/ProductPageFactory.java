import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageFactory {
    private WebDriver driver;

    @FindBy(css = "img[class='img-responsive img-thumbnail'][src='assets/public/images/products/apple_juice.jpg']")
    public WebElement productImageButton;

    @FindBy(css = "img[class='img-thumbnail']")
    public WebElement popupProductImage;

    @FindBy(css = "div[style='margin-right: 20px;']>h4+p")
    public WebElement popupProductPrice;

    @FindBy(css = "div[style='margin-right: 20px;']+div>h4+div")
    public WebElement popupProductDescription;

    @FindBy(css = "div[class='container mat-typography']>h1")
    public WebElement popupProductTitle;

    public ProductPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void popupProductPage() {
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(productImageButton));
        productImageButton.click();

    }

}
