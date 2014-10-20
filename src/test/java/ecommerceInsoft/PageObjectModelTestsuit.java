package ecommerceInsoft;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by HEMANTH on 16/10/2014.
 */
public class PageObjectModelTestsuit extends BaseTest {

    AbstractPage baseclass =new AbstractPage();

    //protected static WebDriver driver;
    //private BaseClass page ;



    @Test
    public void verifythatusercanregisterwithvaliddetails(){
        RegisterUser registerUser=new RegisterUser();
        baseclass.registeruser();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        registerUser.registeruser("gender-female","Suneela","wdgghjjj","suneela.mt@gmail.com","dfghjkl","dfghjkl");
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Your registration completed"));
        baseclass.logout();

    }

    @Test
    public  void verifythatyoucanregisterwithvaliddetails() throws InterruptedException {

        Login login1 = new Login();


        baseclass.login();
        try {
            login1.emailaddress("suneela.mt@gmail.com");
            login1.password("dfghjkl");
            login1.loginbutton();
        } catch (Exception e) {
            System.out.println("Username not registered");
            System.out.println("Exception is" + e);

        }
    }
    @Test
    public void verifythatyoucanadditemtoshoppingcart() throws InterruptedException {
            Books book = new Books();
            baseclass.books("Books");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            book.selectSortby();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            book.selectABook("Best Grilling Recipes");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            book.addToCart();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            baseclass.shoppingcartlist();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Best Grilling Recipes"));



    }

}
