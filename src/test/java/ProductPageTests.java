import org.junit.Assert;
import org.junit.Test;

public class ProductPageTests extends BaseTestClass {

    @Test
    public void popupProductPageLogged() {
        String url = "https://juice-shop.herokuapp.com/#/login";
        driver.get(url);
        loginValidUser();
        ProductPageFactory productPageFactory
                = new ProductPageFactory(driver);
        productPageFactory.popupProductPage();
        Assert.assertTrue(productPageFactory.popupProductTitle.isDisplayed());
        Assert.assertEquals(productPageFactory.popupProductTitle, "Apple Juice (1000ml)");
        Assert.assertTrue(productPageFactory.popupProductDescription.isDisplayed());
        Assert.assertEquals(productPageFactory.popupProductDescription, "The all-time classic.");
        Assert.assertTrue(productPageFactory.popupProductPrice.isDisplayed());
        Assert.assertTrue(productPageFactory.popupProductImage.isDisplayed());
    }

    @Test
    public void popupProductPageNotLogged() {
        String url = "https://juice-shop.herokuapp.com/#/login";

        driver.get(url);

        HomePageFactory homePageFactory
                = new HomePageFactory(driver);
        homePageFactory.popupHomePageButton.click();

        ProductPageFactory productPageFactory
                = new ProductPageFactory(driver);
        productPageFactory.popupProductPage();
        Assert.assertTrue(productPageFactory.popupProductTitle.isDisplayed());
        Assert.assertEquals(productPageFactory.popupProductTitle, "Apple Juice (1000ml)");
        Assert.assertTrue(productPageFactory.popupProductDescription.isDisplayed());
        Assert.assertEquals(productPageFactory.popupProductDescription, "The all-time classic.");
        Assert.assertTrue(productPageFactory.popupProductPrice.isDisplayed());
        Assert.assertTrue(productPageFactory.popupProductImage.isDisplayed());
    }

}







