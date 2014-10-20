package ecommerceInsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by HEMANTH on 16/10/2014.
 */
public class Login extends AbstractPage {




    public static void emailaddress(String email){
        driver.findElement(By.id("Email")).sendKeys(email); ;

    }
    public static void  password(String pwd){
        driver.findElement(By.id("Password")).sendKeys(pwd); ;

    }
    public static void loginbutton(){
        driver.findElement(By.className("button-1 login-button")).click();

    }
    public static void forgotpassword(){
       driver.findElement(By.linkText("Forgot password?"));


    }


}
