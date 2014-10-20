package ecommerceInsoft;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by HEMANTH on 20/10/2014.
 */
public class BaseTest extends AbstractPage {
    @BeforeClass
    public static void openbrowseEnterurl() throws Exception {

        try {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.nopcommerce.com/");
        } catch (Exception e) {
            System.out.println("Exception is" + e);
        }


    }

    @AfterClass
    public static void closingBrowser() {
        driver.quit();
    }
}
