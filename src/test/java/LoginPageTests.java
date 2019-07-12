import org.junit.Test;

public class LoginPageTests extends  BaseTestClass {

    @Test
    public void loginPositiveTest() {
        String url = "https://juice-shop.herokuapp.com/#/login";
        driver.get(url);
        loginValidUser();
    }
}
